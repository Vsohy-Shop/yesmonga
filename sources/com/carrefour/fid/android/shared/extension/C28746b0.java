package com.carrefour.fid.android.shared.extension;

import android.content.res.Resources;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.extension.b0 */
public final class C28746b0 {
    /* renamed from: a */
    public static final double m119030a(@C12580l Integer num, int i) {
        if (num != null) {
            return ((double) num.intValue()) / Math.pow(10.0d, (double) i);
        }
        return 0.0d;
    }

    /* renamed from: b */
    public static final int m119031b(int i) {
        return (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density);
    }

    /* renamed from: c */
    public static final double m119032c(@C12580l Integer num, double d) {
        if (num == null) {
            return d;
        }
        try {
            return (double) num.intValue();
        } catch (Exception unused) {
            return d;
        }
    }

    /* renamed from: d */
    public static /* synthetic */ double m119033d(Integer num, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 0.0d;
        }
        return m119032c(num, d);
    }

    /* renamed from: e */
    public static final int m119034e(@C12580l Double d, int i) {
        if (d == null) {
            return i;
        }
        try {
            return (int) d.doubleValue();
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ int m119035f(Double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m119034e(d, i);
    }

    /* renamed from: g */
    public static final int m119036g(@C12580l Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
