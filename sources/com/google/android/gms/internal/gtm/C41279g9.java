package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.g9 */
public final class C41279g9 extends C41410lj<C41279g9, C41254f8> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41279g9 zza;
    private int zze;
    private C41626uj<C41179c5> zzf = C41410lj.m168019t();
    private C41626uj<C41179c5> zzg = C41410lj.m168019t();
    private C41626uj<C41179c5> zzh = C41410lj.m168019t();
    private C41626uj<C41179c5> zzi = C41410lj.m168019t();
    private C41626uj<C41179c5> zzj = C41410lj.m168019t();
    private C41626uj<C41179c5> zzk = C41410lj.m168019t();
    private C41365k zzl;
    private byte zzm = 2;

    static {
        C41279g9 g9Var = new C41279g9();
        zza = g9Var;
        C41410lj.m168023z(C41279g9.class, g9Var);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        byte b = 1;
        if (i2 == 2) {
            Class<C41179c5> cls = C41179c5.class;
            return C41410lj.m168022x(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0007\u0001Л\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0000", new Object[]{"zze", "zzf", cls, "zzg", cls, "zzh", cls, "zzi", cls, "zzj", cls, "zzk", cls, "zzl"});
        } else if (i2 == 3) {
            return new C41279g9();
        } else {
            if (i2 == 4) {
                return new C41254f8((C41727z0) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzm = b;
            return null;
        }
    }
}
