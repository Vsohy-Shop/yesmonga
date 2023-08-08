package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.sj */
public final class C29708sj extends C29502mz<C29708sj, C29634qj> implements y00 {
    /* access modifiers changed from: private */
    public static final C29708sj zbb;
    private int zbe;
    private int zbf = -1;
    private float zbg = 0.3f;
    private int zbh = 5;
    private float zbi = 0.5f;
    private int zbj = 1;
    private boolean zbk = true;
    private float zbl = 0.85f;
    private boolean zbm = true;
    private float zbn;

    static {
        C29708sj sjVar = new C29708sj();
        zbb = sjVar;
        C29502mz.m120753k(C29708sj.class, sjVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\t\u0000\u0001\u0001\u0011\t\u0000\u0000\u0000\u0001င\u0000\u0005ခ\u0001\u0006င\u0002\u0007ခ\u0003\fဌ\u0004\u000eဇ\u0005\u000fခ\u0006\u0010ဇ\u0007\u0011ခ\b", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", C29671rj.f71437a, "zbk", "zbl", "zbm", "zbn"});
        } else if (i2 == 3) {
            return new C29708sj();
        } else {
            if (i2 == 4) {
                return new C29634qj((C29597pj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
