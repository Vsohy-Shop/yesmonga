package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s4 */
public final class C42172s4 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42172s4 zza;
    private int zzd;
    private int zze;
    private C42071m5 zzf;
    private C42071m5 zzg;
    private boolean zzh;

    static {
        C42172s4 s4Var = new C42172s4();
        zza = s4Var;
        C42177s9.m170825w(C42172s4.class, s4Var);
    }

    /* renamed from: C */
    public static C42155r4 m170795C() {
        return (C42155r4) zza.mo137277j();
    }

    /* renamed from: G */
    public static /* synthetic */ void m170797G(C42172s4 s4Var, int i) {
        s4Var.zzd |= 1;
        s4Var.zze = i;
    }

    /* renamed from: H */
    public static /* synthetic */ void m170798H(C42172s4 s4Var, C42071m5 m5Var) {
        m5Var.getClass();
        s4Var.zzf = m5Var;
        s4Var.zzd |= 2;
    }

    /* renamed from: I */
    public static /* synthetic */ void m170799I(C42172s4 s4Var, C42071m5 m5Var) {
        s4Var.zzg = m5Var;
        s4Var.zzd |= 4;
    }

    /* renamed from: J */
    public static /* synthetic */ void m170800J(C42172s4 s4Var, boolean z) {
        s4Var.zzd |= 8;
        s4Var.zzh = z;
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C42172s4();
        } else {
            if (i2 == 4) {
                return new C42155r4((C42087n4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo137262B() {
        return this.zze;
    }

    /* renamed from: E */
    public final C42071m5 mo137263E() {
        C42071m5 m5Var = this.zzf;
        return m5Var == null ? C42071m5.m170540H() : m5Var;
    }

    /* renamed from: F */
    public final C42071m5 mo137264F() {
        C42071m5 m5Var = this.zzg;
        return m5Var == null ? C42071m5.m170540H() : m5Var;
    }

    /* renamed from: K */
    public final boolean mo137265K() {
        return this.zzh;
    }

    /* renamed from: L */
    public final boolean mo137266L() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: M */
    public final boolean mo137267M() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: N */
    public final boolean mo137268N() {
        return (this.zzd & 4) != 0;
    }
}
