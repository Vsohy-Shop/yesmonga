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

/* renamed from: com.carrefour.fid.android.databinding.k5 */
public final class C36744k5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91141a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91142b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91143c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91144d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91145e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91146f;
    @C0359n0

    /* renamed from: g */
    public final View f91147g;

    public C36744k5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 View view) {
        this.f91141a = constraintLayout;
        this.f91142b = textView;
        this.f91143c = textView2;
        this.f91144d = textView3;
        this.f91145e = textView4;
        this.f91146f = textView5;
        this.f91147g = view;
    }

    @C0359n0
    /* renamed from: a */
    public static C36744k5 m150703a(@C0359n0 View view) {
        int i = R.id.text_holder_order_offline_amount;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_amount);
        if (textView != null) {
            i = R.id.text_holder_order_offline_date;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_date);
            if (textView2 != null) {
                i = R.id.text_holder_order_offline_details;
                TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details);
                if (textView3 != null) {
                    i = R.id.text_holder_order_offline_store_address;
                    TextView textView4 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_store_address);
                    if (textView4 != null) {
                        i = R.id.text_holder_order_offline_store_name;
                        TextView textView5 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_store_name);
                        if (textView5 != null) {
                            i = R.id.view_holder_order_details_product_divider;
                            View a = C20753c.m96463a(view, R.id.view_holder_order_details_product_divider);
                            if (a != null) {
                                return new C36744k5((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5, a);
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
    public static C36744k5 m150704c(@C0359n0 LayoutInflater layoutInflater) {
        return m150705d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36744k5 m150705d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_offline_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150703a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91141a;
    }
}
