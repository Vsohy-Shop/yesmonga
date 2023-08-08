package com.carrefour.fid.android.design.components.databinding;

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
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.design.components.databinding.l */
public final class C37061l implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f92709a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f92710b;
    @C0359n0

    /* renamed from: c */
    public final TextView f92711c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f92712d;

    public C37061l(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 TextView textView, @C0359n0 ImageView imageView) {
        this.f92709a = constraintLayout;
        this.f92710b = materialButton;
        this.f92711c = textView;
        this.f92712d = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37061l m152017a(@C0359n0 View view) {
        int i = C36896b.C36906j.component_error_button;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, i);
        if (materialButton != null) {
            i = C36896b.C36906j.component_error_description;
            TextView textView = (TextView) C20753c.m96463a(view, i);
            if (textView != null) {
                i = C36896b.C36906j.component_error_image;
                ImageView imageView = (ImageView) C20753c.m96463a(view, i);
                if (imageView != null) {
                    return new C37061l((ConstraintLayout) view, materialButton, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C37061l m152018c(@C0359n0 LayoutInflater layoutInflater) {
        return m152019d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37061l m152019d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m152017a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92709a;
    }
}
