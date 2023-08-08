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

/* renamed from: com.carrefour.fid.android.databinding.g5 */
public final class C36704g5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90894a;
    @C0359n0

    /* renamed from: b */
    public final C36833t4 f90895b;
    @C0359n0

    /* renamed from: c */
    public final C36714h5 f90896c;

    public C36704g5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 C36833t4 t4Var, @C0359n0 C36714h5 h5Var) {
        this.f90894a = constraintLayout;
        this.f90895b = t4Var;
        this.f90896c = h5Var;
    }

    @C0359n0
    /* renamed from: a */
    public static C36704g5 m150543a(@C0359n0 View view) {
        int i = R.id.holder_order_details_no_delivery_product;
        View a = C20753c.m96463a(view, R.id.holder_order_details_no_delivery_product);
        if (a != null) {
            C36833t4 a2 = C36833t4.m151053a(a);
            View a3 = C20753c.m96463a(view, R.id.holder_order_details_replacement_product);
            if (a3 != null) {
                return new C36704g5((ConstraintLayout) view, a2, C36714h5.m150583a(a3));
            }
            i = R.id.holder_order_details_replacement_product;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36704g5 m150544c(@C0359n0 LayoutInflater layoutInflater) {
        return m150545d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36704g5 m150545d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_replacement, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150543a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90894a;
    }
}
