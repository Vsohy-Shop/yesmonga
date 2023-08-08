package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39048t2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;

/* renamed from: com.google.barhopper.deeplearning.d */
public final class C32462d extends C39003o2<C32462d, C32461c> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C32462d zza;
    private int zze;
    private C39048t2 zzf = C39003o2.m160633n();
    private C39048t2 zzg = C39003o2.m160633n();
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        C32462d dVar = new C32462d();
        zza = dVar;
        C39003o2.m160640w(C32462d.class, dVar);
    }

    /* renamed from: B */
    public static C32461c m131376B() {
        return (C32461c) zza.mo122988h();
    }

    /* renamed from: D */
    public static /* synthetic */ void m131378D(C32462d dVar, int i) {
        dVar.zze |= 2;
        dVar.zzi = i;
    }

    /* renamed from: E */
    public static /* synthetic */ void m131379E(C32462d dVar, float f) {
        C39048t2 t2Var = dVar.zzf;
        if (!t2Var.mo122767d()) {
            dVar.zzf = C39003o2.m160634o(t2Var);
        }
        dVar.zzf.mo122874V1(f);
    }

    /* renamed from: F */
    public static /* synthetic */ void m131380F(C32462d dVar, float f) {
        C39048t2 t2Var = dVar.zzg;
        if (!t2Var.mo122767d()) {
            dVar.zzg = C39003o2.m160634o(t2Var);
        }
        dVar.zzg.mo122874V1(f);
    }

    /* renamed from: G */
    public static /* synthetic */ void m131381G(C32462d dVar, int i) {
        dVar.zze |= 1;
        dVar.zzh = i;
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C32462d();
        } else {
            if (i2 == 4) {
                return new C32461c((C32460b) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
