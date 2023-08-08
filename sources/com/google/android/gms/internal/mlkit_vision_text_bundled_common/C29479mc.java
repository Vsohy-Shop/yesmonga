package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.mc */
public final class C29479mc extends C29502mz<C29479mc, C29442lc> implements y00 {
    /* access modifiers changed from: private */
    public static final C29479mc zbb;
    private int zbe;
    private String zbf = "";
    private String zbg = "";
    private C29872wz<C29425kw> zbh = C29502mz.m120760t();
    private float zbi;
    private byte zbj = 2;

    static {
        C29479mc mcVar = new C29479mc();
        zbb = mcVar;
        C29502mz.m120753k(C29479mc.class, mcVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbj);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л\u0004ခ\u0002", new Object[]{"zbe", "zbf", "zbg", "zbh", C29425kw.class, "zbi"});
        } else if (i2 == 3) {
            return new C29479mc();
        } else {
            if (i2 == 4) {
                return new C29442lc((C29405kc) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbj = b;
            return null;
        }
    }
}
