package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n */
public final class C38991n extends C39003o2<C38991n, C38982m> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C38991n zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        C38991n nVar = new C38991n();
        zza = nVar;
        C39003o2.m160640w(C38991n.class, nVar);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C38991n();
        } else {
            if (i2 == 4) {
                return new C38982m((C38972l) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
