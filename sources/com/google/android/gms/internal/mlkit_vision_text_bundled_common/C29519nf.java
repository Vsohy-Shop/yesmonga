package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.nf */
public final class C29519nf extends C29502mz<C29519nf, C29482mf> implements y00 {
    /* access modifiers changed from: private */
    public static final C29519nf zbb;
    private int zbe;
    private C29853wg zbf;
    private C29164dt zbg;
    private C29479mc zbh;
    private C29483mg zbi;
    private C29778uf zbj;
    private C29630qf zbk;
    private C29262gg zbl;
    private byte zbm = 2;

    static {
        C29519nf nfVar = new C29519nf();
        zbb = nfVar;
        C29502mz.m120753k(C29519nf.class, nfVar);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbm);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk", "zbl"});
        } else if (i2 == 3) {
            return new C29519nf();
        } else {
            if (i2 == 4) {
                return new C29482mf((C29445lf) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbm = b;
            return null;
        }
    }
}
