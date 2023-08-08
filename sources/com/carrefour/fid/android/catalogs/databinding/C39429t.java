package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.design.components.widgets.FavoriteStoreComponent;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.t */
public final class C39429t implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f100900a;
    @C0359n0

    /* renamed from: b */
    public final FavoriteStoreComponent f100901b;

    public C39429t(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 FavoriteStoreComponent favoriteStoreComponent) {
        this.f100900a = constraintLayout;
        this.f100901b = favoriteStoreComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C39429t m161605a(@C0359n0 View view) {
        int i = C39364b.C39374j.catalog_store_card_view;
        FavoriteStoreComponent favoriteStoreComponent = (FavoriteStoreComponent) C20753c.m96463a(view, i);
        if (favoriteStoreComponent != null) {
            return new C39429t((ConstraintLayout) view, favoriteStoreComponent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39429t m161606c(@C0359n0 LayoutInflater layoutInflater) {
        return m161607d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39429t m161607d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.holder_store_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161605a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f100900a;
    }
}
