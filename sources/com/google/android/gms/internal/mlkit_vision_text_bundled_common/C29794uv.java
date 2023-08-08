package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.uv */
public final class C29794uv extends C29354iz<C29794uv, C29757tv> implements y00 {
    /* access modifiers changed from: private */
    public static final C29794uv zbe;
    private C29279gx zbA;
    private int zbB;
    private float zbC;
    private boolean zbD;
    private int zbE;
    private byte zbF = 2;
    private int zbf;
    private C29872wz<C29980zw> zbg = C29502mz.m120760t();
    private C29056av zbh;
    private C29056av zbi;
    private C29056av zbj;
    private String zbk = "";
    private float zbl;
    private C29872wz<C29203ev> zbm = C29502mz.m120760t();
    private C29872wz<C29129cv> zbn = C29502mz.m120760t();
    private float zbo;
    private String zbp = "";
    private boolean zbq;
    private C29872wz<C29351iw> zbr = C29502mz.m120760t();
    private int zbs;
    private int zbt;
    private boolean zbu;
    private C29498mv zbv;
    private boolean zbw;
    private int zbx;
    private int zby;
    private int zbz;

    static {
        C29794uv uvVar = new C29794uv();
        zbe = uvVar;
        C29502mz.m120753k(C29794uv.class, uvVar);
    }

    /* renamed from: B */
    public final String mo84889B() {
        return this.zbp;
    }

    /* renamed from: C */
    public final String mo84890C() {
        return this.zbk;
    }

    /* renamed from: D */
    public final List<C29980zw> mo84891D() {
        return this.zbg;
    }

    /* renamed from: E */
    public final boolean mo84892E() {
        return (this.zbf & 64) != 0;
    }

    /* renamed from: F */
    public final boolean mo84893F() {
        return (this.zbf & 8) != 0;
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbF);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbe, "\u0001\u0019\u0000\u0001\u0001d\u0019\u0000\u0004\u0006\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ဈ\u0003\u0005ခ\u0004\u0006\u001b\u0007ခ\u0005\bဈ\u0006\tЛ\nဇ\u0007\u000b\u001b\fင\b\rင\t\u000eဇ\n\u000fᐉ\u000b\u0010ဇ\f\u0011င\r\u0012င\u000e\u0013ᐉ\u0002\u0014င\u000f\u0015ဉ\u0010\u0016ဌ\u0011\u0017ခ\u0012\u0018ဇ\u0013dင\u0014", new Object[]{"zbf", "zbg", C29980zw.class, "zbh", "zbi", "zbk", "zbl", "zbn", C29129cv.class, "zbo", "zbp", "zbm", C29203ev.class, "zbq", "zbr", C29351iw.class, "zbs", "zbt", "zbu", "zbv", "zbw", "zbx", "zby", "zbj", "zbz", "zbA", "zbB", C29396k3.m120605a(), "zbC", "zbD", "zbE"});
        } else if (i2 == 3) {
            return new C29794uv();
        } else {
            if (i2 == 4) {
                return new C29757tv((C29941yu) null);
            }
            if (i2 == 5) {
                return zbe;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbF = b;
            return null;
        }
    }

    /* renamed from: w */
    public final int mo84894w() {
        return this.zbx;
    }

    /* renamed from: x */
    public final int mo84895x() {
        return this.zby;
    }

    /* renamed from: y */
    public final C29056av mo84896y() {
        C29056av avVar = this.zbh;
        if (avVar == null) {
            return C29056av.m120162C();
        }
        return avVar;
    }
}
