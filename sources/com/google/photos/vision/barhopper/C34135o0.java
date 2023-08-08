package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;

/* renamed from: com.google.photos.vision.barhopper.o0 */
public final class C34135o0 extends C39003o2<C34135o0, C34127k0> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C34135o0 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C34135o0 o0Var = new C34135o0();
        zza = o0Var;
        C39003o2.m160640w(C34135o0.class, o0Var);
    }

    /* renamed from: C */
    public static C34135o0 m137150C() {
        return zza;
    }

    /* renamed from: D */
    public final String mo99112D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final String mo99113E() {
        return this.zzi;
    }

    /* renamed from: F */
    public final String mo99114F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final int mo99115G() {
        int a = C34133n0.m137147a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", C34131m0.f82771a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C34135o0();
        } else {
            if (i2 == 4) {
                return new C34127k0((C34108b) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
