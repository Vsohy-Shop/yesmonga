package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q5 */
public final class C42139q5 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42139q5 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C42139q5 q5Var = new C42139q5();
        zza = q5Var;
        C42177s9.m170825w(C42139q5.class, q5Var);
    }

    /* renamed from: E */
    public static C42122p5 m170743E() {
        return (C42122p5) zza.mo137277j();
    }

    /* renamed from: I */
    public static /* synthetic */ void m170745I(C42139q5 q5Var, long j) {
        q5Var.zzd |= 1;
        q5Var.zze = j;
    }

    /* renamed from: J */
    public static /* synthetic */ void m170746J(C42139q5 q5Var, String str) {
        str.getClass();
        q5Var.zzd |= 2;
        q5Var.zzf = str;
    }

    /* renamed from: K */
    public static /* synthetic */ void m170747K(C42139q5 q5Var, String str) {
        str.getClass();
        q5Var.zzd |= 4;
        q5Var.zzg = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m170748L(C42139q5 q5Var) {
        q5Var.zzd &= -5;
        q5Var.zzg = zza.zzg;
    }

    /* renamed from: M */
    public static /* synthetic */ void m170749M(C42139q5 q5Var, long j) {
        q5Var.zzd |= 8;
        q5Var.zzh = j;
    }

    /* renamed from: N */
    public static /* synthetic */ void m170750N(C42139q5 q5Var) {
        q5Var.zzd &= -9;
        q5Var.zzh = 0;
    }

    /* renamed from: O */
    public static /* synthetic */ void m170751O(C42139q5 q5Var, double d) {
        q5Var.zzd |= 32;
        q5Var.zzj = d;
    }

    /* renamed from: P */
    public static /* synthetic */ void m170752P(C42139q5 q5Var) {
        q5Var.zzd &= -33;
        q5Var.zzj = 0.0d;
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C42139q5();
        } else {
            if (i2 == 4) {
                return new C42122p5((C42087n4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final double mo137230B() {
        return this.zzj;
    }

    /* renamed from: C */
    public final long mo137231C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final long mo137232D() {
        return this.zze;
    }

    /* renamed from: G */
    public final String mo137233G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final String mo137234H() {
        return this.zzg;
    }

    /* renamed from: Q */
    public final boolean mo137235Q() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: R */
    public final boolean mo137236R() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: S */
    public final boolean mo137237S() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: T */
    public final boolean mo137238T() {
        return (this.zzd & 4) != 0;
    }
}
