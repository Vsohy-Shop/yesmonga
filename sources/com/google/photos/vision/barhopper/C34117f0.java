package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;

/* renamed from: com.google.photos.vision.barhopper.f0 */
public final class C34117f0 extends C39003o2<C34117f0, C34115e0> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C34117f0 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private C34113d0 zzk;
    private C34113d0 zzl;

    static {
        C34117f0 f0Var = new C34117f0();
        zza = f0Var;
        C39003o2.m160640w(C34117f0.class, f0Var);
    }

    /* renamed from: E */
    public static C34117f0 m137092E() {
        return zza;
    }

    /* renamed from: B */
    public final C34113d0 mo99077B() {
        C34113d0 d0Var = this.zzl;
        if (d0Var == null) {
            return C34113d0.m137075I();
        }
        return d0Var;
    }

    /* renamed from: C */
    public final C34113d0 mo99078C() {
        C34113d0 d0Var = this.zzk;
        if (d0Var == null) {
            return C34113d0.m137075I();
        }
        return d0Var;
    }

    /* renamed from: F */
    public final String mo99079F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final String mo99080G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final String mo99081H() {
        return this.zzi;
    }

    /* renamed from: I */
    public final String mo99082I() {
        return this.zzj;
    }

    /* renamed from: J */
    public final String mo99083J() {
        return this.zzf;
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C34117f0();
        } else {
            if (i2 == 4) {
                return new C34115e0((C34108b) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
