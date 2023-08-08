package com.google.android.material.slider;

import androidx.annotation.C0359n0;
import java.util.Locale;

/* renamed from: com.google.android.material.slider.c */
public final class C31570c implements C31571d {

    /* renamed from: e */
    public static final long f76591e = 1000000000000L;

    /* renamed from: f */
    public static final int f76592f = 1000000000;

    /* renamed from: g */
    public static final int f76593g = 1000000;

    /* renamed from: h */
    public static final int f76594h = 1000;

    @C0359n0
    /* renamed from: a */
    public String mo91118a(float f) {
        if (f >= 1.0E12f) {
            return String.format(Locale.US, "%.1fT", new Object[]{Float.valueOf(f / 1.0E12f)});
        } else if (f >= 1.0E9f) {
            return String.format(Locale.US, "%.1fB", new Object[]{Float.valueOf(f / 1.0E9f)});
        } else if (f >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", new Object[]{Float.valueOf(f / 1000000.0f)});
        } else if (f >= 1000.0f) {
            return String.format(Locale.US, "%.1fK", new Object[]{Float.valueOf(f / 1000.0f)});
        } else {
            return String.format(Locale.US, "%.0f", new Object[]{Float.valueOf(f)});
        }
    }
}
