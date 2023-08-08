package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ei */
public final class C29190ei extends C29502mz<C29190ei, C29153di> implements y00 {
    /* access modifiers changed from: private */
    public static final C29190ei zbb;
    private int zbe;
    private long zbf;
    private float zbg = 0.5f;

    static {
        C29190ei eiVar = new C29190ei();
        zbb = eiVar;
        C29502mz.m120753k(C29190ei.class, eiVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001", new Object[]{"zbe", "zbf", "zbg"});
        } else if (i2 == 3) {
            return new C29190ei();
        } else {
            if (i2 == 4) {
                return new C29153di((C29116ci) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
