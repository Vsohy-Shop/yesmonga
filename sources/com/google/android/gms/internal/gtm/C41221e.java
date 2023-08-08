package com.google.android.gms.internal.gtm;

import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.e */
public final class C41221e extends C41410lj<C41221e, C41197d> implements C41651vk {
    public static final C41361jj<C41365k, C41221e> zza;
    /* access modifiers changed from: private */
    public static final C41221e zze;
    private int zzf;
    private C41554rj zzg = C41410lj.m168018s();
    private C41554rj zzh = C41410lj.m168018s();
    private C41554rj zzi = C41410lj.m168018s();
    private int zzj;
    private C41554rj zzk = C41410lj.m168018s();
    private int zzl;
    private int zzm;

    static {
        C41221e eVar = new C41221e();
        zze = eVar;
        C41410lj.m168023z(C41221e.class, eVar);
        zza = C41410lj.m168013n(C41365k.m167872g0(), eVar, eVar, (C41506pj) null, 101, zzye.MESSAGE, C41221e.class);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C41410lj.m168022x(zze, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004င\u0000\u0005\u0016\u0006င\u0001\u0007င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new C41221e();
        } else {
            if (i2 == 4) {
                return new C41197d((C41354jc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: C */
    public final int mo135304C() {
        return this.zzl;
    }

    /* renamed from: D */
    public final int mo135305D() {
        return this.zzh.size();
    }

    /* renamed from: E */
    public final int mo135306E() {
        return this.zzi.size();
    }

    /* renamed from: G */
    public final List<Integer> mo135307G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final List<Integer> mo135308H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final List<Integer> mo135309I() {
        return this.zzi;
    }

    /* renamed from: J */
    public final List<Integer> mo135310J() {
        return this.zzk;
    }
}
