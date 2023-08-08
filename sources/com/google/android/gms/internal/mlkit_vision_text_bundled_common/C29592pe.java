package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.pe */
public final class C29592pe extends C29502mz<C29592pe, C29518ne> implements y00 {
    /* access modifiers changed from: private */
    public static final C29592pe zbb;
    private int zbe;
    private int zbf;
    private String zbg = "";

    static {
        C29592pe peVar = new C29592pe();
        zbb = peVar;
        C29502mz.m120753k(C29592pe.class, peVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"zbe", "zbf", C29555oe.f71386a, "zbg"});
        } else if (i2 == 3) {
            return new C29592pe();
        } else {
            if (i2 == 4) {
                return new C29518ne((C29481me) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
