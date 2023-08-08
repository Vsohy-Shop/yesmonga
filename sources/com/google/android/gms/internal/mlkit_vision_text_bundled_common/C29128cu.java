package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.cu */
public final class C29128cu extends C29502mz<C29128cu, C29092bu> implements y00 {
    /* access modifiers changed from: private */
    public static final C29128cu zbb;
    private int zbe;
    private C29055au zbf;
    private double zbg;
    private boolean zbh;
    private C29313hu zbi;
    private byte zbj = 2;

    static {
        C29128cu cuVar = new C29128cu();
        zbb = cuVar;
        C29502mz.m120753k(C29128cu.class, cuVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbj);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002က\u0001\u0003ဇ\u0002\u0004ᐉ\u0003", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi"});
        } else if (i2 == 3) {
            return new C29128cu();
        } else {
            if (i2 == 4) {
                return new C29092bu((C29866wt) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbj = b;
            return null;
        }
    }
}
