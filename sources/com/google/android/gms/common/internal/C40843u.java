package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.util.C40980g0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@C40473a
/* renamed from: com.google.android.gms.common.internal.u */
public final class C40843u {
    public C40843u() {
        throw new AssertionError("Uninstantiable");
    }

    @C40473a
    /* renamed from: a */
    public static void m166191a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @C40473a
    /* renamed from: b */
    public static void m166192b(boolean z, @C0359n0 Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @C40473a
    /* renamed from: c */
    public static void m166193c(boolean z, @C0359n0 String str, @C0359n0 Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @C40473a
    /* renamed from: d */
    public static void m166194d(@C0359n0 Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name + " thread, but got " + str + ".");
        }
    }

    @C40473a
    /* renamed from: e */
    public static void m166195e(@C0359n0 Handler handler, @C0359n0 String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @C40473a
    /* renamed from: f */
    public static void m166196f() {
        m166197g("Must be called on the main application thread");
    }

    @C40473a
    /* renamed from: g */
    public static void m166197g(@C0359n0 String str) {
        if (!C40980g0.m166619a()) {
            throw new IllegalStateException(str);
        }
    }

    @C40473a
    @C0359n0
    @EnsuresNonNull({"#1"})
    /* renamed from: h */
    public static String m166198h(@C0363p0 String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @C40473a
    @C0359n0
    @EnsuresNonNull({"#1"})
    /* renamed from: i */
    public static String m166199i(@C0363p0 String str, @C0359n0 Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @C40473a
    /* renamed from: j */
    public static void m166200j() {
        m166201k("Must not be called on the main application thread");
    }

    @C40473a
    /* renamed from: k */
    public static void m166201k(@C0359n0 String str) {
        if (C40980g0.m166619a()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    @C40473a
    @C0359n0
    /* renamed from: l */
    public static <T> T m166202l(@C0363p0 T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @EnsuresNonNull({"#1"})
    @C40473a
    @C0359n0
    /* renamed from: m */
    public static <T> T m166203m(@C0359n0 T t, @C0359n0 Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @C40473a
    /* renamed from: n */
    public static int m166204n(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @C40473a
    /* renamed from: o */
    public static int m166205o(int i, @C0359n0 Object obj) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @C40473a
    /* renamed from: p */
    public static long m166206p(long j) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @C40473a
    /* renamed from: q */
    public static long m166207q(long j, @C0359n0 Object obj) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @C40473a
    /* renamed from: r */
    public static void m166208r(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @C40473a
    /* renamed from: s */
    public static void m166209s(boolean z, @C0359n0 Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @C40473a
    /* renamed from: t */
    public static void m166210t(boolean z, @C0359n0 String str, @C0359n0 Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
