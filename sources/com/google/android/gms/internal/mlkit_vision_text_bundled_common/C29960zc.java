package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zc */
public final class C29960zc extends C29502mz<C29960zc, C29923yc> implements y00 {
    /* access modifiers changed from: private */
    public static final C29960zc zbb;
    private int zbe;
    private C29872wz<C29749tn> zbf = C29502mz.m120760t();
    private C29849wc zbg;

    static {
        C29960zc zcVar = new C29960zc();
        zbb = zcVar;
        C29502mz.m120753k(C29960zc.class, zcVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zbe", "zbf", C29749tn.class, "zbg"});
        } else if (i2 == 3) {
            return new C29960zc();
        } else {
            if (i2 == 4) {
                return new C29923yc((C29886xc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
