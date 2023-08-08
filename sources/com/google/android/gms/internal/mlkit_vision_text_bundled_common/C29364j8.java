package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.j8 */
public final class C29364j8 extends C29502mz<C29364j8, C29328i8> implements y00 {
    /* access modifiers changed from: private */
    public static final C29364j8 zbb;
    private int zbe;
    private float zbf;
    private float zbg;
    private float zbh;
    private float zbi;
    private C29475m8 zbj;
    private float zbk;
    private C29770u7 zbl;
    private float zbm;
    private zbwp zbn;
    private zbwp zbo;
    private byte zbp = 2;

    static {
        C29364j8 j8Var = new C29364j8();
        zbb = j8Var;
        C29502mz.m120753k(C29364j8.class, j8Var);
    }

    public C29364j8() {
        zbwp zbwp = zbwp.f71626a;
        this.zbn = zbwp;
        this.zbo = zbwp;
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbp);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ခ\u0003\u0005ခ\u0007\u0006ည\b\u0007ခ\u0005\bဉ\u0006\tᐉ\u0004\nည\t", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbm", "zbn", "zbk", "zbl", "zbj", "zbo"});
        } else if (i2 == 3) {
            return new C29364j8();
        } else {
            if (i2 == 4) {
                return new C29328i8((C29291h8) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbp = b;
            return null;
        }
    }
}
