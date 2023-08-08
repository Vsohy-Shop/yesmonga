package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.n2 */
public final class C29506n2 extends C29354iz<C29506n2, C29469m2> implements y00 {
    /* access modifiers changed from: private */
    public static final C29506n2 zbe;
    private int zbf;
    private double zbg;
    private int zbh;
    private int zbi;
    private double zbj;
    private double zbk;
    private byte zbl = 2;

    static {
        C29506n2 n2Var = new C29506n2();
        zbe = n2Var;
        C29502mz.m120753k(C29506n2.class, n2Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbl);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbe, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zbf", "zbg", "zbh", "zbi", "zbj", "zbk"});
        } else if (i2 == 3) {
            return new C29506n2();
        } else {
            if (i2 == 4) {
                return new C29469m2((C29432l2) null);
            }
            if (i2 == 5) {
                return zbe;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbl = b;
            return null;
        }
    }
}
