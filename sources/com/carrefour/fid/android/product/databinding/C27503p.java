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
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.p */
public final class C27503p implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f66728a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f66729b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f66730c;
    @C0359n0

    /* renamed from: d */
    public final ProductCardSComponent f66731d;
    @C0359n0

    /* renamed from: e */
    public final RecyclerView f66732e;

    public C27503p(@C0359n0 LinearLayout linearLayout, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 ProductCardSComponent productCardSComponent, @C0359n0 RecyclerView recyclerView) {
        this.f66728a = linearLayout;
        this.f66729b = imageView;
        this.f66730c = imageView2;
        this.f66731d = productCardSComponent;
        this.f66732e = recyclerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C27503p m115731a(@C0359n0 View view) {
        int i = C27609f.C27619j.image_butterfly_background;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            i = C27609f.C27619j.image_butterfly_logo;
            ImageView imageView2 = (ImageView) C20753c.m96463a(view, i);
            if (imageView2 != null) {
                i = C27609f.C27619j.product_card;
                ProductCardSComponent productCardSComponent = (ProductCardSComponent) C20753c.m96463a(view, i);
                if (productCardSComponent != null) {
                    i = C27609f.C27619j.recycler_butterfly_buttons;
                    RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
                    if (recyclerView != null) {
                        return new C27503p((LinearLayout) view, imageView, imageView2, productCardSComponent, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27503p m115732c(@C0359n0 LayoutInflater layoutInflater) {
        return m115733d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27503p m115733d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.holder_offer_criteo_butterfly, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115731a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f66728a;
    }
}
