package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.TaglineComponent;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.carrefour.fid.android.databinding.v0 */
public final class C36849v0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91781a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f91782b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f91783c;
    @C0359n0

    /* renamed from: d */
    public final TaglineComponent f91784d;
    @C0359n0

    /* renamed from: e */
    public final TabLayout f91785e;
    @C0359n0

    /* renamed from: f */
    public final LinearLayout f91786f;
    @C0359n0

    /* renamed from: g */
    public final FragmentContainerView f91787g;

    public C36849v0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 TaglineComponent taglineComponent, @C0359n0 TabLayout tabLayout, @C0359n0 LinearLayout linearLayout2, @C0359n0 FragmentContainerView fragmentContainerView) {
        this.f91781a = constraintLayout;
        this.f91782b = composeView;
        this.f91783c = linearLayout;
        this.f91784d = taglineComponent;
        this.f91785e = tabLayout;
        this.f91786f = linearLayout2;
        this.f91787g = fragmentContainerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36849v0 m151113a(@C0359n0 View view) {
        int i = R.id.basket_builder_header;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.basket_builder_header);
        if (composeView != null) {
            i = R.id.basket_builder_header_layout;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.basket_builder_header_layout);
            if (linearLayout != null) {
                i = R.id.basket_builder_secondary_tagline;
                TaglineComponent taglineComponent = (TaglineComponent) C20753c.m96463a(view, R.id.basket_builder_secondary_tagline);
                if (taglineComponent != null) {
                    i = R.id.basket_builder_tagline;
                    TabLayout tabLayout = (TabLayout) C20753c.m96463a(view, R.id.basket_builder_tagline);
                    if (tabLayout != null) {
                        i = R.id.basket_builder_tagline_layout;
                        LinearLayout linearLayout2 = (LinearLayout) C20753c.m96463a(view, R.id.basket_builder_tagline_layout);
                        if (linearLayout2 != null) {
                            i = R.id.fragment_basket_builder_container;
                            FragmentContainerView fragmentContainerView = (FragmentContainerView) C20753c.m96463a(view, R.id.fragment_basket_builder_container);
                            if (fragmentContainerView != null) {
                                return new C36849v0((ConstraintLayout) view, composeView, linearLayout, taglineComponent, tabLayout, linearLayout2, fragmentContainerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36849v0 m151114c(@C0359n0 LayoutInflater layoutInflater) {
        return m151115d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36849v0 m151115d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basket_builder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151113a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91781a;
    }
}
