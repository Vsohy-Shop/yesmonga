package com.google.android.gms.internal.gtm;

import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.kk */
public final class C41387kk extends C41410lj<C41387kk, C41434mj> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41387kk zza;
    private C41626uj<C41365k> zze = C41410lj.m168019t();
    private C41626uj<C41365k> zzf = C41410lj.m168019t();
    private C41626uj<C41433mi> zzg = C41410lj.m168019t();
    private byte zzh = 2;

    static {
        C41387kk kkVar = new C41387kk();
        zza = kkVar;
        C41410lj.m168023z(C41387kk.class, kkVar);
    }

    /* renamed from: D */
    public static C41387kk m167964D() {
        return zza;
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            Class<C41365k> cls = C41365k.class;
            return C41410lj.m168022x(zza, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0002\u0001Л\u0002Л\u0003\u001b", new Object[]{"zze", cls, "zzf", cls, "zzg", C41433mi.class});
        } else if (i2 == 3) {
            return new C41387kk();
        } else {
            if (i2 == 4) {
                return new C41434mj((C41354jc) null);
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

    /* renamed from: E */
    public final List<C41433mi> mo135583E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final List<C41365k> mo135584F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final List<C41365k> mo135585G() {
        return this.zze;
    }
}
