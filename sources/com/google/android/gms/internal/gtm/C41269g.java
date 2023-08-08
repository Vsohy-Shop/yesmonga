package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.g */
public final class C41269g extends C41410lj<C41269g, C41245f> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41269g zza;
    private int zze;
    private String zzf = "";
    private C41365k zzg;
    private C41387kk zzh;
    private byte zzi = 2;

    static {
        C41269g gVar = new C41269g();
        zza = gVar;
        C41410lj.m168023z(C41269g.class, gVar);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        byte b = 1;
        if (i2 == 2) {
            return C41410lj.m168022x(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C41269g();
        } else {
            if (i2 == 4) {
                return new C41245f((C41354jc) null);
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

    /* renamed from: C */
    public final C41387kk mo135388C() {
        C41387kk kkVar = this.zzh;
        if (kkVar == null) {
            return C41387kk.m167964D();
        }
        return kkVar;
    }

    /* renamed from: E */
    public final String mo135389E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final boolean mo135390F() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: G */
    public final boolean mo135391G() {
        return (this.zze & 1) != 0;
    }
}
