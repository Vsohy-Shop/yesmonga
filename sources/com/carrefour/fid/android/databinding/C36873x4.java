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

/* renamed from: com.carrefour.fid.android.databinding.x4 */
public final class C36873x4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91904a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91905b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91906c;

    public C36873x4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91904a = constraintLayout;
        this.f91905b = textView;
        this.f91906c = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36873x4 m151207a(@C0359n0 View view) {
        int i = R.id.text_holder_order_offline_details_total_price_amount;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_total_price_amount);
        if (textView != null) {
            i = R.id.text_holder_order_offline_details_total_price_title;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_total_price_title);
            if (textView2 != null) {
                return new C36873x4((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36873x4 m151208c(@C0359n0 LayoutInflater layoutInflater) {
        return m151209d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36873x4 m151209d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_offline_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151207a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91904a;
    }
}
