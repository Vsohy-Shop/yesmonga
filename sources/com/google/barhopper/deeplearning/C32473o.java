package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc;

/* renamed from: com.google.barhopper.deeplearning.o */
public final class C32473o extends C39003o2<C32473o, C32472n> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C32473o zza;
    private int zze;
    private String zzf = "";
    private zzdc zzg;
    private String zzh;
    private zzdc zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;

    static {
        C32473o oVar = new C32473o();
        zza = oVar;
        C39003o2.m160640w(C32473o.class, oVar);
    }

    public C32473o() {
        zzdc zzdc = zzdc.f99077a;
        this.zzg = zzdc;
        this.zzh = "";
        this.zzi = zzdc;
        this.zzj = 0.25f;
        this.zzk = 0.25f;
        this.zzl = 0.5f;
        this.zzm = 0.85f;
        this.zzn = 1;
    }

    /* renamed from: B */
    public static C32472n m131399B() {
        return (C32472n) zza.mo122988h();
    }

    /* renamed from: D */
    public static /* synthetic */ void m131401D(C32473o oVar, zzdc zzdc) {
        zzdc.getClass();
        oVar.zze |= 2;
        oVar.zzg = zzdc;
    }

    /* renamed from: E */
    public static /* synthetic */ void m131402E(C32473o oVar, zzdc zzdc) {
        zzdc.getClass();
        oVar.zze |= 8;
        oVar.zzi = zzdc;
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        } else if (i2 == 3) {
            return new C32473o();
        } else {
            if (i2 == 4) {
                return new C32472n((C32471m) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
