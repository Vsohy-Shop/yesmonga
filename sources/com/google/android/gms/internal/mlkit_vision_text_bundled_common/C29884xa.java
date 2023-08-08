package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.xa */
public final class C29884xa extends C29502mz<C29884xa, C29847wa> implements y00 {
    /* access modifiers changed from: private */
    public static final C29884xa zbb;
    private C29515nb zbe;
    private double zbf;

    static {
        C29884xa xaVar = new C29884xa();
        zbb = xaVar;
        C29502mz.m120753k(C29884xa.class, xaVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0000", new Object[]{"zbe", "zbf"});
        } else if (i2 == 3) {
            return new C29884xa();
        } else {
            if (i2 == 4) {
                return new C29847wa((C29810va) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
