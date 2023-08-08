package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.wm */
public final class C41677wm extends C41410lj<C41677wm, C41605tm> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41677wm zza;
    private C41626uj<C41653vm> zze = C41410lj.m168019t();
    private byte zzf = 2;

    static {
        C41677wm wmVar = new C41677wm();
        zza = wmVar;
        C41410lj.m168023z(C41677wm.class, wmVar);
    }

    /* renamed from: D */
    public static C41677wm m168689D() {
        return zza;
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzf);
        }
        byte b = 1;
        if (i2 == 2) {
            return C41410lj.m168022x(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zze", C41653vm.class});
        } else if (i2 == 3) {
            return new C41677wm();
        } else {
            if (i2 == 4) {
                return new C41605tm((C41557rm) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzf = b;
            return null;
        }
    }
}
