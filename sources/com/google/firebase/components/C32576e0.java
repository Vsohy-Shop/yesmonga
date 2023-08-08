package com.google.firebase.components;

import com.google.errorprone.annotations.C32488a;

/* renamed from: com.google.firebase.components.e0 */
public final class C32576e0 {
    /* renamed from: a */
    public static void m131618a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @C32488a
    /* renamed from: b */
    public static <T> T m131619b(T t) {
        t.getClass();
        return t;
    }

    @C32488a
    /* renamed from: c */
    public static <T> T m131620c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m131621d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
