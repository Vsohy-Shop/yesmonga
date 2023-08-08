package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.h6 */
public final class C36715h6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90974a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f90975b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatImageView f90976c;
    @C0359n0

    /* renamed from: d */
    public final AppCompatTextView f90977d;
    @C0359n0

    /* renamed from: e */
    public final AppCompatTextView f90978e;

    public C36715h6(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 AppCompatTextView appCompatTextView, @C0359n0 AppCompatTextView appCompatTextView2) {
        this.f90974a = constraintLayout;
        this.f90975b = materialButton;
        this.f90976c = appCompatImageView;
        this.f90977d = appCompatTextView;
        this.f90978e = appCompatTextView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36715h6 m150587a(@C0359n0 View view) {
        int i = R.id.button_empty_view;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, R.id.button_empty_view);
        if (materialButton != null) {
            i = R.id.image_view_empty_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, R.id.image_view_empty_icon);
            if (appCompatImageView != null) {
                i = R.id.text_view_empty_message;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, R.id.text_view_empty_message);
                if (appCompatTextView != null) {
                    i = R.id.text_view_empty_title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C20753c.m96463a(view, R.id.text_view_empty_title);
                    if (appCompatTextView2 != null) {
                        return new C36715h6((ConstraintLayout) view, materialButton, appCompatImageView, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36715h6 m150588c(@C0359n0 LayoutInflater layoutInflater) {
        return m150589d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36715h6 m150589d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_layout_empty_recommended_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150587a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90974a;
    }
}
