package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a5 */
public final class C41855a5 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C41855a5 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;
    /* access modifiers changed from: private */
    public C42296z9 zzj = C42177s9.m170821q();

    static {
        C41855a5 a5Var = new C41855a5();
        zza = a5Var;
        C42177s9.m170825w(C41855a5.class, a5Var);
    }

    /* renamed from: F */
    public static C42291z4 m169601F() {
        return (C42291z4) zza.mo137277j();
    }

    /* renamed from: K */
    public static /* synthetic */ void m169603K(C41855a5 a5Var, String str) {
        str.getClass();
        a5Var.zzd |= 1;
        a5Var.zze = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m169604L(C41855a5 a5Var, String str) {
        str.getClass();
        a5Var.zzd |= 2;
        a5Var.zzf = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m169605M(C41855a5 a5Var) {
        a5Var.zzd &= -3;
        a5Var.zzf = zza.zzf;
    }

    /* renamed from: N */
    public static /* synthetic */ void m169606N(C41855a5 a5Var, long j) {
        a5Var.zzd |= 4;
        a5Var.zzg = j;
    }

    /* renamed from: O */
    public static /* synthetic */ void m169607O(C41855a5 a5Var) {
        a5Var.zzd &= -5;
        a5Var.zzg = 0;
    }

    /* renamed from: P */
    public static /* synthetic */ void m169608P(C41855a5 a5Var, double d) {
        a5Var.zzd |= 16;
        a5Var.zzi = d;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m169609Q(C41855a5 a5Var) {
        a5Var.zzd &= -17;
        a5Var.zzi = 0.0d;
    }

    /* renamed from: R */
    public static /* synthetic */ void m169610R(C41855a5 a5Var, C41855a5 a5Var2) {
        a5Var2.getClass();
        a5Var.mo136522Z();
        a5Var.zzj.add(a5Var2);
    }

    /* renamed from: S */
    public static /* synthetic */ void m169611S(C41855a5 a5Var, Iterable iterable) {
        a5Var.mo136522Z();
        C41948f8.m169878d(iterable, a5Var.zzj);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C41855a5.class});
        } else if (i2 == 3) {
            return new C41855a5();
        } else {
            if (i2 == 4) {
                return new C42291z4((C42087n4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final double mo136510B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final float mo136511C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final int mo136512D() {
        return this.zzj.size();
    }

    /* renamed from: E */
    public final long mo136513E() {
        return this.zzg;
    }

    /* renamed from: H */
    public final String mo136514H() {
        return this.zze;
    }

    /* renamed from: I */
    public final String mo136515I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final List mo136516J() {
        return this.zzj;
    }

    /* renamed from: U */
    public final boolean mo136517U() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: V */
    public final boolean mo136518V() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: W */
    public final boolean mo136519W() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: X */
    public final boolean mo136520X() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: Y */
    public final boolean mo136521Y() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: Z */
    public final void mo136522Z() {
        C42296z9 z9Var = this.zzj;
        if (!z9Var.mo136871d()) {
            this.zzj = C42177s9.m170822r(z9Var);
        }
    }
}
