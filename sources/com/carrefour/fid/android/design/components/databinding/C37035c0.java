package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.carrefour.fid.android.design.components.databinding.c0 */
public final class C37035c0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f92583a;
    @C0359n0

    /* renamed from: b */
    public final TabLayout f92584b;
    @C0359n0

    /* renamed from: c */
    public final ViewPager2 f92585c;

    public C37035c0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TabLayout tabLayout, @C0359n0 ViewPager2 viewPager2) {
        this.f92583a = constraintLayout;
        this.f92584b = tabLayout;
        this.f92585c = viewPager2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37035c0 m151945a(@C0359n0 View view) {
        int i = C36896b.C36906j.message_tab_layout;
        TabLayout tabLayout = (TabLayout) C20753c.m96463a(view, i);
        if (tabLayout != null) {
            i = C36896b.C36906j.message_view_pager;
            ViewPager2 viewPager2 = (ViewPager2) C20753c.m96463a(view, i);
            if (viewPager2 != null) {
                return new C37035c0((ConstraintLayout) view, tabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C37035c0 m151946c(@C0359n0 LayoutInflater layoutInflater) {
        return m151947d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37035c0 m151947d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_message_pager, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151945a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92583a;
    }
}
