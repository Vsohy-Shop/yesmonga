package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.dg */
public final class C29151dg extends C29502mz<C29151dg, C29114cg> implements y00 {
    /* access modifiers changed from: private */
    public static final C29151dg zbb;
    private int zbe;
    private float zbf = 0.3f;

    static {
        C29151dg dgVar = new C29151dg();
        zbb = dgVar;
        C29502mz.m120753k(C29151dg.class, dgVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zbe", "zbf"});
        } else if (i2 == 3) {
            return new C29151dg();
        } else {
            if (i2 == 4) {
                return new C29114cg((C29078bg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
