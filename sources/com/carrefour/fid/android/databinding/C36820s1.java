package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.s1 */
public final class C36820s1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91607a;
    @C0359n0

    /* renamed from: b */
    public final C36675d6 f91608b;
    @C0359n0

    /* renamed from: c */
    public final MaterialButton f91609c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91610d;
    @C0359n0

    /* renamed from: e */
    public final ShimmerFrameLayout f91611e;
    @C0359n0

    /* renamed from: f */
    public final NestedScrollView f91612f;
    @C0359n0

    /* renamed from: g */
    public final C36760m1 f91613g;
    @C0359n0

    /* renamed from: h */
    public final C36770n1 f91614h;
    @C0359n0

    /* renamed from: i */
    public final C36780o1 f91615i;
    @C0359n0

    /* renamed from: j */
    public final LinearLayoutCompat f91616j;
    @C0359n0

    /* renamed from: k */
    public final Group f91617k;
    @C0359n0

    /* renamed from: l */
    public final Guideline f91618l;
    @C0359n0

    /* renamed from: m */
    public final AppCompatImageView f91619m;
    @C0359n0

    /* renamed from: n */
    public final ComposeView f91620n;
    @C0359n0

    /* renamed from: o */
    public final TextView f91621o;
    @C0359n0

    /* renamed from: p */
    public final C36645a6 f91622p;

    public C36820s1(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 C36675d6 d6Var, @C0359n0 MaterialButton materialButton, @C0359n0 TextView textView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 NestedScrollView nestedScrollView, @C0359n0 C36760m1 m1Var, @C0359n0 C36770n1 n1Var, @C0359n0 C36780o1 o1Var, @C0359n0 LinearLayoutCompat linearLayoutCompat, @C0359n0 Group group, @C0359n0 Guideline guideline, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 ComposeView composeView, @C0359n0 TextView textView2, @C0359n0 C36645a6 a6Var) {
        this.f91607a = constraintLayout;
        this.f91608b = d6Var;
        this.f91609c = materialButton;
        this.f91610d = textView;
        this.f91611e = shimmerFrameLayout;
        this.f91612f = nestedScrollView;
        this.f91613g = m1Var;
        this.f91614h = n1Var;
        this.f91615i = o1Var;
        this.f91616j = linearLayoutCompat;
        this.f91617k = group;
        this.f91618l = guideline;
        this.f91619m = appCompatImageView;
        this.f91620n = composeView;
        this.f91621o = textView2;
        this.f91622p = a6Var;
    }

    @C0359n0
    /* renamed from: a */
    public static C36820s1 m151001a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.alcohol_legal_information;
        View a = C20753c.m96463a(view2, R.id.alcohol_legal_information);
        if (a != null) {
            C36675d6 a2 = C36675d6.m150429a(a);
            i = R.id.button_checkout_step_two_validate;
            MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view2, R.id.button_checkout_step_two_validate);
            if (materialButton != null) {
                i = R.id.checkout_cgv;
                TextView textView = (TextView) C20753c.m96463a(view2, R.id.checkout_cgv);
                if (textView != null) {
                    i = R.id.checkout_shimmer;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view2, R.id.checkout_shimmer);
                    if (shimmerFrameLayout != null) {
                        i = R.id.checkoutStepTwoLayout;
                        NestedScrollView nestedScrollView = (NestedScrollView) C20753c.m96463a(view2, R.id.checkoutStepTwoLayout);
                        if (nestedScrollView != null) {
                            i = R.id.fidelity_retry_layout;
                            View a3 = C20753c.m96463a(view2, R.id.fidelity_retry_layout);
                            if (a3 != null) {
                                C36760m1 a4 = C36760m1.m150767a(a3);
                                i = R.id.fidelity_secured_layout;
                                View a5 = C20753c.m96463a(view2, R.id.fidelity_secured_layout);
                                if (a5 != null) {
                                    C36770n1 a6 = C36770n1.m150807a(a5);
                                    i = R.id.fidelity_unsecured_layout;
                                    View a7 = C20753c.m96463a(view2, R.id.fidelity_unsecured_layout);
                                    if (a7 != null) {
                                        C36780o1 a8 = C36780o1.m150847a(a7);
                                        i = R.id.group_additional_order_validate;
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C20753c.m96463a(view2, R.id.group_additional_order_validate);
                                        if (linearLayoutCompat != null) {
                                            i = R.id.group_checkout_step_two;
                                            Group group = (Group) C20753c.m96463a(view2, R.id.group_checkout_step_two);
                                            if (group != null) {
                                                i = R.id.guideline_order_validate;
                                                Guideline guideline = (Guideline) C20753c.m96463a(view2, R.id.guideline_order_validate);
                                                if (guideline != null) {
                                                    i = R.id.img_breathalyzer_legal_information;
                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view2, R.id.img_breathalyzer_legal_information);
                                                    if (appCompatImageView != null) {
                                                        i = R.id.loyalty_code_verification_modal_wrapper;
                                                        ComposeView composeView = (ComposeView) C20753c.m96463a(view2, R.id.loyalty_code_verification_modal_wrapper);
                                                        if (composeView != null) {
                                                            i = R.id.text_cgv_title;
                                                            TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.text_cgv_title);
                                                            if (textView2 != null) {
                                                                i = R.id.verified_3ds_layout;
                                                                View a9 = C20753c.m96463a(view2, R.id.verified_3ds_layout);
                                                                if (a9 != null) {
                                                                    return new C36820s1((ConstraintLayout) view2, a2, materialButton, textView, shimmerFrameLayout, nestedScrollView, a4, a6, a8, linearLayoutCompat, group, guideline, appCompatImageView, composeView, textView2, C36645a6.m150309a(a9));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static C36820s1 m151002c(@C0359n0 LayoutInflater layoutInflater) {
        return m151003d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36820s1 m151003d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_step_two_additional_order, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151001a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91607a;
    }
}
