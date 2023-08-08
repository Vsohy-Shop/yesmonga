package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.t */
public final class C37077t implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92815a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f92816b;

    public C37077t(@C0359n0 View view, @C0359n0 ImageView imageView) {
        this.f92815a = view;
        this.f92816b = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37077t m152061a(@C0359n0 View view) {
        int i = C36896b.C36906j.ds_component_list_imageview;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            return new C37077t(view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37077t m152062b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_list_image, viewGroup);
            return m152061a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92815a;
    }
}
