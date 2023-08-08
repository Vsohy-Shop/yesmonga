package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.km */
public final class C41389km extends C41410lj<C41389km, C41388kl> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41389km zza;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        C41389km kmVar = new C41389km();
        zza = kmVar;
        C41410lj.m168023z(C41389km.class, kmVar);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return C41410lj.m168022x(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C41389km();
        } else {
            if (i2 == 4) {
                return new C41388kl((C41354jc) null);
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

    /* renamed from: C */
    public final int mo135586C() {
        return this.zzf;
    }

    /* renamed from: D */
    public final int mo135587D() {
        return this.zzg;
    }
}
