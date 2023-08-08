package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;

/* renamed from: com.google.photos.vision.barhopper.e */
public final class C34114e extends C39003o2<C34114e, C34112d> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C34114e zza;
    private int zze;
    private double zzf;
    private double zzg;
    private byte zzh = 2;

    static {
        C34114e eVar = new C34114e();
        zza = eVar;
        C39003o2.m160640w(C34114e.class, eVar);
    }

    /* renamed from: E */
    public static C34114e m137085E() {
        return zza;
    }

    /* renamed from: B */
    public final double mo99073B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final double mo99074C() {
        return this.zzg;
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C34114e();
        } else {
            if (i2 == 4) {
                return new C34112d((C34108b) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
