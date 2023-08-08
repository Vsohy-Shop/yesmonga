package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.fu */
public final class C29239fu extends C29502mz<C29239fu, C29202eu> implements y00 {
    /* access modifiers changed from: private */
    public static final C29239fu zbb;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh = 2;
    private float zbi;
    private boolean zbj;

    static {
        C29239fu fuVar = new C29239fu();
        zbb = fuVar;
        C29502mz.m120753k(C29239fu.class, fuVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ခ\u0003\u0005ဇ\u0004", new Object[]{"zbe", "zbf", C29165du.f71211a, "zbg", C29386ju.f71306a, "zbh", C29349iu.f71298a, "zbi", "zbj"});
        } else if (i2 == 3) {
            return new C29239fu();
        } else {
            if (i2 == 4) {
                return new C29202eu((C29866wt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
