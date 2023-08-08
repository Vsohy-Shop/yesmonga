package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;

/* renamed from: com.google.photos.vision.barhopper.g */
public final class C34118g extends C39003o2<C34118g, C34116f> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C34118g zza;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        C34118g gVar = new C34118g();
        zza = gVar;
        C39003o2.m160640w(C34118g.class, gVar);
    }

    /* renamed from: D */
    public static C34116f m137101D() {
        return (C34116f) zza.mo122988h();
    }

    /* renamed from: F */
    public static /* synthetic */ void m137103F(C34118g gVar, int i) {
        gVar.zze |= 1;
        gVar.zzf = i;
    }

    /* renamed from: G */
    public static /* synthetic */ void m137104G(C34118g gVar, int i) {
        gVar.zze |= 2;
        gVar.zzg = i;
    }

    /* renamed from: B */
    public final int mo99084B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final int mo99085C() {
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
            return C39003o2.m160639v(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C34118g();
        } else {
            if (i2 == 4) {
                return new C34116f((C34108b) null);
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
