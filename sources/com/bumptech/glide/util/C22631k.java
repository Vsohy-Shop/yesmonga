package com.bumptech.glide.util;

import androidx.annotation.C0359n0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.util.k */
public class C22631k extends FilterInputStream {

    /* renamed from: b */
    public static final int f58023b = Integer.MIN_VALUE;

    /* renamed from: c */
    public static final int f58024c = -1;

    /* renamed from: a */
    public int f58025a = Integer.MIN_VALUE;

    public C22631k(@C0359n0 InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public final long mo66999a(long j) {
        int i = this.f58025a;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    public int available() throws IOException {
        int i = this.f58025a;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    /* renamed from: b */
    public final void mo67001b(long j) {
        int i = this.f58025a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f58025a = (int) (((long) i) - j);
        }
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f58025a = i;
    }

    public int read() throws IOException {
        if (mo66999a(1) == -1) {
            return -1;
        }
        int read = super.read();
        mo67001b(1);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.f58025a = Integer.MIN_VALUE;
    }

    public long skip(long j) throws IOException {
        long a = mo66999a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        mo67001b(skip);
        return skip;
    }

    public int read(@C0359n0 byte[] bArr, int i, int i2) throws IOException {
        int a = (int) mo66999a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        mo67001b((long) read);
        return read;
    }
}
