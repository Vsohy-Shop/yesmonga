package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.zw */
public final class C29980zw extends C29502mz<C29980zw, C29943yw> implements y00 {
    /* access modifiers changed from: private */
    public static final C29980zw zbb;
    private float zbA;
    private int zbB;
    private float zbC;
    private int zbD = 1;
    private float zbE;
    private int zbF;
    private byte zbG = 2;
    private int zbe;
    private C29872wz<C29425kw> zbf = C29502mz.m120760t();
    private C29056av zbg;
    private C29056av zbh;
    private String zbi = "";
    private float zbj;
    private C29872wz<C29203ev> zbk = C29502mz.m120760t();
    private C29872wz<C29129cv> zbl = C29502mz.m120760t();
    private boolean zbm;
    private String zbn = "";
    private boolean zbo;
    private C29872wz<C29351iw> zbp = C29502mz.m120760t();
    private boolean zbq = true;
    private boolean zbr;
    private boolean zbs;
    private int zbt;
    private int zbu;
    private int zbv;
    private int zbw;
    private int zbx;
    private int zby;
    private String zbz = "";

    static {
        C29980zw zwVar = new C29980zw();
        zbb = zwVar;
        C29502mz.m120753k(C29980zw.class, zwVar);
    }

    /* renamed from: A */
    public final boolean mo85020A() {
        return (this.zbe & 32) != 0;
    }

    /* renamed from: B */
    public final boolean mo85021B() {
        return (this.zbe & 4) != 0;
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbG);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0004\u0004\u0001Л\u0002ᔉ\u0000\u0003ᐉ\u0001\u0004ဈ\u0002\u0005ခ\u0003\u0006\u001b\u0007ဇ\u0004\bဈ\u0005\tЛ\nဇ\u0006\u000b\u001b\fဇ\u0007\rဇ\b\u000eဇ\t\u000fင\u000b\u0010င\f\u0011င\r\u0012င\u000e\u0013င\u000f\u0014ဈ\u0010\u0015ခ\u0011\u0016ဌ\u0012\u0017ဌ\u0014\u0018ခ\u0013\u0019ခ\u0015\u001aင\u0016\u001bင\n", new Object[]{"zbe", "zbf", C29425kw.class, "zbg", "zbh", "zbi", "zbj", "zbl", C29129cv.class, "zbm", "zbn", "zbk", C29203ev.class, "zbo", "zbp", C29351iw.class, "zbq", "zbr", "zbs", "zbu", "zbv", "zbw", "zbx", "zby", "zbz", "zbA", "zbB", C29396k3.m120605a(), "zbD", C29868wv.f71523a, "zbC", "zbE", "zbF", "zbt"});
        } else if (i2 == 3) {
            return new C29980zw();
        } else {
            if (i2 == 4) {
                return new C29943yw((C29941yu) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbG = b;
            return null;
        }
    }

    /* renamed from: v */
    public final C29056av mo85022v() {
        C29056av avVar = this.zbg;
        if (avVar == null) {
            return C29056av.m120162C();
        }
        return avVar;
    }

    /* renamed from: x */
    public final String mo85023x() {
        return this.zbn;
    }

    /* renamed from: y */
    public final String mo85024y() {
        return this.zbi;
    }
}
