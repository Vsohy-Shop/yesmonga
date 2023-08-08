package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x5 */
public final class C42258x5 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42258x5 zza;
    private int zzd;
    private C42296z9 zze = C42177s9.m170821q();
    private C42190t5 zzf;

    static {
        C42258x5 x5Var = new C42258x5();
        zza = x5Var;
        C42177s9.m170825w(C42258x5.class, x5Var);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", C41892c6.class, "zzf"});
        } else if (i2 == 3) {
            return new C42258x5();
        } else {
            if (i2 == 4) {
                return new C42241w5((C42156r5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final C42190t5 mo137451B() {
        C42190t5 t5Var = this.zzf;
        return t5Var == null ? C42190t5.m170865D() : t5Var;
    }

    /* renamed from: D */
    public final List mo137452D() {
        return this.zze;
    }
}
