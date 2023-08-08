package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.QuantityView;

/* renamed from: com.carrefour.fid.android.product.databinding.e0 */
public final class C27485e0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CardView f66652a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f66653b;
    @C0359n0

    /* renamed from: c */
    public final ProgressBar f66654c;
    @C0359n0

    /* renamed from: d */
    public final QuantityView f66655d;
    @C0359n0

    /* renamed from: e */
    public final TextView f66656e;
    @C0359n0

    /* renamed from: f */
    public final TextView f66657f;
    @C0359n0

    /* renamed from: g */
    public final TextView f66658g;
    @C0359n0

    /* renamed from: h */
    public final TextView f66659h;
    @C0359n0

    /* renamed from: i */
    public final LinearLayout f66660i;
    @C0359n0

    /* renamed from: j */
    public final TextView f66661j;

    public C27485e0(@C0359n0 CardView cardView, @C0359n0 ImageButton imageButton, @C0359n0 ProgressBar progressBar, @C0359n0 QuantityView quantityView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 LinearLayout linearLayout, @C0359n0 TextView textView5) {
        this.f66652a = cardView;
        this.f66653b = imageButton;
        this.f66654c = progressBar;
        this.f66655d = quantityView;
        this.f66656e = textView;
        this.f66657f = textView2;
        this.f66658g = textView3;
        this.f66659h = textView4;
        this.f66660i = linearLayout;
        this.f66661j = textView5;
    }

    @C0359n0
    /* renamed from: a */
    public static C27485e0 m115665a(@C0359n0 View view) {
        int i = C27609f.C27619j.button_holder_product_details_purchase;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, i);
        if (imageButton != null) {
            i = C27609f.C27619j.button_holder_product_details_purchase_progress;
            ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, i);
            if (progressBar != null) {
                i = C27609f.C27619j.layout_holder_product_details_quantity;
                QuantityView quantityView = (QuantityView) C20753c.m96463a(view, i);
                if (quantityView != null) {
                    i = C27609f.C27619j.text_holder_bottom_product_details_promo;
                    TextView textView = (TextView) C20753c.m96463a(view, i);
                    if (textView != null) {
                        i = C27609f.C27619j.text_holder_product_details_price;
                        TextView textView2 = (TextView) C20753c.m96463a(view, i);
                        if (textView2 != null) {
                            i = C27609f.C27619j.text_holder_product_details_strike_through_price;
                            TextView textView3 = (TextView) C20753c.m96463a(view, i);
                            if (textView3 != null) {
                                i = C27609f.C27619j.text_holder_product_details_weight_price;
                                TextView textView4 = (TextView) C20753c.m96463a(view, i);
                                if (textView4 != null) {
                                    i = C27609f.C27619j.variable_weight_info_layout;
                                    LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, i);
                                    if (linearLayout != null) {
                                        i = C27609f.C27619j.variable_weight_info_text;
                                        TextView textView5 = (TextView) C20753c.m96463a(view, i);
                                        if (textView5 != null) {
                                            return new C27485e0((CardView) view, imageButton, progressBar, quantityView, textView, textView2, textView3, textView4, linearLayout, textView5);
                                        }
                                    }
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
    public static C27485e0 m115666c(@C0359n0 LayoutInflater layoutInflater) {
        return m115667d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27485e0 m115667d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.product_details_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115665a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CardView getRoot() {
        return this.f66652a;
    }
}
