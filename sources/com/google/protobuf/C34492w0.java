package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.protobuf.w0 */
public class C34492w0 extends InputStream {

    /* renamed from: a */
    public Iterator<ByteBuffer> f83549a;

    /* renamed from: b */
    public ByteBuffer f83550b;

    /* renamed from: c */
    public int f83551c = 0;

    /* renamed from: d */
    public int f83552d;

    /* renamed from: e */
    public int f83553e;

    /* renamed from: f */
    public boolean f83554f;

    /* renamed from: g */
    public byte[] f83555g;

    /* renamed from: v */
    public int f83556v;

    /* renamed from: w */
    public long f83557w;

    public C34492w0(Iterable<ByteBuffer> iterable) {
        this.f83549a = iterable.iterator();
        for (ByteBuffer next : iterable) {
            this.f83551c++;
        }
        this.f83552d = -1;
        if (!mo101655a()) {
            this.f83550b = C34471v0.f83533e;
            this.f83552d = 0;
            this.f83553e = 0;
            this.f83557w = 0;
        }
    }

    /* renamed from: a */
    public final boolean mo101655a() {
        this.f83552d++;
        if (!this.f83549a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f83549a.next();
        this.f83550b = next;
        this.f83553e = next.position();
        if (this.f83550b.hasArray()) {
            this.f83554f = true;
            this.f83555g = this.f83550b.array();
            this.f83556v = this.f83550b.arrayOffset();
        } else {
            this.f83554f = false;
            this.f83557w = C34341c3.m138997k(this.f83550b);
            this.f83555g = null;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo101656b(int i) {
        int i2 = this.f83553e + i;
        this.f83553e = i2;
        if (i2 == this.f83550b.limit()) {
            mo101655a();
        }
    }

    public int read() throws IOException {
        if (this.f83552d == this.f83551c) {
            return -1;
        }
        if (this.f83554f) {
            byte b = this.f83555g[this.f83553e + this.f83556v] & 255;
            mo101656b(1);
            return b;
        }
        byte A = C34341c3.m138951A(((long) this.f83553e) + this.f83557w) & 255;
        mo101656b(1);
        return A;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f83552d == this.f83551c) {
            return -1;
        }
        int limit = this.f83550b.limit();
        int i3 = this.f83553e;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f83554f) {
            System.arraycopy(this.f83555g, i3 + this.f83556v, bArr, i, i2);
            mo101656b(i2);
        } else {
            int position = this.f83550b.position();
            this.f83550b.position(this.f83553e);
            this.f83550b.get(bArr, i, i2);
            this.f83550b.position(position);
            mo101656b(i2);
        }
        return i2;
    }
}
