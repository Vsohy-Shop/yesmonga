package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.catalogs.C39364b;
import com.ortiz.touchview.TouchImageView;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.o */
public final class C39424o implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TouchImageView f100890a;
    @C0359n0

    /* renamed from: b */
    public final TouchImageView f100891b;

    public C39424o(@C0359n0 TouchImageView touchImageView, @C0359n0 TouchImageView touchImageView2) {
        this.f100890a = touchImageView;
        this.f100891b = touchImageView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C39424o m161585a(@C0359n0 View view) {
        if (view != null) {
            TouchImageView touchImageView = (TouchImageView) view;
            return new C39424o(touchImageView, touchImageView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C39424o m161586c(@C0359n0 LayoutInflater layoutInflater) {
        return m161587d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39424o m161587d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.holder_catalog_page, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161585a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TouchImageView getRoot() {
        return this.f100890a;
    }
}
