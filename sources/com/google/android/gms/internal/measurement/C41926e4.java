package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e4 */
public final class C41926e4 extends C42177s9 implements C42263xa {
    /* access modifiers changed from: private */
    public static final C41926e4 zza;
    private int zzd;
    private String zze = "";
    private C42296z9 zzf = C42177s9.m170821q();
    private boolean zzg;

    static {
        C41926e4 e4Var = new C41926e4();
        zza = e4Var;
        C42177s9.m170825w(C41926e4.class, e4Var);
    }

    /* renamed from: A */
    public final Object mo136501A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C42177s9.m170824t(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", C42034k4.class, "zzg"});
        } else if (i2 == 3) {
            return new C41926e4();
        } else {
            if (i2 == 4) {
                return new C41908d4((C41872b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final String mo136709C() {
        return this.zze;
    }
}
