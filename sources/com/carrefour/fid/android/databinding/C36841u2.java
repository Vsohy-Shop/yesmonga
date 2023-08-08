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

/* renamed from: com.carrefour.fid.android.databinding.u2 */
public final class C36841u2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91736a;
    @C0359n0

    /* renamed from: b */
    public final Button f91737b;
    @C0359n0

    /* renamed from: c */
    public final RecyclerView f91738c;
    @C0359n0

    /* renamed from: d */
    public final ShimmerFrameLayout f91739d;
    @C0359n0

    /* renamed from: e */
    public final ViewStub f91740e;

    public C36841u2(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 RecyclerView recyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ViewStub viewStub) {
        this.f91736a = constraintLayout;
        this.f91737b = button;
        this.f91738c = recyclerView;
        this.f91739d = shimmerFrameLayout;
        this.f91740e = viewStub;
    }

    @C0359n0
    /* renamed from: a */
    public static C36841u2 m151085a(@C0359n0 View view) {
        int i = R.id.button_fragment_orders_details_order_again;
        Button button = (Button) C20753c.m96463a(view, R.id.button_fragment_orders_details_order_again);
        if (button != null) {
            i = R.id.recycler_fragment_orders_details;
            RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.recycler_fragment_orders_details);
            if (recyclerView != null) {
                i = R.id.shimmer_fragment_orders_offline_details;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_fragment_orders_offline_details);
                if (shimmerFrameLayout != null) {
                    i = R.id.stub_fragment_orders_offline_details_error;
                    ViewStub viewStub = (ViewStub) C20753c.m96463a(view, R.id.stub_fragment_orders_offline_details_error);
                    if (viewStub != null) {
                        return new C36841u2((ConstraintLayout) view, button, recyclerView, shimmerFrameLayout, viewStub);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36841u2 m151086c(@C0359n0 LayoutInflater layoutInflater) {
        return m151087d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36841u2 m151087d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_orders_offline_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151085a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91736a;
    }
}
