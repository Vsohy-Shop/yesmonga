package com.google.android.gms.internal.gtm;

import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.vg */
public final class C41647vg extends C41410lj<C41647vg, C41407lg> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41647vg zza;
    private int zze;
    private C41554rj zzf = C41410lj.m168018s();
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private byte zzk = 2;

    static {
        C41647vg vgVar = new C41647vg();
        zza = vgVar;
        C41410lj.m168023z(C41647vg.class, vgVar);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        byte b = 1;
        if (i2 == 2) {
            return C41410lj.m168022x(zza, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001ဇ\u0003\u0002ᔄ\u0000\u0003\u0016\u0004င\u0001\u0006ဇ\u0002", new Object[]{"zze", "zzj", "zzg", "zzf", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C41647vg();
        } else {
            if (i2 == 4) {
                return new C41407lg((C41354jc) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzk = b;
            return null;
        }
    }

    /* renamed from: D */
    public final List<Integer> mo135985D() {
        return this.zzf;
    }
}
