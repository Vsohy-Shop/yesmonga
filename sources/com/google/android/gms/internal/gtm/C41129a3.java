package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.a3 */
public final class C41129a3 extends C41410lj<C41129a3, C41728z1> implements C41651vk {
    public static final C41361jj<C41365k, C41129a3> zza;
    /* access modifiers changed from: private */
    public static final C41129a3 zze;
    private int zzf;
    private C41329ib zzg;
    private C41179c5 zzh;
    private byte zzi = 2;

    static {
        C41129a3 a3Var = new C41129a3();
        zze = a3Var;
        C41410lj.m168023z(C41129a3.class, a3Var);
        zza = C41410lj.m168013n(C41365k.m167872g0(), a3Var, a3Var, (C41506pj) null, 47497405, zzye.MESSAGE, C41129a3.class);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        byte b = 1;
        if (i2 == 2) {
            return C41410lj.m168022x(zze, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C41129a3();
        } else {
            if (i2 == 4) {
                return new C41728z1((C41727z0) null);
            }
            if (i2 == 5) {
                return zze;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzi = b;
            return null;
        }
    }
}
