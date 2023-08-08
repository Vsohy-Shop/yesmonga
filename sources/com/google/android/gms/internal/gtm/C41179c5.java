package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.c5 */
public final class C41179c5 extends C41410lj<C41179c5, C41154b4> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41179c5 zza;
    private int zze;
    private C41626uj<C41229e7> zzf = C41410lj.m168019t();
    private C41365k zzg;
    private String zzh = "";
    private byte zzi = 2;

    static {
        C41179c5 c5Var = new C41179c5();
        zza = c5Var;
        C41410lj.m168023z(C41179c5.class, c5Var);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        byte b = 1;
        if (i2 == 2) {
            return C41410lj.m168022x(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ဈ\u0001", new Object[]{"zze", "zzf", C41229e7.class, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C41179c5();
        } else {
            if (i2 == 4) {
                return new C41154b4((C41727z0) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzi = b;
            return null;
        }
    }
}
