package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.k1 */
public final class C37060k1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ImageView f92707a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f92708b;

    public C37060k1(@C0359n0 ImageView imageView, @C0359n0 ImageView imageView2) {
        this.f92707a = imageView;
        this.f92708b = imageView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37060k1 m152013a(@C0359n0 View view) {
        if (view != null) {
            ImageView imageView = (ImageView) view;
            return new C37060k1(imageView, imageView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C37060k1 m152014c(@C0359n0 LayoutInflater layoutInflater) {
        return m152015d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37060k1 m152015d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.item_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m152013a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ImageView getRoot() {
        return this.f92707a;
    }
}
