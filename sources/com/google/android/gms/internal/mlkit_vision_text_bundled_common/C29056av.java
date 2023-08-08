package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.av */
public final class C29056av extends C29502mz<C29056av, C29978zu> implements y00 {
    /* access modifiers changed from: private */
    public static final C29056av zbb;
    private int zbe;
    private int zbf;
    private int zbg;
    private int zbh;
    private int zbi;
    private float zbj;
    private C29424kv zbk;
    private byte zbl = 2;

    static {
        C29056av avVar = new C29056av();
        zbb = avVar;
        C29502mz.m120753k(C29056av.class, avVar);
    }

    /* renamed from: C */
    public static C29056av m120162C() {
        return zbb;
    }

    /* renamed from: A */
    public final int mo84511A() {
        return this.zbh;
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbl);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ခ\u0004\u0006ဉ\u0005", new Object[]{"zbe", "zbf", "zbg", "zbh", "zbi", "zbj", "zbk"});
        } else if (i2 == 3) {
            return new C29056av();
        } else {
            if (i2 == 4) {
                return new C29978zu((C29941yu) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbl = b;
            return null;
        }
    }

    /* renamed from: v */
    public final float mo84512v() {
        return this.zbj;
    }

    /* renamed from: w */
    public final int mo84513w() {
        return this.zbi;
    }

    /* renamed from: x */
    public final int mo84514x() {
        return this.zbf;
    }

    /* renamed from: y */
    public final int mo84515y() {
        return this.zbg;
    }
}
