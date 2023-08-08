package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.r2 */
public final class C29654r2 extends C29502mz<C29654r2, C29617q2> implements y00 {
    /* access modifiers changed from: private */
    public static final C29654r2 zbb;
    private int zbe;
    private int zbf;
    private int zbg;
    private byte zbh = 2;

    static {
        C29654r2 r2Var = new C29654r2();
        zbb = r2Var;
        C29502mz.m120753k(C29654r2.class, r2Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbh);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zbe", "zbf", "zbg"});
        } else if (i2 == 3) {
            return new C29654r2();
        } else {
            if (i2 == 4) {
                return new C29617q2((C29543o2) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbh = b;
            return null;
        }
    }
}
