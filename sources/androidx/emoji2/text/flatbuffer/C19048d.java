package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: androidx.emoji2.text.flatbuffer.d */
public class C19048d implements C19068q {

    /* renamed from: a */
    public final ByteBuffer f48481a;

    public C19048d(ByteBuffer byteBuffer) {
        this.f48481a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: B */
    public void mo56050B(int i, double d) {
        mo56055c(i + 8);
        this.f48481a.putDouble(i, d);
    }

    /* renamed from: C */
    public boolean mo56051C(int i) {
        return get(i) != 0;
    }

    /* renamed from: F */
    public void mo56052F(int i, long j) {
        mo56055c(i + 8);
        this.f48481a.putLong(i, j);
    }

    /* renamed from: a */
    public void mo56053a(int i, byte[] bArr, int i2, int i3) {
        mo56055c((i3 - i2) + i);
        int position = this.f48481a.position();
        this.f48481a.position(i);
        this.f48481a.put(bArr, i2, i3);
        this.f48481a.position(position);
    }

    /* renamed from: b */
    public void mo56054b(double d) {
        this.f48481a.putDouble(d);
    }

    /* renamed from: c */
    public boolean mo56055c(int i) {
        return i <= this.f48481a.limit();
    }

    /* renamed from: d */
    public void mo56056d(int i, byte b) {
        mo56055c(i + 1);
        this.f48481a.put(i, b);
    }

    /* renamed from: e */
    public byte[] mo56057e() {
        return this.f48481a.array();
    }

    /* renamed from: f */
    public String mo56058f(int i, int i2) {
        return Utf8Safe.m89027h(this.f48481a, i, i2);
    }

    /* renamed from: g */
    public int mo56059g() {
        return this.f48481a.position();
    }

    public byte get(int i) {
        return this.f48481a.get(i);
    }

    public double getDouble(int i) {
        return this.f48481a.getDouble(i);
    }

    public float getFloat(int i) {
        return this.f48481a.getFloat(i);
    }

    public int getInt(int i) {
        return this.f48481a.getInt(i);
    }

    public long getLong(int i) {
        return this.f48481a.getLong(i);
    }

    public short getShort(int i) {
        return this.f48481a.getShort(i);
    }

    /* renamed from: h */
    public void mo56066h(float f) {
        this.f48481a.putFloat(f);
    }

    /* renamed from: i */
    public void mo56067i(byte b) {
        this.f48481a.put(b);
    }

    /* renamed from: j */
    public void mo56068j(short s) {
        this.f48481a.putShort(s);
    }

    /* renamed from: k */
    public void mo56069k(int i, short s) {
        mo56055c(i + 2);
        this.f48481a.putShort(i, s);
    }

    /* renamed from: l */
    public void mo56070l(boolean z) {
        this.f48481a.put(z ? (byte) 1 : 0);
    }

    public int limit() {
        return this.f48481a.limit();
    }

    /* renamed from: m */
    public void mo56072m(int i) {
        this.f48481a.putInt(i);
    }

    /* renamed from: n */
    public void mo56073n(byte[] bArr, int i, int i2) {
        this.f48481a.put(bArr, i, i2);
    }

    /* renamed from: o */
    public void mo56074o(int i, int i2) {
        mo56055c(i + 4);
        this.f48481a.putInt(i, i2);
    }

    /* renamed from: p */
    public void mo56075p(long j) {
        this.f48481a.putLong(j);
    }

    /* renamed from: t */
    public void mo56076t(int i, float f) {
        mo56055c(i + 4);
        this.f48481a.putFloat(i, f);
    }

    /* renamed from: u */
    public void mo56077u(int i, boolean z) {
        mo56056d(i, z ? (byte) 1 : 0);
    }
}
