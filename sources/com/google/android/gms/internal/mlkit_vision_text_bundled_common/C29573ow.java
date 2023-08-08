package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ow */
public final class C29573ow extends C29502mz<C29573ow, C29536nw> implements y00 {
    /* access modifiers changed from: private */
    public static final C29573ow zbb;
    private C29872wz<C29499mw> zbe = C29502mz.m120760t();
    private byte zbf = 2;

    static {
        C29573ow owVar = new C29573ow();
        zbb = owVar;
        C29502mz.m120753k(C29573ow.class, owVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbf);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbe", C29499mw.class});
        } else if (i2 == 3) {
            return new C29573ow();
        } else {
            if (i2 == 4) {
                return new C29536nw((C29941yu) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbf = b;
            return null;
        }
    }
}
