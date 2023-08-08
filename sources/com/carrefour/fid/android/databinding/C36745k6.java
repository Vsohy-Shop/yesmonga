package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.k6 */
public final class C36745k6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ImageView f91148a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91149b;

    public C36745k6(@C0359n0 ImageView imageView, @C0359n0 ImageView imageView2) {
        this.f91148a = imageView;
        this.f91149b = imageView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36745k6 m150707a(@C0359n0 View view) {
        if (view != null) {
            ImageView imageView = (ImageView) view;
            return new C36745k6(imageView, imageView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36745k6 m150708c(@C0359n0 LayoutInflater layoutInflater) {
        return m150709d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36745k6 m150709d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_primes, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150707a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ImageView getRoot() {
        return this.f91148a;
    }
}
