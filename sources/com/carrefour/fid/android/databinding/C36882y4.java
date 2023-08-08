package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.y4 */
public final class C36882y4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91971a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91972b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91973c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91974d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91975e;
    @C0359n0

    /* renamed from: f */
    public final Barrier f91976f;
    @C0359n0

    /* renamed from: g */
    public final View f91977g;

    public C36882y4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 Barrier barrier, @C0359n0 View view) {
        this.f91971a = constraintLayout;
        this.f91972b = textView;
        this.f91973c = textView2;
        this.f91974d = textView3;
        this.f91975e = textView4;
        this.f91976f = barrier;
        this.f91977g = view;
    }

    @C0359n0
    /* renamed from: a */
    public static C36882y4 m151243a(@C0359n0 View view) {
        int i = R.id.text_holder_order_details_product_amount;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_product_amount);
        if (textView != null) {
            i = R.id.text_holder_order_details_product_discount;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_product_discount);
            if (textView2 != null) {
                i = R.id.text_holder_order_details_product_name;
                TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_product_name);
                if (textView3 != null) {
                    i = R.id.text_holder_order_details_product_quantity;
                    TextView textView4 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_product_quantity);
                    if (textView4 != null) {
                        i = R.id.view_holder_order_offline_details_product_barrier;
                        Barrier barrier = (Barrier) C20753c.m96463a(view, R.id.view_holder_order_offline_details_product_barrier);
                        if (barrier != null) {
                            i = R.id.view_holder_order_offline_details_product_divider_end;
                            View a = C20753c.m96463a(view, R.id.view_holder_order_offline_details_product_divider_end);
                            if (a != null) {
                                return new C36882y4((ConstraintLayout) view, textView, textView2, textView3, textView4, barrier, a);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36882y4 m151244c(@C0359n0 LayoutInflater layoutInflater) {
        return m151245d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36882y4 m151245d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_offline_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151243a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91971a;
    }
}
