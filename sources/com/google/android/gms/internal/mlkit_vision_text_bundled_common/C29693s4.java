package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.s4 */
public final class C29693s4 extends C29354iz<C29693s4, C29434l4> implements y00 {
    /* access modifiers changed from: private */
    public static final C29693s4 zbe;
    private int zbf;
    private C29397k4 zbg;
    private C29872wz<C29656r4> zbh = C29502mz.m120760t();
    private float zbi;
    private float zbj;
    private float zbk;
    private float zbl;
    private float zbm;
    private C29872wz<C29508n4> zbn = C29502mz.m120760t();
    private C29872wz<C29324i4> zbo = C29502mz.m120760t();
    private long zbp;
    private long zbq;
    private long zbr;
    private float zbs;
    private byte zbt = 2;

    static {
        C29693s4 s4Var = new C29693s4();
        zbe = s4Var;
        C29502mz.m120753k(C29693s4.class, s4Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbt);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbe, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007\u001b\b\u001b\tဃ\u0007\nခ\t\u000bဃ\b\fဃ\u0006\rခ\u0005", new Object[]{"zbf", "zbg", "zbh", C29656r4.class, "zbi", "zbj", "zbk", "zbl", "zbn", C29508n4.class, "zbo", C29324i4.class, "zbq", "zbs", "zbr", "zbp", "zbm"});
        } else if (i2 == 3) {
            return new C29693s4();
        } else {
            if (i2 == 4) {
                return new C29434l4((C29213f4) null);
            }
            if (i2 == 5) {
                return zbe;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbt = b;
            return null;
        }
    }
}
