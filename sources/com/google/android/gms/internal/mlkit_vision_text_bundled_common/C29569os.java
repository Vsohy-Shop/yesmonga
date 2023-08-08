package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.os */
public final class C29569os extends C29502mz<C29569os, C29532ns> implements y00 {
    /* access modifiers changed from: private */
    public static final C29569os zbb;
    private C29872wz<C29495ms> zbe = C29502mz.m120760t();

    static {
        C29569os osVar = new C29569os();
        zbb = osVar;
        C29502mz.m120753k(C29569os.class, osVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbe", C29495ms.class});
        } else if (i2 == 3) {
            return new C29569os();
        } else {
            if (i2 == 4) {
                return new C29532ns((C29421ks) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
