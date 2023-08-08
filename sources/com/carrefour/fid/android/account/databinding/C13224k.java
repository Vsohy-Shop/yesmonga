package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.design.components.widgets.LoaderMaterialButton;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.account.databinding.k */
public final class C13224k implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f32521a;
    @C0359n0

    /* renamed from: b */
    public final RadioGroup f32522b;
    @C0359n0

    /* renamed from: c */
    public final RecyclerView f32523c;
    @C0359n0

    /* renamed from: d */
    public final LoaderMaterialButton f32524d;
    @C0359n0

    /* renamed from: e */
    public final ScrollView f32525e;
    @C0359n0

    /* renamed from: f */
    public final ShimmerFrameLayout f32526f;
    @C0359n0

    /* renamed from: g */
    public final ComposeView f32527g;
    @C0359n0

    /* renamed from: h */
    public final LinearLayout f32528h;

    public C13224k(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 RadioGroup radioGroup, @C0359n0 RecyclerView recyclerView, @C0359n0 LoaderMaterialButton loaderMaterialButton, @C0359n0 ScrollView scrollView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout) {
        this.f32521a = constraintLayout;
        this.f32522b = radioGroup;
        this.f32523c = recyclerView;
        this.f32524d = loaderMaterialButton;
        this.f32525e = scrollView;
        this.f32526f = shimmerFrameLayout;
        this.f32527g = composeView;
        this.f32528h = linearLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C13224k m57303a(@C0359n0 View view) {
        int i = C13144b.C13154j.address_radio_group;
        RadioGroup radioGroup = (RadioGroup) C20753c.m96463a(view, i);
        if (radioGroup != null) {
            i = C13144b.C13154j.address_verification_suggestions_list;
            RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
            if (recyclerView != null) {
                i = C13144b.C13154j.button_address_verification_validation;
                LoaderMaterialButton loaderMaterialButton = (LoaderMaterialButton) C20753c.m96463a(view, i);
                if (loaderMaterialButton != null) {
                    i = C13144b.C13154j.scrollview_choices;
                    ScrollView scrollView = (ScrollView) C20753c.m96463a(view, i);
                    if (scrollView != null) {
                        i = C13144b.C13154j.shimmer_fragment_verify_address;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, i);
                        if (shimmerFrameLayout != null) {
                            i = C13144b.C13154j.verify_user_address_header;
                            ComposeView composeView = (ComposeView) C20753c.m96463a(view, i);
                            if (composeView != null) {
                                i = C13144b.C13154j.verify_user_address_header_layout;
                                LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, i);
                                if (linearLayout != null) {
                                    return new C13224k((ConstraintLayout) view, radioGroup, recyclerView, loaderMaterialButton, scrollView, shimmerFrameLayout, composeView, linearLayout);
                                }
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
    public static C13224k m57304c(@C0359n0 LayoutInflater layoutInflater) {
        return m57305d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13224k m57305d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.fragment_verify_user_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57303a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f32521a;
    }
}
