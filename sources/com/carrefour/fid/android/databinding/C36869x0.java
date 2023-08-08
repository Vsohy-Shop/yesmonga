package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.x0 */
public final class C36869x0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91884a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f91885b;
    @C0359n0

    /* renamed from: c */
    public final ShimmerFrameLayout f91886c;
    @C0359n0

    /* renamed from: d */
    public final ViewStub f91887d;
    @C0359n0

    /* renamed from: e */
    public final ViewStub f91888e;

    public C36869x0(@C0359n0 LinearLayout linearLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2) {
        this.f91884a = linearLayout;
        this.f91885b = recyclerView;
        this.f91886c = shimmerFrameLayout;
        this.f91887d = viewStub;
        this.f91888e = viewStub2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36869x0 m151191a(@C0359n0 View view) {
        int i = R.id.offer_list;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.offer_list);
        if (recyclerView != null) {
            i = R.id.shimmer_fragment_basket_builder;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_fragment_basket_builder);
            if (shimmerFrameLayout != null) {
                i = R.id.stub_basket_builder_recommended_products_empty;
                ViewStub viewStub = (ViewStub) C20753c.m96463a(view, R.id.stub_basket_builder_recommended_products_empty);
                if (viewStub != null) {
                    i = R.id.stub_basket_builder_recommended_products_error;
                    ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view, R.id.stub_basket_builder_recommended_products_error);
                    if (viewStub2 != null) {
                        return new C36869x0((LinearLayout) view, recyclerView, shimmerFrameLayout, viewStub, viewStub2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36869x0 m151192c(@C0359n0 LayoutInflater layoutInflater) {
        return m151193d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36869x0 m151193d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basket_builder_recommended_products, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151191a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91884a;
    }
}
