package com.google.android.gms.internal.mlkit_common;

import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_common.e */
public final class C42347e {
    /* renamed from: a */
    public static int m171459a(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = C42358f.m171476a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            str2 = C42358f.m171476a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    /* renamed from: b */
    public static int m171460b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m171463e(i, i2, "index"));
    }

    /* renamed from: c */
    public static void m171461c(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m171463e(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m171463e(i2, i3, "end index");
            } else {
                str = C42358f.m171476a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: d */
    public static void m171462d(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalStateException("A SourcePolicy can only set internal() or external() once.");
        }
    }

    /* renamed from: e */
    public static String m171463e(int i, int i2, String str) {
        if (i < 0) {
            return C42358f.m171476a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C42358f.m171476a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
