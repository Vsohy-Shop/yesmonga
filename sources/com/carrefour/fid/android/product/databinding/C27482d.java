package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.widgets.PageControlsComponent;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.d */
public final class C27482d implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f66631a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f66632b;
    @C0359n0

    /* renamed from: c */
    public final PageControlsComponent f66633c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f66634d;

    public C27482d(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 PageControlsComponent pageControlsComponent, @C0359n0 ImageView imageView) {
        this.f66631a = constraintLayout;
        this.f66632b = recyclerView;
        this.f66633c = pageControlsComponent;
        this.f66634d = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C27482d m115653a(@C0359n0 View view) {
        int i = C27609f.C27619j.product_details_list_images;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
        if (recyclerView != null) {
            i = C27609f.C27619j.tab_product_image_indicator;
            PageControlsComponent pageControlsComponent = (PageControlsComponent) C20753c.m96463a(view, i);
            if (pageControlsComponent != null) {
                i = C27609f.C27619j.toolBarBackImage;
                ImageView imageView = (ImageView) C20753c.m96463a(view, i);
                if (imageView != null) {
                    return new C27482d((ConstraintLayout) view, recyclerView, pageControlsComponent, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27482d m115654c(@C0359n0 LayoutInflater layoutInflater) {
        return m115655d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27482d m115655d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.fragment_product_details_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115653a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f66631a;
    }
}
