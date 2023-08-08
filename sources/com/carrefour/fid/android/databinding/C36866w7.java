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

/* renamed from: com.carrefour.fid.android.databinding.w7 */
public final class C36866w7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91865a;
    @C0359n0

    /* renamed from: b */
    public final View f91866b;
    @C0359n0

    /* renamed from: c */
    public final View f91867c;
    @C0359n0

    /* renamed from: d */
    public final View f91868d;
    @C0359n0

    /* renamed from: e */
    public final View f91869e;
    @C0359n0

    /* renamed from: f */
    public final View f91870f;
    @C0359n0

    /* renamed from: g */
    public final View f91871g;
    @C0359n0

    /* renamed from: h */
    public final View f91872h;

    public C36866w7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4, @C0359n0 View view5, @C0359n0 View view6, @C0359n0 View view7) {
        this.f91865a = constraintLayout;
        this.f91866b = view;
        this.f91867c = view2;
        this.f91868d = view3;
        this.f91869e = view4;
        this.f91870f = view5;
        this.f91871g = view6;
        this.f91872h = view7;
    }

    @C0359n0
    /* renamed from: a */
    public static C36866w7 m151179a(@C0359n0 View view) {
        int i = R.id.view_shimmer_orders_offline_list_item_addres_2;
        View a = C20753c.m96463a(view, R.id.view_shimmer_orders_offline_list_item_addres_2);
        if (a != null) {
            i = R.id.view_shimmer_orders_offline_list_item_address;
            View a2 = C20753c.m96463a(view, R.id.view_shimmer_orders_offline_list_item_address);
            if (a2 != null) {
                i = R.id.view_shimmer_orders_offline_list_item_amount;
                View a3 = C20753c.m96463a(view, R.id.view_shimmer_orders_offline_list_item_amount);
                if (a3 != null) {
                    i = R.id.view_shimmer_orders_offline_list_item_date;
                    View a4 = C20753c.m96463a(view, R.id.view_shimmer_orders_offline_list_item_date);
                    if (a4 != null) {
                        i = R.id.view_shimmer_orders_offline_list_item_details_button;
                        View a5 = C20753c.m96463a(view, R.id.view_shimmer_orders_offline_list_item_details_button);
                        if (a5 != null) {
                            i = R.id.view_shimmer_orders_offline_list_item_separator;
                            View a6 = C20753c.m96463a(view, R.id.view_shimmer_orders_offline_list_item_separator);
                            if (a6 != null) {
                                i = R.id.view_shimmer_orders_offline_list_item_store_name;
                                View a7 = C20753c.m96463a(view, R.id.view_shimmer_orders_offline_list_item_store_name);
                                if (a7 != null) {
                                    return new C36866w7((ConstraintLayout) view, a, a2, a3, a4, a5, a6, a7);
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
    public static C36866w7 m151180c(@C0359n0 LayoutInflater layoutInflater) {
        return m151181d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36866w7 m151181d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_orders_offline_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151179a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91865a;
    }
}
