package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a7 */
public final class C38870a7 extends C39003o2<C38870a7, C39106z6> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C38870a7 zza;
    private int zze;
    private int zzf;
    private int zzg = 100;
    private int zzh;

    static {
        C38870a7 a7Var = new C38870a7();
        zza = a7Var;
        C39003o2.m160640w(C38870a7.class, a7Var);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", C39097y6.f98973a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C38870a7();
        } else {
            if (i2 == 4) {
                return new C39106z6((C39069v5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
