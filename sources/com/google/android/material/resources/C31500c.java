package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.C0327c1;
import androidx.annotation.C0330d1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.widget.C0722h1;
import com.google.android.material.C31076a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.resources.c */
public class C31500c {

    /* renamed from: a */
    public static final float f76263a = 1.3f;

    /* renamed from: b */
    public static final float f76264b = 2.0f;

    @C0363p0
    /* renamed from: a */
    public static ColorStateList m127363a(@C0359n0 Context context, @C0359n0 TypedArray typedArray, @C0330d1 int i) {
        int resourceId;
        ColorStateList a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = C0507a.m2345a(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return a;
    }

    @C0363p0
    /* renamed from: b */
    public static ColorStateList m127364b(@C0359n0 Context context, @C0359n0 C0722h1 h1Var, @C0330d1 int i) {
        int u;
        ColorStateList a;
        if (!h1Var.mo3455C(i) || (u = h1Var.mo3479u(i, 0)) == 0 || (a = C0507a.m2345a(context, u)) == null) {
            return h1Var.mo3462d(i);
        }
        return a;
    }

    /* renamed from: c */
    public static int m127365c(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    /* renamed from: d */
    public static int m127366d(@C0359n0 Context context, @C0359n0 TypedArray typedArray, @C0330d1 int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @C0363p0
    /* renamed from: e */
    public static Drawable m127367e(@C0359n0 Context context, @C0359n0 TypedArray typedArray, @C0330d1 int i) {
        int resourceId;
        Drawable b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = C0507a.m2346b(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return b;
    }

    @C0330d1
    /* renamed from: f */
    public static int m127368f(@C0359n0 TypedArray typedArray, @C0330d1 int i, @C0330d1 int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    @C0363p0
    /* renamed from: g */
    public static C31501d m127369g(@C0359n0 Context context, @C0359n0 TypedArray typedArray, @C0330d1 int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C31501d(context, resourceId);
    }

    /* renamed from: h */
    public static int m127370h(@C0359n0 Context context, @C0327c1 int i, int i2) {
        if (i == 0) {
            return i2;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C31076a.C31091o.TextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(C31076a.C31091o.TextAppearance_android_textSize, typedValue);
        obtainStyledAttributes.recycle();
        if (!value) {
            return i2;
        }
        if (m127365c(typedValue) == 2) {
            return Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
        }
        return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    /* renamed from: i */
    public static boolean m127371i(@C0359n0 Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: j */
    public static boolean m127372j(@C0359n0 Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
