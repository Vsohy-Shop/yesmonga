package com.google.android.gms.internal.gtm;

import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.a */
public final class C41125a extends C41410lj<C41125a, C41725ym> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41125a zza;
    private int zze;
    private C41626uj<String> zzf = C41410lj.m168019t();
    private C41626uj<String> zzg = C41410lj.m168019t();
    private C41626uj<C41365k> zzh = C41410lj.m168019t();
    private C41626uj<C41389km> zzi = C41410lj.m168019t();
    private C41626uj<C41647vg> zzj = C41410lj.m168019t();
    private C41626uj<C41647vg> zzk = C41410lj.m168019t();
    private C41626uj<C41647vg> zzl = C41410lj.m168019t();
    private C41626uj<C41173c> zzm = C41410lj.m168019t();
    private String zzn = "";
    private String zzo = "";
    private String zzp = "0";
    private String zzq = "";
    private C41406lf zzr;
    private float zzs;
    private boolean zzt;
    private C41626uj<String> zzu = C41410lj.m168019t();
    private int zzv;
    private byte zzw = 2;

    static {
        C41125a aVar = new C41125a();
        zza = aVar;
        C41410lj.m168023z(C41125a.class, aVar);
    }

    /* renamed from: K */
    public static C41725ym m167030K() {
        return (C41725ym) zza.mo135630l();
    }

    /* renamed from: M */
    public static C41125a m167032M() {
        return zza;
    }

    /* renamed from: N */
    public static C41125a m167033N(byte[] bArr, C41673wi wiVar) throws zzvk {
        return (C41125a) C41410lj.m168016q(zza, bArr, wiVar);
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzw);
        }
        byte b = 1;
        if (i2 == 2) {
            Class<C41647vg> cls = C41647vg.class;
            return C41410lj.m168022x(zza, "\u0001\u0011\u0000\u0001\u0001\u0013\u0011\u0000\t\u0005\u0001\u001a\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007\u001b\tဈ\u0000\nဈ\u0001\fဈ\u0002\rဈ\u0003\u000eဉ\u0004\u000fခ\u0005\u0010\u001a\u0011င\u0007\u0012ဇ\u0006\u0013\u001a", new Object[]{"zze", "zzg", "zzh", C41365k.class, "zzi", C41389km.class, "zzj", cls, "zzk", cls, "zzl", cls, "zzm", C41173c.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzu", "zzv", "zzt", "zzf"});
        } else if (i2 == 3) {
            return new C41125a();
        } else {
            if (i2 == 4) {
                return new C41725ym((C41354jc) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzw = b;
            return null;
        }
    }

    /* renamed from: C */
    public final int mo134975C() {
        return this.zzj.size();
    }

    /* renamed from: D */
    public final int mo134976D() {
        return this.zzl.size();
    }

    /* renamed from: E */
    public final int mo134977E() {
        return this.zzv;
    }

    /* renamed from: F */
    public final int mo134978F() {
        return this.zzk.size();
    }

    /* renamed from: G */
    public final int mo134979G() {
        return this.zzh.size();
    }

    /* renamed from: H */
    public final C41647vg mo134980H(int i) {
        return this.zzj.get(i);
    }

    /* renamed from: I */
    public final C41647vg mo134981I(int i) {
        return this.zzl.get(i);
    }

    /* renamed from: J */
    public final C41647vg mo134982J(int i) {
        return this.zzk.get(i);
    }

    /* renamed from: O */
    public final C41365k mo134983O(int i) {
        return this.zzh.get(i);
    }

    /* renamed from: P */
    public final String mo134984P() {
        return this.zzq;
    }

    /* renamed from: Q */
    public final List<String> mo134985Q() {
        return this.zzg;
    }

    /* renamed from: R */
    public final List<C41389km> mo134986R() {
        return this.zzi;
    }

    /* renamed from: S */
    public final List<C41173c> mo134987S() {
        return this.zzm;
    }

    /* renamed from: T */
    public final List<C41365k> mo134988T() {
        return this.zzh;
    }
}
