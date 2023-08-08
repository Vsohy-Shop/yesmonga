package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j7 */
public final class C38960j7 extends C39003o2<C38960j7, C38950i7> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C38960j7 zza;
    private int zze;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        C38960j7 j7Var = new C38960j7();
        zza = j7Var;
        C39003o2.m160640w(C38960j7.class, j7Var);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C38960j7();
        } else {
            if (i2 == 4) {
                return new C38950i7((C39069v5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
