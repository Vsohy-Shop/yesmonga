package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.c0 */
public final class C36659c0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final RecyclerView f90625a;

    public C36659c0(@C0359n0 RecyclerView recyclerView) {
        this.f90625a = recyclerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36659c0 m150365a(@C0359n0 View view) {
        if (view != null) {
            return new C36659c0((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36659c0 m150366c(@C0359n0 LayoutInflater layoutInflater) {
        return m150367d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36659c0 m150367d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_account_list_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150365a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f90625a;
    }
}
