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

/* renamed from: com.carrefour.fid.android.databinding.q7 */
public final class C36806q7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91546a;
    @C0359n0

    /* renamed from: b */
    public final C36646a7 f91547b;
    @C0359n0

    /* renamed from: c */
    public final C36646a7 f91548c;
    @C0359n0

    /* renamed from: d */
    public final C36646a7 f91549d;

    public C36806q7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 C36646a7 a7Var, @C0359n0 C36646a7 a7Var2, @C0359n0 C36646a7 a7Var3) {
        this.f91546a = constraintLayout;
        this.f91547b = a7Var;
        this.f91548c = a7Var2;
        this.f91549d = a7Var3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36806q7 m150947a(@C0359n0 View view) {
        int i = R.id.plp_cell_placeholder1;
        View a = C20753c.m96463a(view, R.id.plp_cell_placeholder1);
        if (a != null) {
            C36646a7 a2 = C36646a7.m150313a(a);
            View a3 = C20753c.m96463a(view, R.id.plp_cell_placeholder2);
            if (a3 != null) {
                C36646a7 a4 = C36646a7.m150313a(a3);
                View a5 = C20753c.m96463a(view, R.id.plp_cell_placeholder3);
                if (a5 != null) {
                    return new C36806q7((ConstraintLayout) view, a2, a4, C36646a7.m150313a(a5));
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
    public static C36806q7 m150948c(@C0359n0 LayoutInflater layoutInflater) {
        return m150949d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36806q7 m150949d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_basket_builder_preview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150947a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91546a;
    }
}
