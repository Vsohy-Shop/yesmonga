package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.aa */
public final class C41860aa {

    /* renamed from: a */
    public static final Charset f105995a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f105996b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f105997c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f105998d;

    /* renamed from: e */
    public static final ByteBuffer f105999e;

    /* renamed from: f */
    public static final C42244w8 f106000f;

    static {
        byte[] bArr = new byte[0];
        f105998d = bArr;
        f105999e = ByteBuffer.wrap(bArr);
        int i = C42244w8.f106481b;
        C42210u8 u8Var = new C42210u8(bArr, 0, 0, false, (C42193t8) null);
        try {
            u8Var.mo137341c(0);
            f106000f = u8Var;
        } catch (zzll e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m169666a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m169667b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: c */
    public static Object m169668c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static String m169669d(byte[] bArr) {
        return new String(bArr, f105996b);
    }
}
