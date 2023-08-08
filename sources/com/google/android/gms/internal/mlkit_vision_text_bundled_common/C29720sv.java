package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.sv */
public final class C29720sv extends C29502mz<C29720sv, C29683rv> implements y00 {
    /* access modifiers changed from: private */
    public static final C29720sv zbb;
    private int zbe;
    private float zbf = 1.5f;
    private float zbg = 3.0f;
    private float zbh = 3.0f;
    private float zbi = 2.0f;
    private float zbj = 0.5f;
    private float zbk = 1.5f;
    private float zbl = 1.7f;
    private float zbm = 2.0f;
    private boolean zbn;

    static {
        C29720sv svVar = new C29720sv();
        zbb = svVar;
        C29502mz.m120753k(C29720sv.class, svVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tဇ\b", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbn"});
        } else if (i2 == 3) {
            return new C29720sv();
        } else {
            if (i2 == 4) {
                return new C29683rv((C29941yu) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
