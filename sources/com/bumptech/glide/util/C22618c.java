package com.bumptech.glide.util;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.util.c */
public final class C22618c extends FilterInputStream {

    /* renamed from: c */
    public static final String f58001c = "ContentLengthStream";

    /* renamed from: d */
    public static final int f58002d = -1;

    /* renamed from: a */
    public final long f58003a;

    /* renamed from: b */
    public int f58004b;

    public C22618c(@C0359n0 InputStream inputStream, long j) {
        super(inputStream);
        this.f58003a = j;
    }

    @C0359n0
    /* renamed from: b */
    public static InputStream m102585b(@C0359n0 InputStream inputStream, long j) {
        return new C22618c(inputStream, j);
    }

    @C0359n0
    /* renamed from: c */
    public static InputStream m102586c(@C0359n0 InputStream inputStream, @C0363p0 String str) {
        return m102585b(inputStream, (long) m102587d(str));
    }

    /* renamed from: d */
    public static int m102587d(@C0363p0 String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                if (Log.isLoggable(f58001c, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("failed to parse content length header: ");
                    sb.append(str);
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo66957a(int i) throws IOException {
        if (i >= 0) {
            this.f58004b += i;
        } else if (this.f58003a - ((long) this.f58004b) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f58003a + ", but read: " + this.f58004b);
        }
        return i;
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f58003a - ((long) this.f58004b), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        mo66957a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return mo66957a(super.read(bArr, i, i2));
    }
}
