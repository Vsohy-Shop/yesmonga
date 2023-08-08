package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.hi */
public final class C41312hi extends C41410lj<C41312hi, C41288gi> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41312hi zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C41312hi hiVar = new C41312hi();
        zza = hiVar;
        C41410lj.m168023z(C41312hi.class, hiVar);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C41267fl(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C41312hi();
        } else {
            if (i2 == 4) {
                return new C41288gi((C41192ci) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
