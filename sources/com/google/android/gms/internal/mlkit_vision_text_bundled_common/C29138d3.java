package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.d3 */
public final class C29138d3 extends C29502mz<C29138d3, C29101c3> implements y00 {
    /* access modifiers changed from: private */
    public static final C29138d3 zbb;
    private int zbe;
    private String zbf = "";
    private float zbg = 1.0f;
    private byte zbh = 2;

    static {
        C29138d3 d3Var = new C29138d3();
        zbb = d3Var;
        C29502mz.m120753k(C29138d3.class, d3Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbh);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ခ\u0001", new Object[]{"zbe", "zbf", "zbg"});
        } else if (i2 == 3) {
            return new C29138d3();
        } else {
            if (i2 == 4) {
                return new C29101c3((C29543o2) null);
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
