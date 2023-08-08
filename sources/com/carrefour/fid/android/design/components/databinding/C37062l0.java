package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.l0 */
public final class C37062l0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92713a;
    @C0359n0

    /* renamed from: b */
    public final AppCompatTextView f92714b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatTextView f92715c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f92716d;

    public C37062l0(@C0359n0 View view, @C0359n0 AppCompatTextView appCompatTextView, @C0359n0 AppCompatTextView appCompatTextView2, @C0359n0 ImageView imageView) {
        this.f92713a = view;
        this.f92714b = appCompatTextView;
        this.f92715c = appCompatTextView2;
        this.f92716d = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37062l0 m152021a(@C0359n0 View view) {
        int i = C36896b.C36906j.price_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, i);
        if (appCompatTextView != null) {
            i = C36896b.C36906j.sub_price_text;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C20753c.m96463a(view, i);
            if (appCompatTextView2 != null) {
                i = C36896b.C36906j.variable_weight_image;
                ImageView imageView = (ImageView) C20753c.m96463a(view, i);
                if (imageView != null) {
                    return new C37062l0(view, appCompatTextView, appCompatTextView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37062l0 m152022b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_product_card_price, viewGroup);
            return m152021a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92713a;
    }
}
