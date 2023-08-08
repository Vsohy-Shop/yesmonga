package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k4 */
public final class C42034k4 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C42034k4 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C42034k4 k4Var = new C42034k4();
        zza = k4Var;
        C42177s9.m170825w(C42034k4.class, k4Var);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C42034k4();
        } else {
            if (i2 == 4) {
                return new C42016j4((C41872b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
