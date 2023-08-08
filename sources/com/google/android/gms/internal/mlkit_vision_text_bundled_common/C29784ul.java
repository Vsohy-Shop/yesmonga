package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ul */
public final class C29784ul extends C29502mz<C29784ul, C29747tl> implements y00 {
    /* access modifiers changed from: private */
    public static final C29784ul zbb;
    private int zbe;
    private C29368jc zbf;
    private C29088bq zbg;
    private C29437l7 zbh;
    private C29088bq zbi;
    private byte zbj = 2;

    static {
        C29784ul ulVar = new C29784ul();
        zbb = ulVar;
        C29502mz.m120753k(C29784ul.class, ulVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbj);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi"});
        } else if (i2 == 3) {
            return new C29784ul();
        } else {
            if (i2 == 4) {
                return new C29747tl((C29710sl) null);
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
