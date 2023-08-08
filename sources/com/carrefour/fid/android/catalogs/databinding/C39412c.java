package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.catalogs.C39364b;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.c */
public final class C39412c implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f100808a;

    public C39412c(@C0359n0 LinearLayout linearLayout) {
        this.f100808a = linearLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C39412c m161537a(@C0359n0 View view) {
        if (view != null) {
            return new C39412c((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C39412c m161538c(@C0359n0 LayoutInflater layoutInflater) {
        return m161539d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39412c m161539d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.catalog_product_placeholder_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161537a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f100808a;
    }
}
