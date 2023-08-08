package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.i9 */
public final class C29329i9 extends C29502mz<C29329i9, C29255g9> implements y00 {
    /* access modifiers changed from: private */
    public static final C29329i9 zbb;
    private int zbe;
    private String zbf = "";
    private zbwp zbg = zbwp.f71626a;

    static {
        C29329i9 i9Var = new C29329i9();
        zbb = i9Var;
        C29502mz.m120753k(C29329i9.class, i9Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zbe", "zbf", "zbg"});
        } else if (i2 == 3) {
            return new C29329i9();
        } else {
            if (i2 == 4) {
                return new C29255g9((C29181e9) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
