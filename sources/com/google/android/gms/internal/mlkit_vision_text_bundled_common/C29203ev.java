package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ev */
public final class C29203ev extends C29502mz<C29203ev, C29166dv> implements y00 {
    /* access modifiers changed from: private */
    public static final C29203ev zbb;
    private int zbe;
    private float zbf;
    private int zbg;
    private byte zbh = 2;

    static {
        C29203ev evVar = new C29203ev();
        zbb = evVar;
        C29502mz.m120753k(C29203ev.class, evVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbh);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔁ\u0000\u0002င\u0001", new Object[]{"zbe", "zbf", "zbg"});
        } else if (i2 == 3) {
            return new C29203ev();
        } else {
            if (i2 == 4) {
                return new C29166dv((C29941yu) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbh = b;
            return null;
        }
    }
}
