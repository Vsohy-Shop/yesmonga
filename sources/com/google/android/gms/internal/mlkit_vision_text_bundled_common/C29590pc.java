package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.pc */
public final class C29590pc extends C29502mz<C29590pc, C29553oc> implements y00 {
    /* access modifiers changed from: private */
    public static final C29590pc zbb;
    private int zbe;
    private double zbf = 1.0d;
    private int zbg;
    private float zbh = 0.3f;
    private r00 zbi;

    static {
        C29590pc pcVar = new C29590pc();
        zbb = pcVar;
        C29502mz.m120753k(C29590pc.class, pcVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003ခ\u0002\u0004ဉ\u0003", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi"});
        } else if (i2 == 3) {
            return new C29590pc();
        } else {
            if (i2 == 4) {
                return new C29553oc((C29516nc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
