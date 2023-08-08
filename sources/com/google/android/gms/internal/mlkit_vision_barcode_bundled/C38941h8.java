package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h8 */
public final class C38941h8 extends C39003o2<C38941h8, C38931g8> implements C39085x3 {
    public static final C38985m2<C39080w7, C38941h8> zza;
    /* access modifiers changed from: private */
    public static final C38941h8 zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private C39080w7 zzi;
    private byte zzj = 2;

    static {
        C38941h8 h8Var = new C38941h8();
        zze = h8Var;
        C39003o2.m160640w(C38941h8.class, h8Var);
        zza = C39003o2.m160629j(C39080w7.m160960D(), h8Var, h8Var, (C39030r2) null, 13258261, zzhp.MESSAGE, C38941h8.class);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        byte b = 1;
        if (i2 == 2) {
            return C39003o2.m160639v(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C38941h8();
        } else {
            if (i2 == 4) {
                return new C38931g8((C38921f8) null);
            }
            if (i2 == 5) {
                return zze;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzj = b;
            return null;
        }
    }
}
