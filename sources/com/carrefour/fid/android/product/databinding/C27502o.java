package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.o */
public final class C27502o implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ImageView f66726a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f66727b;

    public C27502o(@C0359n0 ImageView imageView, @C0359n0 ImageView imageView2) {
        this.f66726a = imageView;
        this.f66727b = imageView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C27502o m115727a(@C0359n0 View view) {
        if (view != null) {
            ImageView imageView = (ImageView) view;
            return new C27502o(imageView, imageView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C27502o m115728c(@C0359n0 LayoutInflater layoutInflater) {
        return m115729d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27502o m115729d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.holder_lucky_cart_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115727a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ImageView getRoot() {
        return this.f66726a;
    }
}
