package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.n4 */
public final class C36773n4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91365a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91366b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91367c;
    @C0359n0

    /* renamed from: d */
    public final View f91368d;

    public C36773n4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 View view) {
        this.f91365a = constraintLayout;
        this.f91366b = textView;
        this.f91367c = textView2;
        this.f91368d = view;
    }

    @C0359n0
    /* renamed from: a */
    public static C36773n4 m150819a(@C0359n0 View view) {
        int i = R.id.basket_mixing_discount_count;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.basket_mixing_discount_count);
        if (textView != null) {
            i = R.id.basket_mixing_discount_text;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.basket_mixing_discount_text);
            if (textView2 != null) {
                i = R.id.basket_mixing_discount_top_space;
                View a = C20753c.m96463a(view, R.id.basket_mixing_discount_top_space);
                if (a != null) {
                    return new C36773n4((ConstraintLayout) view, textView, textView2, a);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36773n4 m150820c(@C0359n0 LayoutInflater layoutInflater) {
        return m150821d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36773n4 m150821d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_offer_product_mixing_basket, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150819a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91365a;
    }
}
