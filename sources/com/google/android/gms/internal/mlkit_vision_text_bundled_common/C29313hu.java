package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.hu */
public final class C29313hu extends C29502mz<C29313hu, C29276gu> implements y00 {
    /* access modifiers changed from: private */
    public static final C29313hu zbb;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private int zbi;
    private float zbj;
    private byte zbk = 2;

    static {
        C29313hu huVar = new C29313hu();
        zbb = huVar;
        C29502mz.m120753k(C29313hu.class, huVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbk);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ခ\u0004", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        } else if (i2 == 3) {
            return new C29313hu();
        } else {
            if (i2 == 4) {
                return new C29276gu((C29866wt) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbk = b;
            return null;
        }
    }
}
