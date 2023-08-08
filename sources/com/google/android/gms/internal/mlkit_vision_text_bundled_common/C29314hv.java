package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.hv */
public final class C29314hv extends C29502mz<C29314hv, C29277gv> implements y00 {
    /* access modifiers changed from: private */
    public static final C29314hv zbb;
    private int zbe;
    private double zbf;
    private double zbg;

    static {
        C29314hv hvVar = new C29314hv();
        zbb = hvVar;
        C29502mz.m120753k(C29314hv.class, hvVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zbe", "zbf", "zbg"});
        } else if (i2 == 3) {
            return new C29314hv();
        } else {
            if (i2 == 4) {
                return new C29277gv((C29941yu) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
