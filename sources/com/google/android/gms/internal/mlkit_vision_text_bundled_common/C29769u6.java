package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.u6 */
public final class C29769u6 extends C29502mz<C29769u6, C29732t6> implements y00 {
    /* access modifiers changed from: private */
    public static final C29769u6 zbb;
    private int zbe;
    private float zbf = 10.0f;
    private float zbg = 10.0f;
    private float zbh = 5.0f;
    private float zbi = 5.0f;
    private float zbj = 10.0f;
    private float zbk = 10.0f;

    static {
        C29769u6 u6Var = new C29769u6();
        zbb = u6Var;
        C29502mz.m120753k(C29769u6.class, u6Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk"});
        } else if (i2 == 3) {
            return new C29769u6();
        } else {
            if (i2 == 4) {
                return new C29732t6((C29547o6) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
