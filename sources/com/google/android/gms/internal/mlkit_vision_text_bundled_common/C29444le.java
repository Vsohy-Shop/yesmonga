package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.le */
public final class C29444le extends C29502mz<C29444le, C29370je> implements y00 {
    /* access modifiers changed from: private */
    public static final C29444le zbb;
    private int zbe;
    private int zbf;
    private String zbg = "";

    static {
        C29444le leVar = new C29444le();
        zbb = leVar;
        C29502mz.m120753k(C29444le.class, leVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"zbe", "zbf", C29407ke.f71321a, "zbg"});
        } else if (i2 == 3) {
            return new C29444le();
        } else {
            if (i2 == 4) {
                return new C29370je((C29334ie) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
