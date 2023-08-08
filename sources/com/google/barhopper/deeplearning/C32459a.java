package com.google.barhopper.deeplearning;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;

/* renamed from: com.google.barhopper.deeplearning.a */
public final class C32459a extends C39003o2<C32459a, C32470l> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C32459a zza;
    private int zze;
    private C32468j zzf;
    private C32473o zzg;

    static {
        C32459a aVar = new C32459a();
        zza = aVar;
        C39003o2.m160640w(C32459a.class, aVar);
    }

    /* renamed from: B */
    public static C32470l m131367B() {
        return (C32470l) zza.mo122988h();
    }

    /* renamed from: D */
    public static /* synthetic */ void m131369D(C32459a aVar, C32468j jVar) {
        jVar.getClass();
        aVar.zzf = jVar;
        aVar.zze |= 1;
    }

    /* renamed from: E */
    public static /* synthetic */ void m131370E(C32459a aVar, C32473o oVar) {
        oVar.getClass();
        aVar.zzg = oVar;
        aVar.zze |= 2;
    }

    @RecentlyNonNull
    /* renamed from: z */
    public final Object mo94469z(int i, @RecentlyNonNull Object obj, @RecentlyNonNull Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C32459a();
        } else {
            if (i2 == 4) {
                return new C32470l((C32469k) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
