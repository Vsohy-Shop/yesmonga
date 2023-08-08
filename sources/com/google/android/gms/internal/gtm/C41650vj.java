package com.google.android.gms.internal.gtm;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.gtm.vj */
public final class C41650vj {

    /* renamed from: a */
    public static final Charset f105169a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f105170b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f105171c;

    /* renamed from: d */
    public static final ByteBuffer f105172d;

    /* renamed from: e */
    public static final C41672wh f105173e;

    static {
        byte[] bArr = new byte[0];
        f105171c = bArr;
        f105172d = ByteBuffer.wrap(bArr);
        int i = C41672wh.f105213e;
        C41576sh shVar = new C41576sh(bArr, 0, 0, false, (C41552rh) null);
        try {
            shVar.mo135835b(0);
            f105173e = shVar;
        } catch (zzvk e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m168599a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m168600b(byte[] bArr) {
        int length = bArr.length;
        int d = m168602d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m168601c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    public static int m168602d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    public static <T> T m168603e(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: f */
    public static <T> T m168604f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    public static Object m168605g(Object obj, Object obj2) {
        return ((C41627uk) obj).mo135625e().mo135874w3((C41627uk) obj2).mo135374w();
    }

    /* renamed from: h */
    public static String m168606h(byte[] bArr) {
        return new String(bArr, f105169a);
    }

    /* renamed from: i */
    public static boolean m168607i(C41627uk ukVar) {
        if (!(ukVar instanceof C41719yg)) {
            return false;
        }
        C41719yg ygVar = (C41719yg) ukVar;
        throw null;
    }

    /* renamed from: j */
    public static boolean m168608j(byte[] bArr) {
        return C41461nm.m168096e(bArr);
    }
}
