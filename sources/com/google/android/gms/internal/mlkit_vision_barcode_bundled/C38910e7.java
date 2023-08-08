package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e7 */
public final class C38910e7 extends C39003o2<C38910e7, C38900d7> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C38910e7 zza;
    private int zze;
    private String zzf = "";
    private C38980l7 zzg;

    static {
        C38910e7 e7Var = new C38910e7();
        zza = e7Var;
        C39003o2.m160640w(C38910e7.class, e7Var);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C38910e7();
        } else {
            if (i2 == 4) {
                return new C38900d7((C39069v5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
