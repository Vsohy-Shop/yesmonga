package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.x5 */
public final class C29879x5 extends C29354iz<C29879x5, C29842w5> implements y00 {
    /* access modifiers changed from: private */
    public static final C29879x5 zbe;
    private byte zbf = 2;

    static {
        C29879x5 x5Var = new C29879x5();
        zbe = x5Var;
        C29502mz.m120753k(C29879x5.class, x5Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        byte b;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbf);
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbe, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new C29879x5();
        }
        if (i2 == 4) {
            return new C29842w5((C29805v5) null);
        }
        if (i2 == 5) {
            return zbe;
        }
        if (obj == null) {
            b = 0;
        } else {
            b = 1;
        }
        this.zbf = b;
        return null;
    }
}
