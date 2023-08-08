package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c5 */
public final class C41891c5 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C41891c5 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private C42138q4 zzg;

    static {
        C41891c5 c5Var = new C41891c5();
        zza = c5Var;
        C42177s9.m170825w(C41891c5.class, c5Var);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C41891c5();
        } else {
            if (i2 == 4) {
                return new C41873b5((C42087n4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
