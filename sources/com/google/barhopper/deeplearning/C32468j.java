package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39003o2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39048t2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39085x3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39087x5;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdc;

/* renamed from: com.google.barhopper.deeplearning.j */
public final class C32468j extends C39003o2<C32468j, C32467i> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C32468j zza;
    private int zze;
    private String zzf = "";
    private zzdc zzg = zzdc.f99077a;
    private int zzh = 10;
    private float zzi = 0.5f;
    private float zzj = 0.05f;
    private C32465g zzk;
    private C39048t2 zzl = C39003o2.m160633n();
    private int zzm = 1;
    private C39087x5 zzn;
    private int zzo = 320;
    private int zzp = 4;
    private int zzq = 2;

    static {
        C32468j jVar = new C32468j();
        zza = jVar;
        C39003o2.m160640w(C32468j.class, jVar);
    }

    /* renamed from: B */
    public static C32467i m131390B() {
        return (C32467i) zza.mo122988h();
    }

    /* renamed from: D */
    public static /* synthetic */ void m131392D(C32468j jVar, C32465g gVar) {
        gVar.getClass();
        jVar.zzk = gVar;
        jVar.zze |= 32;
    }

    /* renamed from: E */
    public static /* synthetic */ void m131393E(C32468j jVar, zzdc zzdc) {
        zzdc.getClass();
        jVar.zze |= 2;
        jVar.zzg = zzdc;
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\u0007\u0013\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        } else if (i2 == 3) {
            return new C32468j();
        } else {
            if (i2 == 4) {
                return new C32467i((C32466h) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
