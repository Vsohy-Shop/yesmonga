package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.s8 */
public final class C29697s8 extends C29502mz<C29697s8, C29660r8> implements y00 {
    /* access modifiers changed from: private */
    public static final C29697s8 zbb;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private int zbi;
    private byte zbj = 2;

    static {
        C29697s8 s8Var = new C29697s8();
        zbb = s8Var;
        C29502mz.m120753k(C29697s8.class, s8Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbj);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi"});
        } else if (i2 == 3) {
            return new C29697s8();
        } else {
            if (i2 == 4) {
                return new C29660r8((C29623q8) null);
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
