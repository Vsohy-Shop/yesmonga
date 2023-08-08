package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.m0 */
public final class C31954m0 extends FilterInputStream {

    /* renamed from: a */
    public final C31995v1 f77964a = new C31995v1();

    /* renamed from: b */
    public byte[] f77965b = new byte[4096];

    /* renamed from: c */
    public long f77966c;

    /* renamed from: d */
    public boolean f77967d = false;

    /* renamed from: e */
    public boolean f77968e = false;

    public C31954m0(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public final C31968o2 mo92621a() throws IOException {
        byte[] bArr;
        if (this.f77966c > 0) {
            do {
                bArr = this.f77965b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f77967d || this.f77968e) {
            return new C31968o2((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!mo92625f(30)) {
            this.f77967d = true;
            return this.f77964a.mo92696b();
        }
        C31968o2 b = this.f77964a.mo92696b();
        if (b.mo92657h()) {
            this.f77968e = true;
            return b;
        } else if (b.mo92653e() != 4294967295L) {
            int c = this.f77964a.mo92697c() - 30;
            long j = (long) c;
            int length = this.f77965b.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.f77965b = Arrays.copyOf(this.f77965b, length);
            }
            if (!mo92625f(c)) {
                this.f77967d = true;
                return this.f77964a.mo92696b();
            }
            C31968o2 b2 = this.f77964a.mo92696b();
            this.f77966c = b2.mo92653e();
            return b2;
        } else {
            throw new C31904bk("Files bigger than 4GiB are not supported.");
        }
    }

    /* renamed from: b */
    public final boolean mo92622b() {
        return this.f77967d;
    }

    /* renamed from: c */
    public final boolean mo92623c() {
        return this.f77968e;
    }

    /* renamed from: d */
    public final long mo92624d() {
        return this.f77966c;
    }

    /* renamed from: f */
    public final boolean mo92625f(int i) throws IOException {
        int g = mo92626g(this.f77965b, 0, i);
        if (g != i) {
            int i2 = i - g;
            if (mo92626g(this.f77965b, g, i2) != i2) {
                this.f77964a.mo92695a(this.f77965b, 0, g);
                return false;
            }
        }
        this.f77964a.mo92695a(this.f77965b, 0, i);
        return true;
    }

    /* renamed from: g */
    public final int mo92626g(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f77966c;
        if (j <= 0 || this.f77967d) {
            return -1;
        }
        int g = mo92626g(bArr, i, (int) Math.min(j, (long) i2));
        this.f77966c -= (long) g;
        if (g != 0) {
            return g;
        }
        this.f77967d = true;
        return 0;
    }
}
