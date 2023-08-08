package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.qp */
public final class C29640qp extends C29502mz<C29640qp, C29603pp> implements y00 {
    /* access modifiers changed from: private */
    public static final C29640qp zbb;
    private int zbe;
    private C29437l7 zbf;
    private float zbg;
    private byte zbh = 2;

    static {
        C29640qp qpVar = new C29640qp();
        zbb = qpVar;
        C29502mz.m120753k(C29640qp.class, qpVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbh);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ခ\u0001", new Object[]{"zbe", "zbf", "zbg"});
        } else if (i2 == 3) {
            return new C29640qp();
        } else {
            if (i2 == 4) {
                return new C29603pp((C29566op) null);
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
