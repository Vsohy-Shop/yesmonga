package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zg */
public final class C29964zg extends C29502mz<C29964zg, C29927yg> implements y00 {
    /* access modifiers changed from: private */
    public static final C29964zg zbb;
    private int zbe;
    private float zbf = 0.7f;
    private int zbg = 2;
    private float zbh = 0.2f;

    static {
        C29964zg zgVar = new C29964zg();
        zbb = zgVar;
        C29502mz.m120753k(C29964zg.class, zgVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001\u0003ခ\u0002", new Object[]{"zbe", "zbf", "zbg", "zbh"});
        } else if (i2 == 3) {
            return new C29964zg();
        } else {
            if (i2 == 4) {
                return new C29927yg((C29890xg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
