package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.k5 */
public final class C29398k5 extends C29354iz<C29398k5, C29103c5> implements y00 {
    /* access modifiers changed from: private */
    public static final C29398k5 zbe;
    private int zbf;
    private C29067b5 zbg;
    private C29872wz<C29361j5> zbh = C29502mz.m120760t();
    private float zbi;
    private float zbj;
    private C29872wz<C29214f5> zbk = C29502mz.m120760t();
    private zbwp zbl = zbwp.f71626a;
    private C29067b5 zbm;
    private C29693s4 zbn;
    private C29872wz<C29952z4> zbo = C29502mz.m120760t();
    private byte zbp = 2;

    static {
        C29398k5 k5Var = new C29398k5();
        zbe = k5Var;
        C29502mz.m120753k(C29398k5.class, k5Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbp);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbe, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0001\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004\u001b\u0005ᐉ\u0005\u0006\u001b\u0007ည\u0003\bဉ\u0004\tခ\u0002", new Object[]{"zbf", "zbg", "zbh", C29361j5.class, "zbi", "zbk", C29214f5.class, "zbn", "zbo", C29952z4.class, "zbl", "zbm", "zbj"});
        } else if (i2 == 3) {
            return new C29398k5();
        } else {
            if (i2 == 4) {
                return new C29103c5((C29841w4) null);
            }
            if (i2 == 5) {
                return zbe;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbp = b;
            return null;
        }
    }
}
