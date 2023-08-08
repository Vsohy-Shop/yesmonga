package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.r4 */
public final class C36813r4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91574a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91575b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91576c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91577d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91578e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91579f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91580g;
    @C0359n0

    /* renamed from: h */
    public final TextView f91581h;

    public C36813r4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6) {
        this.f91574a = constraintLayout;
        this.f91575b = imageView;
        this.f91576c = textView;
        this.f91577d = textView2;
        this.f91578e = textView3;
        this.f91579f = textView4;
        this.f91580g = textView5;
        this.f91581h = textView6;
    }

    @C0359n0
    /* renamed from: a */
    public static C36813r4 m150975a(@C0359n0 View view) {
        int i = R.id.image_holder_order_details_product;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_holder_order_details_product);
        if (imageView != null) {
            i = R.id.text_holder_order_details_new_product_amount;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_new_product_amount);
            if (textView != null) {
                i = R.id.text_holder_order_details_new_product_quantity;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_new_product_quantity);
                if (textView2 != null) {
                    i = R.id.text_holder_order_details_original_product_amount;
                    TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_original_product_amount);
                    if (textView3 != null) {
                        i = R.id.text_holder_order_details_original_product_quantity;
                        TextView textView4 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_original_product_quantity);
                        if (textView4 != null) {
                            i = R.id.text_holder_order_details_product_description;
                            TextView textView5 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_product_description);
                            if (textView5 != null) {
                                i = R.id.text_holder_order_details_product_name;
                                TextView textView6 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_product_name);
                                if (textView6 != null) {
                                    return new C36813r4((ConstraintLayout) view, imageView, textView, textView2, textView3, textView4, textView5, textView6);
                                }
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
    public static C36813r4 m150976c(@C0359n0 LayoutInflater layoutInflater) {
        return m150977d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36813r4 m150977d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_missing_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150975a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91574a;
    }
}
