package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.nn */
public final class C29527nn extends C29502mz<C29527nn, C29490mn> implements y00 {
    /* access modifiers changed from: private */
    public static final C29527nn zbb;
    private C29872wz<C29232fn> zbe = C29502mz.m120760t();

    static {
        C29527nn nnVar = new C29527nn();
        zbb = nnVar;
        C29502mz.m120753k(C29527nn.class, nnVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbe", C29232fn.class});
        } else if (i2 == 3) {
            return new C29527nn();
        } else {
            if (i2 == 4) {
                return new C29490mn((C29453ln) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
