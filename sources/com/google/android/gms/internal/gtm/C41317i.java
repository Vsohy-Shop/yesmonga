package com.google.android.gms.internal.gtm;

import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.i */
public final class C41317i extends C41410lj<C41317i, C41293h> implements C41651vk {
    /* access modifiers changed from: private */
    public static final C41317i zza;
    private int zze;
    /* access modifiers changed from: private */
    public C41626uj<C41269g> zzf = C41410lj.m168019t();
    private C41125a zzg;
    private String zzh = "";
    private byte zzi = 2;

    static {
        C41317i iVar = new C41317i();
        zza = iVar;
        C41410lj.m168023z(C41317i.class, iVar);
    }

    /* renamed from: E */
    public static C41293h m167674E() {
        return (C41293h) zza.mo135630l();
    }

    /* renamed from: G */
    public static C41317i m167676G() {
        return zza;
    }

    /* renamed from: H */
    public static C41317i m167677H(byte[] bArr, C41673wi wiVar) throws zzvk {
        return (C41317i) C41410lj.m168016q(zza, bArr, wiVar);
    }

    /* renamed from: L */
    public static /* synthetic */ void m167679L(C41317i iVar, C41125a aVar) {
        aVar.getClass();
        iVar.zzg = aVar;
        iVar.zze |= 1;
    }

    /* renamed from: M */
    public static /* synthetic */ void m167680M(C41317i iVar, String str) {
        str.getClass();
        iVar.zze |= 2;
        iVar.zzh = str;
    }

    /* renamed from: A */
    public final Object mo134974A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        byte b = 1;
        if (i2 == 2) {
            return C41410lj.m168022x(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ဈ\u0001", new Object[]{"zze", "zzf", C41269g.class, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C41317i();
        } else {
            if (i2 == 4) {
                return new C41293h((C41354jc) null);
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
    public final int mo135474C() {
        return this.zzf.size();
    }

    /* renamed from: D */
    public final C41125a mo135475D() {
        C41125a aVar = this.zzg;
        if (aVar == null) {
            return C41125a.m167032M();
        }
        return aVar;
    }

    /* renamed from: I */
    public final String mo135476I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final List<C41269g> mo135477J() {
        return this.zzf;
    }

    /* renamed from: N */
    public final boolean mo135478N() {
        return (this.zze & 1) != 0;
    }
}
