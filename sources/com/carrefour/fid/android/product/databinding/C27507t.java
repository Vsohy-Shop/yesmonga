package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.t */
public final class C27507t implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final NestedScrollView f66741a;
    @C0359n0

    /* renamed from: b */
    public final C27510w f66742b;
    @C0359n0

    /* renamed from: c */
    public final C27511x f66743c;
    @C0359n0

    /* renamed from: d */
    public final RecyclerView f66744d;

    public C27507t(@C0359n0 NestedScrollView nestedScrollView, @C0359n0 C27510w wVar, @C0359n0 C27511x xVar, @C0359n0 RecyclerView recyclerView) {
        this.f66741a = nestedScrollView;
        this.f66742b = wVar;
        this.f66743c = xVar;
        this.f66744d = recyclerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C27507t m115747a(@C0359n0 View view) {
        int i = C27609f.C27619j.offer_details_header;
        View a = C20753c.m96463a(view, i);
        if (a != null) {
            C27510w a2 = C27510w.m115759a(a);
            int i2 = C27609f.C27619j.offer_details_sponsored_products;
            View a3 = C20753c.m96463a(view, i2);
            if (a3 != null) {
                C27511x a4 = C27511x.m115763a(a3);
                int i3 = C27609f.C27619j.recycler_product_details;
                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i3);
                if (recyclerView != null) {
                    return new C27507t((NestedScrollView) view, a2, a4, recyclerView);
                }
                i = i3;
            } else {
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27507t m115748c(@C0359n0 LayoutInflater layoutInflater) {
        return m115749d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27507t m115749d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.include_pdp_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115747a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public NestedScrollView getRoot() {
        return this.f66741a;
    }
}
