package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c8 */
public final class C38891c8 extends C39003o2<C38891c8, C38881b8> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C38891c8 zza;
    private int zze;
    private C39057u2 zzf = C39003o2.m160635p();
    private C39048t2 zzg = C39003o2.m160633n();
    private boolean zzh = true;
    private String zzi = "";
    private String zzj = "";
    private C39080w7 zzk;
    private byte zzl = 2;

    static {
        C38891c8 c8Var = new C38891c8();
        zza = c8Var;
        C39003o2.m160640w(C38891c8.class, c8Var);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b = 1;
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C38891c8();
        } else {
            if (i2 == 4) {
                return new C38881b8((C38871a8) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzl = b;
            return null;
        }
    }
}
