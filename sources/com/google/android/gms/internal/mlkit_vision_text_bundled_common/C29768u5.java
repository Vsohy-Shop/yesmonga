package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.u5 */
public final class C29768u5 extends C29354iz<C29768u5, C29731t5> implements y00 {
    /* access modifiers changed from: private */
    public static final C29768u5 zbe;
    private int zbf;
    private int zbg = 0;
    private Object zbh;
    private int zbi = 0;
    private Object zbj;
    private String zbk = "FaceAttributesClientBrainEmbedder";
    private String zbl = "";
    private C29098c0 zbm;
    private int zbn;
    private boolean zbo = true;
    private int zbp = 1;
    private byte zbq = 2;

    static {
        C29768u5 u5Var = new C29768u5();
        zbe = u5Var;
        C29502mz.m120753k(C29768u5.class, u5Var);
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbq);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbe, "\u0001\n\u0002\u0001\u0002\r\n\u0000\u0000\u0001\u0002ြ\u0000\u0003ျ\u0000\u0004ဇ\b\u0005ဌ\t\u0007ᐼ\u0001\bျ\u0001\tဈ\u0000\nဈ\u0001\fင\u0003\rဉ\u0002", new Object[]{"zbh", "zbg", "zbj", "zbi", "zbf", C29877x3.class, "zbo", "zbp", C29694s5.f71447a, C29879x5.class, "zbk", "zbl", "zbn", "zbm"});
        } else if (i2 == 3) {
            return new C29768u5();
        } else {
            if (i2 == 4) {
                return new C29731t5((C29657r5) null);
            }
            if (i2 == 5) {
                return zbe;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbq = b;
            return null;
        }
    }
}
