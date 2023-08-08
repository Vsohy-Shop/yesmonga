package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h3 */
public final class C38936h3 extends C39003o2<C38936h3, C38955j2> implements C39085x3 {
    public static final C38985m2<C39080w7, C38936h3> zza;
    /* access modifiers changed from: private */
    public static final C38936h3 zze;
    private int zzf;
    private String zzg = "";
    private C39075w2<C38920f7> zzh = C39003o2.m160636s();
    private C39075w2<C39107z7> zzi = C39003o2.m160636s();
    private C39075w2<C38920f7> zzj = C39003o2.m160636s();
    private C39080w7 zzk;
    private C38936h3 zzl;
    private C38971k8 zzm;
    private byte zzn = 2;

    static {
        C38936h3 h3Var = new C38936h3();
        zze = h3Var;
        C39003o2.m160640w(C38936h3.class, h3Var);
        zza = C39003o2.m160629j(C39080w7.m160960D(), h3Var, h3Var, (C39030r2) null, 12208774, zzhp.MESSAGE, C38936h3.class);
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        byte b = 1;
        if (i2 == 2) {
            Class<C38920f7> cls = C38920f7.class;
            return C39003o2.m160639v(zze, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzf", "zzh", cls, "zzj", cls, "zzi", C39107z7.class, "zzk", "zzg", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new C38936h3();
        } else {
            if (i2 == 4) {
                return new C38955j2((C38974l1) null);
            }
            if (i2 == 5) {
                return zze;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzn = b;
            return null;
        }
    }
}
