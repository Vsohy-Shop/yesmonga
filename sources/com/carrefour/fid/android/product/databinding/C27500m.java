package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.m */
public final class C27500m implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final RecyclerView f66722a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f66723b;

    public C27500m(@C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView recyclerView2) {
        this.f66722a = recyclerView;
        this.f66723b = recyclerView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C27500m m115719a(@C0359n0 View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C27500m(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C27500m m115720c(@C0359n0 LayoutInflater layoutInflater) {
        return m115721d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27500m m115721d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.holder_component_traceability, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115719a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f66722a;
    }
}
