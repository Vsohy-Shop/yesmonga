package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.R;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.carrefour.fid.android.databinding.w */
public final class C36858w implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91827a;
    @C0359n0

    /* renamed from: b */
    public final TabLayout f91828b;
    @C0359n0

    /* renamed from: c */
    public final ViewPager2 f91829c;

    public C36858w(@C0359n0 LinearLayout linearLayout, @C0359n0 TabLayout tabLayout, @C0359n0 ViewPager2 viewPager2) {
        this.f91827a = linearLayout;
        this.f91828b = tabLayout;
        this.f91829c = viewPager2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36858w m151149a(@C0359n0 View view) {
        int i = R.id.account_consent_tab_layout;
        TabLayout tabLayout = (TabLayout) C20753c.m96463a(view, R.id.account_consent_tab_layout);
        if (tabLayout != null) {
            i = R.id.account_consent_view_pager;
            ViewPager2 viewPager2 = (ViewPager2) C20753c.m96463a(view, R.id.account_consent_view_pager);
            if (viewPager2 != null) {
                return new C36858w((LinearLayout) view, tabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36858w m151150c(@C0359n0 LayoutInflater layoutInflater) {
        return m151151d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36858w m151151d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_account_consent_parameter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151149a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91827a;
    }
}
