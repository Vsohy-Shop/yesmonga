package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k5 */
public final class C42035k5 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42035k5 zza;
    private int zzd;
    private int zze = 1;
    private C42296z9 zzf = C42177s9.m170821q();

    static {
        C42035k5 k5Var = new C42035k5();
        zza = k5Var;
        C42177s9.m170825w(C42035k5.class, k5Var);
    }

    /* renamed from: B */
    public static C41999i5 m170447B() {
        return (C41999i5) zza.mo137277j();
    }

    /* renamed from: D */
    public static /* synthetic */ void m170449D(C42035k5 k5Var, C42274y4 y4Var) {
        y4Var.getClass();
        C42296z9 z9Var = k5Var.zzf;
        if (!z9Var.mo136871d()) {
            k5Var.zzf = C42177s9.m170822r(z9Var);
        }
        k5Var.zzf.add(y4Var);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", C42017j5.f106232a, "zzf", C42274y4.class});
        } else if (i2 == 3) {
            return new C42035k5();
        } else {
            if (i2 == 4) {
                return new C41999i5((C42087n4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
