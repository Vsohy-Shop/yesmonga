package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.y7 */
public final class C36885y7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91987a;
    @C0359n0

    /* renamed from: b */
    public final View f91988b;
    @C0359n0

    /* renamed from: c */
    public final View f91989c;
    @C0359n0

    /* renamed from: d */
    public final View f91990d;
    @C0359n0

    /* renamed from: e */
    public final View f91991e;

    public C36885y7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4) {
        this.f91987a = constraintLayout;
        this.f91988b = view;
        this.f91989c = view2;
        this.f91990d = view3;
        this.f91991e = view4;
    }

    @C0359n0
    /* renamed from: a */
    public static C36885y7 m151253a(@C0359n0 View view) {
        int i = R.id.view_shimmer_orders_online_details_product_amount;
        View a = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_product_amount);
        if (a != null) {
            i = R.id.view_shimmer_orders_online_details_product_name;
            View a2 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_product_name);
            if (a2 != null) {
                i = R.id.view_shimmer_orders_online_details_product_name_rest;
                View a3 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_product_name_rest);
                if (a3 != null) {
                    i = R.id.view_shimmer_orders_online_details_product_quantity;
                    View a4 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_product_quantity);
                    if (a4 != null) {
                        return new C36885y7((ConstraintLayout) view, a, a2, a3, a4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36885y7 m151254c(@C0359n0 LayoutInflater layoutInflater) {
        return m151255d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36885y7 m151255d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_orders_online_details_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151253a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91987a;
    }
}
