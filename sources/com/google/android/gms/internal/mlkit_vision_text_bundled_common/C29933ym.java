package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ym */
public final class C29933ym extends C29502mz<C29933ym, C29896xm> implements y00 {
    /* access modifiers changed from: private */
    public static final C29933ym zbb;
    private int zbe;
    private int zbf = 1;
    private boolean zbg;

    static {
        C29933ym ymVar = new C29933ym();
        zbb = ymVar;
        C29502mz.m120753k(C29933ym.class, ymVar);
    }

    /* renamed from: v */
    public static C29896xm m121368v() {
        return (C29896xm) zbb.mo84734m();
    }

    /* renamed from: x */
    public static /* synthetic */ void m121370x(C29933ym ymVar, int i) {
        ymVar.zbf = 1;
        ymVar.zbe = 1 | ymVar.zbe;
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"zbe", "zbf", C29410kh.f71323a, "zbg"});
        } else if (i2 == 3) {
            return new C29933ym();
        } else {
            if (i2 == 4) {
                return new C29896xm((C29859wm) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
