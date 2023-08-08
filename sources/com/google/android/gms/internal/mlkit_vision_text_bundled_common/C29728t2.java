package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.t2 */
public final class C29728t2 extends C29502mz<C29728t2, C29691s2> implements y00 {
    /* access modifiers changed from: private */
    public static final C29728t2 zbb;
    private int zbe;
    private C29872wz<C29654r2> zbf = C29502mz.m120760t();
    private C29313hu zbg;
    private byte zbh = 2;

    static {
        C29728t2 t2Var = new C29728t2();
        zbb = t2Var;
        C29502mz.m120753k(C29728t2.class, t2Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbh);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"zbe", "zbf", C29654r2.class, "zbg"});
        } else if (i2 == 3) {
            return new C29728t2();
        } else {
            if (i2 == 4) {
                return new C29691s2((C29543o2) null);
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
