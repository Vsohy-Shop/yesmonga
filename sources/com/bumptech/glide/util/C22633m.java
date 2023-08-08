package com.bumptech.glide.util;

import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.Collection;

/* renamed from: com.bumptech.glide.util.m */
public final class C22633m {
    /* renamed from: a */
    public static void m102621a(boolean z, @C0359n0 String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @C0359n0
    /* renamed from: b */
    public static String m102622b(@C0363p0 String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @C0359n0
    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m102623c(@C0359n0 T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @C0359n0
    /* renamed from: d */
    public static <T> T m102624d(@C0363p0 T t) {
        return m102625e(t, "Argument must not be null");
    }

    @C0359n0
    /* renamed from: e */
    public static <T> T m102625e(@C0363p0 T t, @C0359n0 String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
