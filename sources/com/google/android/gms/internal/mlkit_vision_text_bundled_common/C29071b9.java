package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.b9 */
public final class C29071b9 extends C29502mz<C29071b9, C29034a9> implements y00 {
    /* access modifiers changed from: private */
    public static final C29071b9 zbb;
    private int zbe;
    private int zbf;
    private int zbg = 100;
    private int zbh = -100;
    private boolean zbi;
    private float zbj = 40.0f;

    static {
        C29071b9 b9Var = new C29071b9();
        zbb = b9Var;
        C29502mz.m120753k(C29071b9.class, b9Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ခ\u0004", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        } else if (i2 == 3) {
            return new C29071b9();
        } else {
            if (i2 == 4) {
                return new C29034a9((C29956z8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
