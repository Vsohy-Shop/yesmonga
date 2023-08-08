package com.google.android.material.theme.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.view.C0538d;
import com.google.android.material.C31076a;

/* renamed from: com.google.android.material.theme.overlay.a */
public class C31683a {

    /* renamed from: a */
    public static final int[] f77068a = {16842752, C31076a.C31079c.theme};

    /* renamed from: b */
    public static final int[] f77069b = {C31076a.C31079c.materialThemeOverlay};

    @C0327c1
    /* renamed from: a */
    public static int m128453a(@C0359n0 Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f77068a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return resourceId;
        }
        return resourceId2;
    }

    @C0327c1
    /* renamed from: b */
    public static int m128454b(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f77069b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @C0359n0
    /* renamed from: c */
    public static Context m128455c(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        boolean z;
        int b = m128454b(context, attributeSet, i, i2);
        if (!(context instanceof C0538d) || ((C0538d) context).mo1762c() != b) {
            z = false;
        } else {
            z = true;
        }
        if (b == 0 || z) {
            return context;
        }
        C0538d dVar = new C0538d(context, b);
        int a = m128453a(context, attributeSet);
        if (a != 0) {
            dVar.getTheme().applyStyle(a, true);
        }
        return dVar;
    }
}
