package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.i2 */
public final class C36721i2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final RecyclerView f91008a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f91009b;

    public C36721i2(@C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView recyclerView2) {
        this.f91008a = recyclerView;
        this.f91009b = recyclerView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36721i2 m150611a(@C0359n0 View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C36721i2(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36721i2 m150612c(@C0359n0 LayoutInflater layoutInflater) {
        return m150613d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36721i2 m150613d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_legale_notice, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150611a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f91008a;
    }
}
