package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39075w2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;

/* renamed from: com.google.photos.vision.barhopper.b0 */
public final class C34109b0 extends C39003o2<C34109b0, C34107a0> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C34109b0 zza;
    private int zze;
    private String zzf = "";
    private C39075w2<C34110c> zzg = C39003o2.m160636s();

    static {
        C34109b0 b0Var = new C34109b0();
        zza = b0Var;
        C39003o2.m160640w(C34109b0.class, b0Var);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C34110c.class});
        } else if (i2 == 3) {
            return new C34109b0();
        } else {
            if (i2 == 4) {
                return new C34107a0((C34108b) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
