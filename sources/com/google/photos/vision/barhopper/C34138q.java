package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;

/* renamed from: com.google.photos.vision.barhopper.q */
public final class C34138q extends C39003o2<C34138q, C34130m> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C34138q zza;
    private int zze;
    private String zzf = "";
    private int zzg;
    private String zzh = "";
    private boolean zzi;
    private byte zzj = 2;

    static {
        C34138q qVar = new C34138q();
        zza = qVar;
        C39003o2.m160640w(C34138q.class, qVar);
    }

    /* renamed from: C */
    public static C34138q m137158C() {
        return zza;
    }

    /* renamed from: D */
    public final String mo99116D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final String mo99117E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final int mo99118F() {
        int a = C34136p.m137156a(this.zzg);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        byte b = 1;
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", C34134o.f82773a, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C34138q();
        } else {
            if (i2 == 4) {
                return new C34130m((C34108b) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzj = b;
            return null;
        }
    }
}
