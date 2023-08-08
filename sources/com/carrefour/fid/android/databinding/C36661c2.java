package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.c2 */
public final class C36661c2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final RecyclerView f90635a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f90636b;

    public C36661c2(@C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView recyclerView2) {
        this.f90635a = recyclerView;
        this.f90636b = recyclerView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36661c2 m150373a(@C0359n0 View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C36661c2(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36661c2 m150374c(@C0359n0 LayoutInflater layoutInflater) {
        return m150375d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36661c2 m150375d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_embedded_software_licencing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150373a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f90635a;
    }
}
