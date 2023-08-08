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
import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.OrderInformationCardView;

/* renamed from: com.carrefour.fid.android.databinding.q4 */
public final class C36803q4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91536a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91537b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91538c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91539d;
    @C0359n0

    /* renamed from: e */
    public final OrderInformationCardView f91540e;

    public C36803q4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 OrderInformationCardView orderInformationCardView) {
        this.f91536a = constraintLayout;
        this.f91537b = textView;
        this.f91538c = textView2;
        this.f91539d = textView3;
        this.f91540e = orderInformationCardView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36803q4 m150937a(@C0359n0 View view) {
        int i = R.id.text_order_details_department_count;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.text_order_details_department_count);
        if (textView != null) {
            i = R.id.text_order_details_department_label;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_order_details_department_label);
            if (textView2 != null) {
                i = R.id.text_order_information_title;
                TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_order_information_title);
                if (textView3 != null) {
                    i = R.id.view_missing_product;
                    OrderInformationCardView orderInformationCardView = (OrderInformationCardView) C20753c.m96463a(view, R.id.view_missing_product);
                    if (orderInformationCardView != null) {
                        return new C36803q4((ConstraintLayout) view, textView, textView2, textView3, orderInformationCardView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36803q4 m150938c(@C0359n0 LayoutInflater layoutInflater) {
        return m150939d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36803q4 m150939d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_department, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150937a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91536a;
    }
}
