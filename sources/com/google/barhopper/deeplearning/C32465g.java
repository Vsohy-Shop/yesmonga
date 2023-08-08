package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39075w2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;

/* renamed from: com.google.barhopper.deeplearning.g */
public final class C32465g extends C39003o2<C32465g, C32464f> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C32465g zza;
    private C39075w2<C32462d> zze = C39003o2.m160636s();

    static {
        C32465g gVar = new C32465g();
        zza = gVar;
        C39003o2.m160640w(C32465g.class, gVar);
    }

    /* renamed from: B */
    public static C32464f m131384B() {
        return (C32464f) zza.mo122988h();
    }

    /* renamed from: D */
    public static /* synthetic */ void m131386D(C32465g gVar, C32462d dVar) {
        dVar.getClass();
        C39075w2<C32462d> w2Var = gVar.zze;
        if (!w2Var.mo122767d()) {
            gVar.zze = C39003o2.m160637t(w2Var);
        }
        gVar.zze.add(dVar);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C32462d.class});
        } else if (i2 == 3) {
            return new C32465g();
        } else {
            if (i2 == 4) {
                return new C32464f((C32463e) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
