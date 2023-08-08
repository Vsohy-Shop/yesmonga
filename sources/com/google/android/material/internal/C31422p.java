package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.C0327c1;
import androidx.annotation.C0330d1;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0722h1;
import com.google.android.material.C31076a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.p */
public final class C31422p {

    /* renamed from: a */
    public static final int[] f75960a = {C31076a.C31079c.colorPrimary};

    /* renamed from: b */
    public static final String f75961b = "Theme.AppCompat";

    /* renamed from: c */
    public static final int[] f75962c = {C31076a.C31079c.colorPrimaryVariant};

    /* renamed from: d */
    public static final String f75963d = "Theme.MaterialComponents";

    /* renamed from: a */
    public static void m126961a(@C0359n0 Context context) {
        m126965e(context, f75960a, f75961b);
    }

    /* renamed from: b */
    public static void m126962b(@C0359n0 Context context, AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31076a.C31091o.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C31076a.C31091o.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C31076a.C31079c.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m126963c(context);
            }
        }
        m126961a(context);
    }

    /* renamed from: c */
    public static void m126963c(@C0359n0 Context context) {
        m126965e(context, f75962c, f75963d);
    }

    /* renamed from: d */
    public static void m126964d(@C0359n0 Context context, AttributeSet attributeSet, @C0330d1 @C0359n0 int[] iArr, @C0336f int i, @C0327c1 int i2, @C0363p0 @C0330d1 int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C31076a.C31091o.ThemeEnforcement, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C31076a.C31091o.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C31076a.C31091o.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m126967g(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    public static void m126965e(@C0359n0 Context context, @C0359n0 int[] iArr, String str) {
        if (!m126969i(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: f */
    public static boolean m126966f(@C0359n0 Context context) {
        return m126969i(context, f75960a);
    }

    /* renamed from: g */
    public static boolean m126967g(@C0359n0 Context context, AttributeSet attributeSet, @C0330d1 @C0359n0 int[] iArr, @C0336f int i, @C0327c1 int i2, @C0330d1 @C0359n0 int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static boolean m126968h(@C0359n0 Context context) {
        return m126969i(context, f75962c);
    }

    /* renamed from: i */
    public static boolean m126969i(@C0359n0 Context context, @C0359n0 int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @C0359n0
    /* renamed from: j */
    public static TypedArray m126970j(@C0359n0 Context context, AttributeSet attributeSet, @C0330d1 @C0359n0 int[] iArr, @C0336f int i, @C0327c1 int i2, @C0330d1 int... iArr2) {
        m126962b(context, attributeSet, i, i2);
        m126964d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: k */
    public static C0722h1 m126971k(@C0359n0 Context context, AttributeSet attributeSet, @C0330d1 @C0359n0 int[] iArr, @C0336f int i, @C0327c1 int i2, @C0330d1 int... iArr2) {
        m126962b(context, attributeSet, i, i2);
        m126964d(context, attributeSet, iArr, i, i2, iArr2);
        return C0722h1.m3539G(context, attributeSet, iArr, i, i2);
    }
}
