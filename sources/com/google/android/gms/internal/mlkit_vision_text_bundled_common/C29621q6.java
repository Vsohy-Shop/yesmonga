package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.q6 */
public final class C29621q6 extends C29502mz<C29621q6, C29584p6> implements y00 {
    /* access modifiers changed from: private */
    public static final C29621q6 zbb;
    private int zbe;
    private float zbf = 0.01f;

    static {
        C29621q6 q6Var = new C29621q6();
        zbb = q6Var;
        C29502mz.m120753k(C29621q6.class, q6Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zbe", "zbf"});
        } else if (i2 == 3) {
            return new C29621q6();
        } else {
            if (i2 == 4) {
                return new C29584p6((C29547o6) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
