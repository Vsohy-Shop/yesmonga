package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.cv */
public final class C29129cv extends C29502mz<C29129cv, C29093bv> implements y00 {
    /* access modifiers changed from: private */
    public static final C29129cv zbb;
    private int zbe;
    private int zbf = -1;
    private int zbg = -1;
    private C29687rz zbh = C29502mz.m120757q();
    private C29724sz zbi = C29502mz.m120758r();
    private C29687rz zbj = C29502mz.m120757q();

    static {
        C29129cv cvVar = new C29129cv();
        zbb = cvVar;
        C29502mz.m120753k(C29129cv.class, cvVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003\u0013\u0004\u0016\u0006\u0013", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        } else if (i2 == 3) {
            return new C29129cv();
        } else {
            if (i2 == 4) {
                return new C29093bv((C29941yu) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
