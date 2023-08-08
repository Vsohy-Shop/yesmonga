package com.contentsquare.android.sdk;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.contentsquare.android.sdk.o3 */
public final class C14566o3 {

    /* renamed from: a */
    public static final Charset f36056a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f36057b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f36058c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    public static final byte[] f36059d;

    /* renamed from: e */
    public static final ByteBuffer f36060e;

    /* renamed from: f */
    public static final C14231c f36061f;

    /* renamed from: com.contentsquare.android.sdk.o3$a */
    public interface C14567a extends C14575i<Boolean> {
    }

    /* renamed from: com.contentsquare.android.sdk.o3$b */
    public interface C14568b extends C14575i<Double> {
    }

    /* renamed from: com.contentsquare.android.sdk.o3$c */
    public interface C14569c {
        /* renamed from: a */
        int mo35918a();
    }

    /* renamed from: com.contentsquare.android.sdk.o3$d */
    public interface C14570d<T extends C14569c> {
        /* renamed from: b */
        T mo35920b(int i);
    }

    /* renamed from: com.contentsquare.android.sdk.o3$e */
    public interface C14571e {
        /* renamed from: b */
        boolean mo36035b(int i);
    }

    /* renamed from: com.contentsquare.android.sdk.o3$f */
    public interface C14572f extends C14575i<Float> {
    }

    /* renamed from: com.contentsquare.android.sdk.o3$g */
    public interface C14573g extends C14575i<Integer> {
        /* renamed from: b */
        C14573g mo34508b(int i);
    }

    /* renamed from: com.contentsquare.android.sdk.o3$h */
    public interface C14574h extends C14575i<Long> {
        /* renamed from: b */
        C14574h mo34508b(int i);
    }

    /* renamed from: com.contentsquare.android.sdk.o3$i */
    public interface C14575i<E> extends List<E>, RandomAccess {
        /* renamed from: b */
        C14575i<E> mo34508b(int i);

        /* renamed from: c */
        void mo34819c();

        /* renamed from: p */
        boolean mo34822p();
    }

    static {
        byte[] bArr = new byte[0];
        f36059d = bArr;
        f36060e = ByteBuffer.wrap(bArr);
        f36061f = C14231c.m61078c(bArr);
    }

    /* renamed from: a */
    public static int m62799a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: b */
    public static int m62800b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static int m62801c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m62802d(byte[] bArr) {
        return m62803e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m62803e(byte[] bArr, int i, int i2) {
        int a = m62799a(i2, bArr, i, i2);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: f */
    public static <T> T m62804f(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: g */
    public static Object m62805g(Object obj, Object obj2) {
        return ((C14218ba) obj).mo34695S0().mo34702j1((C14218ba) obj2).mo34701a();
    }

    /* renamed from: h */
    public static <T> T m62806h(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: i */
    public static boolean m62807i(byte[] bArr) {
        return C14553ne.m62721h(bArr);
    }

    /* renamed from: j */
    public static String m62808j(byte[] bArr) {
        return new String(bArr, f36057b);
    }
}
