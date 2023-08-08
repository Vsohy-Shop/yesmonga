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
import com.carrefour.fid.android.design.components.widgets.HubProductComponent;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.r */
public final class C39427r implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f100896a;
    @C0359n0

    /* renamed from: b */
    public final HubProductComponent f100897b;

    public C39427r(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 HubProductComponent hubProductComponent) {
        this.f100896a = constraintLayout;
        this.f100897b = hubProductComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C39427r m161597a(@C0359n0 View view) {
        int i = C39364b.C39374j.catalog_list_card;
        HubProductComponent hubProductComponent = (HubProductComponent) C20753c.m96463a(view, i);
        if (hubProductComponent != null) {
            return new C39427r((ConstraintLayout) view, hubProductComponent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39427r m161598c(@C0359n0 LayoutInflater layoutInflater) {
        return m161599d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39427r m161599d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.holder_my_catalogs_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161597a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f100896a;
    }
}
