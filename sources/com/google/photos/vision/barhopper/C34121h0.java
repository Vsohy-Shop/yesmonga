package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39010p0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39028r0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39073w0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39075w2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;
import java.util.List;

/* renamed from: com.google.photos.vision.barhopper.h0 */
public final class C34121h0 extends C39003o2<C34121h0, C34119g0> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C34121h0 zza;
    private int zze;
    private C39028r0 zzf;
    private String zzg = "";
    private String zzh = "";
    private C39075w2<C39073w0> zzi = C39003o2.m160636s();
    private C39075w2<C34135o0> zzj = C39003o2.m160636s();
    private C39075w2<String> zzk = C39003o2.m160636s();
    private C39075w2<C39010p0> zzl = C39003o2.m160636s();
    private String zzm = "";
    private byte zzn = 2;

    static {
        C34121h0 h0Var = new C34121h0();
        zza = h0Var;
        C39003o2.m160640w(C34121h0.class, h0Var);
    }

    /* renamed from: D */
    public static C34121h0 m137109D() {
        return zza;
    }

    /* renamed from: B */
    public final C39028r0 mo99086B() {
        C39028r0 r0Var = this.zzf;
        if (r0Var == null) {
            return C39028r0.m160739C();
        }
        return r0Var;
    }

    /* renamed from: E */
    public final String mo99087E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final String mo99088F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final List<C39010p0> mo99089G() {
        return this.zzl;
    }

    /* renamed from: H */
    public final List<C34135o0> mo99090H() {
        return this.zzj;
    }

    /* renamed from: I */
    public final List<C39073w0> mo99091I() {
        return this.zzi;
    }

    /* renamed from: J */
    public final List<String> mo99092J() {
        return this.zzk;
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        byte b = 1;
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C39073w0.class, "zzj", C34135o0.class, "zzk", "zzl", C39010p0.class, "zzm"});
        } else if (i2 == 3) {
            return new C34121h0();
        } else {
            if (i2 == 4) {
                return new C34119g0((C34108b) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzn = b;
            return null;
        }
    }
}
