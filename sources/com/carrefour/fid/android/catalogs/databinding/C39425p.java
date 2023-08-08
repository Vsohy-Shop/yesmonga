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
import com.carrefour.fid.android.design.components.widgets.catalogs.CriteoCatalogBannerComponent;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.p */
public final class C39425p implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f100892a;
    @C0359n0

    /* renamed from: b */
    public final CriteoCatalogBannerComponent f100893b;

    public C39425p(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 CriteoCatalogBannerComponent criteoCatalogBannerComponent) {
        this.f100892a = constraintLayout;
        this.f100893b = criteoCatalogBannerComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C39425p m161589a(@C0359n0 View view) {
        int i = C39364b.C39374j.criteo_component;
        CriteoCatalogBannerComponent criteoCatalogBannerComponent = (CriteoCatalogBannerComponent) C20753c.m96463a(view, i);
        if (criteoCatalogBannerComponent != null) {
            return new C39425p((ConstraintLayout) view, criteoCatalogBannerComponent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39425p m161590c(@C0359n0 LayoutInflater layoutInflater) {
        return m161591d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39425p m161591d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.holder_criteo_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161589a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f100892a;
    }
}
