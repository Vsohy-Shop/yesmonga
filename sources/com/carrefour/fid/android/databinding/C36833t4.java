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

/* renamed from: com.carrefour.fid.android.databinding.t4 */
public final class C36833t4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91677a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91678b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91679c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91680d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91681e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91682f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91683g;

    public C36833t4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5) {
        this.f91677a = constraintLayout;
        this.f91678b = imageView;
        this.f91679c = textView;
        this.f91680d = textView2;
        this.f91681e = textView3;
        this.f91682f = textView4;
        this.f91683g = textView5;
    }

    @C0359n0
    /* renamed from: a */
    public static C36833t4 m151053a(@C0359n0 View view) {
        int i = R.id.image_holder_order_details_no_delivery_product;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_holder_order_details_no_delivery_product);
        if (imageView != null) {
            i = R.id.text_holder_order_details_no_delivery_product_amount;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_no_delivery_product_amount);
            if (textView != null) {
                i = R.id.text_holder_order_details_no_delivery_product_description;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_no_delivery_product_description);
                if (textView2 != null) {
                    i = R.id.text_holder_order_details_no_delivery_product_name;
                    TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_no_delivery_product_name);
                    if (textView3 != null) {
                        i = R.id.text_holder_order_details_no_delivery_product_quantity;
                        TextView textView4 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_no_delivery_product_quantity);
                        if (textView4 != null) {
                            i = R.id.text_no_delivery_product_title;
                            TextView textView5 = (TextView) C20753c.m96463a(view, R.id.text_no_delivery_product_title);
                            if (textView5 != null) {
                                return new C36833t4((ConstraintLayout) view, imageView, textView, textView2, textView3, textView4, textView5);
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
    public static C36833t4 m151054c(@C0359n0 LayoutInflater layoutInflater) {
        return m151055d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36833t4 m151055d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_no_delivery_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151053a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91677a;
    }
}
