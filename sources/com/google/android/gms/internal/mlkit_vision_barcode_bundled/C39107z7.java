package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z7 */
public final class C39107z7 extends C39003o2<C39107z7, C39098y7> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C39107z7 zza;
    private int zze;
    private C39075w2<String> zzf = C39003o2.m160636s();
    private String zzg = "";

    static {
        C39107z7 z7Var = new C39107z7();
        zza = z7Var;
        C39003o2.m160640w(C39107z7.class, z7Var);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C39107z7();
        } else {
            if (i2 == 4) {
                return new C39098y7((C39089x7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
