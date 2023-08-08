package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.i */
public final class C36718i implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90989a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f90990b;
    @C0359n0

    /* renamed from: c */
    public final TextView f90991c;

    public C36718i(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 TextView textView) {
        this.f90989a = constraintLayout;
        this.f90990b = imageView;
        this.f90991c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36718i m150599a(@C0359n0 View view) {
        int i = R.id.card_imageView;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.card_imageView);
        if (imageView != null) {
            i = R.id.card_title;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.card_title);
            if (textView != null) {
                return new C36718i((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36718i m150600c(@C0359n0 LayoutInflater layoutInflater) {
        return m150601d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36718i m150601d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.card_presentation_cell, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150599a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90989a;
    }
}
