package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.account.C13144b;

/* renamed from: com.carrefour.fid.android.account.databinding.l */
public final class C13225l implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f32529a;
    @C0359n0

    /* renamed from: b */
    public final AppCompatImageView f32530b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatImageView f32531c;
    @C0359n0

    /* renamed from: d */
    public final TextView f32532d;
    @C0359n0

    /* renamed from: e */
    public final TextView f32533e;

    public C13225l(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 AppCompatImageView appCompatImageView2, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f32529a = constraintLayout;
        this.f32530b = appCompatImageView;
        this.f32531c = appCompatImageView2;
        this.f32532d = textView;
        this.f32533e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C13225l m57307a(@C0359n0 View view) {
        int i = C13144b.C13154j.address_suggestions_arrow_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, i);
        if (appCompatImageView != null) {
            i = C13144b.C13154j.address_suggestions_map_image;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C20753c.m96463a(view, i);
            if (appCompatImageView2 != null) {
                i = C13144b.C13154j.text_search_address;
                TextView textView = (TextView) C20753c.m96463a(view, i);
                if (textView != null) {
                    i = C13144b.C13154j.text_search_postal_code;
                    TextView textView2 = (TextView) C20753c.m96463a(view, i);
                    if (textView2 != null) {
                        return new C13225l((ConstraintLayout) view, appCompatImageView, appCompatImageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C13225l m57308c(@C0359n0 LayoutInflater layoutInflater) {
        return m57309d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13225l m57309d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.holder_dqe_address_suggestions_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57307a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f32529a;
    }
}
