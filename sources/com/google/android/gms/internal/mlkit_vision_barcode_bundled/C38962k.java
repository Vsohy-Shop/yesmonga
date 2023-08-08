package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.k */
public final class C38962k extends C39003o2<C38962k, C38942i> implements C39085x3 {
    public static final C38985m2<C39080w7, C38962k> zza;
    private static final C39066v2<Integer, Object> zze = new C38932h();
    /* access modifiers changed from: private */
    public static final C38962k zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private C39057u2 zzj = C39003o2.m160635p();
    private String zzk = "";
    private String zzl = "";
    private C38971k8 zzm;
    private C39080w7 zzn;
    private byte zzo = 2;

    static {
        C38962k kVar = new C38962k();
        zzf = kVar;
        C39003o2.m160640w(C38962k.class, kVar);
        zza = C39003o2.m160629j(C39080w7.m160960D(), kVar, kVar, (C39030r2) null, 308676116, zzhp.MESSAGE, C38962k.class);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        byte b = 1;
        if (i2 == 2) {
            return C39003o2.m160639v(zzf, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003\u001e\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", C38952j.f98873a, "zzk", "zzl", "zzn", "zzm"});
        } else if (i2 == 3) {
            return new C38962k();
        } else {
            if (i2 == 4) {
                return new C38942i((C38922g) null);
            }
            if (i2 == 5) {
                return zzf;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzo = b;
            return null;
        }
    }
}
