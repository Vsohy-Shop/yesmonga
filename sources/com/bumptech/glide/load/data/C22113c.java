package com.bumptech.glide.load.data;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.data.c */
public final class C22113c extends OutputStream {
    @C0359n0

    /* renamed from: a */
    public final OutputStream f56799a;

    /* renamed from: b */
    public byte[] f56800b;

    /* renamed from: c */
    public C22157b f56801c;

    /* renamed from: d */
    public int f56802d;

    public C22113c(@C0359n0 OutputStream outputStream, @C0359n0 C22157b bVar) {
        this(outputStream, bVar, 65536);
    }

    /* renamed from: a */
    public final void mo65795a() throws IOException {
        int i = this.f56802d;
        if (i > 0) {
            this.f56799a.write(this.f56800b, 0, i);
            this.f56802d = 0;
        }
    }

    /* renamed from: b */
    public final void mo65796b() throws IOException {
        if (this.f56802d == this.f56800b.length) {
            mo65795a();
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.f56799a.close();
            release();
        } catch (Throwable th) {
            this.f56799a.close();
            throw th;
        }
    }

    public void flush() throws IOException {
        mo65795a();
        this.f56799a.flush();
    }

    public final void release() {
        byte[] bArr = this.f56800b;
        if (bArr != null) {
            this.f56801c.mo65934e(bArr);
            this.f56800b = null;
        }
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f56800b;
        int i2 = this.f56802d;
        this.f56802d = i2 + 1;
        bArr[i2] = (byte) i;
        mo65796b();
    }

    @C0344h1
    public C22113c(@C0359n0 OutputStream outputStream, C22157b bVar, int i) {
        this.f56799a = outputStream;
        this.f56801c = bVar;
        this.f56800b = (byte[]) bVar.mo65932c(i, byte[].class);
    }

    public void write(@C0359n0 byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(@C0359n0 byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f56802d;
            if (i6 != 0 || i4 < this.f56800b.length) {
                int min = Math.min(i4, this.f56800b.length - i6);
                System.arraycopy(bArr, i5, this.f56800b, this.f56802d, min);
                this.f56802d += min;
                i3 += min;
                mo65796b();
            } else {
                this.f56799a.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
