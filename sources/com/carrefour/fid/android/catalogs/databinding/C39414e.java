package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.catalogs.C39364b;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.e */
public final class C39414e implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f100814a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f100815b;

    public C39414e(@C0359n0 LinearLayout linearLayout, @C0359n0 ImageView imageView) {
        this.f100814a = linearLayout;
        this.f100815b = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C39414e m161545a(@C0359n0 View view) {
        int i = C39364b.C39374j.catalogImage;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            return new C39414e((LinearLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39414e m161546c(@C0359n0 LayoutInflater layoutInflater) {
        return m161547d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39414e m161547d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.catalog_store_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161545a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f100814a;
    }
}
