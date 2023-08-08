package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.x2 */
public final class C39084x2 {

    /* renamed from: a */
    public static final Charset f98960a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f98961b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f98962c;

    /* renamed from: d */
    public static final ByteBuffer f98963d;

    /* renamed from: e */
    public static final C39029r1 f98964e;

    static {
        byte[] bArr = new byte[0];
        f98962c = bArr;
        f98963d = ByteBuffer.wrap(bArr);
        int i = C39029r1.f98931b;
        C39011p1 p1Var = new C39011p1(bArr, 0, 0, false, (C39002o1) null);
        try {
            p1Var.mo122997c(0);
            f98964e = p1Var;
        } catch (zzep e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m160965a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m160966b(byte[] bArr) {
        int length = bArr.length;
        int d = m160968d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m160967c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    public static int m160968d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    public static <T> T m160969e(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: f */
    public static <T> T m160970f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    public static Object m160971g(Object obj, Object obj2) {
        return ((C39076w3) obj).mo122986f().mo123101n0((C39076w3) obj2).mo122919r();
    }

    /* renamed from: h */
    public static String m160972h(byte[] bArr) {
        return new String(bArr, f98960a);
    }

    /* renamed from: i */
    public static boolean m160973i(C39076w3 w3Var) {
        if (!(w3Var instanceof C39100z0)) {
            return false;
        }
        C39100z0 z0Var = (C39100z0) w3Var;
        throw null;
    }

    /* renamed from: j */
    public static boolean m160974j(byte[] bArr) {
        return C39060u5.m160890h(bArr);
    }
}
