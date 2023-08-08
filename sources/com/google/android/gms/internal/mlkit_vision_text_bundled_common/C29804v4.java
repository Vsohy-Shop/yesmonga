package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.v4 */
public final class C29804v4 extends C29502mz<C29804v4, C29767u4> implements y00 {
    /* access modifiers changed from: private */
    public static final C29804v4 zbb;
    private C29872wz<C29693s4> zbe = C29502mz.m120760t();
    private byte zbf = 2;

    static {
        C29804v4 v4Var = new C29804v4();
        zbb = v4Var;
        C29502mz.m120753k(C29804v4.class, v4Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbf);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zbe", C29693s4.class});
        } else if (i2 == 3) {
            return new C29804v4();
        } else {
            if (i2 == 4) {
                return new C29767u4((C29730t4) null);
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
