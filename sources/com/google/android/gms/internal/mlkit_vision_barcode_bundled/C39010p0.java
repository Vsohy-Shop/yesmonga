package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p0 */
public final class C39010p0 extends C39003o2<C39010p0, C38963k0> implements C39085x3 {
    /* access modifiers changed from: private */
    public static final C39010p0 zza;
    private int zze;
    private int zzf;
    private C39075w2<String> zzg = C39003o2.m160636s();
    private C38936h3 zzh;
    private byte zzi = 2;

    static {
        C39010p0 p0Var = new C39010p0();
        zza = p0Var;
        C39003o2.m160640w(C39010p0.class, p0Var);
    }

    /* renamed from: C */
    public final List<String> mo122995C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final int mo122996D() {
        int a = C39001o0.m160628a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: z */
    public final Object mo94469z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        byte b = 1;
        if (i2 == 2) {
            return C39003o2.m160639v(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဌ\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zze", "zzf", C38983m0.f98893a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C39010p0();
        } else {
            if (i2 == 4) {
                return new C38963k0((C38953j0) null);
            }
            if (i2 == 5) {
                return zza;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzi = b;
            return null;
        }
    }
}
