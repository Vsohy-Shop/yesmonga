package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.qw */
public final class C29647qw extends C29502mz<C29647qw, C29610pw> implements y00 {
    /* access modifiers changed from: private */
    public static final C29647qw zbb;
    private int zbe;
    private C29056av zbf;
    private C29724sz zbg = C29502mz.m120758r();
    private byte zbh = 2;

    static {
        C29647qw qwVar = new C29647qw();
        zbb = qwVar;
        C29502mz.m120753k(C29647qw.class, qwVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbh);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u0016", new Object[]{"zbe", "zbf", "zbg"});
        } else if (i2 == 3) {
            return new C29647qw();
        } else {
            if (i2 == 4) {
                return new C29610pw((C29941yu) null);
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
