package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.sw */
public final class C29721sw extends C29502mz<C29721sw, C29684rw> implements y00 {
    /* access modifiers changed from: private */
    public static final C29721sw zbb;
    private int zbe;
    private C29056av zbf;
    private String zbg = "";
    private C29724sz zbh = C29502mz.m120758r();
    private int zbi;
    private int zbj;
    private byte zbk = 2;

    static {
        C29721sw swVar = new C29721sw();
        zbb = swVar;
        C29502mz.m120753k(C29721sw.class, swVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbk);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003\u0016\u0004င\u0002\u0005ဌ\u0003", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", C29396k3.m120605a()});
        } else if (i2 == 3) {
            return new C29721sw();
        } else {
            if (i2 == 4) {
                return new C29684rw((C29941yu) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbk = b;
            return null;
        }
    }
}
