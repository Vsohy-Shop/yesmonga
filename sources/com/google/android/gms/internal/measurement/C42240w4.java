package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w4 */
public final class C42240w4 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42240w4 zza;
    private int zzd;
    /* access modifiers changed from: private */
    public C42296z9 zze = C42177s9.m170821q();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        C42240w4 w4Var = new C42240w4();
        zza = w4Var;
        C42177s9.m170825w(C42240w4.class, w4Var);
    }

    /* renamed from: F */
    public static C42223v4 m171015F() {
        return (C42223v4) zza.mo137277j();
    }

    /* renamed from: K */
    public static /* synthetic */ void m171017K(C42240w4 w4Var, int i, C41855a5 a5Var) {
        a5Var.getClass();
        w4Var.mo137405V();
        w4Var.zze.set(i, a5Var);
    }

    /* renamed from: L */
    public static /* synthetic */ void m171018L(C42240w4 w4Var, C41855a5 a5Var) {
        a5Var.getClass();
        w4Var.mo137405V();
        w4Var.zze.add(a5Var);
    }

    /* renamed from: M */
    public static /* synthetic */ void m171019M(C42240w4 w4Var, Iterable iterable) {
        w4Var.mo137405V();
        C41948f8.m169878d(iterable, w4Var.zze);
    }

    /* renamed from: O */
    public static /* synthetic */ void m171021O(C42240w4 w4Var, int i) {
        w4Var.mo137405V();
        w4Var.zze.remove(i);
    }

    /* renamed from: P */
    public static /* synthetic */ void m171022P(C42240w4 w4Var, String str) {
        str.getClass();
        w4Var.zzd |= 1;
        w4Var.zzf = str;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m171023Q(C42240w4 w4Var, long j) {
        w4Var.zzd |= 2;
        w4Var.zzg = j;
    }

    /* renamed from: R */
    public static /* synthetic */ void m171024R(C42240w4 w4Var, long j) {
        w4Var.zzd |= 4;
        w4Var.zzh = j;
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", C41855a5.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C42240w4();
        } else {
            if (i2 == 4) {
                return new C42223v4((C42087n4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo137395B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final int mo137396C() {
        return this.zze.size();
    }

    /* renamed from: D */
    public final long mo137397D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final long mo137398E() {
        return this.zzg;
    }

    /* renamed from: H */
    public final C41855a5 mo137399H(int i) {
        return (C41855a5) this.zze.get(i);
    }

    /* renamed from: I */
    public final String mo137400I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final List mo137401J() {
        return this.zze;
    }

    /* renamed from: S */
    public final boolean mo137402S() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: T */
    public final boolean mo137403T() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: U */
    public final boolean mo137404U() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: V */
    public final void mo137405V() {
        C42296z9 z9Var = this.zze;
        if (!z9Var.mo136871d()) {
            this.zze = C42177s9.m170822r(z9Var);
        }
    }
}
