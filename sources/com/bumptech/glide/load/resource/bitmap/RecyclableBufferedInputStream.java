package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: a */
    public volatile byte[] f57454a;

    /* renamed from: b */
    public int f57455b;

    /* renamed from: c */
    public int f57456c;

    /* renamed from: d */
    public int f57457d;

    /* renamed from: e */
    public int f57458e;

    /* renamed from: f */
    public final C22157b f57459f;

    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(@C0359n0 InputStream inputStream, @C0359n0 C22157b bVar) {
        this(inputStream, bVar, 65536);
    }

    /* renamed from: c */
    public static IOException m101659c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public final int mo66379a(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = this.f57457d;
        if (i2 == -1 || this.f57458e - i2 >= (i = this.f57456c)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f57457d = -1;
                this.f57458e = 0;
                this.f57455b = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f57455b == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f57459f.mo65932c(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f57454a = bArr2;
            this.f57459f.mo65934e(bArr);
            bArr = bArr2;
        } else if (i2 > 0) {
            System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
        }
        int i3 = this.f57458e - this.f57457d;
        this.f57458e = i3;
        this.f57457d = 0;
        this.f57455b = 0;
        int read2 = inputStream.read(bArr, i3, bArr.length - i3);
        int i4 = this.f57458e;
        if (read2 > 0) {
            i4 += read2;
        }
        this.f57455b = i4;
        return read2;
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f57454a == null || inputStream == null) {
            throw m101659c();
        }
        return (this.f57455b - this.f57458e) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void mo66381b() {
        this.f57456c = this.f57454a.length;
    }

    public void close() throws IOException {
        if (this.f57454a != null) {
            this.f57459f.mo65934e(this.f57454a);
            this.f57454a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f57456c = Math.max(this.f57456c, i);
        this.f57457d = this.f57458e;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0018=Splitter:B:11:0x0018, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f57454a     // Catch:{ all -> 0x003e }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r2 = r5.f57458e     // Catch:{ all -> 0x003e }
            int r3 = r5.f57455b     // Catch:{ all -> 0x003e }
            r4 = -1
            if (r2 < r3) goto L_0x0018
            int r1 = r5.mo66379a(r1, r0)     // Catch:{ all -> 0x003e }
            if (r1 != r4) goto L_0x0018
            monitor-exit(r5)
            return r4
        L_0x0018:
            byte[] r1 = r5.f57454a     // Catch:{ all -> 0x003e }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r5.f57454a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            java.io.IOException r0 = m101659c()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x0026:
            int r1 = r5.f57455b     // Catch:{ all -> 0x003e }
            int r2 = r5.f57458e     // Catch:{ all -> 0x003e }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r5.f57458e = r1     // Catch:{ all -> 0x003e }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0037:
            monitor-exit(r5)
            return r4
        L_0x0039:
            java.io.IOException r0 = m101659c()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.read():int");
    }

    public synchronized void release() {
        if (this.f57454a != null) {
            this.f57459f.mo65934e(this.f57454a);
            this.f57454a = null;
        }
    }

    public synchronized void reset() throws IOException {
        if (this.f57454a != null) {
            int i = this.f57457d;
            if (-1 != i) {
                this.f57458e = i;
            } else {
                throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f57458e + " markLimit: " + this.f57456c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f57454a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f57455b;
                int i2 = this.f57458e;
                if (((long) (i - i2)) >= j) {
                    this.f57458e = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.f57458e = i;
                if (this.f57457d == -1 || j > ((long) this.f57456c)) {
                    long skip = inputStream.skip(j - j2);
                    if (skip > 0) {
                        this.f57457d = -1;
                    }
                    return j2 + skip;
                } else if (mo66379a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f57455b;
                    int i4 = this.f57458e;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f57458e = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) i3)) - ((long) i4);
                    this.f57458e = i3;
                    return j3;
                }
            } else {
                throw m101659c();
            }
        } else {
            throw m101659c();
        }
    }

    @C0344h1
    public RecyclableBufferedInputStream(@C0359n0 InputStream inputStream, @C0359n0 C22157b bVar, int i) {
        super(inputStream);
        this.f57457d = -1;
        this.f57459f = bVar;
        this.f57454a = (byte[]) bVar.mo65932c(i, byte[].class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0047, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0054, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(@androidx.annotation.C0359n0 byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f57454a     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008b
            if (r9 != 0) goto L_0x000a
            monitor-exit(r6)
            r7 = 0
            return r7
        L_0x000a:
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0086
            int r2 = r6.f57458e     // Catch:{ all -> 0x0090 }
            int r3 = r6.f57455b     // Catch:{ all -> 0x0090 }
            if (r2 >= r3) goto L_0x0032
            int r4 = r3 - r2
            if (r4 < r9) goto L_0x001a
            r3 = r9
            goto L_0x001b
        L_0x001a:
            int r3 = r3 - r2
        L_0x001b:
            java.lang.System.arraycopy(r0, r2, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r2 = r6.f57458e     // Catch:{ all -> 0x0090 }
            int r2 = r2 + r3
            r6.f57458e = r2     // Catch:{ all -> 0x0090 }
            if (r3 == r9) goto L_0x0030
            int r2 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r2 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            int r8 = r8 + r3
            int r2 = r9 - r3
            goto L_0x0033
        L_0x0030:
            monitor-exit(r6)
            return r3
        L_0x0032:
            r2 = r9
        L_0x0033:
            int r3 = r6.f57457d     // Catch:{ all -> 0x0090 }
            r4 = -1
            if (r3 != r4) goto L_0x0048
            int r3 = r0.length     // Catch:{ all -> 0x0090 }
            if (r2 < r3) goto L_0x0048
            int r3 = r1.read(r7, r8, r2)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0076
            if (r2 != r9) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            int r4 = r9 - r2
        L_0x0046:
            monitor-exit(r6)
            return r4
        L_0x0048:
            int r3 = r6.mo66379a(r1, r0)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0055
            if (r2 != r9) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            int r4 = r9 - r2
        L_0x0053:
            monitor-exit(r6)
            return r4
        L_0x0055:
            byte[] r3 = r6.f57454a     // Catch:{ all -> 0x0090 }
            if (r0 == r3) goto L_0x0063
            byte[] r0 = r6.f57454a     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x005e
            goto L_0x0063
        L_0x005e:
            java.io.IOException r7 = m101659c()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0063:
            int r3 = r6.f57455b     // Catch:{ all -> 0x0090 }
            int r4 = r6.f57458e     // Catch:{ all -> 0x0090 }
            int r5 = r3 - r4
            if (r5 < r2) goto L_0x006d
            r3 = r2
            goto L_0x006e
        L_0x006d:
            int r3 = r3 - r4
        L_0x006e:
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r4 = r6.f57458e     // Catch:{ all -> 0x0090 }
            int r4 = r4 + r3
            r6.f57458e = r4     // Catch:{ all -> 0x0090 }
        L_0x0076:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x007b
            monitor-exit(r6)
            return r9
        L_0x007b:
            int r4 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r4 != 0) goto L_0x0084
            int r9 = r9 - r2
            monitor-exit(r6)
            return r9
        L_0x0084:
            int r8 = r8 + r3
            goto L_0x0033
        L_0x0086:
            java.io.IOException r7 = m101659c()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x008b:
            java.io.IOException r7 = m101659c()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.read(byte[], int, int):int");
    }
}
