package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.carrefour.fid.android.databinding.n3 */
public final class C36772n3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91359a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f91360b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f91361c;
    @C0359n0

    /* renamed from: d */
    public final ShimmerFrameLayout f91362d;
    @C0359n0

    /* renamed from: e */
    public final TabLayout f91363e;
    @C0359n0

    /* renamed from: f */
    public final ViewPager2 f91364f;

    public C36772n3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 TabLayout tabLayout, @C0359n0 ViewPager2 viewPager2) {
        this.f91359a = constraintLayout;
        this.f91360b = composeView;
        this.f91361c = linearLayout;
        this.f91362d = shimmerFrameLayout;
        this.f91363e = tabLayout;
        this.f91364f = viewPager2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36772n3 m150815a(@C0359n0 View view) {
        int i = R.id.search_with_list_result_header;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.search_with_list_result_header);
        if (composeView != null) {
            i = R.id.search_with_list_result_header_layout;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.search_with_list_result_header_layout);
            if (linearLayout != null) {
                i = R.id.search_with_list_result_shimmer;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.search_with_list_result_shimmer);
                if (shimmerFrameLayout != null) {
                    i = R.id.search_with_list_result_tagline;
                    TabLayout tabLayout = (TabLayout) C20753c.m96463a(view, R.id.search_with_list_result_tagline);
                    if (tabLayout != null) {
                        i = R.id.search_with_list_result_view_pager;
                        ViewPager2 viewPager2 = (ViewPager2) C20753c.m96463a(view, R.id.search_with_list_result_view_pager);
                        if (viewPager2 != null) {
                            return new C36772n3((ConstraintLayout) view, composeView, linearLayout, shimmerFrameLayout, tabLayout, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36772n3 m150816c(@C0359n0 LayoutInflater layoutInflater) {
        return m150817d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36772n3 m150817d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_search_with_list_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150815a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91359a;
    }
}
