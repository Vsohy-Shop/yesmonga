package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;

/* renamed from: com.google.photos.vision.barhopper.d0 */
public final class C34113d0 extends C39003o2<C34113d0, C34111c0> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C34113d0 zza;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;

    static {
        C34113d0 d0Var = new C34113d0();
        zza = d0Var;
        C39003o2.m160640w(C34113d0.class, d0Var);
    }

    /* renamed from: I */
    public static C34113d0 m137075I() {
        return zza;
    }

    /* renamed from: B */
    public final int mo99066B() {
        return this.zzh;
    }

    /* renamed from: C */
    public final int mo99067C() {
        return this.zzi;
    }

    /* renamed from: D */
    public final int mo99068D() {
        return this.zzj;
    }

    /* renamed from: E */
    public final int mo99069E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final int mo99070F() {
        return this.zzk;
    }

    /* renamed from: G */
    public final int mo99071G() {
        return this.zzf;
    }

    /* renamed from: J */
    public final boolean mo99072J() {
        return this.zzl;
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C34113d0();
        } else {
            if (i2 == 4) {
                return new C34111c0((C34108b) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
