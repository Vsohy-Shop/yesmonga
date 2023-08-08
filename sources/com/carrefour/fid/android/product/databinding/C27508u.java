package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.u */
public final class C27508u implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f66745a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f66746b;

    public C27508u(@C0359n0 FrameLayout frameLayout, @C0359n0 ImageView imageView) {
        this.f66745a = frameLayout;
        this.f66746b = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C27508u m115751a(@C0359n0 View view) {
        int i = C27609f.C27619j.image_product_details;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            return new C27508u((FrameLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27508u m115752c(@C0359n0 LayoutInflater layoutInflater) {
        return m115753d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27508u m115753d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.item_product_details_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115751a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f66745a;
    }
}
