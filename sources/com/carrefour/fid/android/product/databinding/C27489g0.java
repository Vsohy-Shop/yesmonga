package com.carrefour.fid.android.product.databinding;

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
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.g0 */
public final class C27489g0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f66671a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f66672b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f66673c;
    @C0359n0

    /* renamed from: d */
    public final ConstraintLayout f66674d;
    @C0359n0

    /* renamed from: e */
    public final TextView f66675e;
    @C0359n0

    /* renamed from: f */
    public final TextView f66676f;

    public C27489g0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 ConstraintLayout constraintLayout2, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f66671a = constraintLayout;
        this.f66672b = imageView;
        this.f66673c = imageView2;
        this.f66674d = constraintLayout2;
        this.f66675e = textView;
        this.f66676f = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C27489g0 m115681a(@C0359n0 View view) {
        int i = C27609f.C27619j.image_allergobox_icon;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            i = C27609f.C27619j.image_consotrust_icon;
            ImageView imageView2 = (ImageView) C20753c.m96463a(view, i);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C27609f.C27619j.text_allergobox_description;
                TextView textView = (TextView) C20753c.m96463a(view, i);
                if (textView != null) {
                    i = C27609f.C27619j.text_allergobox_link;
                    TextView textView2 = (TextView) C20753c.m96463a(view, i);
                    if (textView2 != null) {
                        return new C27489g0(constraintLayout, imageView, imageView2, constraintLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27489g0 m115682c(@C0359n0 LayoutInflater layoutInflater) {
        return m115683d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27489g0 m115683d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.view_allergobox, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115681a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f66671a;
    }
}
