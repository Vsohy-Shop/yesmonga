package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.ii */
public final class C41336ii extends C41313hj<C41336ii, C41216di> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41336ii zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private C41626uj<C41312hi> zzm = C41243el.m167469h();
    private boolean zzn;
    private boolean zzo = true;
    private boolean zzp;
    private C41626uj<C41577si> zzq = C41243el.m167469h();
    private byte zzr = 2;

    static {
        C41336ii iiVar = new C41336ii();
        zze = iiVar;
        C41410lj.m168023z(C41336ii.class, iiVar);
    }

    /* renamed from: H */
    public static C41336ii m167724H() {
        return zze;
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzr);
        }
        byte b = 1;
        if (i2 == 2) {
            return new C41267fl(zze, "\u0001\u000b\u0000\u0001\u0001ϧ\u000b\u0000\u0002\u0001\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0005ဇ\u0003\u0006ဌ\u0002\nဇ\u0005\u000b\u001b\fဇ\u0006\rဇ\u0007\u000eဇ\bϧЛ", new Object[]{"zzf", "zzg", C41240ei.f104569a, "zzh", "zzk", "zzj", "zzi", C41264fi.f104598a, "zzl", "zzm", C41312hi.class, "zzn", "zzo", "zzp", "zzq", C41577si.class});
        } else if (i2 == 3) {
            return new C41336ii();
        } else {
            if (i2 == 4) {
                return new C41216di((C41192ci) null);
            }
            if (i2 == 5) {
                return zze;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzr = b;
            return null;
        }
    }
}
