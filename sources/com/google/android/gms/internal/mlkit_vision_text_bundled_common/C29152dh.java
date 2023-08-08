package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.dh */
public final class C29152dh extends C29502mz<C29152dh, C29115ch> implements y00 {
    /* access modifiers changed from: private */
    public static final C29152dh zbb;
    private int zbe;
    private boolean zbf;
    private String zbg = "";

    static {
        C29152dh dhVar = new C29152dh();
        zbb = dhVar;
        C29502mz.m120753k(C29152dh.class, dhVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"zbe", "zbf", "zbg"});
        } else if (i2 == 3) {
            return new C29152dh();
        } else {
            if (i2 == 4) {
                return new C29115ch((C29079bh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
