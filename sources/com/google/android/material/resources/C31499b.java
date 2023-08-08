package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0372t0;
import androidx.annotation.RestrictTo;
import com.google.android.material.C31076a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.resources.b */
public class C31499b {
    @C0363p0
    /* renamed from: a */
    public static TypedValue m127355a(@C0359n0 Context context, @C0336f int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m127356b(@C0359n0 Context context, @C0336f int i, boolean z) {
        TypedValue a = m127355a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        if (a.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m127357c(@C0359n0 Context context, @C0336f int i, @C0359n0 String str) {
        return m127361g(context, i, str) != 0;
    }

    @C0372t0
    /* renamed from: d */
    public static int m127358d(@C0359n0 Context context, @C0336f int i, @C0364q int i2) {
        float dimension;
        TypedValue a = m127355a(context, i);
        if (a == null || a.type != 5) {
            dimension = context.getResources().getDimension(i2);
        } else {
            dimension = a.getDimension(context.getResources().getDisplayMetrics());
        }
        return (int) dimension;
    }

    /* renamed from: e */
    public static int m127359e(@C0359n0 Context context, @C0336f int i, int i2) {
        TypedValue a = m127355a(context, i);
        if (a == null || a.type != 16) {
            return i2;
        }
        return a.data;
    }

    @C0372t0
    /* renamed from: f */
    public static int m127360f(@C0359n0 Context context) {
        return m127358d(context, C31076a.C31079c.minTouchTargetSize, C31076a.C31082f.mtrl_min_touch_target_size);
    }

    /* renamed from: g */
    public static int m127361g(@C0359n0 Context context, @C0336f int i, @C0359n0 String str) {
        TypedValue a = m127355a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: h */
    public static int m127362h(@C0359n0 View view, @C0336f int i) {
        return m127361g(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
