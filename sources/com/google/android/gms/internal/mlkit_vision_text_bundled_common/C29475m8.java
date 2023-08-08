package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.m8 */
public final class C29475m8 extends C29502mz<C29475m8, C29438l8> implements y00 {
    /* access modifiers changed from: private */
    public static final C29475m8 zbb;
    private int zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private float zbi;
    private byte zbj = 2;

    static {
        C29475m8 m8Var = new C29475m8();
        zbb = m8Var;
        C29502mz.m120753k(C29475m8.class, m8Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbj);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi"});
        } else if (i2 == 3) {
            return new C29475m8();
        } else {
            if (i2 == 4) {
                return new C29438l8((C29401k8) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbj = b;
            return null;
        }
    }
}
