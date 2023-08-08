package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.i0 */
public final class C29320i0 extends C29502mz<C29320i0, C29283h0> implements y00 {
    /* access modifiers changed from: private */
    public static final C29320i0 zbb;
    private int zbe;
    private String zbf = "";
    private String zbg = "";

    static {
        C29320i0 i0Var = new C29320i0();
        zbb = i0Var;
        C29502mz.m120753k(C29320i0.class, i0Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zbe", "zbf", "zbg"});
        } else if (i2 == 3) {
            return new C29320i0();
        } else {
            if (i2 == 4) {
                return new C29283h0((C29025a0) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
