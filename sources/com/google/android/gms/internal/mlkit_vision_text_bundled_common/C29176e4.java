package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.e4 */
public final class C29176e4 extends C29502mz<C29176e4, C29139d4> implements y00 {
    /* access modifiers changed from: private */
    public static final C29176e4 zbb;
    private C29872wz<C29029a4> zbe = C29502mz.m120760t();
    private C29872wz<C29620q5> zbf = C29502mz.m120760t();

    static {
        C29176e4 e4Var = new C29176e4();
        zbb = e4Var;
        C29502mz.m120753k(C29176e4.class, e4Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zbe", C29029a4.class, "zbf", C29620q5.class});
        } else if (i2 == 3) {
            return new C29176e4();
        } else {
            if (i2 == 4) {
                return new C29139d4((C29066b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
