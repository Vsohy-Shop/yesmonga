package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.catalogs.C39364b;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.f */
public final class C39415f implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f100816a;

    public C39415f(@C0359n0 FrameLayout frameLayout) {
        this.f100816a = frameLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C39415f m161549a(@C0359n0 View view) {
        if (view != null) {
            return new C39415f((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C39415f m161550c(@C0359n0 LayoutInflater layoutInflater) {
        return m161551d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39415f m161551d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.catalog_store_list_item_padding, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161549a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f100816a;
    }
}
