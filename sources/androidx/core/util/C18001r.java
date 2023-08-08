package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.util.r */
public final class C18001r {
    /* renamed from: a */
    public static void m81764a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m81765b(boolean z, @C0359n0 Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m81766c(boolean z, @C0359n0 String str, @C0359n0 Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static float m81767d(float f, @C0359n0 String str) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        } else if (!Float.isInfinite(f)) {
            return f;
        } else {
            throw new IllegalArgumentException(str + " must not be infinite");
        }
    }

    /* renamed from: e */
    public static double m81768e(double d, double d2, double d3, @C0359n0 String str) {
        if (d < d2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", new Object[]{str, Double.valueOf(d2), Double.valueOf(d3)}));
        } else if (d <= d3) {
            return d;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", new Object[]{str, Double.valueOf(d2), Double.valueOf(d3)}));
        }
    }

    /* renamed from: f */
    public static float m81769f(float f, float f2, float f3, @C0359n0 String str) {
        if (f < f2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", new Object[]{str, Float.valueOf(f2), Float.valueOf(f3)}));
        } else if (f <= f3) {
            return f;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", new Object[]{str, Float.valueOf(f2), Float.valueOf(f3)}));
        }
    }

    /* renamed from: g */
    public static int m81770g(int i, int i2, int i3, @C0359n0 String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        } else if (i <= i3) {
            return i;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    /* renamed from: h */
    public static long m81771h(long j, long j2, long j3, @C0359n0 String str) {
        if (j < j2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Long.valueOf(j2), Long.valueOf(j3)}));
        } else if (j <= j3) {
            return j;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    @C0337f0(from = 0)
    /* renamed from: i */
    public static int m81772i(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    @C0337f0(from = 0)
    /* renamed from: j */
    public static int m81773j(int i, @C0363p0 String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: k */
    public static int m81774k(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i2) + " are allowed");
    }

    @C0359n0
    /* renamed from: l */
    public static <T> T m81775l(@C0363p0 T t) {
        t.getClass();
        return t;
    }

    @C0359n0
    /* renamed from: m */
    public static <T> T m81776m(@C0363p0 T t, @C0359n0 Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: n */
    public static void m81777n(boolean z) {
        m81778o(z, (String) null);
    }

    /* renamed from: o */
    public static void m81778o(boolean z, @C0363p0 String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @C0359n0
    /* renamed from: p */
    public static <T extends CharSequence> T m81779p(@C0363p0 T t) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException();
    }

    @C0359n0
    /* renamed from: q */
    public static <T extends CharSequence> T m81780q(@C0363p0 T t, @C0359n0 Object obj) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @C0359n0
    /* renamed from: r */
    public static <T extends CharSequence> T m81781r(@C0363p0 T t, @C0359n0 String str, @C0359n0 Object... objArr) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }
}
