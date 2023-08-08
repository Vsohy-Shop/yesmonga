package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.j9 */
public final class C29365j9 extends C29502mz<C29365j9, C29218f9> implements y00 {
    /* access modifiers changed from: private */
    public static final C29365j9 zbb;
    private int zbe;
    private String zbf = "visionkit-pa.googleapis.com";
    private String zbg = "";
    private C29872wz<C29329i9> zbh = C29502mz.m120760t();

    static {
        C29365j9 j9Var = new C29365j9();
        zbb = j9Var;
        C29502mz.m120753k(C29365j9.class, j9Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"zbe", "zbf", "zbg", "zbh", C29329i9.class});
        } else if (i2 == 3) {
            return new C29365j9();
        } else {
            if (i2 == 4) {
                return new C29218f9((C29181e9) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
