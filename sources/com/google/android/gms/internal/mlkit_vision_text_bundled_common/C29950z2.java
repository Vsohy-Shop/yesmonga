package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.z2 */
public final class C29950z2 extends C29354iz<C29950z2, C29913y2> implements y00 {
    /* access modifiers changed from: private */
    public static final C29950z2 zbe;
    private int zbf;
    private int zbg = 0;
    private Object zbh;
    private String zbi = "";
    private int zbj;
    private int zbk;
    private int zbl;
    private byte zbm = 2;

    static {
        C29950z2 z2Var = new C29950z2();
        zbe = z2Var;
        C29502mz.m120753k(C29950z2.class, z2Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbm);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbe, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0006ွ\u0000\u0007ွ\u0000\bံ\u0000", new Object[]{"zbh", "zbg", "zbf", "zbi", "zbj", "zbk", "zbl"});
        } else if (i2 == 3) {
            return new C29950z2();
        } else {
            if (i2 == 4) {
                return new C29913y2((C29543o2) null);
            }
            if (i2 == 5) {
                return zbe;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbm = b;
            return null;
        }
    }
}
