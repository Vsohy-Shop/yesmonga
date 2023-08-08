package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.q1 */
public final class C36800q1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91520a;
    @C0359n0

    /* renamed from: b */
    public final CoordinatorLayout f91521b;
    @C0359n0

    /* renamed from: c */
    public final Guideline f91522c;
    @C0359n0

    /* renamed from: d */
    public final RecyclerView f91523d;
    @C0359n0

    /* renamed from: e */
    public final ComposeView f91524e;
    @C0359n0

    /* renamed from: f */
    public final ShimmerFrameLayout f91525f;
    @C0359n0

    /* renamed from: g */
    public final ViewStub f91526g;
    @C0359n0

    /* renamed from: h */
    public final ViewStub f91527h;

    public C36800q1(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 Guideline guideline, @C0359n0 RecyclerView recyclerView, @C0359n0 ComposeView composeView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2) {
        this.f91520a = constraintLayout;
        this.f91521b = coordinatorLayout;
        this.f91522c = guideline;
        this.f91523d = recyclerView;
        this.f91524e = composeView;
        this.f91525f = shimmerFrameLayout;
        this.f91526g = viewStub;
        this.f91527h = viewStub2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36800q1 m150925a(@C0359n0 View view) {
        int i = R.id.coordinator_fragment_basket;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C20753c.m96463a(view, R.id.coordinator_fragment_basket);
        if (coordinatorLayout != null) {
            i = R.id.guideline_list_product;
            Guideline guideline = (Guideline) C20753c.m96463a(view, R.id.guideline_list_product);
            if (guideline != null) {
                i = R.id.list_fragment_basket;
                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_fragment_basket);
                if (recyclerView != null) {
                    i = R.id.recap_basket;
                    ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.recap_basket);
                    if (composeView != null) {
                        i = R.id.shimmer_fragment_basket;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_fragment_basket);
                        if (shimmerFrameLayout != null) {
                            i = R.id.stub_fragment_basket_empty;
                            ViewStub viewStub = (ViewStub) C20753c.m96463a(view, R.id.stub_fragment_basket_empty);
                            if (viewStub != null) {
                                i = R.id.stub_fragment_basket_error;
                                ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view, R.id.stub_fragment_basket_error);
                                if (viewStub2 != null) {
                                    return new C36800q1((ConstraintLayout) view, coordinatorLayout, guideline, recyclerView, composeView, shimmerFrameLayout, viewStub, viewStub2);
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
    public static C36800q1 m150926c(@C0359n0 LayoutInflater layoutInflater) {
        return m150927d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36800q1 m150927d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_step_one_additional_order, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150925a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91520a;
    }
}
