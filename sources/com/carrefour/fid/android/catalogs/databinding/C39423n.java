package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.catalogs.C39364b;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.n */
public final class C39423n implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f100887a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f100888b;
    @C0359n0

    /* renamed from: c */
    public final TextView f100889c;

    public C39423n(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 TextView textView) {
        this.f100887a = constraintLayout;
        this.f100888b = recyclerView;
        this.f100889c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C39423n m161581a(@C0359n0 View view) {
        int i = C39364b.C39374j.catalog_list_holder;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
        if (recyclerView != null) {
            i = C39364b.C39374j.title;
            TextView textView = (TextView) C20753c.m96463a(view, i);
            if (textView != null) {
                return new C39423n((ConstraintLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39423n m161582c(@C0359n0 LayoutInflater layoutInflater) {
        return m161583d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39423n m161583d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.holder_catalog_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161581a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f100887a;
    }
}
