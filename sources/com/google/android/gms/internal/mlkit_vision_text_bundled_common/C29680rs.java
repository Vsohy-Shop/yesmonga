package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.rs */
public final class C29680rs extends C29502mz<C29680rs, C29643qs> implements y00 {
    /* access modifiers changed from: private */
    public static final C29680rs zbb;
    private int zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private float zbi;
    private float zbj;
    private long zbk;
    private byte zbl = 2;

    static {
        C29680rs rsVar = new C29680rs();
        zbb = rsVar;
        C29502mz.m120753k(C29680rs.class, rsVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbl);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003\u0005ခ\u0004\u0006ဂ\u0005", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk"});
        } else if (i2 == 3) {
            return new C29680rs();
        } else {
            if (i2 == 4) {
                return new C29643qs((C29606ps) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbl = b;
            return null;
        }
    }
}
