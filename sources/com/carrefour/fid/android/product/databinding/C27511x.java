package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.x */
public final class C27511x implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f66775a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f66776b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f66777c;

    public C27511x(@C0359n0 LinearLayout linearLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 LinearLayout linearLayout2) {
        this.f66775a = linearLayout;
        this.f66776b = recyclerView;
        this.f66777c = linearLayout2;
    }

    @C0359n0
    /* renamed from: a */
    public static C27511x m115763a(@C0359n0 View view) {
        int i = C27609f.C27619j.recycler_product_details_sponsored_products;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
        if (recyclerView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new C27511x(linearLayout, recyclerView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27511x m115764c(@C0359n0 LayoutInflater layoutInflater) {
        return m115765d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27511x m115765d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.offer_details_sponsored_products, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115763a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f66775a;
    }
}
