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

/* renamed from: com.carrefour.fid.android.databinding.n7 */
public final class C36776n7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91377a;
    @C0359n0

    /* renamed from: b */
    public final C36646a7 f91378b;
    @C0359n0

    /* renamed from: c */
    public final C36646a7 f91379c;
    @C0359n0

    /* renamed from: d */
    public final C36646a7 f91380d;

    public C36776n7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 C36646a7 a7Var, @C0359n0 C36646a7 a7Var2, @C0359n0 C36646a7 a7Var3) {
        this.f91377a = constraintLayout;
        this.f91378b = a7Var;
        this.f91379c = a7Var2;
        this.f91380d = a7Var3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36776n7 m150831a(@C0359n0 View view) {
        int i = R.id.plp_cell_placeholder1;
        View a = C20753c.m96463a(view, R.id.plp_cell_placeholder1);
        if (a != null) {
            C36646a7 a2 = C36646a7.m150313a(a);
            View a3 = C20753c.m96463a(view, R.id.plp_cell_placeholder2);
            if (a3 != null) {
                C36646a7 a4 = C36646a7.m150313a(a3);
                View a5 = C20753c.m96463a(view, R.id.plp_cell_placeholder3);
                if (a5 != null) {
                    return new C36776n7((ConstraintLayout) view, a2, a4, C36646a7.m150313a(a5));
                }
                i = R.id.plp_cell_placeholder3;
            } else {
                i = R.id.plp_cell_placeholder2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36776n7 m150832c(@C0359n0 LayoutInflater layoutInflater) {
        return m150833d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36776n7 m150833d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_additional_order_department_preview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150831a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91377a;
    }
}
