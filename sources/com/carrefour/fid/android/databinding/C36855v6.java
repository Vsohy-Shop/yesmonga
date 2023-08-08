package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.v6 */
public final class C36855v6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final RecyclerView f91810a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f91811b;

    public C36855v6(@C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView recyclerView2) {
        this.f91810a = recyclerView;
        this.f91811b = recyclerView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36855v6 m151137a(@C0359n0 View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C36855v6(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36855v6 m151138c(@C0359n0 LayoutInflater layoutInflater) {
        return m151139d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36855v6 m151139d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.order_loyalty_cards_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151137a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f91810a;
    }
}
