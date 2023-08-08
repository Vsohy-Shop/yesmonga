package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.e3 */
public final class C29175e3 extends C29502mz<C29175e3, C29028a3> implements y00 {
    /* access modifiers changed from: private */
    public static final C29175e3 zbb;
    private C29872wz<C29138d3> zbe = C29502mz.m120760t();
    private byte zbf = 2;

    static {
        C29175e3 e3Var = new C29175e3();
        zbb = e3Var;
        C29502mz.m120753k(C29175e3.class, e3Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbf);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbe", C29138d3.class});
        } else if (i2 == 3) {
            return new C29175e3();
        } else {
            if (i2 == 4) {
                return new C29028a3((C29543o2) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbf = b;
            return null;
        }
    }
}
