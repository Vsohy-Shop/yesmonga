package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.qv */
public final class C29646qv extends C29502mz<C29646qv, C29609pv> implements y00 {
    /* access modifiers changed from: private */
    public static final C29646qv zbb;
    private int zbe;
    private zbwp zbf;
    private zbwp zbg;
    private zbwp zbh;
    private C29056av zbi;
    private String zbj;
    private byte zbk = 2;

    static {
        C29646qv qvVar = new C29646qv();
        zbb = qvVar;
        C29502mz.m120753k(C29646qv.class, qvVar);
    }

    public C29646qv() {
        zbwp zbwp = zbwp.f71626a;
        this.zbf = zbwp;
        this.zbg = zbwp;
        this.zbh = zbwp;
        this.zbj = "";
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbk);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj"});
        } else if (i2 == 3) {
            return new C29646qv();
        } else {
            if (i2 == 4) {
                return new C29609pv((C29941yu) null);
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
