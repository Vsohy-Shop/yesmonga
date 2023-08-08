package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m5 */
public final class C42071m5 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42071m5 zza;
    /* access modifiers changed from: private */
    public C42279y9 zzd = C42177s9.m170819o();
    /* access modifiers changed from: private */
    public C42279y9 zze = C42177s9.m170819o();
    /* access modifiers changed from: private */
    public C42296z9 zzf = C42177s9.m170821q();
    /* access modifiers changed from: private */
    public C42296z9 zzg = C42177s9.m170821q();

    static {
        C42071m5 m5Var = new C42071m5();
        zza = m5Var;
        C42177s9.m170825w(C42071m5.class, m5Var);
    }

    /* renamed from: F */
    public static C42053l5 m170538F() {
        return (C42053l5) zza.mo137277j();
    }

    /* renamed from: H */
    public static C42071m5 m170540H() {
        return zza;
    }

    /* renamed from: M */
    public static /* synthetic */ void m170541M(C42071m5 m5Var, Iterable iterable) {
        C42279y9 y9Var = m5Var.zzd;
        if (!y9Var.mo136871d()) {
            m5Var.zzd = C42177s9.m170820p(y9Var);
        }
        C41948f8.m169878d(iterable, m5Var.zzd);
    }

    /* renamed from: O */
    public static /* synthetic */ void m170543O(C42071m5 m5Var, Iterable iterable) {
        C42279y9 y9Var = m5Var.zze;
        if (!y9Var.mo136871d()) {
            m5Var.zze = C42177s9.m170820p(y9Var);
        }
        C41948f8.m169878d(iterable, m5Var.zze);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m170545Q(C42071m5 m5Var, Iterable iterable) {
        C42296z9 z9Var = m5Var.zzf;
        if (!z9Var.mo136871d()) {
            m5Var.zzf = C42177s9.m170822r(z9Var);
        }
        C41948f8.m169878d(iterable, m5Var.zzf);
    }

    /* renamed from: S */
    public static /* synthetic */ void m170547S(C42071m5 m5Var, Iterable iterable) {
        C42296z9 z9Var = m5Var.zzg;
        if (!z9Var.mo136871d()) {
            m5Var.zzg = C42177s9.m170822r(z9Var);
        }
        C41948f8.m169878d(iterable, m5Var.zzg);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", C42206u4.class, "zzg", C42105o5.class});
        } else if (i2 == 3) {
            return new C42071m5();
        } else {
            if (i2 == 4) {
                return new C42053l5((C42087n4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo137143B() {
        return this.zzf.size();
    }

    /* renamed from: C */
    public final int mo137144C() {
        return this.zze.size();
    }

    /* renamed from: D */
    public final int mo137145D() {
        return this.zzg.size();
    }

    /* renamed from: E */
    public final int mo137146E() {
        return this.zzd.size();
    }

    /* renamed from: I */
    public final List mo137147I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final List mo137148J() {
        return this.zze;
    }

    /* renamed from: K */
    public final List mo137149K() {
        return this.zzg;
    }

    /* renamed from: L */
    public final List mo137150L() {
        return this.zzd;
    }
}
