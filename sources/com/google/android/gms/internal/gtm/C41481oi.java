package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.oi */
public final class C41481oi extends C41313hj<C41481oi, C41457ni> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41481oi zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk = "";
    private C41626uj<C41577si> zzl = C41243el.m167469h();
    private byte zzm = 2;

    static {
        C41481oi oiVar = new C41481oi();
        zze = oiVar;
        C41410lj.m168023z(C41481oi.class, oiVar);
    }

    /* renamed from: H */
    public static C41481oi m168121H() {
        return zze;
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        byte b = 1;
        if (i2 == 2) {
            return new C41267fl(zze, "\u0001\u0006\u0000\u0001\u0001ϧ\u0006\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\nဈ\u0004ϧЛ", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", C41577si.class});
        } else if (i2 == 3) {
            return new C41481oi();
        } else {
            if (i2 == 4) {
                return new C41457ni((C41192ci) null);
            }
            if (i2 == 5) {
                return zze;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzm = b;
            return null;
        }
    }
}
