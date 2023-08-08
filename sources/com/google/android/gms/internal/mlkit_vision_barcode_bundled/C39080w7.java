package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w7 */
public final class C39080w7 extends C38965k2<C39080w7, C39071v7> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C39080w7 zze;
    private byte zzf = 2;

    static {
        C39080w7 w7Var = new C39080w7();
        zze = w7Var;
        C39003o2.m160640w(C39080w7.class, w7Var);
    }

    /* renamed from: D */
    public static C39080w7 m160960D() {
        return zze;
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        byte b;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i2 == 2) {
            return C39003o2.m160639v(zze, "\u0003\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new C39080w7();
        }
        if (i2 == 4) {
            return new C39071v7((C39062u7) null);
        }
        if (i2 == 5) {
            return zze;
        }
        if (obj == null) {
            b = 0;
        } else {
            b = 1;
        }
        this.zzf = b;
        return null;
    }
}
