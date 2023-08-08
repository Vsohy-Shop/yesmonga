package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.d6 */
public final class C36675d6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayoutCompat f90725a;
    @C0359n0

    /* renamed from: b */
    public final AppCompatImageView f90726b;

    public C36675d6(@C0359n0 LinearLayoutCompat linearLayoutCompat, @C0359n0 AppCompatImageView appCompatImageView) {
        this.f90725a = linearLayoutCompat;
        this.f90726b = appCompatImageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36675d6 m150429a(@C0359n0 View view) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, R.id.french_republic_logo);
        if (appCompatImageView != null) {
            return new C36675d6((LinearLayoutCompat) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.french_republic_logo)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36675d6 m150430c(@C0359n0 LayoutInflater layoutInflater) {
        return m150431d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36675d6 m150431d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_alcohol_legal_information, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150429a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayoutCompat getRoot() {
        return this.f90725a;
    }
}
