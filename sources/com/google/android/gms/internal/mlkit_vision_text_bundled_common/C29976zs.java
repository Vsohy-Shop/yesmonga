package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zs */
public final class C29976zs extends C29502mz<C29976zs, C29828vs> implements y00 {
    /* access modifiers changed from: private */
    public static final C29976zs zbb;
    private C29872wz<C29939ys> zbe = C29502mz.m120760t();

    static {
        C29976zs zsVar = new C29976zs();
        zbb = zsVar;
        C29502mz.m120753k(C29976zs.class, zsVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbe", C29939ys.class});
        } else if (i2 == 3) {
            return new C29976zs();
        } else {
            if (i2 == 4) {
                return new C29828vs((C29717ss) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
