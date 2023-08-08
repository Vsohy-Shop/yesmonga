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

/* renamed from: com.carrefour.fid.android.databinding.h */
public final class C36708h implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90910a;
    @C0359n0

    /* renamed from: b */
    public final C36862w3 f90911b;
    @C0359n0

    /* renamed from: c */
    public final C36646a7 f90912c;
    @C0359n0

    /* renamed from: d */
    public final C36646a7 f90913d;
    @C0359n0

    /* renamed from: e */
    public final C36646a7 f90914e;

    public C36708h(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 C36862w3 w3Var, @C0359n0 C36646a7 a7Var, @C0359n0 C36646a7 a7Var2, @C0359n0 C36646a7 a7Var3) {
        this.f90910a = constraintLayout;
        this.f90911b = w3Var;
        this.f90912c = a7Var;
        this.f90913d = a7Var2;
        this.f90914e = a7Var3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36708h m150559a(@C0359n0 View view) {
        int i = R.id.plp_cell_header_placeholder;
        View a = C20753c.m96463a(view, R.id.plp_cell_header_placeholder);
        if (a != null) {
            C36862w3 a2 = C36862w3.m151165a(a);
            i = R.id.plp_cell_placeholder1;
            View a3 = C20753c.m96463a(view, R.id.plp_cell_placeholder1);
            if (a3 != null) {
                C36646a7 a4 = C36646a7.m150313a(a3);
                i = R.id.plp_cell_placeholder2;
                View a5 = C20753c.m96463a(view, R.id.plp_cell_placeholder2);
                if (a5 != null) {
                    C36646a7 a6 = C36646a7.m150313a(a5);
                    i = R.id.plp_cell_placeholder3;
                    View a7 = C20753c.m96463a(view, R.id.plp_cell_placeholder3);
                    if (a7 != null) {
                        return new C36708h((ConstraintLayout) view, a2, a4, a6, C36646a7.m150313a(a7));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36708h m150560c(@C0359n0 LayoutInflater layoutInflater) {
        return m150561d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36708h m150561d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.basket_cell_placeholder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150559a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90910a;
    }
}
