package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.C19063n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: androidx.emoji2.text.flatbuffer.o */
public final class C19065o extends C19072u {

    /* renamed from: androidx.emoji2.text.flatbuffer.o$a */
    public static final class C19066a extends C19046b {
        /* renamed from: f */
        public C19066a mo56227f(int i, int i2, ByteBuffer byteBuffer) {
            mo56079b(i, i2, byteBuffer);
            return this;
        }

        /* renamed from: g */
        public C19065o mo56228g(int i) {
            return mo56229h(new C19065o(), i);
        }

        /* renamed from: h */
        public C19065o mo56229h(C19065o oVar, int i) {
            return oVar.mo56225v(C19072u.m89313c(mo56078a(i), this.f48480d), this.f48480d);
        }
    }

    /* renamed from: A */
    public static void m89256A(C19053i iVar, int i) {
        iVar.mo56132k(0, i, 0);
    }

    /* renamed from: B */
    public static int m89257B(C19053i iVar, int[] iArr) {
        iVar.mo56129h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            iVar.mo56135n(iArr[length]);
        }
        return iVar.mo56094E();
    }

    /* renamed from: C */
    public static int m89258C(C19053i iVar, int i, int i2, int i3) {
        iVar.mo56127g0(3);
        m89269z(iVar, i3);
        m89268y(iVar, i2);
        m89256A(iVar, i);
        return m89259D(iVar);
    }

    /* renamed from: D */
    public static int m89259D(C19053i iVar) {
        return iVar.mo56093D();
    }

    /* renamed from: E */
    public static void m89260E(C19053i iVar, int i) {
        iVar.mo56095F(i);
    }

    /* renamed from: F */
    public static void m89261F(C19053i iVar, int i) {
        iVar.mo56099J(i);
    }

    /* renamed from: G */
    public static C19065o m89262G(ByteBuffer byteBuffer) {
        return m89263H(byteBuffer, new C19065o());
    }

    /* renamed from: H */
    public static C19065o m89263H(ByteBuffer byteBuffer, C19065o oVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return oVar.mo56225v(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: Q */
    public static void m89264Q(C19053i iVar, int i) {
        iVar.mo56129h0(4, i, 4);
    }

    /* renamed from: R */
    public static void m89265R(C19053i iVar) {
        iVar.mo56127g0(3);
    }

    /* renamed from: u */
    public static void m89266u() {
        C19051g.m89088a();
    }

    /* renamed from: y */
    public static void m89268y(C19053i iVar, int i) {
        iVar.mo56136o(1, i, 0);
    }

    /* renamed from: z */
    public static void m89269z(C19053i iVar, int i) {
        iVar.mo56136o(2, i, 0);
    }

    /* renamed from: I */
    public C19063n mo56216I(int i) {
        return mo56217J(new C19063n(), i);
    }

    /* renamed from: J */
    public C19063n mo56217J(C19063n nVar, int i) {
        int d = mo56238d(6);
        if (d != 0) {
            return nVar.mo56211v(mo56237b(mo56243l(d) + (i * 4)), this.f48536b);
        }
        return null;
    }

    /* renamed from: K */
    public int mo56218K() {
        int d = mo56238d(6);
        if (d != 0) {
            return mo56246o(d);
        }
        return 0;
    }

    /* renamed from: L */
    public C19063n.C19064a mo56219L() {
        return mo56220M(new C19063n.C19064a());
    }

    /* renamed from: M */
    public C19063n.C19064a mo56220M(C19063n.C19064a aVar) {
        int d = mo56238d(6);
        if (d != 0) {
            return aVar.mo56213f(mo56243l(d), 4, this.f48536b);
        }
        return null;
    }

    /* renamed from: N */
    public String mo56221N() {
        int d = mo56238d(8);
        if (d != 0) {
            return mo56241h(d + this.f48535a);
        }
        return null;
    }

    /* renamed from: O */
    public ByteBuffer mo56222O() {
        return mo56244m(8, 1);
    }

    /* renamed from: P */
    public ByteBuffer mo56223P(ByteBuffer byteBuffer) {
        return mo56245n(byteBuffer, 8, 1);
    }

    /* renamed from: S */
    public int mo56224S() {
        int d = mo56238d(4);
        if (d != 0) {
            return this.f48536b.getInt(d + this.f48535a);
        }
        return 0;
    }

    /* renamed from: v */
    public C19065o mo56225v(int i, ByteBuffer byteBuffer) {
        mo56226w(i, byteBuffer);
        return this;
    }

    /* renamed from: w */
    public void mo56226w(int i, ByteBuffer byteBuffer) {
        mo56240g(i, byteBuffer);
    }
}
