package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.u2 */
public final class C29765u2 extends C29502mz<C29765u2, C29580p2> implements y00 {
    /* access modifiers changed from: private */
    public static final C29765u2 zbb;
    private int zbe;
    private int zbf = 0;
    private Object zbg;
    private byte zbh = 2;

    static {
        C29765u2 u2Var = new C29765u2();
        zbb = u2Var;
        C29502mz.m120753k(C29765u2.class, u2Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbh);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000", new Object[]{"zbg", "zbf", "zbe", C29728t2.class, C29313hu.class, C29128cu.class});
        } else if (i2 == 3) {
            return new C29765u2();
        } else {
            if (i2 == 4) {
                return new C29580p2((C29543o2) null);
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
