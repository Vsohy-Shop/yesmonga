package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.C32488a;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* renamed from: com.google.android.gms.internal.common.z */
public final class C41124z {
    @C32488a
    /* renamed from: a */
    public static int m166998a(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = C41103f0.m166979a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            str2 = C41103f0.m166979a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    @C32488a
    /* renamed from: b */
    public static int m166999b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m167001d(i, i2, "index"));
    }

    /* renamed from: c */
    public static void m167000c(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m167001d(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m167001d(i2, i3, "end index");
            } else {
                str = C41103f0.m166979a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: d */
    public static String m167001d(int i, int i2, String str) {
        if (i < 0) {
            return C41103f0.m166979a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C41103f0.m166979a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }
}
