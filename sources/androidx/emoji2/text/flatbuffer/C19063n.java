package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: androidx.emoji2.text.flatbuffer.n */
public final class C19063n extends C19072u {

    /* renamed from: androidx.emoji2.text.flatbuffer.n$a */
    public static final class C19064a extends C19046b {
        /* renamed from: f */
        public C19064a mo56213f(int i, int i2, ByteBuffer byteBuffer) {
            mo56079b(i, i2, byteBuffer);
            return this;
        }

        /* renamed from: g */
        public C19063n mo56214g(int i) {
            return mo56215h(new C19063n(), i);
        }

        /* renamed from: h */
        public C19063n mo56215h(C19063n nVar, int i) {
            return nVar.mo56211v(C19072u.m89313c(mo56078a(i), this.f48480d), this.f48480d);
        }
    }

    /* renamed from: A */
    public static void m89223A(C19053i iVar, boolean z) {
        iVar.mo56116b(1, z, false);
    }

    /* renamed from: B */
    public static void m89224B(C19053i iVar, short s) {
        iVar.mo56137p(5, s, 0);
    }

    /* renamed from: C */
    public static void m89225C(C19053i iVar, int i) {
        iVar.mo56132k(0, i, 0);
    }

    /* renamed from: D */
    public static void m89226D(C19053i iVar, short s) {
        iVar.mo56137p(2, s, 0);
    }

    /* renamed from: E */
    public static void m89227E(C19053i iVar, short s) {
        iVar.mo56137p(4, s, 0);
    }

    /* renamed from: M */
    public static int m89228M(C19053i iVar, int[] iArr) {
        iVar.mo56129h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            iVar.mo56131j(iArr[length]);
        }
        return iVar.mo56094E();
    }

    /* renamed from: N */
    public static int m89229N(C19053i iVar, int i, boolean z, short s, short s2, short s3, short s4, int i2) {
        iVar.mo56127g0(7);
        m89237y(iVar, i2);
        m89225C(iVar, i);
        m89224B(iVar, s4);
        m89227E(iVar, s3);
        m89238z(iVar, s2);
        m89226D(iVar, s);
        m89223A(iVar, z);
        return m89230P(iVar);
    }

    /* renamed from: P */
    public static int m89230P(C19053i iVar) {
        return iVar.mo56093D();
    }

    /* renamed from: Q */
    public static C19063n m89231Q(ByteBuffer byteBuffer) {
        return m89232R(byteBuffer, new C19063n());
    }

    /* renamed from: R */
    public static C19063n m89232R(ByteBuffer byteBuffer, C19063n nVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return nVar.mo56211v(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: V */
    public static void m89233V(C19053i iVar, int i) {
        iVar.mo56129h0(4, i, 4);
    }

    /* renamed from: W */
    public static void m89234W(C19053i iVar) {
        iVar.mo56127g0(7);
    }

    /* renamed from: u */
    public static void m89235u() {
        C19051g.m89088a();
    }

    /* renamed from: y */
    public static void m89237y(C19053i iVar, int i) {
        iVar.mo56136o(6, i, 0);
    }

    /* renamed from: z */
    public static void m89238z(C19053i iVar, short s) {
        iVar.mo56137p(3, s, 0);
    }

    /* renamed from: F */
    public int mo56199F(int i) {
        int d = mo56238d(16);
        if (d != 0) {
            return this.f48536b.getInt(mo56243l(d) + (i * 4));
        }
        return 0;
    }

    /* renamed from: G */
    public ByteBuffer mo56200G() {
        return mo56244m(16, 4);
    }

    /* renamed from: H */
    public ByteBuffer mo56201H(ByteBuffer byteBuffer) {
        return mo56245n(byteBuffer, 16, 4);
    }

    /* renamed from: I */
    public int mo56202I() {
        int d = mo56238d(16);
        if (d != 0) {
            return mo56246o(d);
        }
        return 0;
    }

    /* renamed from: J */
    public C19061l mo56203J() {
        return mo56204K(new C19061l());
    }

    /* renamed from: K */
    public C19061l mo56204K(C19061l lVar) {
        int d = mo56238d(16);
        if (d != 0) {
            return lVar.mo56194f(mo56243l(d), this.f48536b);
        }
        return null;
    }

    /* renamed from: L */
    public short mo56205L() {
        int d = mo56238d(10);
        if (d != 0) {
            return this.f48536b.getShort(d + this.f48535a);
        }
        return 0;
    }

    /* renamed from: O */
    public boolean mo56206O() {
        int d = mo56238d(6);
        return (d == 0 || this.f48536b.get(d + this.f48535a) == 0) ? false : true;
    }

    /* renamed from: S */
    public short mo56207S() {
        int d = mo56238d(14);
        if (d != 0) {
            return this.f48536b.getShort(d + this.f48535a);
        }
        return 0;
    }

    /* renamed from: T */
    public int mo56208T() {
        int d = mo56238d(4);
        if (d != 0) {
            return this.f48536b.getInt(d + this.f48535a);
        }
        return 0;
    }

    /* renamed from: U */
    public short mo56209U() {
        int d = mo56238d(8);
        if (d != 0) {
            return this.f48536b.getShort(d + this.f48535a);
        }
        return 0;
    }

    /* renamed from: X */
    public short mo56210X() {
        int d = mo56238d(12);
        if (d != 0) {
            return this.f48536b.getShort(d + this.f48535a);
        }
        return 0;
    }

    /* renamed from: v */
    public C19063n mo56211v(int i, ByteBuffer byteBuffer) {
        mo56212w(i, byteBuffer);
        return this;
    }

    /* renamed from: w */
    public void mo56212w(int i, ByteBuffer byteBuffer) {
        mo56240g(i, byteBuffer);
    }
}
