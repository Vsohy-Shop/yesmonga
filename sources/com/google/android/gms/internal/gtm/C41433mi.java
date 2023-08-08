package com.google.android.gms.internal.gtm;

/* renamed from: com.google.android.gms.internal.gtm.mi */
public final class C41433mi extends C41410lj<C41433mi, C41480oh> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41433mi zza;
    private int zze;
    private String zzf = "";
    private long zzg;
    private long zzh = 2147483647L;
    private boolean zzi;
    private long zzj;

    static {
        C41433mi miVar = new C41433mi();
        zza = miVar;
        C41410lj.m168023z(C41433mi.class, miVar);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C41410lj.m168022x(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C41433mi();
        } else {
            if (i2 == 4) {
                return new C41480oh((C41354jc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final long mo135646C() {
        return this.zzj;
    }

    /* renamed from: D */
    public final long mo135647D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final long mo135648E() {
        return this.zzg;
    }

    /* renamed from: G */
    public final String mo135649G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean mo135650H() {
        return this.zzi;
    }

    /* renamed from: I */
    public final boolean mo135651I() {
        return (this.zze & 1) != 0;
    }
}
