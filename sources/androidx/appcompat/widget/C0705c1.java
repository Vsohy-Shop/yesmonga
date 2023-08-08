package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.core.graphics.C17586h0;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.appcompat.widget.c1 */
public class C0705c1 {

    /* renamed from: a */
    public static final String f2336a = "ThemeUtils";

    /* renamed from: b */
    public static final ThreadLocal<TypedValue> f2337b = new ThreadLocal<>();

    /* renamed from: c */
    public static final int[] f2338c = {-16842910};

    /* renamed from: d */
    public static final int[] f2339d = {16842908};

    /* renamed from: e */
    public static final int[] f2340e = {16843518};

    /* renamed from: f */
    public static final int[] f2341f = {16842919};

    /* renamed from: g */
    public static final int[] f2342g = {16842912};

    /* renamed from: h */
    public static final int[] f2343h = {16842913};

    /* renamed from: i */
    public static final int[] f2344i = {-16842919, -16842908};

    /* renamed from: j */
    public static final int[] f2345j = new int[0];

    /* renamed from: k */
    public static final int[] f2346k = new int[1];

    /* renamed from: a */
    public static void m3421a(@C0359n0 View view, @C0359n0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0387a.C0400m.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(C0387a.C0400m.AppCompatTheme_windowActionBar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @C0359n0
    /* renamed from: b */
    public static ColorStateList m3422b(int i, int i2) {
        return new ColorStateList(new int[][]{f2338c, f2345j}, new int[]{i2, i});
    }

    /* renamed from: c */
    public static int m3423c(@C0359n0 Context context, int i) {
        ColorStateList f = m3426f(context, i);
        if (f != null && f.isStateful()) {
            return f.getColorForState(f2338c, f.getDefaultColor());
        }
        TypedValue g = m3427g();
        context.getTheme().resolveAttribute(16842803, g, true);
        return m3425e(context, i, g.getFloat());
    }

    /* renamed from: d */
    public static int m3424d(@C0359n0 Context context, int i) {
        int[] iArr = f2346k;
        iArr[0] = i;
        C0722h1 F = C0722h1.m3538F(context, (AttributeSet) null, iArr);
        try {
            return F.mo3461c(0, 0);
        } finally {
            F.mo3458I();
        }
    }

    /* renamed from: e */
    public static int m3425e(@C0359n0 Context context, int i, float f) {
        int d = m3424d(context, i);
        return C17586h0.m80563B(d, Math.round(((float) Color.alpha(d)) * f));
    }

    @C0363p0
    /* renamed from: f */
    public static ColorStateList m3426f(@C0359n0 Context context, int i) {
        int[] iArr = f2346k;
        iArr[0] = i;
        C0722h1 F = C0722h1.m3538F(context, (AttributeSet) null, iArr);
        try {
            return F.mo3462d(0);
        } finally {
            F.mo3458I();
        }
    }

    /* renamed from: g */
    public static TypedValue m3427g() {
        ThreadLocal<TypedValue> threadLocal = f2337b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
