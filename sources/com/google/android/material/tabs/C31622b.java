package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.C0359n0;
import com.google.android.material.animation.C31093a;

/* renamed from: com.google.android.material.tabs.b */
public class C31622b extends C31623c {

    /* renamed from: b */
    public static final float f76821b = 0.5f;

    /* renamed from: d */
    public void mo91444d(TabLayout tabLayout, View view, View view2, float f, @C0359n0 Drawable drawable) {
        float f2;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF a = C31623c.m128152a(tabLayout, view);
        if (i < 0) {
            f2 = C31093a.m124648b(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            f2 = C31093a.m124648b(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (f2 * 255.0f));
    }
}
