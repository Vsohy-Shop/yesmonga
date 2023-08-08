package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.x2 */
public final class C36871x2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91896a;
    @C0359n0

    /* renamed from: b */
    public final Button f91897b;
    @C0359n0

    /* renamed from: c */
    public final RecyclerView f91898c;
    @C0359n0

    /* renamed from: d */
    public final ShimmerFrameLayout f91899d;
    @C0359n0

    /* renamed from: e */
    public final ShimmerFrameLayout f91900e;
    @C0359n0

    /* renamed from: f */
    public final ShimmerFrameLayout f91901f;
    @C0359n0

    /* renamed from: g */
    public final ViewStub f91902g;

    public C36871x2(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 RecyclerView recyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ShimmerFrameLayout shimmerFrameLayout2, @C0359n0 ShimmerFrameLayout shimmerFrameLayout3, @C0359n0 ViewStub viewStub) {
        this.f91896a = constraintLayout;
        this.f91897b = button;
        this.f91898c = recyclerView;
        this.f91899d = shimmerFrameLayout;
        this.f91900e = shimmerFrameLayout2;
        this.f91901f = shimmerFrameLayout3;
        this.f91902g = viewStub;
    }

    @C0359n0
    /* renamed from: a */
    public static C36871x2 m151199a(@C0359n0 View view) {
        int i = R.id.button_fragment_orders_details_order_again;
        Button button = (Button) C20753c.m96463a(view, R.id.button_fragment_orders_details_order_again);
        if (button != null) {
            i = R.id.recycler_fragment_orders_details;
            RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.recycler_fragment_orders_details);
            if (recyclerView != null) {
                i = R.id.shimmer_fragment_orders_offline_details;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_fragment_orders_offline_details);
                if (shimmerFrameLayout != null) {
                    i = R.id.shimmer_fragment_orders_online_details_billed;
                    ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_fragment_orders_online_details_billed);
                    if (shimmerFrameLayout2 != null) {
                        i = R.id.shimmer_fragment_orders_online_details_validated;
                        ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_fragment_orders_online_details_validated);
                        if (shimmerFrameLayout3 != null) {
                            i = R.id.stub_fragment_orders_online_details_error;
                            ViewStub viewStub = (ViewStub) C20753c.m96463a(view, R.id.stub_fragment_orders_online_details_error);
                            if (viewStub != null) {
                                return new C36871x2((ConstraintLayout) view, button, recyclerView, shimmerFrameLayout, shimmerFrameLayout2, shimmerFrameLayout3, viewStub);
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
    public static C36871x2 m151200c(@C0359n0 LayoutInflater layoutInflater) {
        return m151201d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36871x2 m151201d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_orders_online_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151199a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91896a;
    }
}
