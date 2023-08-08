package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.lx */
public final class C29463lx extends C29502mz<C29463lx, C29426kx> implements y00 {
    /* access modifiers changed from: private */
    public static final C29463lx zbb;
    private int zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private String zbi = "";
    private int zbj = -1;
    private float zbk = -1.0f;
    private float zbl = -1.0f;
    private boolean zbm;
    private float zbn;
    private float zbo;
    private byte zbp = 2;

    static {
        C29463lx lxVar = new C29463lx();
        zbb = lxVar;
        C29502mz.m120753k(C29463lx.class, lxVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbp);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0001\u0001ᔁ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဈ\u0003\u0005င\u0004\u0007ခ\u0005\bခ\u0006\tဇ\u0007\nခ\b\u000bခ\t", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbm", "zbn", "zbo"});
        } else if (i2 == 3) {
            return new C29463lx();
        } else {
            if (i2 == 4) {
                return new C29426kx((C29389jx) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbp = b;
            return null;
        }
    }
}
