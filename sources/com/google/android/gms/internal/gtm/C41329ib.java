package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.ib */
public final class C41329ib extends C41410lj<C41329ib, C41304ha> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41329ib zza;
    private C41626uj<C41279g9> zze = C41410lj.m168019t();
    private C41626uj<C41179c5> zzf = C41410lj.m168019t();
    private byte zzg = 2;

    static {
        C41329ib ibVar = new C41329ib();
        zza = ibVar;
        C41410lj.m168023z(C41329ib.class, ibVar);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        byte b = 1;
        if (i2 == 2) {
            return C41410lj.m168022x(zza, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"zze", C41279g9.class, "zzf", C41179c5.class});
        } else if (i2 == 3) {
            return new C41329ib();
        } else {
            if (i2 == 4) {
                return new C41304ha((C41727z0) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzg = b;
            return null;
        }
    }
}
