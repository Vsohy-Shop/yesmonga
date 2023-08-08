package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.f8 */
public final class C29217f8 extends C29502mz<C29217f8, C29106c8> implements y00 {
    /* access modifiers changed from: private */
    public static final C29217f8 zbb;
    private int zbe;
    private long zbf;
    private String zbg = "";
    private String zbh = "";
    private int zbi;
    private int zbj;
    private C29872wz<String> zbk = C29502mz.m120760t();
    private String zbl = "";
    private C29881x7 zbm;
    private zbwp zbn;
    private C29697s8 zbo;
    private String zbp;
    private C29872wz<C29180e8> zbq;
    private C29872wz<C29033a8> zbr;
    private zbwp zbs;
    private String zbt;
    private byte zbu = 2;

    static {
        C29217f8 f8Var = new C29217f8();
        zbb = f8Var;
        C29502mz.m120753k(C29217f8.class, f8Var);
    }

    public C29217f8() {
        zbwp zbwp = zbwp.f71626a;
        this.zbn = zbwp;
        this.zbp = "";
        this.zbq = C29502mz.m120760t();
        this.zbr = C29502mz.m120760t();
        this.zbs = zbwp;
        this.zbt = "";
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbu);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u000f\u0000\u0001\u0001\u001c\u000f\u0000\u0003\u0004\u0001ᔂ\u0000\u0002б\u0010ဈ\u0001\u0011ဈ\u0002\u0012င\u0003\u0013င\u0004\u0014\u001a\u0015ဈ\u0005\u0016ည\u0007\u0017ᐉ\b\u0018ᐉ\u0006\u0019ည\n\u001aဈ\t\u001bဈ\u000b\u001c\u001b", new Object[]{"zbe", "zbf", "zbq", C29180e8.class, "zbg", "zbh", "zbi", "zbj", "zbk", "zbl", "zbn", "zbo", "zbm", "zbs", "zbp", "zbt", "zbr", C29033a8.class});
        } else if (i2 == 3) {
            return new C29217f8();
        } else {
            if (i2 == 4) {
                return new C29106c8((C29070b8) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbu = b;
            return null;
        }
    }
}
