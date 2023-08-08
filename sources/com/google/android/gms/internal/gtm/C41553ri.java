package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.ri */
public final class C41553ri extends C41410lj<C41553ri, C41529qi> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41553ri zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private byte zzh = 2;

    static {
        C41553ri riVar = new C41553ri();
        zza = riVar;
        C41410lj.m168023z(C41553ri.class, riVar);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return new C41267fl(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C41553ri();
        } else {
            if (i2 == 4) {
                return new C41529qi((C41192ci) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
