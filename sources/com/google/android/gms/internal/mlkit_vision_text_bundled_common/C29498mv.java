package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.mv */
public final class C29498mv extends C29502mz<C29498mv, C29461lv> implements y00 {
    /* access modifiers changed from: private */
    public static final C29498mv zbb;
    private C29872wz<C29056av> zbA;
    private C29687rz zbB;
    private C29724sz zbC;
    private float zbD;
    private int zbE;
    private int zbF;
    private byte zbG = 2;
    private int zbe;
    private C29056av zbf;
    private float zbg;
    private zbwp zbh;
    private zbwp zbi;
    private C29056av zbj;
    private int zbk;
    private C29872wz<C29572ov> zbl;
    private boolean zbm;
    private boolean zbn;
    private C29872wz<C29463lx> zbo;
    private String zbp;
    private String zbq;
    private C29872wz<C29056av> zbr;
    private C29872wz<C29203ev> zbs;
    private int zbt;
    private int zbu;
    private float zbv;
    private float zbw;
    private float zbx;
    private int zby;
    private C29204ew zbz;

    static {
        C29498mv mvVar = new C29498mv();
        zbb = mvVar;
        C29502mz.m120753k(C29498mv.class, mvVar);
    }

    public C29498mv() {
        zbwp zbwp = zbwp.f71626a;
        this.zbh = zbwp;
        this.zbi = zbwp;
        this.zbl = C29502mz.m120760t();
        this.zbo = C29502mz.m120760t();
        this.zbp = "";
        this.zbq = "";
        this.zbr = C29502mz.m120760t();
        this.zbs = C29502mz.m120760t();
        this.zbu = 1;
        this.zbA = C29502mz.m120760t();
        this.zbB = C29502mz.m120757q();
        this.zbC = C29502mz.m120758r();
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbG);
        }
        byte b = 1;
        if (i2 == 2) {
            Class<C29056av> cls = C29056av.class;
            return C29502mz.m120752j(zbb, "\u0001\u001b\u0000\u0001\u0001d\u001b\u0000\u0007\u0007\u0001ᔉ\u0000\u0002ခ\u0001\u0003ည\u0002\u0004ည\u0003\u0005င\u0005\u0006ᐉ\u0004\u0007Л\bဇ\u0006\tဇ\u0007\nЛ\u000bဈ\b\fЛ\rЛ\u000eင\n\u000fဌ\u000b\u0010ခ\u000e\u0011ဈ\t\u0012င\u000f\u0013ဉ\u0010\u0014Л\u0015\u0013\u0016\u0016\u0017ခ\f\u0018ခ\r\u0019ခ\u0011\u001aင\u0012dင\u0013", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbk", "zbj", "zbl", C29572ov.class, "zbm", "zbn", "zbo", C29463lx.class, "zbp", "zbr", cls, "zbs", C29203ev.class, "zbt", "zbu", C29868wv.f71523a, "zbx", "zbq", "zby", "zbz", "zbA", cls, "zbB", "zbC", "zbv", "zbw", "zbD", "zbE", "zbF"});
        } else if (i2 == 3) {
            return new C29498mv();
        } else {
            if (i2 == 4) {
                return new C29461lv((C29941yu) null);
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
}
