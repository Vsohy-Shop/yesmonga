package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0379x;
import com.google.android.material.animation.C31093a;

/* renamed from: com.google.android.material.tabs.a */
public class C31621a extends C31623c {
    /* renamed from: e */
    public static float m128148e(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        return (float) (1.0d - Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    public static float m128149f(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        return (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
    }

    /* renamed from: d */
    public void mo91444d(TabLayout tabLayout, View view, View view2, float f, @C0359n0 Drawable drawable) {
        boolean z;
        float f2;
        float f3;
        RectF a = C31623c.m128152a(tabLayout, view);
        RectF a2 = C31623c.m128152a(tabLayout, view2);
        if (a.left < a2.left) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f3 = m128148e(f);
            f2 = m128149f(f);
        } else {
            f3 = m128149f(f);
            f2 = m128148e(f);
        }
        drawable.setBounds(C31093a.m124649c((int) a.left, (int) a2.left, f3), drawable.getBounds().top, C31093a.m124649c((int) a.right, (int) a2.right, f2), drawable.getBounds().bottom);
    }
}
