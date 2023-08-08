package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.i8 */
public final class C36727i8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f91033a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f91034b;

    public C36727i8(@C0359n0 FrameLayout frameLayout, @C0359n0 RecyclerView recyclerView) {
        this.f91033a = frameLayout;
        this.f91034b = recyclerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36727i8 m150635a(@C0359n0 View view) {
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_services_grid);
        if (recyclerView != null) {
            return new C36727i8((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.list_services_grid)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36727i8 m150636c(@C0359n0 LayoutInflater layoutInflater) {
        return m150637d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36727i8 m150637d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.store_services_grid_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150635a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f91033a;
    }
}
