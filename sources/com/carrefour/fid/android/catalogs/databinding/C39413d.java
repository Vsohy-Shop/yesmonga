package com.carrefour.fid.android.catalogs.databinding;

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
import com.carrefour.fid.android.catalogs.C39364b;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.d */
public final class C39413d implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f100809a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f100810b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f100811c;
    @C0359n0

    /* renamed from: d */
    public final TextView f100812d;
    @C0359n0

    /* renamed from: e */
    public final ConstraintLayout f100813e;

    public C39413d(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 TextView textView, @C0359n0 ConstraintLayout constraintLayout2) {
        this.f100809a = constraintLayout;
        this.f100810b = imageView;
        this.f100811c = imageView2;
        this.f100812d = textView;
        this.f100813e = constraintLayout2;
    }

    @C0359n0
    /* renamed from: a */
    public static C39413d m161541a(@C0359n0 View view) {
        int i = C39364b.C39374j.cata_list_arrow;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            i = C39364b.C39374j.cata_list_image;
            ImageView imageView2 = (ImageView) C20753c.m96463a(view, i);
            if (imageView2 != null) {
                i = C39364b.C39374j.cata_list_text;
                TextView textView = (TextView) C20753c.m96463a(view, i);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new C39413d(constraintLayout, imageView, imageView2, textView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39413d m161542c(@C0359n0 LayoutInflater layoutInflater) {
        return m161543d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39413d m161543d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.catalog_section_cell, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161541a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f100809a;
    }
}
