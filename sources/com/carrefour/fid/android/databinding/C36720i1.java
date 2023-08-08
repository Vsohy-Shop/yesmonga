package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.i1 */
public final class C36720i1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90994a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f90995b;
    @C0359n0

    /* renamed from: c */
    public final NestedScrollView f90996c;
    @C0359n0

    /* renamed from: d */
    public final ComposeView f90997d;
    @C0359n0

    /* renamed from: e */
    public final LinearLayout f90998e;
    @C0359n0

    /* renamed from: f */
    public final CoordinatorLayout f90999f;
    @C0359n0

    /* renamed from: g */
    public final Group f91000g;
    @C0359n0

    /* renamed from: h */
    public final RecyclerView f91001h;
    @C0359n0

    /* renamed from: i */
    public final ProgressBar f91002i;
    @C0359n0

    /* renamed from: j */
    public final ComposeView f91003j;
    @C0359n0

    /* renamed from: k */
    public final ShimmerFrameLayout f91004k;
    @C0359n0

    /* renamed from: l */
    public final ViewStub f91005l;
    @C0359n0

    /* renamed from: m */
    public final ViewStub f91006m;
    @C0359n0

    /* renamed from: n */
    public final C36837t8 f91007n;

    public C36720i1(@C0359n0 LinearLayout linearLayout, @C0359n0 ComposeView composeView, @C0359n0 NestedScrollView nestedScrollView, @C0359n0 ComposeView composeView2, @C0359n0 LinearLayout linearLayout2, @C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 Group group, @C0359n0 RecyclerView recyclerView, @C0359n0 ProgressBar progressBar, @C0359n0 ComposeView composeView3, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2, @C0359n0 C36837t8 t8Var) {
        this.f90994a = linearLayout;
        this.f90995b = composeView;
        this.f90996c = nestedScrollView;
        this.f90997d = composeView2;
        this.f90998e = linearLayout2;
        this.f90999f = coordinatorLayout;
        this.f91000g = group;
        this.f91001h = recyclerView;
        this.f91002i = progressBar;
        this.f91003j = composeView3;
        this.f91004k = shimmerFrameLayout;
        this.f91005l = viewStub;
        this.f91006m = viewStub2;
        this.f91007n = t8Var;
    }

    @C0359n0
    /* renamed from: a */
    public static C36720i1 m150607a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.basket_banner;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view2, R.id.basket_banner);
        if (composeView != null) {
            i = R.id.basket_container;
            NestedScrollView nestedScrollView = (NestedScrollView) C20753c.m96463a(view2, R.id.basket_container);
            if (nestedScrollView != null) {
                i = R.id.checkout_step_1_header;
                ComposeView composeView2 = (ComposeView) C20753c.m96463a(view2, R.id.checkout_step_1_header);
                if (composeView2 != null) {
                    i = R.id.checkout_step_1_header_layout;
                    LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view2, R.id.checkout_step_1_header_layout);
                    if (linearLayout != null) {
                        i = R.id.coordinator_fragment_basket;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C20753c.m96463a(view2, R.id.coordinator_fragment_basket);
                        if (coordinatorLayout != null) {
                            i = R.id.group_fragment_basket;
                            Group group = (Group) C20753c.m96463a(view2, R.id.group_fragment_basket);
                            if (group != null) {
                                i = R.id.list_fragment_basket;
                                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view2, R.id.list_fragment_basket);
                                if (recyclerView != null) {
                                    i = R.id.progress_frequent_purchases;
                                    ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view2, R.id.progress_frequent_purchases);
                                    if (progressBar != null) {
                                        i = R.id.recap_basket;
                                        ComposeView composeView3 = (ComposeView) C20753c.m96463a(view2, R.id.recap_basket);
                                        if (composeView3 != null) {
                                            i = R.id.shimmer_fragment_basket;
                                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view2, R.id.shimmer_fragment_basket);
                                            if (shimmerFrameLayout != null) {
                                                i = R.id.stub_fragment_basket_empty;
                                                ViewStub viewStub = (ViewStub) C20753c.m96463a(view2, R.id.stub_fragment_basket_empty);
                                                if (viewStub != null) {
                                                    i = R.id.stub_fragment_basket_error;
                                                    ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view2, R.id.stub_fragment_basket_error);
                                                    if (viewStub2 != null) {
                                                        i = R.id.view_recommended_products;
                                                        View a = C20753c.m96463a(view2, R.id.view_recommended_products);
                                                        if (a != null) {
                                                            return new C36720i1((LinearLayout) view2, composeView, nestedScrollView, composeView2, linearLayout, coordinatorLayout, group, recyclerView, progressBar, composeView3, shimmerFrameLayout, viewStub, viewStub2, C36837t8.m151069a(a));
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
    public static C36720i1 m150608c(@C0359n0 LayoutInflater layoutInflater) {
        return m150609d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36720i1 m150609d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_step_1, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150607a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90994a;
    }
}
