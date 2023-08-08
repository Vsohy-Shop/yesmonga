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

/* renamed from: com.carrefour.fid.android.databinding.t7 */
public final class C36836t7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91708a;
    @C0359n0

    /* renamed from: b */
    public final View f91709b;
    @C0359n0

    /* renamed from: c */
    public final View f91710c;
    @C0359n0

    /* renamed from: d */
    public final View f91711d;
    @C0359n0

    /* renamed from: e */
    public final View f91712e;
    @C0359n0

    /* renamed from: f */
    public final View f91713f;
    @C0359n0

    /* renamed from: g */
    public final View f91714g;

    public C36836t7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4, @C0359n0 View view5, @C0359n0 View view6) {
        this.f91708a = constraintLayout;
        this.f91709b = view;
        this.f91710c = view2;
        this.f91711d = view3;
        this.f91712e = view4;
        this.f91713f = view5;
        this.f91714g = view6;
    }

    @C0359n0
    /* renamed from: a */
    public static C36836t7 m151065a(@C0359n0 View view) {
        int i = R.id.view_shimmer_orders_details_separator;
        View a = C20753c.m96463a(view, R.id.view_shimmer_orders_details_separator);
        if (a != null) {
            i = R.id.view_shimmer_orders_details_status;
            View a2 = C20753c.m96463a(view, R.id.view_shimmer_orders_details_status);
            if (a2 != null) {
                i = R.id.view_shimmer_orders_details_store_address;
                View a3 = C20753c.m96463a(view, R.id.view_shimmer_orders_details_store_address);
                if (a3 != null) {
                    i = R.id.view_shimmer_orders_details_store_name;
                    View a4 = C20753c.m96463a(view, R.id.view_shimmer_orders_details_store_name);
                    if (a4 != null) {
                        i = R.id.view_shimmer_orders_details_type_icon;
                        View a5 = C20753c.m96463a(view, R.id.view_shimmer_orders_details_type_icon);
                        if (a5 != null) {
                            i = R.id.view_shimmer_orders_details_type_name;
                            View a6 = C20753c.m96463a(view, R.id.view_shimmer_orders_details_type_name);
                            if (a6 != null) {
                                return new C36836t7((ConstraintLayout) view, a, a2, a3, a4, a5, a6);
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
    public static C36836t7 m151066c(@C0359n0 LayoutInflater layoutInflater) {
        return m151067d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36836t7 m151067d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_orders_offline_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151065a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91708a;
    }
}
