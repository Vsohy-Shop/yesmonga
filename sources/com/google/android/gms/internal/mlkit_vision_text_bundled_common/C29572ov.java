package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ov */
public final class C29572ov extends C29502mz<C29572ov, C29535nv> implements y00 {
    /* access modifiers changed from: private */
    public static final C29572ov zbb;
    private int zbe;
    private C29646qv zbf;
    private float zbg;
    private C29687rz zbh = C29502mz.m120757q();
    private byte zbi = 2;

    static {
        C29572ov ovVar = new C29572ov();
        zbb = ovVar;
        C29502mz.m120753k(C29572ov.class, ovVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbi);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ခ\u0001\u0003\u0013", new Object[]{"zbe", "zbf", "zbg", "zbh"});
        } else if (i2 == 3) {
            return new C29572ov();
        } else {
            if (i2 == 4) {
                return new C29535nv((C29941yu) null);
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
