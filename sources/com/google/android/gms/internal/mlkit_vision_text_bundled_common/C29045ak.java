package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.ak */
public final class C29045ak extends C29502mz<C29045ak, C29967zj> implements y00 {
    /* access modifiers changed from: private */
    public static final C29045ak zbb;
    private int zbe;
    private int zbf = 0;
    private Object zbg;
    private C29377jl zbh;
    private boolean zbi;
    private C29263gh zbj;
    private C29933ym zbk;
    private C29152dh zbl;
    private int zbm;
    private byte zbn = 2;

    static {
        C29045ak akVar = new C29045ak();
        zbb = akVar;
        C29502mz.m120753k(C29045ak.class, akVar);
    }

    /* renamed from: A */
    public static /* synthetic */ void m120146A(C29045ak akVar, C29377jl jlVar) {
        jlVar.getClass();
        akVar.zbh = jlVar;
        akVar.zbe |= 1;
    }

    /* renamed from: w */
    public static C29967zj m120147w() {
        return (C29967zj) zbb.mo84734m();
    }

    /* renamed from: y */
    public static /* synthetic */ void m120149y(C29045ak akVar, C29933ym ymVar) {
        ymVar.getClass();
        akVar.zbk = ymVar;
        akVar.zbe |= 8;
    }

    /* renamed from: B */
    public final boolean mo84507B() {
        if (this.zbf == 6) {
            return ((Boolean) this.zbg).booleanValue();
        }
        return false;
    }

    /* renamed from: C */
    public final boolean mo84508C() {
        if (this.zbf == 5) {
            return ((Boolean) this.zbg).booleanValue();
        }
        return false;
    }

    /* renamed from: D */
    public final boolean mo84509D() {
        return (this.zbe & 128) != 0;
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbn);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဉ\u0002\u0005်\u0000\u0006်\u0000\u0007ဉ\u0006\bင\u0007", new Object[]{"zbg", "zbf", "zbe", "zbh", "zbi", "zbk", "zbj", "zbl", "zbm"});
        } else if (i2 == 3) {
            return new C29045ak();
        } else {
            if (i2 == 4) {
                return new C29967zj((C29930yj) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbn = b;
            return null;
        }
    }

    /* renamed from: v */
    public final int mo84510v() {
        return this.zbm;
    }
}
