package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.n5 */
public final class C29509n5 extends C29502mz<C29509n5, C29472m5> implements y00 {
    /* access modifiers changed from: private */
    public static final C29509n5 zbb;
    private C29872wz<C29398k5> zbe = C29502mz.m120760t();
    private byte zbf = 2;

    static {
        C29509n5 n5Var = new C29509n5();
        zbb = n5Var;
        C29502mz.m120753k(C29509n5.class, n5Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbf);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbe", C29398k5.class});
        } else if (i2 == 3) {
            return new C29509n5();
        } else {
            if (i2 == 4) {
                return new C29472m5((C29435l5) null);
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
