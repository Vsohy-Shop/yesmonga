package com.google.photos.vision.barhopper;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39075w2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39101z1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzep;
import java.util.List;

/* renamed from: com.google.photos.vision.barhopper.a */
public final class C34106a extends C39003o2<C34106a, C34147z> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C34106a zza;
    private int zze;
    private C39075w2<C34140s> zzf = C39003o2.m160636s();
    private int zzg;
    private String zzh = "";
    private zzdc zzi = zzdc.f99077a;
    private byte zzj = 2;

    static {
        C34106a aVar = new C34106a();
        zza = aVar;
        C39003o2.m160640w(C34106a.class, aVar);
    }

    /* renamed from: C */
    public static C34106a m137067C(byte[] bArr, C39101z1 z1Var) throws zzep {
        return (C34106a) C39003o2.m160631l(zza, bArr, z1Var);
    }

    @RecentlyNonNull
    /* renamed from: D */
    public final List<C34140s> mo99065D() {
        return this.zzf;
    }

    @RecentlyNonNull
    /* renamed from: z */
    public final Object mo94469z(int i, @RecentlyNonNull Object obj, @RecentlyNonNull Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        byte b = 1;
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᔌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", C34140s.class, "zzg", C34124j.f82770a, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C34106a();
        } else {
            if (i2 == 4) {
                return new C34147z((C34108b) null);
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
