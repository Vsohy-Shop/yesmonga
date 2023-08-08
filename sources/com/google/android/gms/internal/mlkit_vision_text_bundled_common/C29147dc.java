package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.dc */
public final class C29147dc extends C29502mz<C29147dc, C29292h9> implements y00 {
    /* access modifiers changed from: private */
    public static final C29147dc zbb;
    private boolean zbA;
    private int zbB;
    private boolean zbC;
    private C29367jb zbD;
    private int zbe;
    private String zbf = "";
    private String zbg = "";
    private boolean zbh;
    private C29729t3 zbi;
    private boolean zbj;
    private int zbk;
    private boolean zbl;
    private boolean zbm;
    private float zbn;
    private float zbo;
    private boolean zbp;
    private boolean zbq;
    private boolean zbr = true;
    private boolean zbs = true;
    private boolean zbt;
    private int zbu;
    private boolean zbv;
    private float zbw = 0.75f;
    private boolean zbx;
    private C29830vu zby;
    private boolean zbz;

    static {
        C29147dc dcVar = new C29147dc();
        zbb = dcVar;
        C29502mz.m120753k(C29147dc.class, dcVar);
    }

    /* renamed from: v */
    public static C29292h9 m120293v() {
        return (C29292h9) zbb.mo84734m();
    }

    /* renamed from: x */
    public static /* synthetic */ void m120295x(C29147dc dcVar, String str) {
        dcVar.zbe |= 1;
        dcVar.zbf = str;
    }

    /* renamed from: y */
    public static /* synthetic */ void m120296y(C29147dc dcVar, String str) {
        dcVar.zbe |= 2;
        dcVar.zbg = str;
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\b\u0004ဇ\u0006\u0005ခ\t\u0006ဇ\u0007\bင\u0016\tင\u0005\nဇ\n\u000bဇ\u000b\fဇ\f\rဇ\r\u000eဇ\u000e\u000fင\u000f\u0010ဇ\u0010\u0011ခ\u0011\u0012ဇ\u0012\u0013ဉ\u0013\u0014ဇ\u0002\u0015ဉ\u0018\u0016ဇ\u0017\u0017ဉ\u0003\u0018ဇ\u0004\u0019ဇ\u0014\u001aဇ\u0015", new Object[]{"zbe", "zbf", "zbg", "zbn", "zbl", "zbo", "zbm", "zbB", "zbk", "zbp", "zbq", "zbr", "zbs", "zbt", "zbu", "zbv", "zbw", "zbx", "zby", "zbh", "zbD", "zbC", "zbi", "zbj", "zbz", "zbA"});
        } else if (i2 == 3) {
            return new C29147dc();
        } else {
            if (i2 == 4) {
                return new C29292h9((C29254g8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
