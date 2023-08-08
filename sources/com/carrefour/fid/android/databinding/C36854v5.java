package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.v5 */
public final class C36854v5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final AppCompatImageView f91808a;
    @C0359n0

    /* renamed from: b */
    public final AppCompatImageView f91809b;

    public C36854v5(@C0359n0 AppCompatImageView appCompatImageView, @C0359n0 AppCompatImageView appCompatImageView2) {
        this.f91808a = appCompatImageView;
        this.f91809b = appCompatImageView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36854v5 m151133a(@C0359n0 View view) {
        if (view != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view;
            return new C36854v5(appCompatImageView, appCompatImageView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36854v5 m151134c(@C0359n0 LayoutInflater layoutInflater) {
        return m151135d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36854v5 m151135d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.home_cms_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151133a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public AppCompatImageView getRoot() {
        return this.f91808a;
    }
}
