package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: com.google.android.gms.internal.gtm.ai */
public abstract class C41144ai extends C41335ih {

    /* renamed from: b */
    public static final Logger f104442b = Logger.getLogger(C41144ai.class.getName());

    /* renamed from: c */
    public static final boolean f104443c = C41340im.m167740C();

    /* renamed from: a */
    public C41168bi f104444a;

    public C41144ai() {
    }

    /* renamed from: A */
    public static int m167084A(byte[] bArr) {
        int length = bArr.length;
        return m167094d(length) + length;
    }

    /* renamed from: B */
    public static int m167085B(zztd zztd) {
        int i = zztd.mo136144i();
        return m167094d(i) + i;
    }

    @Deprecated
    /* renamed from: C */
    public static int m167086C(int i, C41627uk ukVar, C41315hl hlVar) {
        int d = m167094d(i << 3);
        int i2 = d + d;
        C41695xg xgVar = (C41695xg) ukVar;
        int a = xgVar.mo135622a();
        if (a == -1) {
            a = hlVar.mo135456b(xgVar);
            xgVar.mo135629k(a);
        }
        return i2 + a;
    }

    @Deprecated
    /* renamed from: D */
    public static int m167087D(C41627uk ukVar) {
        return ukVar.mo135623b();
    }

    /* renamed from: E */
    public static int m167088E(int i) {
        if (i >= 0) {
            return m167094d(i);
        }
        return 10;
    }

    /* renamed from: F */
    public static int m167089F(C41146ak akVar) {
        int a = akVar.mo135033a();
        return m167094d(a) + a;
    }

    /* renamed from: G */
    public static int m167090G(C41627uk ukVar) {
        int b = ukVar.mo135623b();
        return m167094d(b) + b;
    }

    /* renamed from: a */
    public static int m167091a(C41627uk ukVar, C41315hl hlVar) {
        C41695xg xgVar = (C41695xg) ukVar;
        int a = xgVar.mo135622a();
        if (a == -1) {
            a = hlVar.mo135456b(xgVar);
            xgVar.mo135629k(a);
        }
        return m167094d(a) + a;
    }

    /* renamed from: b */
    public static int m167092b(String str) {
        int i;
        try {
            i = C41461nm.m168094c(str);
        } catch (zzyc unused) {
            i = str.getBytes(C41650vj.f105169a).length;
        }
        return m167094d(i) + i;
    }

    /* renamed from: c */
    public static int m167093c(int i) {
        return m167094d(i << 3);
    }

    /* renamed from: d */
    public static int m167094d(int i) {
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
    public static int m167095e(long j) {
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
    public static C41144ai m167096f(byte[] bArr) {
        return new C41720yh(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public final void mo135007g() {
        if (mo135009j() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: h */
    public final void mo135008h(String str, zzyc zzyc) throws IOException {
        f104442b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzyc);
        byte[] bytes = str.getBytes(C41650vj.f105169a);
        try {
            int length = bytes.length;
            mo135023x(length);
            mo135019t(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zztm(e);
        } catch (zztm e2) {
            throw e2;
        }
    }

    /* renamed from: j */
    public abstract int mo135009j();

    /* renamed from: k */
    public abstract void mo135010k(byte b) throws IOException;

    /* renamed from: l */
    public abstract void mo135011l(int i, boolean z) throws IOException;

    /* renamed from: m */
    public abstract void mo135012m(int i, zztd zztd) throws IOException;

    /* renamed from: n */
    public abstract void mo135013n(int i, int i2) throws IOException;

    /* renamed from: o */
    public abstract void mo135014o(int i) throws IOException;

    /* renamed from: p */
    public abstract void mo135015p(int i, long j) throws IOException;

    /* renamed from: q */
    public abstract void mo135016q(long j) throws IOException;

    /* renamed from: r */
    public abstract void mo135017r(int i, int i2) throws IOException;

    /* renamed from: s */
    public abstract void mo135018s(int i) throws IOException;

    /* renamed from: t */
    public abstract void mo135019t(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: u */
    public abstract void mo135020u(int i, String str) throws IOException;

    /* renamed from: v */
    public abstract void mo135021v(int i, int i2) throws IOException;

    /* renamed from: w */
    public abstract void mo135022w(int i, int i2) throws IOException;

    /* renamed from: x */
    public abstract void mo135023x(int i) throws IOException;

    /* renamed from: y */
    public abstract void mo135024y(int i, long j) throws IOException;

    /* renamed from: z */
    public abstract void mo135025z(long j) throws IOException;

    public /* synthetic */ C41144ai(C41744zh zhVar) {
    }
}
