package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.bi */
public final class C29080bi extends C29502mz<C29080bi, C29043ai> implements y00 {
    /* access modifiers changed from: private */
    public static final C29080bi zbb;
    private int zbe;
    private C29872wz<C29301hi> zbf = C29502mz.m120760t();
    private String zbg = "";

    static {
        C29080bi biVar = new C29080bi();
        zbb = biVar;
        C29502mz.m120753k(C29080bi.class, biVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zbe", "zbf", C29301hi.class, "zbg"});
        } else if (i2 == 3) {
            return new C29080bi();
        } else {
            if (i2 == 4) {
                return new C29043ai((C29965zh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
