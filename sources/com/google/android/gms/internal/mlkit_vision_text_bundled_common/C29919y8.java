package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.y8 */
public final class C29919y8 extends C29502mz<C29919y8, C29882x8> implements y00 {
    /* access modifiers changed from: private */
    public static final C29919y8 zbb;
    private int zbe;
    private float zbf = 0.05f;
    private float zbg = 0.5f;
    private boolean zbh;
    private int zbi = 10;
    private int zbj = 200;
    private float zbk = 0.8f;
    private int zbl = 4;
    private int zbm = 10;
    private float zbn = 0.2f;
    private float zbo = 0.1f;
    private boolean zbp;

    static {
        C29919y8 y8Var = new C29919y8();
        zbb = y8Var;
        C29502mz.m120753k(C29919y8.class, y8Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0006\u0006င\u0007\u0007ခ\b\bခ\t\tဇ\n\nခ\u0005\u000bဇ\u0002", new Object[]{"zbe", "zbf", "zbg", "zbi", "zbj", "zbl", "zbm", "zbn", "zbo", "zbp", "zbk", "zbh"});
        } else if (i2 == 3) {
            return new C29919y8();
        } else {
            if (i2 == 4) {
                return new C29882x8((C29845w8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
