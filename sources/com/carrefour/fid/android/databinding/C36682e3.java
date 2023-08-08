package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.e3 */
public final class C36682e3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90759a;
    @C0359n0

    /* renamed from: b */
    public final C36817r8 f90760b;
    @C0359n0

    /* renamed from: c */
    public final Button f90761c;
    @C0359n0

    /* renamed from: d */
    public final RecyclerView f90762d;

    public C36682e3(@C0359n0 LinearLayout linearLayout, @C0359n0 C36817r8 r8Var, @C0359n0 Button button, @C0359n0 RecyclerView recyclerView) {
        this.f90759a = linearLayout;
        this.f90760b = r8Var;
        this.f90761c = button;
        this.f90762d = recyclerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36682e3 m150457a(@C0359n0 View view) {
        int i = R.id.allergobox_view;
        View a = C20753c.m96463a(view, R.id.allergobox_view);
        if (a != null) {
            C36817r8 a2 = C36817r8.m150991a(a);
            int i2 = R.id.button_product_list_filters_facet_terms;
            Button button = (Button) C20753c.m96463a(view, R.id.button_product_list_filters_facet_terms);
            if (button != null) {
                i2 = R.id.list_product_list_filters_facet_terms;
                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_product_list_filters_facet_terms);
                if (recyclerView != null) {
                    return new C36682e3((LinearLayout) view, a2, button, recyclerView);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36682e3 m150458c(@C0359n0 LayoutInflater layoutInflater) {
        return m150459d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36682e3 m150459d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_product_list_filters_facet_terms, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150457a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90759a;
    }
}
