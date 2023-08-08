package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.l */
public final class C27498l implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final RecyclerView f66712a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f66713b;

    public C27498l(@C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView recyclerView2) {
        this.f66712a = recyclerView;
        this.f66713b = recyclerView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C27498l m115713a(@C0359n0 View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C27498l(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C27498l m115714c(@C0359n0 LayoutInflater layoutInflater) {
        return m115715d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27498l m115715d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.holder_component_regular_recycler, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115713a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f66712a;
    }
}
