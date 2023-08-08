package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.e7 */
public final class C41229e7 extends C41410lj<C41229e7, C41204d6> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41229e7 zza;
    private int zze;
    private String zzf = "";
    private C41365k zzg;
    private byte zzh = 2;

    static {
        C41229e7 e7Var = new C41229e7();
        zza = e7Var;
        C41410lj.m168023z(C41229e7.class, e7Var);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return C41410lj.m168022x(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C41229e7();
        } else {
            if (i2 == 4) {
                return new C41204d6((C41727z0) null);
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
