package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.nm */
public final class C29526nm extends C29502mz<C29526nm, C29489mm> implements y00 {
    /* access modifiers changed from: private */
    public static final C29526nm zbb;
    private int zbe;
    private int zbf;
    private String zbg = "";
    private C29872wz<C29080bi> zbh = C29502mz.m120760t();

    static {
        C29526nm nmVar = new C29526nm();
        zbb = nmVar;
        C29502mz.m120753k(C29526nm.class, nmVar);
    }

    /* renamed from: x */
    public static C29526nm m120798x(byte[] bArr, C29908xy xyVar) throws zbye {
        return (C29526nm) C29502mz.m120755o(zbb, bArr, xyVar);
    }

    /* renamed from: A */
    public final List<C29080bi> mo84742A() {
        return this.zbh;
    }

    /* renamed from: l */
    public final Object mo84505l(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C29502mz.m120752j(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"zbe", "zbf", "zbg", "zbh", C29080bi.class});
        } else if (i2 == 3) {
            return new C29526nm();
        } else {
            if (i2 == 4) {
                return new C29489mm((C29452lm) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zbb;
        }
    }

    /* renamed from: v */
    public final int mo84743v() {
        return this.zbf;
    }

    /* renamed from: y */
    public final String mo84744y() {
        return this.zbg;
    }
}
