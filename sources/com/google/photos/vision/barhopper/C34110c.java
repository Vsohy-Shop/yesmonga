package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;

/* renamed from: com.google.photos.vision.barhopper.c */
public final class C34110c extends C39003o2<C34110c, C34137p0> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C34110c zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzn = "";

    static {
        C34110c cVar = new C34110c();
        zza = cVar;
        C39003o2.m160640w(C34110c.class, cVar);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        } else if (i2 == 3) {
            return new C34110c();
        } else {
            if (i2 == 4) {
                return new C34137p0((C34108b) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
