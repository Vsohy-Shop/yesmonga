package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.r */
public final class C27505r implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f66737a;

    public C27505r(@C0359n0 FrameLayout frameLayout) {
        this.f66737a = frameLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C27505r m115739a(@C0359n0 View view) {
        if (view != null) {
            return new C27505r((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C27505r m115740c(@C0359n0 LayoutInflater layoutInflater) {
        return m115741d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27505r m115741d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.holder_offer_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115739a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f66737a;
    }
}
