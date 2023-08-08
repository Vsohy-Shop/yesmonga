package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c */
public final class C38882c extends C39003o2<C38882c, C38872b> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C38882c zza;
    private int zze;
    private C38912f zzf;
    private boolean zzg;

    static {
        C38882c cVar = new C38882c();
        zza = cVar;
        C39003o2.m160640w(C38882c.class, cVar);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C38882c();
        } else {
            if (i2 == 4) {
                return new C38872b((C38981l8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
