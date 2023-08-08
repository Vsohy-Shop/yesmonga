package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.assetpacks.d0 */
public final class C31911d0 extends InputStream {

    /* renamed from: a */
    public final InputStream f77823a;

    /* renamed from: b */
    public long f77824b;

    public C31911d0(InputStream inputStream, long j) {
        this.f77823a = inputStream;
        this.f77824b = j;
    }

    public final void close() throws IOException {
        super.close();
        this.f77823a.close();
        this.f77824b = 0;
    }

    public final int read() throws IOException {
        long j = this.f77824b;
        if (j <= 0) {
            return -1;
        }
        this.f77824b = j - 1;
        return this.f77823a.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f77824b;
        if (j <= 0) {
            return -1;
        }
        int read = this.f77823a.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f77824b -= (long) read;
        }
        return read;
    }
}
