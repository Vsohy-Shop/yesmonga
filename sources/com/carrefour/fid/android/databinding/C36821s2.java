package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.R;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.carrefour.fid.android.databinding.s2 */
public final class C36821s2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91623a;
    @C0359n0

    /* renamed from: b */
    public final LinearLayout f91624b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f91625c;
    @C0359n0

    /* renamed from: d */
    public final LinearLayout f91626d;
    @C0359n0

    /* renamed from: e */
    public final ViewPager2 f91627e;
    @C0359n0

    /* renamed from: f */
    public final TabLayout f91628f;

    public C36821s2(@C0359n0 LinearLayout linearLayout, @C0359n0 LinearLayout linearLayout2, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout3, @C0359n0 ViewPager2 viewPager2, @C0359n0 TabLayout tabLayout) {
        this.f91623a = linearLayout;
        this.f91624b = linearLayout2;
        this.f91625c = composeView;
        this.f91626d = linearLayout3;
        this.f91627e = viewPager2;
        this.f91628f = tabLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C36821s2 m151005a(@C0359n0 View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.orders_header;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.orders_header);
        if (composeView != null) {
            i = R.id.orders_header_layout;
            LinearLayout linearLayout2 = (LinearLayout) C20753c.m96463a(view, R.id.orders_header_layout);
            if (linearLayout2 != null) {
                i = R.id.pager_fragment_orders;
                ViewPager2 viewPager2 = (ViewPager2) C20753c.m96463a(view, R.id.pager_fragment_orders);
                if (viewPager2 != null) {
                    i = R.id.tab_fragment_orders;
                    TabLayout tabLayout = (TabLayout) C20753c.m96463a(view, R.id.tab_fragment_orders);
                    if (tabLayout != null) {
                        return new C36821s2(linearLayout, linearLayout, composeView, linearLayout2, viewPager2, tabLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36821s2 m151006c(@C0359n0 LayoutInflater layoutInflater) {
        return m151007d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36821s2 m151007d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_orders, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151005a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91623a;
    }
}
