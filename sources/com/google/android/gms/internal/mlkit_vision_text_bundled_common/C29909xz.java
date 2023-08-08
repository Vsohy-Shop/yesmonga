package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.xz */
public final class C29909xz {

    /* renamed from: a */
    public static final Charset f71541a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f71542b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f71543c;

    /* renamed from: d */
    public static final ByteBuffer f71544d;

    /* renamed from: e */
    public static final C29575oy f71545e;

    static {
        byte[] bArr = new byte[0];
        f71543c = bArr;
        f71544d = ByteBuffer.wrap(bArr);
        int i = C29575oy.f71393b;
        C29501my myVar = new C29501my(bArr, 0, 0, false, (C29464ly) null);
        try {
            myVar.mo84725c(0);
            f71545e = myVar;
        } catch (zbye e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m121343a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m121344b(byte[] bArr) {
        int length = bArr.length;
        int d = m121346d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m121345c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    public static int m121346d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    public static <T> T m121347e(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: f */
    public static <T> T m121348f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    public static Object m121349g(Object obj, Object obj2) {
        return ((x00) obj).mo84728c().mo84764r3((x00) obj2).mo84647e0();
    }

    /* renamed from: h */
    public static String m121350h(byte[] bArr) {
        return new String(bArr, f71541a);
    }

    /* renamed from: i */
    public static boolean m121351i(x00 x00) {
        if (!(x00 instanceof C29685rx)) {
            return false;
        }
        C29685rx rxVar = (C29685rx) x00;
        throw null;
    }

    /* renamed from: j */
    public static boolean m121352j(byte[] bArr) {
        return C29873x.m121299e(bArr);
    }
}
