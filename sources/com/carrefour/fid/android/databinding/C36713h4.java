package com.carrefour.fid.android.databinding;

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
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent;

/* renamed from: com.carrefour.fid.android.databinding.h4 */
public final class C36713h4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90957a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f90958b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f90959c;
    @C0359n0

    /* renamed from: d */
    public final ProductCardSComponent f90960d;
    @C0359n0

    /* renamed from: e */
    public final RecyclerView f90961e;

    public C36713h4(@C0359n0 LinearLayout linearLayout, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 ProductCardSComponent productCardSComponent, @C0359n0 RecyclerView recyclerView) {
        this.f90957a = linearLayout;
        this.f90958b = imageView;
        this.f90959c = imageView2;
        this.f90960d = productCardSComponent;
        this.f90961e = recyclerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36713h4 m150579a(@C0359n0 View view) {
        int i = R.id.image_butterfly_background;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_butterfly_background);
        if (imageView != null) {
            i = R.id.image_butterfly_logo;
            ImageView imageView2 = (ImageView) C20753c.m96463a(view, R.id.image_butterfly_logo);
            if (imageView2 != null) {
                i = R.id.product_card;
                ProductCardSComponent productCardSComponent = (ProductCardSComponent) C20753c.m96463a(view, R.id.product_card);
                if (productCardSComponent != null) {
                    i = R.id.recycler_butterfly_buttons;
                    RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.recycler_butterfly_buttons);
                    if (recyclerView != null) {
                        return new C36713h4((LinearLayout) view, imageView, imageView2, productCardSComponent, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36713h4 m150580c(@C0359n0 LayoutInflater layoutInflater) {
        return m150581d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36713h4 m150581d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_offer_criteo_butterfly, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150579a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90957a;
    }
}
