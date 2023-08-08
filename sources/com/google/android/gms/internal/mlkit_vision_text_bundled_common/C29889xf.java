package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.xf */
public final class C29889xf extends C29502mz<C29889xf, C29852wf> implements y00 {
    /* access modifiers changed from: private */
    public static final C29889xf zbb;
    private int zbe;
    private boolean zbf;
    private float zbg = 0.2f;
    private C29872wz<C29041ag> zbh = C29502mz.m120760t();

    static {
        C29889xf xfVar = new C29889xf();
        zbb = xfVar;
        C29502mz.m120753k(C29889xf.class, xfVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0004\u001b", new Object[]{"zbe", "zbf", "zbg", "zbh", C29041ag.class});
        } else if (i2 == 3) {
            return new C29889xf();
        } else {
            if (i2 == 4) {
                return new C29852wf((C29815vf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
