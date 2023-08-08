package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.j */
public final class C37055j implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f92696a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f92697b;

    public C37055j(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView) {
        this.f92696a = constraintLayout;
        this.f92697b = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37055j m151999a(@C0359n0 View view) {
        int i = C36896b.C36906j.offer_image;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            return new C37055j((ConstraintLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C37055j m152000c(@C0359n0 LayoutInflater layoutInflater) {
        return m152001d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37055j m152001d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_current_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151999a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92696a;
    }
}
