package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.a0 */
public final class C27477a0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f66612a;
    @C0359n0

    /* renamed from: b */
    public final TextView f66613b;
    @C0359n0

    /* renamed from: c */
    public final TextView f66614c;
    @C0359n0

    /* renamed from: d */
    public final TextView f66615d;
    @C0359n0

    /* renamed from: e */
    public final ImageComponent f66616e;

    public C27477a0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 ImageComponent imageComponent) {
        this.f66612a = constraintLayout;
        this.f66613b = textView;
        this.f66614c = textView2;
        this.f66615d = textView3;
        this.f66616e = imageComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C27477a0 m115633a(@C0359n0 View view) {
        int i = C27609f.C27619j.product_button_atc;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C27609f.C27619j.product_content;
            TextView textView2 = (TextView) C20753c.m96463a(view, i);
            if (textView2 != null) {
                i = C27609f.C27619j.product_group_fav;
                TextView textView3 = (TextView) C20753c.m96463a(view, i);
                if (textView3 != null) {
                    i = C27609f.C27619j.product_image;
                    ImageComponent imageComponent = (ImageComponent) C20753c.m96463a(view, i);
                    if (imageComponent != null) {
                        return new C27477a0((ConstraintLayout) view, textView, textView2, textView3, imageComponent);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27477a0 m115634c(@C0359n0 LayoutInflater layoutInflater) {
        return m115635d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27477a0 m115635d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.plp_cell_placeholder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115633a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f66612a;
    }
}
