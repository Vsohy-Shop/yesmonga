package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.z6 */
public final class C29954z6 extends C29502mz<C29954z6, C29917y6> implements y00 {
    /* access modifiers changed from: private */
    public static final C29954z6 zbb;
    private C29872wz<C29880x6> zbe = C29502mz.m120760t();

    static {
        C29954z6 z6Var = new C29954z6();
        zbb = z6Var;
        C29502mz.m120753k(C29954z6.class, z6Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbe", C29880x6.class});
        } else if (i2 == 3) {
            return new C29954z6();
        } else {
            if (i2 == 4) {
                return new C29917y6((C29806v6) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
