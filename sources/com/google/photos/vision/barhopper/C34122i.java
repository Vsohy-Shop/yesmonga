package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;

/* renamed from: com.google.photos.vision.barhopper.i */
public final class C34122i extends C39003o2<C34122i, C34120h> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C34122i zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private byte zzh = 2;

    static {
        C34122i iVar = new C34122i();
        zza = iVar;
        C39003o2.m160640w(C34122i.class, iVar);
    }

    /* renamed from: C */
    public static C34122i m137119C() {
        return zza;
    }

    /* renamed from: D */
    public final String mo99093D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final String mo99094E() {
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
            return C39003o2.m160639v(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C34122i();
        } else {
            if (i2 == 4) {
                return new C34120h((C34108b) null);
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
