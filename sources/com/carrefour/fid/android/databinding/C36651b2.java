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
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.carrefour.fid.android.databinding.b2 */
public final class C36651b2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90595a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f90596b;
    @C0359n0

    /* renamed from: c */
    public final TabLayout f90597c;

    public C36651b2(@C0359n0 LinearLayout linearLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 TabLayout tabLayout) {
        this.f90595a = linearLayout;
        this.f90596b = recyclerView;
        this.f90597c = tabLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C36651b2 m150333a(@C0359n0 View view) {
        int i = R.id.ecosystemRecycler;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.ecosystemRecycler);
        if (recyclerView != null) {
            i = R.id.tabLayoutEcosystem;
            TabLayout tabLayout = (TabLayout) C20753c.m96463a(view, R.id.tabLayoutEcosystem);
            if (tabLayout != null) {
                return new C36651b2((LinearLayout) view, recyclerView, tabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36651b2 m150334c(@C0359n0 LayoutInflater layoutInflater) {
        return m150335d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36651b2 m150335d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_ecosystem, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150333a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90595a;
    }
}
