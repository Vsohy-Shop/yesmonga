package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.kj */
public final class C29412kj extends C29502mz<C29412kj, C29375jj> implements y00 {
    /* access modifiers changed from: private */
    public static final C29412kj zbb;
    private int zbe;
    private C29569os zbf;
    private C29680rs zbg;
    private boolean zbh;
    private byte zbi = 2;

    static {
        C29412kj kjVar = new C29412kj();
        zbb = kjVar;
        C29502mz.m120753k(C29412kj.class, kjVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbi);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"zbe", "zbf", "zbg", "zbh"});
        } else if (i2 == 3) {
            return new C29412kj();
        } else {
            if (i2 == 4) {
                return new C29375jj((C29339ij) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbi = b;
            return null;
        }
    }
}
