package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.c2 */
public final class C29100c2 extends C29502mz<C29100c2, C29064b2> implements y00 {
    /* access modifiers changed from: private */
    public static final C29100c2 zbb;
    private int zbe;
    private String zbf = "";
    private int zbg;
    private String zbh = "";
    private boolean zbi;
    private String zbj = "";
    private C29872wz<String> zbk = C29502mz.m120760t();
    private C29872wz<C29875x1> zbl = C29502mz.m120760t();
    private C29872wz<String> zbm = C29502mz.m120760t();
    private int zbn;

    static {
        C29100c2 c2Var = new C29100c2();
        zbb = c2Var;
        C29502mz.m120753k(C29100c2.class, c2Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0003\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001a\u0004\u001b\u0006ဈ\u0002\u0007ဇ\u0003\bဈ\u0004\t\u001a\nင\u0005", new Object[]{"zbe", "zbf", "zbg", "zbk", "zbl", C29875x1.class, "zbh", "zbi", "zbj", "zbm", "zbn"});
        } else if (i2 == 3) {
            return new C29100c2();
        } else {
            if (i2 == 4) {
                return new C29064b2((C29025a0) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
