package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.C0379x;
import com.google.android.material.animation.C31093a;
import com.google.android.material.internal.C31432x;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.google.android.material.tabs.c */
public class C31623c {
    @C0366r(unit = 0)

    /* renamed from: a */
    public static final int f76822a = 24;

    /* renamed from: a */
    public static RectF m128152a(TabLayout tabLayout, @C0363p0 View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.mo91276D() || !(view instanceof TabLayout.TabView)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        return m128153b((TabLayout.TabView) view, 24);
    }

    /* renamed from: b */
    public static RectF m128153b(@C0359n0 TabLayout.TabView tabView, @C0366r(unit = 0) int i) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int e = (int) C31432x.m127010e(tabView.getContext(), i);
        if (contentWidth < e) {
            contentWidth = e;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF((float) (left - i2), (float) (top - (contentHeight / 2)), (float) (i2 + left), (float) (top + (left / 2)));
    }

    /* renamed from: c */
    public void mo91445c(TabLayout tabLayout, View view, @C0359n0 Drawable drawable) {
        RectF a = m128152a(tabLayout, view);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
    }

    /* renamed from: d */
    public void mo91444d(TabLayout tabLayout, View view, View view2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f, @C0359n0 Drawable drawable) {
        RectF a = m128152a(tabLayout, view);
        RectF a2 = m128152a(tabLayout, view2);
        drawable.setBounds(C31093a.m124649c((int) a.left, (int) a2.left, f), drawable.getBounds().top, C31093a.m124649c((int) a.right, (int) a2.right, f), drawable.getBounds().bottom);
    }
}
