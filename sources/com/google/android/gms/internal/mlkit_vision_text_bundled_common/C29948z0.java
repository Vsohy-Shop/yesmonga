package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.z0 */
public final class C29948z0 extends C29502mz<C29948z0, C29910y> implements y00 {
    /* access modifiers changed from: private */
    public static final C29948z0 zbb;
    private int zbe;
    private double zbf;
    private double zbg;

    static {
        C29948z0 z0Var = new C29948z0();
        zbb = z0Var;
        C29502mz.m120753k(C29948z0.class, z0Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zbe", "zbf", "zbg"});
        } else if (i2 == 3) {
            return new C29948z0();
        } else {
            if (i2 == 4) {
                return new C29910y((C29061b) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
