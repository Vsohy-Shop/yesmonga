package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.xl */
public final class C29895xl extends C29502mz<C29895xl, C29858wl> implements y00 {
    /* access modifiers changed from: private */
    public static final C29895xl zbb;
    private int zbe;
    private C29147dc zbf;
    private C29368jc zbg;
    private C29784ul zbh;
    private boolean zbi;
    private byte zbj = 2;

    static {
        C29895xl xlVar = new C29895xl();
        zbb = xlVar;
        C29502mz.m120753k(C29895xl.class, xlVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbj);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဇ\u0003\u0003ᐉ\u0002\u0004ဉ\u0001", new Object[]{"zbe", "zbf", "zbi", "zbh", "zbg"});
        } else if (i2 == 3) {
            return new C29895xl();
        } else {
            if (i2 == 4) {
                return new C29858wl((C29821vl) null);
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
