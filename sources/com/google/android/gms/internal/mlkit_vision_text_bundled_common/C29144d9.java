package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.d9 */
public final class C29144d9 extends C29502mz<C29144d9, C29107c9> implements y00 {
    /* access modifiers changed from: private */
    public static final C29144d9 zbb;
    private int zbe;
    private C29071b9 zbf;
    private float zbg = 0.6f;
    private float zbh = 0.5f;
    private float zbi = 0.01f;
    private float zbj = 0.2f;
    private float zbk = 3.0f;
    private float zbl = 0.75f;
    private float zbm = 0.75f;
    private float zbn = 0.25f;
    private float zbo = 0.2f;
    private float zbp = 0.4f;
    private int zbq = 10;
    private float zbr = 0.05f;
    private int zbs = 3;

    static {
        C29144d9 d9Var = new C29144d9();
        zbb = d9Var;
        C29502mz.m120753k(C29144d9.class, d9Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\bခ\u0006\tခ\u0007\nခ\b\u000bခ\t\fခ\n\rင\u000b\u000eခ\f\u000fင\r", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbn", "zbo", "zbp", "zbq", "zbr", "zbs"});
        } else if (i2 == 3) {
            return new C29144d9();
        } else {
            if (i2 == 4) {
                return new C29107c9((C29956z8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
