package org.jsoup.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import org.jsoup.helper.C12750d;

/* renamed from: org.jsoup.internal.a */
public final class C12754a extends BufferedInputStream {

    /* renamed from: g */
    public static final int f31526g = 32768;

    /* renamed from: a */
    public final boolean f31527a;

    /* renamed from: b */
    public final int f31528b;

    /* renamed from: c */
    public long f31529c;

    /* renamed from: d */
    public long f31530d = 0;

    /* renamed from: e */
    public int f31531e;

    /* renamed from: f */
    public boolean f31532f;

    public C12754a(InputStream inputStream, int i, int i2) {
        super(inputStream, i);
        boolean z;
        boolean z2 = true;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C12750d.m55067d(z);
        this.f31528b = i2;
        this.f31531e = i2;
        this.f31527a = i2 == 0 ? false : z2;
        this.f31529c = System.nanoTime();
    }

    /* renamed from: d */
    public static C12754a m55094d(InputStream inputStream, int i, int i2) {
        if (inputStream instanceof C12754a) {
            return (C12754a) inputStream;
        }
        return new C12754a(inputStream, i, i2);
    }

    /* renamed from: a */
    public final boolean mo29631a() {
        if (this.f31530d != 0 && System.nanoTime() - this.f31529c > this.f31530d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public ByteBuffer mo29632b(int i) throws IOException {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C12750d.m55068e(z, "maxSize must be 0 (unlimited) or larger");
        if (i <= 0) {
            z2 = false;
        }
        int i2 = 32768;
        if (z2 && i < 32768) {
            i2 = i;
        }
        byte[] bArr = new byte[i2];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        while (true) {
            int read = read(bArr);
            if (read == -1) {
                break;
            }
            if (z2) {
                if (read >= i) {
                    byteArrayOutputStream.write(bArr, 0, i);
                    break;
                }
                i -= read;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: c */
    public C12754a mo29633c(long j, long j2) {
        this.f31529c = j;
        this.f31530d = j2 * 1000000;
        return this;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f31532f || (this.f31527a && this.f31531e <= 0)) {
            return -1;
        }
        if (Thread.interrupted()) {
            this.f31532f = true;
            return -1;
        } else if (!mo29631a()) {
            if (this.f31527a && i2 > (i3 = this.f31531e)) {
                i2 = i3;
            }
            try {
                int read = super.read(bArr, i, i2);
                this.f31531e -= read;
                return read;
            } catch (SocketTimeoutException unused) {
                return 0;
            }
        } else {
            throw new SocketTimeoutException("Read timeout");
        }
    }

    public void reset() throws IOException {
        super.reset();
        this.f31531e = this.f31528b - this.markpos;
    }
}
