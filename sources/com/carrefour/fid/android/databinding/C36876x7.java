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

/* renamed from: com.carrefour.fid.android.databinding.x7 */
public final class C36876x7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91925a;
    @C0359n0

    /* renamed from: b */
    public final View f91926b;
    @C0359n0

    /* renamed from: c */
    public final View f91927c;
    @C0359n0

    /* renamed from: d */
    public final View f91928d;
    @C0359n0

    /* renamed from: e */
    public final View f91929e;
    @C0359n0

    /* renamed from: f */
    public final View f91930f;
    @C0359n0

    /* renamed from: g */
    public final View f91931g;
    @C0359n0

    /* renamed from: h */
    public final View f91932h;
    @C0359n0

    /* renamed from: i */
    public final View f91933i;
    @C0359n0

    /* renamed from: j */
    public final View f91934j;
    @C0359n0

    /* renamed from: k */
    public final View f91935k;
    @C0359n0

    /* renamed from: l */
    public final View f91936l;
    @C0359n0

    /* renamed from: m */
    public final View f91937m;

    public C36876x7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4, @C0359n0 View view5, @C0359n0 View view6, @C0359n0 View view7, @C0359n0 View view8, @C0359n0 View view9, @C0359n0 View view10, @C0359n0 View view11, @C0359n0 View view12) {
        this.f91925a = constraintLayout;
        this.f91926b = view;
        this.f91927c = view2;
        this.f91928d = view3;
        this.f91929e = view4;
        this.f91930f = view5;
        this.f91931g = view6;
        this.f91932h = view7;
        this.f91933i = view8;
        this.f91934j = view9;
        this.f91935k = view10;
        this.f91936l = view11;
        this.f91937m = view12;
    }

    @C0359n0
    /* renamed from: a */
    public static C36876x7 m151219a(@C0359n0 View view) {
        int i = R.id.view_shimmer_orders_online_details_amount;
        View a = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_amount);
        if (a != null) {
            i = R.id.view_shimmer_orders_online_details_button_icon_1;
            View a2 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_button_icon_1);
            if (a2 != null) {
                i = R.id.view_shimmer_orders_online_details_button_icon_2;
                View a3 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_button_icon_2);
                if (a3 != null) {
                    i = R.id.view_shimmer_orders_online_details_buttons_separator;
                    View a4 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_buttons_separator);
                    if (a4 != null) {
                        i = R.id.view_shimmer_orders_online_details_separator;
                        View a5 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_separator);
                        if (a5 != null) {
                            i = R.id.view_shimmer_orders_online_details_slot;
                            View a6 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_slot);
                            if (a6 != null) {
                                i = R.id.view_shimmer_orders_online_details_slot_value;
                                View a7 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_slot_value);
                                if (a7 != null) {
                                    i = R.id.view_shimmer_orders_online_details_status;
                                    View a8 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_status);
                                    if (a8 != null) {
                                        i = R.id.view_shimmer_orders_online_details_status_value;
                                        View a9 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_status_value);
                                        if (a9 != null) {
                                            i = R.id.view_shimmer_orders_online_details_store_name;
                                            View a10 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_store_name);
                                            if (a10 != null) {
                                                i = R.id.view_shimmer_orders_online_details_type_icon;
                                                View a11 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_type_icon);
                                                if (a11 != null) {
                                                    i = R.id.view_shimmer_orders_online_details_type_name;
                                                    View a12 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_details_type_name);
                                                    if (a12 != null) {
                                                        return new C36876x7((ConstraintLayout) view, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12);
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
    public static C36876x7 m151220c(@C0359n0 LayoutInflater layoutInflater) {
        return m151221d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36876x7 m151221d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_orders_online_details_billed, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151219a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91925a;
    }
}
