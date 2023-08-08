package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.android.volley.toolbox.y */
public class C21836y extends ByteArrayOutputStream {

    /* renamed from: b */
    public static final int f56483b = 256;

    /* renamed from: a */
    public final C21801h f56484a;

    public C21836y(C21801h hVar) {
        this(hVar, 256);
    }

    /* renamed from: a */
    public final void mo65060a(int i) {
        int i2 = this.count;
        if (i2 + i > this.buf.length) {
            byte[] a = this.f56484a.mo65002a((i2 + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f56484a.mo65003b(this.buf);
            this.buf = a;
        }
    }

    public void close() throws IOException {
        this.f56484a.mo65003b(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f56484a.mo65003b(this.buf);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        mo65060a(i2);
        super.write(bArr, i, i2);
    }

    public C21836y(C21801h hVar, int i) {
        this.f56484a = hVar;
        this.buf = hVar.mo65002a(Math.max(i, 256));
    }

    public synchronized void write(int i) {
        mo65060a(1);
        super.write(i);
    }
}
