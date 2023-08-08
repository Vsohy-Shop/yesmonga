package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.x7 */
public final class C29881x7 extends C29502mz<C29881x7, C29844w7> implements y00 {
    /* access modifiers changed from: private */
    public static final C29881x7 zbb;
    private int zbe;
    private double zbf;
    private double zbg;
    private String zbh = "";
    private double zbi;
    private boolean zbj;
    private double zbk;
    private double zbl;
    private byte zbm = 2;

    static {
        C29881x7 x7Var = new C29881x7();
        zbb = x7Var;
        C29502mz.m120753k(C29881x7.class, x7Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbm);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001\u0004က\u0005\u0005က\u0006\u0006ဇ\u0004\u0007က\u0003\bဈ\u0002", new Object[]{"zbe", "zbf", "zbg", "zbk", "zbl", "zbj", "zbi", "zbh"});
        } else if (i2 == 3) {
            return new C29881x7();
        } else {
            if (i2 == 4) {
                return new C29844w7((C29807v7) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbm = b;
            return null;
        }
    }
}
