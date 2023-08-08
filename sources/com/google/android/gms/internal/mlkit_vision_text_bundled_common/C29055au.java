package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.au */
public final class C29055au extends C29502mz<C29055au, C29903xt> implements y00 {
    /* access modifiers changed from: private */
    public static final C29055au zbb;
    private C29872wz<C29977zt> zbe = C29502mz.m120760t();

    static {
        C29055au auVar = new C29055au();
        zbb = auVar;
        C29502mz.m120753k(C29055au.class, auVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbe", C29977zt.class});
        } else if (i2 == 3) {
            return new C29055au();
        } else {
            if (i2 == 4) {
                return new C29903xt((C29866wt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
