package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.p7 */
public final class C36796p7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91501a;
    @C0359n0

    /* renamed from: b */
    public final C36816r7 f91502b;
    @C0359n0

    /* renamed from: c */
    public final C36816r7 f91503c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91504d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91505e;

    public C36796p7(@C0359n0 LinearLayout linearLayout, @C0359n0 C36816r7 r7Var, @C0359n0 C36816r7 r7Var2, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91501a = linearLayout;
        this.f91502b = r7Var;
        this.f91503c = r7Var2;
        this.f91504d = textView;
        this.f91505e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36796p7 m150911a(@C0359n0 View view) {
        int i = R.id.basket_builder_cell_header_placeholder1;
        View a = C20753c.m96463a(view, R.id.basket_builder_cell_header_placeholder1);
        if (a != null) {
            C36816r7 a2 = C36816r7.m150987a(a);
            i = R.id.basket_builder_cell_header_placeholder2;
            View a3 = C20753c.m96463a(view, R.id.basket_builder_cell_header_placeholder2);
            if (a3 != null) {
                C36816r7 a4 = C36816r7.m150987a(a3);
                i = R.id.deparmentPlaceholder;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.deparmentPlaceholder);
                if (textView != null) {
                    i = R.id.seeAllButtonPlaceholder;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.seeAllButtonPlaceholder);
                    if (textView2 != null) {
                        return new C36796p7((LinearLayout) view, a2, a4, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36796p7 m150912c(@C0359n0 LayoutInflater layoutInflater) {
        return m150913d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36796p7 m150913d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_basket_builder_department, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150911a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91501a;
    }
}
