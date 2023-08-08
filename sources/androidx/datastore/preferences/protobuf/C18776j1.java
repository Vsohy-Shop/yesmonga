package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.j1 */
public class C18776j1 extends InputStream {

    /* renamed from: a */
    public Iterator<ByteBuffer> f47879a;

    /* renamed from: b */
    public ByteBuffer f47880b;

    /* renamed from: c */
    public int f47881c = 0;

    /* renamed from: d */
    public int f47882d;

    /* renamed from: e */
    public int f47883e;

    /* renamed from: f */
    public boolean f47884f;

    /* renamed from: g */
    public byte[] f47885g;

    /* renamed from: v */
    public int f47886v;

    /* renamed from: w */
    public long f47887w;

    public C18776j1(Iterable<ByteBuffer> iterable) {
        this.f47879a = iterable.iterator();
        for (ByteBuffer next : iterable) {
            this.f47881c++;
        }
        this.f47882d = -1;
        if (!mo54856a()) {
            this.f47880b = C18753i1.f47864e;
            this.f47882d = 0;
            this.f47883e = 0;
            this.f47887w = 0;
        }
    }

    /* renamed from: a */
    public final boolean mo54856a() {
        this.f47882d++;
        if (!this.f47879a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f47879a.next();
        this.f47880b = next;
        this.f47883e = next.position();
        if (this.f47880b.hasArray()) {
            this.f47884f = true;
            this.f47885g = this.f47880b.array();
            this.f47886v = this.f47880b.arrayOffset();
        } else {
            this.f47884f = false;
            this.f47887w = C18923z3.m88396i(this.f47880b);
            this.f47885g = null;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo54857b(int i) {
        int i2 = this.f47883e + i;
        this.f47883e = i2;
        if (i2 == this.f47880b.limit()) {
            mo54856a();
        }
    }

    public int read() throws IOException {
        if (this.f47882d == this.f47881c) {
            return -1;
        }
        if (this.f47884f) {
            byte b = this.f47885g[this.f47883e + this.f47886v] & 255;
            mo54857b(1);
            return b;
        }
        byte y = C18923z3.m88424y(((long) this.f47883e) + this.f47887w) & 255;
        mo54857b(1);
        return y;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f47882d == this.f47881c) {
            return -1;
        }
        int limit = this.f47880b.limit();
        int i3 = this.f47883e;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f47884f) {
            System.arraycopy(this.f47885g, i3 + this.f47886v, bArr, i, i2);
            mo54857b(i2);
        } else {
            int position = this.f47880b.position();
            this.f47880b.position(this.f47883e);
            this.f47880b.get(bArr, i, i2);
            this.f47880b.position(position);
            mo54857b(i2);
        }
        return i2;
    }
}
