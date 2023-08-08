package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w0 */
public final class C39073w0 extends C39003o2<C39073w0, C39037s0> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C39073w0 zza;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        C39073w0 w0Var = new C39073w0();
        zza = w0Var;
        C39003o2.m160640w(C39073w0.class, w0Var);
    }

    /* renamed from: C */
    public static C39073w0 m160941C() {
        return zza;
    }

    /* renamed from: D */
    public final String mo123104D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final int mo123105E() {
        int a = C39064v0.m160894a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", C39055u0.f98942a, "zzg"});
        } else if (i2 == 3) {
            return new C39073w0();
        } else {
            if (i2 == 4) {
                return new C39037s0((C38953j0) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
