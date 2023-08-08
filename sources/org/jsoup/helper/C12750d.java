package org.jsoup.helper;

import javax.annotation.Nullable;

/* renamed from: org.jsoup.helper.d */
public final class C12750d {
    /* renamed from: a */
    public static void m55064a(String str) {
        throw new IllegalArgumentException(str);
    }

    /* renamed from: b */
    public static void m55065b(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Must be false");
        }
    }

    /* renamed from: c */
    public static void m55066c(boolean z, String str) {
        if (z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: d */
    public static void m55067d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    /* renamed from: e */
    public static void m55068e(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: f */
    public static void m55069f(Object[] objArr) {
        m55070g(objArr, "Array must not contain any null objects");
    }

    /* renamed from: g */
    public static void m55070g(Object[] objArr, String str) {
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            if (objArr[i] != null) {
                i++;
            } else {
                throw new IllegalArgumentException(str);
            }
        }
    }

    /* renamed from: h */
    public static void m55071h(@Nullable String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    /* renamed from: i */
    public static void m55072i(@Nullable String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: j */
    public static void m55073j(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    /* renamed from: k */
    public static void m55074k(@Nullable Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: l */
    public static void m55075l(String str) {
        throw new IllegalStateException(str);
    }
}
