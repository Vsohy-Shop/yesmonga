package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f7 */
public final class C38920f7 extends C39003o2<C38920f7, C38928g5> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C38920f7 zza;
    private int zze;
    private int zzf = 17;
    private C39075w2<C38962k> zzg = C39003o2.m160636s();
    private int zzh;
    private C38941h8 zzi;
    private C38891c8 zzj;
    private C39080w7 zzk;
    private int zzl;
    private C39075w2<C38991n> zzm = C39003o2.m160636s();
    private byte zzn = 2;

    static {
        C38920f7 f7Var = new C38920f7();
        zza = f7Var;
        C39003o2.m160640w(C38920f7.class, f7Var);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        byte b = 1;
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001ဌ\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zze", "zzf", C38909e6.f98838a, "zzg", C38962k.class, "zzh", "zzi", "zzj", "zzl", "zzm", C38991n.class, "zzk"});
        } else if (i2 == 3) {
            return new C38920f7();
        } else {
            if (i2 == 4) {
                return new C38928g5((C38937h4) null);
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
