package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z5 */
public final class C39105z5 extends C39003o2<C39105z5, C39096y5> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C39105z5 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C39105z5 z5Var = new C39105z5();
        zza = z5Var;
        C39003o2.m160640w(C39105z5.class, z5Var);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C39105z5();
        } else {
            if (i2 == 4) {
                return new C39096y5((C39069v5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
