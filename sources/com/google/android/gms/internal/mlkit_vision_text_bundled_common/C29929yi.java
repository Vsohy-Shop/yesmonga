package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.yi */
public final class C29929yi extends C29502mz<C29929yi, C29892xi> implements y00 {
    /* access modifiers changed from: private */
    public static final C29929yi zbb;
    private int zbe;
    private int zbf = 0;
    private Object zbg;
    private C29872wz<C29768u5> zbh = C29502mz.m120760t();
    private byte zbi = 2;

    static {
        C29929yi yiVar = new C29929yi();
        zbb = yiVar;
        C29502mz.m120753k(C29929yi.class, yiVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbi);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0001\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001်\u0000\u0003Л", new Object[]{"zbg", "zbf", "zbe", "zbh", C29768u5.class});
        } else if (i2 == 3) {
            return new C29929yi();
        } else {
            if (i2 == 4) {
                return new C29892xi((C29855wi) null);
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
