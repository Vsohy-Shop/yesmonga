package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ry */
public abstract class C29686ry extends C29132cy {

    /* renamed from: b */
    public static final Logger f71442b = Logger.getLogger(C29686ry.class.getName());

    /* renamed from: c */
    public static final boolean f71443c = C29725t.m121126C();

    /* renamed from: d */
    public static final /* synthetic */ int f71444d = 0;

    /* renamed from: a */
    public C29723sy f71445a;

    public C29686ry() {
    }

    /* renamed from: F */
    public static int m121005F(byte[] bArr) {
        int length = bArr.length;
        return m121015f(length) + length;
    }

    /* renamed from: G */
    public static int m121006G(zbwp zbwp) {
        int i = zbwp.mo84991i();
        return m121015f(i) + i;
    }

    @Deprecated
    /* renamed from: H */
    public static int m121007H(int i, x00 x00, j10 j10) {
        int f = m121015f(i << 3);
        int i2 = f + f;
        C29648qx qxVar = (C29648qx) x00;
        int d = qxVar.mo84729d();
        if (d == -1) {
            d = j10.mo84483a(qxVar);
            qxVar.mo84726a(d);
        }
        return i2 + d;
    }

    @Deprecated
    /* renamed from: I */
    public static int m121008I(x00 x00) {
        return x00.mo84727b();
    }

    /* renamed from: J */
    public static int m121009J(int i) {
        if (i >= 0) {
            return m121015f(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m121010a(c00 c00) {
        int a = c00.mo84549a();
        return m121015f(a) + a;
    }

    /* renamed from: b */
    public static int m121011b(x00 x00) {
        int b = x00.mo84727b();
        return m121015f(b) + b;
    }

    /* renamed from: c */
    public static int m121012c(x00 x00, j10 j10) {
        C29648qx qxVar = (C29648qx) x00;
        int d = qxVar.mo84729d();
        if (d == -1) {
            d = j10.mo84483a(qxVar);
            qxVar.mo84726a(d);
        }
        return m121015f(d) + d;
    }

    /* renamed from: d */
    public static int m121013d(String str) {
        int i;
        try {
            i = C29873x.m121297c(str);
        } catch (zbaaw unused) {
            i = str.getBytes(C29909xz.f71541a).length;
        }
        return m121015f(i) + i;
    }

    /* renamed from: e */
    public static int m121014e(int i) {
        return m121015f(i << 3);
    }

    /* renamed from: f */
    public static int m121015f(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m121016g(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((CoroutineScheduler.f29765M0 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: h */
    public static C29686ry m121017h(byte[] bArr) {
        return new C29612py(bArr, 0, bArr.length);
    }

    /* renamed from: A */
    public abstract void mo84765A(int i, int i2) throws IOException;

    /* renamed from: B */
    public abstract void mo84766B(int i, int i2) throws IOException;

    /* renamed from: C */
    public abstract void mo84767C(int i) throws IOException;

    /* renamed from: D */
    public abstract void mo84768D(int i, long j) throws IOException;

    /* renamed from: E */
    public abstract void mo84769E(long j) throws IOException;

    /* renamed from: i */
    public final void mo84814i() {
        if (mo84771l() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: j */
    public final void mo84815j(String str, zbaaw zbaaw) throws IOException {
        f71442b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zbaaw);
        byte[] bytes = str.getBytes(C29909xz.f71541a);
        try {
            int length = bytes.length;
            mo84767C(length);
            mo84782w(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zbwv(e);
        } catch (zbwv e2) {
            throw e2;
        }
    }

    /* renamed from: l */
    public abstract int mo84771l();

    /* renamed from: m */
    public abstract void mo84772m(byte b) throws IOException;

    /* renamed from: n */
    public abstract void mo84773n(int i, boolean z) throws IOException;

    /* renamed from: o */
    public abstract void mo84774o(int i, zbwp zbwp) throws IOException;

    /* renamed from: p */
    public abstract void mo84775p(zbwp zbwp) throws IOException;

    /* renamed from: q */
    public abstract void mo84776q(int i, int i2) throws IOException;

    /* renamed from: r */
    public abstract void mo84777r(int i) throws IOException;

    /* renamed from: s */
    public abstract void mo84778s(int i, long j) throws IOException;

    /* renamed from: t */
    public abstract void mo84779t(long j) throws IOException;

    /* renamed from: u */
    public abstract void mo84780u(int i, int i2) throws IOException;

    /* renamed from: v */
    public abstract void mo84781v(int i) throws IOException;

    /* renamed from: w */
    public abstract void mo84782w(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: x */
    public abstract void mo84783x(x00 x00) throws IOException;

    /* renamed from: y */
    public abstract void mo84784y(int i, String str) throws IOException;

    /* renamed from: z */
    public abstract void mo84785z(String str) throws IOException;

    public /* synthetic */ C29686ry(C29649qy qyVar) {
    }
}
