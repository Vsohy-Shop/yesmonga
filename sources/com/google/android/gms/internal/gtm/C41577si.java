package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.si */
public final class C41577si extends C41410lj<C41577si, C41505pi> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41577si zza;
    private int zze;
    private C41626uj<C41553ri> zzf = C41243el.m167469h();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private double zzj;
    private zztd zzk = zztd.f105744a;
    private String zzl = "";
    private byte zzm = 2;

    static {
        C41577si siVar = new C41577si();
        zza = siVar;
        C41410lj.m168023z(C41577si.class, siVar);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        byte b = 1;
        if (i2 == 2) {
            return new C41267fl(zza, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zze", "zzf", C41553ri.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C41577si();
        } else {
            if (i2 == 4) {
                return new C41505pi((C41192ci) null);
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
