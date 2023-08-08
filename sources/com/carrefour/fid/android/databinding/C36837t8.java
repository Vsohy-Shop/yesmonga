package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.t8 */
public final class C36837t8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91715a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f91716b;

    public C36837t8(@C0359n0 LinearLayout linearLayout, @C0359n0 RecyclerView recyclerView) {
        this.f91715a = linearLayout;
        this.f91716b = recyclerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36837t8 m151069a(@C0359n0 View view) {
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_most_relevant_products);
        if (recyclerView != null) {
            return new C36837t8((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.list_most_relevant_products)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36837t8 m151070c(@C0359n0 LayoutInflater layoutInflater) {
        return m151071d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36837t8 m151071d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_recommended_products, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151069a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91715a;
    }
}
