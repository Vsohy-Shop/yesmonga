package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.widgets.PageControlsComponent;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.q */
public final class C27504q implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f66733a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f66734b;
    @C0359n0

    /* renamed from: c */
    public final RecyclerView f66735c;
    @C0359n0

    /* renamed from: d */
    public final PageControlsComponent f66736d;

    public C27504q(@C0359n0 LinearLayout linearLayout, @C0359n0 ImageView imageView, @C0359n0 RecyclerView recyclerView, @C0359n0 PageControlsComponent pageControlsComponent) {
        this.f66733a = linearLayout;
        this.f66734b = imageView;
        this.f66735c = recyclerView;
        this.f66736d = pageControlsComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C27504q m115735a(@C0359n0 View view) {
        int i = C27609f.C27619j.image_flagship_branding;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            i = C27609f.C27619j.product_list;
            RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
            if (recyclerView != null) {
                i = C27609f.C27619j.product_list_indicator;
                PageControlsComponent pageControlsComponent = (PageControlsComponent) C20753c.m96463a(view, i);
                if (pageControlsComponent != null) {
                    return new C27504q((LinearLayout) view, imageView, recyclerView, pageControlsComponent);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27504q m115736c(@C0359n0 LayoutInflater layoutInflater) {
        return m115737d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27504q m115737d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.holder_offer_criteo_flagship, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115735a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f66733a;
    }
}
