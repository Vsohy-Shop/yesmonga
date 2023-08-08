package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.C19318a;
import androidx.interpolator.view.animation.C19319b;
import androidx.interpolator.view.animation.C19320c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.animation.a */
public class C31093a {

    /* renamed from: a */
    public static final TimeInterpolator f74425a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f74426b = new C19319b();

    /* renamed from: c */
    public static final TimeInterpolator f74427c = new C19318a();

    /* renamed from: d */
    public static final TimeInterpolator f74428d = new C19320c();

    /* renamed from: e */
    public static final TimeInterpolator f74429e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m124647a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m124648b(float f, float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3, @C0379x(from = 0.0d, mo1016to = 1.0d) float f4, @C0379x(from = 0.0d, mo1016to = 1.0d) float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : m124647a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m124649c(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
