package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.e8 */
public final class C29180e8 extends C29502mz<C29180e8, C29143d8> implements y00 {
    /* access modifiers changed from: private */
    public static final C29180e8 zbb;
    private int zbe;
    private int zbf;
    private C29872wz<C29364j8> zbg = C29502mz.m120760t();
    private int zbh;
    private boolean zbi;
    private byte zbj = 2;

    static {
        C29180e8 e8Var = new C29180e8();
        zbb = e8Var;
        C29502mz.m120753k(C29180e8.class, e8Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbj);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0001\u0002\u0003ᔄ\u0000\u0004Л\u0005င\u0001\u0006ဇ\u0002", new Object[]{"zbe", "zbf", "zbg", C29364j8.class, "zbh", "zbi"});
        } else if (i2 == 3) {
            return new C29180e8();
        } else {
            if (i2 == 4) {
                return new C29143d8((C29070b8) null);
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
