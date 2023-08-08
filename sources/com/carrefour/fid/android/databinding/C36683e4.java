package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.e4 */
public final class C36683e4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ImageView f90763a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f90764b;

    public C36683e4(@C0359n0 ImageView imageView, @C0359n0 ImageView imageView2) {
        this.f90763a = imageView;
        this.f90764b = imageView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36683e4 m150461a(@C0359n0 View view) {
        if (view != null) {
            ImageView imageView = (ImageView) view;
            return new C36683e4(imageView, imageView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36683e4 m150462c(@C0359n0 LayoutInflater layoutInflater) {
        return m150463d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36683e4 m150463d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_lucky_cart_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150461a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ImageView getRoot() {
        return this.f90763a;
    }
}
