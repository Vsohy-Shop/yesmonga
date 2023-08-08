package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.o7 */
public final class C36786o7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91447a;
    @C0359n0

    /* renamed from: b */
    public final C36796p7 f91448b;
    @C0359n0

    /* renamed from: c */
    public final C36796p7 f91449c;
    @C0359n0

    /* renamed from: d */
    public final C36796p7 f91450d;

    public C36786o7(@C0359n0 LinearLayout linearLayout, @C0359n0 C36796p7 p7Var, @C0359n0 C36796p7 p7Var2, @C0359n0 C36796p7 p7Var3) {
        this.f91447a = linearLayout;
        this.f91448b = p7Var;
        this.f91449c = p7Var2;
        this.f91450d = p7Var3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36786o7 m150871a(@C0359n0 View view) {
        int i = R.id.basket_builder_department_placeholder1;
        View a = C20753c.m96463a(view, R.id.basket_builder_department_placeholder1);
        if (a != null) {
            C36796p7 a2 = C36796p7.m150911a(a);
            View a3 = C20753c.m96463a(view, R.id.basket_builder_department_placeholder2);
            if (a3 != null) {
                C36796p7 a4 = C36796p7.m150911a(a3);
                View a5 = C20753c.m96463a(view, R.id.basket_builder_department_placeholder3);
                if (a5 != null) {
                    return new C36786o7((LinearLayout) view, a2, a4, C36796p7.m150911a(a5));
                }
                i = R.id.basket_builder_department_placeholder3;
            } else {
                i = R.id.basket_builder_department_placeholder2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36786o7 m150872c(@C0359n0 LayoutInflater layoutInflater) {
        return m150873d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36786o7 m150873d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_basket_builder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150871a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91447a;
    }
}
