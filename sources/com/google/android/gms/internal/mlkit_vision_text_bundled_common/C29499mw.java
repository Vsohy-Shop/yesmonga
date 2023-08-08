package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.mw */
public final class C29499mw extends C29502mz<C29499mw, C29462lw> implements y00 {
    /* access modifiers changed from: private */
    public static final C29499mw zbb;
    private int zbe;
    private int zbf;
    private C29724sz zbg = C29502mz.m120758r();
    private float zbh;
    private byte zbi = 2;

    static {
        C29499mw mwVar = new C29499mw();
        zbb = mwVar;
        C29502mz.m120753k(C29499mw.class, mwVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbi);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᔄ\u0000\u0002ᔁ\u0001\u0003\u0016", new Object[]{"zbe", "zbf", "zbh", "zbg"});
        } else if (i2 == 3) {
            return new C29499mw();
        } else {
            if (i2 == 4) {
                return new C29462lw((C29941yu) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbi = b;
            return null;
        }
    }
}
