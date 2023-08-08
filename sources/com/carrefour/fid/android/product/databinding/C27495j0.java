package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.product.C27609f;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.product.databinding.j0 */
public final class C27495j0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f66700a;
    @C0359n0

    /* renamed from: b */
    public final AppCompatImageView f66701b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatTextView f66702c;
    @C0359n0

    /* renamed from: d */
    public final MaterialButton f66703d;
    @C0359n0

    /* renamed from: e */
    public final AppCompatImageView f66704e;

    public C27495j0(@C0359n0 View view, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 AppCompatTextView appCompatTextView, @C0359n0 MaterialButton materialButton, @C0359n0 AppCompatImageView appCompatImageView2) {
        this.f66700a = view;
        this.f66701b = appCompatImageView;
        this.f66702c = appCompatTextView;
        this.f66703d = materialButton;
        this.f66704e = appCompatImageView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C27495j0 m115703a(@C0359n0 View view) {
        int i = C27609f.C27619j.first_flavor_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, i);
        if (appCompatImageView != null) {
            i = C27609f.C27619j.left_promo_items;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, i);
            if (appCompatTextView != null) {
                i = C27609f.C27619j.other_flavors_button;
                MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, i);
                if (materialButton != null) {
                    i = C27609f.C27619j.second_flavor_image;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) C20753c.m96463a(view, i);
                    if (appCompatImageView2 != null) {
                        return new C27495j0(view, appCompatImageView, appCompatTextView, materialButton, appCompatImageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C27495j0 m115704b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C27609f.C27622m.view_mixing_product_details, viewGroup);
            return m115703a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f66700a;
    }
}
