package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k3 */
public final class C42033k3 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42033k3 zza;
    private int zzd;
    private int zze;
    private C42296z9 zzf = C42177s9.m170821q();
    private C42296z9 zzg = C42177s9.m170821q();
    private boolean zzh;
    private boolean zzi;

    static {
        C42033k3 k3Var = new C42033k3();
        zza = k3Var;
        C42177s9.m170825w(C42033k3.class, k3Var);
    }

    /* renamed from: J */
    public static /* synthetic */ void m170434J(C42033k3 k3Var, int i, C42222v3 v3Var) {
        v3Var.getClass();
        C42296z9 z9Var = k3Var.zzf;
        if (!z9Var.mo136871d()) {
            k3Var.zzf = C42177s9.m170822r(z9Var);
        }
        k3Var.zzf.set(i, v3Var);
    }

    /* renamed from: K */
    public static /* synthetic */ void m170435K(C42033k3 k3Var, int i, C42069m3 m3Var) {
        m3Var.getClass();
        C42296z9 z9Var = k3Var.zzg;
        if (!z9Var.mo136871d()) {
            k3Var.zzg = C42177s9.m170822r(z9Var);
        }
        k3Var.zzg.set(i, m3Var);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", C42222v3.class, "zzg", C42069m3.class, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C42033k3();
        } else {
            if (i2 == 4) {
                return new C42015j3((C41997i3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo137060B() {
        return this.zze;
    }

    /* renamed from: C */
    public final int mo137061C() {
        return this.zzg.size();
    }

    /* renamed from: D */
    public final int mo137062D() {
        return this.zzf.size();
    }

    /* renamed from: F */
    public final C42069m3 mo137063F(int i) {
        return (C42069m3) this.zzg.get(i);
    }

    /* renamed from: G */
    public final C42222v3 mo137064G(int i) {
        return (C42222v3) this.zzf.get(i);
    }

    /* renamed from: H */
    public final List mo137065H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final List mo137066I() {
        return this.zzf;
    }

    /* renamed from: L */
    public final boolean mo137067L() {
        return (this.zzd & 1) != 0;
    }
}
