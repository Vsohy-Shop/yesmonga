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

/* renamed from: com.carrefour.fid.android.databinding.b8 */
public final class C36657b8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90618a;
    @C0359n0

    /* renamed from: b */
    public final View f90619b;
    @C0359n0

    /* renamed from: c */
    public final View f90620c;
    @C0359n0

    /* renamed from: d */
    public final View f90621d;

    public C36657b8(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3) {
        this.f90618a = constraintLayout;
        this.f90619b = view;
        this.f90620c = view2;
        this.f90621d = view3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36657b8 m150357a(@C0359n0 View view) {
        int i = R.id.view_shimmer_orders_online_list_customer_care_icon;
        View a = C20753c.m96463a(view, R.id.view_shimmer_orders_online_list_customer_care_icon);
        if (a != null) {
            i = R.id.view_shimmer_orders_online_list_customer_care_message;
            View a2 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_list_customer_care_message);
            if (a2 != null) {
                i = R.id.view_shimmer_orders_online_list_customer_care_title;
                View a3 = C20753c.m96463a(view, R.id.view_shimmer_orders_online_list_customer_care_title);
                if (a3 != null) {
                    return new C36657b8((ConstraintLayout) view, a, a2, a3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36657b8 m150358c(@C0359n0 LayoutInflater layoutInflater) {
        return m150359d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36657b8 m150359d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_orders_online_list_customer_care, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150357a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90618a;
    }
}
