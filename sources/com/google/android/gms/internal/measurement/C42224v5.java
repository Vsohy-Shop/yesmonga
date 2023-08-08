package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v5 */
public final class C42224v5 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42224v5 zza;
    private int zzd;
    private String zze = "";
    private C42296z9 zzf = C42177s9.m170821q();

    static {
        C42224v5 v5Var = new C42224v5();
        zza = v5Var;
        C42177s9.m170825w(C42224v5.class, v5Var);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C41892c6.class});
        } else if (i2 == 3) {
            return new C42224v5();
        } else {
            if (i2 == 4) {
                return new C42207u5((C42156r5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final String mo137371C() {
        return this.zze;
    }

    /* renamed from: D */
    public final List mo137372D() {
        return this.zzf;
    }
}
