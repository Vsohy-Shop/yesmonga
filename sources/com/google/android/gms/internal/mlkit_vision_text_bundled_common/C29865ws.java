package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ws */
public final class C29865ws extends C29502mz<C29865ws, C29053as> implements y00 {
    /* access modifiers changed from: private */
    public static final C29865ws zbb;
    private int zbe;
    private C29216f7 zbf;
    private C29574ox zbg;
    private String zbh = "";

    static {
        C29865ws wsVar = new C29865ws();
        zbb = wsVar;
        C29502mz.m120753k(C29865ws.class, wsVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0002\u0003ဉ\u0001", new Object[]{"zbe", "zbf", "zbh", "zbg"});
        } else if (i2 == 3) {
            return new C29865ws();
        } else {
            if (i2 == 4) {
                return new C29053as((C29162dr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
