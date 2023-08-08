package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.uo */
public final class C29787uo extends C29502mz<C29787uo, C29750to> implements y00 {
    /* access modifiers changed from: private */
    public static final C29787uo zbb;
    private int zbe;
    private int zbf = 0;
    private Object zbg;
    private boolean zbh;
    private C29872wz<C29454lo> zbi = C29502mz.m120760t();
    private C29687rz zbj = C29502mz.m120757q();
    private float zbk = 0.15f;
    private float zbl;
    private float zbm;
    private float zbn;
    private byte zbo = 2;

    static {
        C29787uo uoVar = new C29787uo();
        zbb = uoVar;
        C29502mz.m120753k(C29787uo.class, uoVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbo);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\b\u0001\u0001\u0002\u000b\b\u0000\u0002\u0001\u0002ᐼ\u0000\u0003ဇ\u0000\u0004\u001b\u0005\u0013\u0006ခ\u0002\u0007ခ\u0003\bခ\u0004\u000bခ\u0005", new Object[]{"zbg", "zbf", "zbe", C29640qp.class, "zbh", "zbi", C29454lo.class, "zbj", "zbk", "zbl", "zbm", "zbn"});
        } else if (i2 == 3) {
            return new C29787uo();
        } else {
            if (i2 == 4) {
                return new C29750to((C29713so) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbo = b;
            return null;
        }
    }
}
