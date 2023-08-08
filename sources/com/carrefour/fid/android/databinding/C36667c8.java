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

/* renamed from: com.carrefour.fid.android.databinding.c8 */
public final class C36667c8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90687a;
    @C0359n0

    /* renamed from: b */
    public final View f90688b;
    @C0359n0

    /* renamed from: c */
    public final View f90689c;
    @C0359n0

    /* renamed from: d */
    public final View f90690d;
    @C0359n0

    /* renamed from: e */
    public final View f90691e;
    @C0359n0

    /* renamed from: f */
    public final View f90692f;
    @C0359n0

    /* renamed from: g */
    public final View f90693g;
    @C0359n0

    /* renamed from: h */
    public final View f90694h;
    @C0359n0

    /* renamed from: i */
    public final View f90695i;
    @C0359n0

    /* renamed from: j */
    public final View f90696j;

    public C36667c8(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4, @C0359n0 View view5, @C0359n0 View view6, @C0359n0 View view7, @C0359n0 View view8, @C0359n0 View view9) {
        this.f90687a = constraintLayout;
        this.f90688b = view;
        this.f90689c = view2;
        this.f90690d = view3;
        this.f90691e = view4;
        this.f90692f = view5;
        this.f90693g = view6;
        this.f90694h = view7;
        this.f90695i = view8;
        this.f90696j = view9;
    }

    @C0359n0
    /* renamed from: a */
    public static C36667c8 m150397a(@C0359n0 View view) {
        int i = R.id.view_shimmer_orders_online_list_item_display_order;
        View a = C20753c.m96463a(view, R.id.view_shimmer_orders_online_list_item_display_order);
        if (a != null) {
            i = R.id.view_shimmer_orders_online_list_item_order_again;
            View a2 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_list_item_order_again);
            if (a2 != null) {
                i = R.id.view_shimmer_orders_online_list_item_order_id;
                View a3 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_list_item_order_id);
                if (a3 != null) {
                    i = R.id.view_shimmer_orders_online_list_item_order_status;
                    View a4 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_list_item_order_status);
                    if (a4 != null) {
                        i = R.id.view_shimmer_orders_online_list_item_separator;
                        View a5 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_list_item_separator);
                        if (a5 != null) {
                            i = R.id.view_shimmer_orders_online_list_item_slot;
                            View a6 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_list_item_slot);
                            if (a6 != null) {
                                i = R.id.view_shimmer_orders_online_list_item_slot_value;
                                View a7 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_list_item_slot_value);
                                if (a7 != null) {
                                    i = R.id.view_shimmer_orders_online_list_item_type_icon;
                                    View a8 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_list_item_type_icon);
                                    if (a8 != null) {
                                        i = R.id.view_shimmer_orders_online_list_item_type_name;
                                        View a9 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_list_item_type_name);
                                        if (a9 != null) {
                                            return new C36667c8((ConstraintLayout) view, a, a2, a3, a4, a5, a6, a7, a8, a9);
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
    public static C36667c8 m150398c(@C0359n0 LayoutInflater layoutInflater) {
        return m150399d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36667c8 m150399d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_orders_online_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150397a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90687a;
    }
}
