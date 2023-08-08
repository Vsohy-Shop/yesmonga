package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.a6 */
public final class C36645a6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90570a;
    @C0359n0

    /* renamed from: b */
    public final LinearLayoutCompat f90571b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatImageView f90572c;
    @C0359n0

    /* renamed from: d */
    public final AppCompatImageView f90573d;
    @C0359n0

    /* renamed from: e */
    public final AppCompatTextView f90574e;
    @C0359n0

    /* renamed from: f */
    public final AppCompatTextView f90575f;

    public C36645a6(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 LinearLayoutCompat linearLayoutCompat, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 AppCompatImageView appCompatImageView2, @C0359n0 AppCompatTextView appCompatTextView, @C0359n0 AppCompatTextView appCompatTextView2) {
        this.f90570a = constraintLayout;
        this.f90571b = linearLayoutCompat;
        this.f90572c = appCompatImageView;
        this.f90573d = appCompatImageView2;
        this.f90574e = appCompatTextView;
        this.f90575f = appCompatTextView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36645a6 m150309a(@C0359n0 View view) {
        int i = R.id.container_3ds_instructions;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C20753c.m96463a(view, R.id.container_3ds_instructions);
        if (linearLayoutCompat != null) {
            i = R.id.image_3ds_arrow;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, R.id.image_3ds_arrow);
            if (appCompatImageView != null) {
                i = R.id.image_3ds_logo;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C20753c.m96463a(view, R.id.image_3ds_logo);
                if (appCompatImageView2 != null) {
                    i = R.id.text_3ds_title;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, R.id.text_3ds_title);
                    if (appCompatTextView != null) {
                        i = R.id.text_3ds_view_instructions;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C20753c.m96463a(view, R.id.text_3ds_view_instructions);
                        if (appCompatTextView2 != null) {
                            return new C36645a6((ConstraintLayout) view, linearLayoutCompat, appCompatImageView, appCompatImageView2, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36645a6 m150310c(@C0359n0 LayoutInflater layoutInflater) {
        return m150311d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36645a6 m150311d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_3ds_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150309a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90570a;
    }
}
