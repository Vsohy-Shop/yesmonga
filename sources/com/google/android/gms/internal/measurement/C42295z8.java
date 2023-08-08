package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* renamed from: com.google.android.gms.internal.measurement.z8 */
public abstract class C42295z8 extends C42056l8 {

    /* renamed from: b */
    public static final Logger f106582b = Logger.getLogger(C42295z8.class.getName());

    /* renamed from: c */
    public static final boolean f106583c = C42006ic.m170287C();

    /* renamed from: d */
    public static final /* synthetic */ int f106584d = 0;

    /* renamed from: a */
    public C41859a9 f106585a;

    public C42295z8() {
    }

    /* renamed from: A */
    public static C42295z8 m171209A(byte[] bArr, int i, int i2) {
        return new C42261x8(bArr, 0, i2);
    }

    @Deprecated
    /* renamed from: u */
    public static int m171211u(int i, C42246wa waVar, C41987hb hbVar) {
        int a = ((C41948f8) waVar).mo136761a(hbVar);
        int y = m171215y(i << 3);
        return y + y + a;
    }

    /* renamed from: v */
    public static int m171212v(int i) {
        if (i >= 0) {
            return m171215y(i);
        }
        return 10;
    }

    /* renamed from: w */
    public static int m171213w(C42246wa waVar, C41987hb hbVar) {
        int a = ((C41948f8) waVar).mo136761a(hbVar);
        return m171215y(a) + a;
    }

    /* renamed from: x */
    public static int m171214x(String str) {
        int i;
        try {
            i = C42078mc.m170567c(str);
        } catch (zzny unused) {
            i = str.getBytes(C41860aa.f105996b).length;
        }
        return m171215y(i) + i;
    }

    /* renamed from: y */
    public static int m171215y(int i) {
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

    /* renamed from: z */
    public static int m171216z(long j) {
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
            j >>>= 14;
            i += 2;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: a */
    public final void mo137495a() {
        if (mo137457d() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public final void mo137496b(String str, zzny zzny) throws IOException {
        f106582b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzny);
        byte[] bytes = str.getBytes(C41860aa.f105996b);
        try {
            int length = bytes.length;
            mo137471r(length);
            mo137467n(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(e);
        }
    }

    /* renamed from: d */
    public abstract int mo137457d();

    /* renamed from: e */
    public abstract void mo137458e(byte b) throws IOException;

    /* renamed from: f */
    public abstract void mo137459f(int i, boolean z) throws IOException;

    /* renamed from: g */
    public abstract void mo137460g(int i, zzka zzka) throws IOException;

    /* renamed from: h */
    public abstract void mo137461h(int i, int i2) throws IOException;

    /* renamed from: i */
    public abstract void mo137462i(int i) throws IOException;

    /* renamed from: j */
    public abstract void mo137463j(int i, long j) throws IOException;

    /* renamed from: k */
    public abstract void mo137464k(long j) throws IOException;

    /* renamed from: l */
    public abstract void mo137465l(int i, int i2) throws IOException;

    /* renamed from: m */
    public abstract void mo137466m(int i) throws IOException;

    /* renamed from: n */
    public abstract void mo137467n(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: o */
    public abstract void mo137468o(int i, String str) throws IOException;

    /* renamed from: p */
    public abstract void mo137469p(int i, int i2) throws IOException;

    /* renamed from: q */
    public abstract void mo137470q(int i, int i2) throws IOException;

    /* renamed from: r */
    public abstract void mo137471r(int i) throws IOException;

    /* renamed from: s */
    public abstract void mo137472s(int i, long j) throws IOException;

    /* renamed from: t */
    public abstract void mo137473t(long j) throws IOException;

    public /* synthetic */ C42295z8(C42278y8 y8Var) {
    }
}
