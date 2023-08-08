package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.infinitelist.InfiniteListRecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.t2 */
public final class C36831t2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91665a;
    @C0359n0

    /* renamed from: b */
    public final C36734j5 f91666b;
    @C0359n0

    /* renamed from: c */
    public final ConstraintLayout f91667c;
    @C0359n0

    /* renamed from: d */
    public final InfiniteListRecyclerView f91668d;
    @C0359n0

    /* renamed from: e */
    public final ShimmerFrameLayout f91669e;
    @C0359n0

    /* renamed from: f */
    public final ViewStub f91670f;
    @C0359n0

    /* renamed from: g */
    public final ViewStub f91671g;

    public C36831t2(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 C36734j5 j5Var, @C0359n0 ConstraintLayout constraintLayout2, @C0359n0 InfiniteListRecyclerView infiniteListRecyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2) {
        this.f91665a = constraintLayout;
        this.f91666b = j5Var;
        this.f91667c = constraintLayout2;
        this.f91668d = infiniteListRecyclerView;
        this.f91669e = shimmerFrameLayout;
        this.f91670f = viewStub;
        this.f91671g = viewStub2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36831t2 m151045a(@C0359n0 View view) {
        int i = R.id.loyalty_card_details;
        View a = C20753c.m96463a(view, R.id.loyalty_card_details);
        if (a != null) {
            C36734j5 a2 = C36734j5.m150663a(a);
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.recycler_fragment_orders_offline;
            InfiniteListRecyclerView infiniteListRecyclerView = (InfiniteListRecyclerView) C20753c.m96463a(view, R.id.recycler_fragment_orders_offline);
            if (infiniteListRecyclerView != null) {
                i = R.id.shimmer_fragment_orders_offline_list;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_fragment_orders_offline_list);
                if (shimmerFrameLayout != null) {
                    i = R.id.stub_fragment_orders_offline_empty;
                    ViewStub viewStub = (ViewStub) C20753c.m96463a(view, R.id.stub_fragment_orders_offline_empty);
                    if (viewStub != null) {
                        i = R.id.stub_fragment_orders_offline_error;
                        ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view, R.id.stub_fragment_orders_offline_error);
                        if (viewStub2 != null) {
                            return new C36831t2(constraintLayout, a2, constraintLayout, infiniteListRecyclerView, shimmerFrameLayout, viewStub, viewStub2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36831t2 m151046c(@C0359n0 LayoutInflater layoutInflater) {
        return m151047d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36831t2 m151047d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_orders_offline, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151045a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91665a;
    }
}
