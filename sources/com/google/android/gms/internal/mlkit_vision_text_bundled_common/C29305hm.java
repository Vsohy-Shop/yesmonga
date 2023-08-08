package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.hm */
public final class C29305hm extends C29502mz<C29305hm, C29231fm> implements y00 {
    /* access modifiers changed from: private */
    public static final C29305hm zbb;
    private int zbe;
    private int zbf;
    private C29437l7 zbg;
    private C29235fq zbh;
    private C29888xe zbi;
    private C29928yh zbj;
    private byte zbk = 2;

    static {
        C29305hm hmVar = new C29305hm();
        zbb = hmVar;
        C29502mz.m120753k(C29305hm.class, hmVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbk);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0002\u0002ဉ\u0003\u0003ဌ\u0000\u0004ဉ\u0004\u0005ᐉ\u0001", new Object[]{"zbe", "zbh", "zbi", "zbf", C29268gm.f71262a, "zbj", "zbg"});
        } else if (i2 == 3) {
            return new C29305hm();
        } else {
            if (i2 == 4) {
                return new C29231fm((C29194em) null);
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
