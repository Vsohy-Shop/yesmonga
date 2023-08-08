package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.bq */
public final class C29088bq extends C29502mz<C29088bq, C29936yp> implements y00 {
    /* access modifiers changed from: private */
    public static final C29088bq zbb;
    private int zbe;
    private String zbf = "";
    private C29051aq zbg;
    private C29565oo zbh;
    private C29565oo zbi;
    private C29808v8 zbj;
    private String zbk = "en";
    private int zbl = -1;
    private float zbm;
    private C29872wz<String> zbn = C29502mz.m120760t();
    private C29872wz<String> zbo = C29502mz.m120760t();
    private boolean zbp;
    private C29098c0 zbq;
    private int zbr = -1;

    static {
        C29088bq bqVar = new C29088bq();
        zbb = bqVar;
        C29502mz.m120753k(C29088bq.class, bqVar);
    }

    /* renamed from: v */
    public static C29936yp m120204v() {
        return (C29936yp) zbb.mo84734m();
    }

    /* renamed from: x */
    public static /* synthetic */ void m120206x(C29088bq bqVar, String str) {
        bqVar.zbe |= 1;
        bqVar.zbf = "PassThroughCoarseClassifier";
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0002\u0000\u0001ဈ\u0000\u0002င\u0006\u0003ခ\u0007\u0004\u001a\u0005\u001a\u0006ဉ\u0001\bဇ\b\tဉ\t\nဉ\u0002\u000bဈ\u0005\fဉ\u0003\rင\n\u000eဉ\u0004", new Object[]{"zbe", "zbf", "zbl", "zbm", "zbn", "zbo", "zbg", "zbp", "zbq", "zbh", "zbk", "zbi", "zbr", "zbj"});
        } else if (i2 == 3) {
            return new C29088bq();
        } else {
            if (i2 == 4) {
                return new C29936yp((C29899xp) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }
}
