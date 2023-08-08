package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.uw */
public final class C29795uw extends C29502mz<C29795uw, C29758tw> implements y00 {
    /* access modifiers changed from: private */
    public static final C29795uw zbb;
    private int zbe;
    private zbwp zbf = zbwp.f71626a;
    private int zbg;
    private int zbh;
    private String zbi = "";
    private C29872wz<C29794uv> zbj = C29502mz.m120760t();
    private C29906xw zbk;
    private C29872wz<C29721sw> zbl = C29502mz.m120760t();
    private C29130cw zbm;
    private C29979zv zbn;
    private C29872wz<C29647qw> zbo = C29502mz.m120760t();
    private byte zbp = 2;

    static {
        C29795uw uwVar = new C29795uw();
        zbb = uwVar;
        C29502mz.m120753k(C29795uw.class, uwVar);
    }

    /* renamed from: w */
    public static C29795uw m121235w() {
        return zbb;
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zbp);
        }
        byte b = 1;
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0003\u0004\u0001ᔊ\u0000\u0002ဈ\u0003\u0003Л\u0004ဉ\u0004\u0005Л\u0006ဉ\u0005\u0007ဉ\u0006\bЛ\tင\u0001\nင\u0002", new Object[]{"zbe", "zbf", "zbi", "zbj", C29794uv.class, "zbk", "zbl", C29721sw.class, "zbm", "zbn", "zbo", C29647qw.class, "zbg", "zbh"});
        } else if (i2 == 3) {
            return new C29795uw();
        } else {
            if (i2 == 4) {
                return new C29758tw((C29941yu) null);
            }
            if (i2 == 5) {
                return zbb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zbp = b;
            return null;
        }
    }

    /* renamed from: x */
    public final List<C29794uv> mo84897x() {
        return this.zbj;
    }
}
