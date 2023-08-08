package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u1 */
public abstract class C39056u1 extends C38914f1 {

    /* renamed from: b */
    public static final Logger f98943b = Logger.getLogger(C39056u1.class.getName());

    /* renamed from: c */
    public static final boolean f98944c = C39024q5.m160708C();

    /* renamed from: a */
    public C39065v1 f98945a;

    public C39056u1() {
    }

    /* renamed from: A */
    public static int m160848A(byte[] bArr) {
        int length = bArr.length;
        return m160858d(length) + length;
    }

    /* renamed from: B */
    public static int m160849B(zzdc zzdc) {
        int k = zzdc.mo123184k();
        return m160858d(k) + k;
    }

    @Deprecated
    /* renamed from: C */
    public static int m160850C(int i, C39076w3 w3Var, C39014p4 p4Var) {
        int d = m160858d(i << 3);
        int i2 = d + d;
        C39091y0 y0Var = (C39091y0) w3Var;
        int a = y0Var.mo122983a();
        if (a == -1) {
            a = p4Var.mo122788b(y0Var);
            y0Var.mo122987g(a);
        }
        return i2 + a;
    }

    @Deprecated
    /* renamed from: D */
    public static int m160851D(C39076w3 w3Var) {
        return w3Var.mo122992x();
    }

    /* renamed from: E */
    public static int m160852E(int i) {
        if (i >= 0) {
            return m160858d(i);
        }
        return 10;
    }

    /* renamed from: F */
    public static int m160853F(C38886c3 c3Var) {
        int a = c3Var.mo122807a();
        return m160858d(a) + a;
    }

    /* renamed from: G */
    public static int m160854G(C39076w3 w3Var) {
        int x = w3Var.mo122992x();
        return m160858d(x) + x;
    }

    /* renamed from: a */
    public static int m160855a(C39076w3 w3Var, C39014p4 p4Var) {
        C39091y0 y0Var = (C39091y0) w3Var;
        int a = y0Var.mo122983a();
        if (a == -1) {
            a = p4Var.mo122788b(y0Var);
            y0Var.mo122987g(a);
        }
        return m160858d(a) + a;
    }

    /* renamed from: b */
    public static int m160856b(String str) {
        int i;
        try {
            i = C39060u5.m160887e(str);
        } catch (zzhn unused) {
            i = str.getBytes(C39084x2.f98960a).length;
        }
        return m160858d(i) + i;
    }

    /* renamed from: c */
    public static int m160857c(int i) {
        return m160858d(i << 3);
    }

    /* renamed from: d */
    public static int m160858d(int i) {
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

    /* renamed from: e */
    public static int m160859e(long j) {
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

    /* renamed from: f */
    public static C39056u1 m160860f(byte[] bArr) {
        return new C39038s1(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public final void mo123059g() {
        if (mo123033j() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: h */
    public final void mo123060h(String str, zzhn zzhn) throws IOException {
        f98943b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzhn);
        byte[] bytes = str.getBytes(C39084x2.f98960a);
        try {
            int length = bytes.length;
            mo123047x(length);
            mo123043t(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzdi(e);
        } catch (zzdi e2) {
            throw e2;
        }
    }

    /* renamed from: j */
    public abstract int mo123033j();

    /* renamed from: k */
    public abstract void mo123034k(byte b) throws IOException;

    /* renamed from: l */
    public abstract void mo123035l(int i, boolean z) throws IOException;

    /* renamed from: m */
    public abstract void mo123036m(int i, zzdc zzdc) throws IOException;

    /* renamed from: n */
    public abstract void mo123037n(int i, int i2) throws IOException;

    /* renamed from: o */
    public abstract void mo123038o(int i) throws IOException;

    /* renamed from: p */
    public abstract void mo123039p(int i, long j) throws IOException;

    /* renamed from: q */
    public abstract void mo123040q(long j) throws IOException;

    /* renamed from: r */
    public abstract void mo123041r(int i, int i2) throws IOException;

    /* renamed from: s */
    public abstract void mo123042s(int i) throws IOException;

    /* renamed from: t */
    public abstract void mo123043t(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: u */
    public abstract void mo123044u(int i, String str) throws IOException;

    /* renamed from: v */
    public abstract void mo123045v(int i, int i2) throws IOException;

    /* renamed from: w */
    public abstract void mo123046w(int i, int i2) throws IOException;

    /* renamed from: x */
    public abstract void mo123047x(int i) throws IOException;

    /* renamed from: y */
    public abstract void mo123048y(int i, long j) throws IOException;

    /* renamed from: z */
    public abstract void mo123049z(long j) throws IOException;

    public /* synthetic */ C39056u1(C39047t1 t1Var) {
    }
}
