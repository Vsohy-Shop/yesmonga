package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent;

/* renamed from: com.carrefour.fid.android.design.components.databinding.d */
public final class C37037d implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92594a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92595b;
    @C0359n0

    /* renamed from: c */
    public final ImageComponent f92596c;
    @C0359n0

    /* renamed from: d */
    public final AppCompatImageView f92597d;
    @C0359n0

    /* renamed from: e */
    public final TextView f92598e;

    public C37037d(@C0359n0 View view, @C0359n0 TextView textView, @C0359n0 ImageComponent imageComponent, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 TextView textView2) {
        this.f92594a = view;
        this.f92595b = textView;
        this.f92596c = imageComponent;
        this.f92597d = appCompatImageView;
        this.f92598e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37037d m151951a(@C0359n0 View view) {
        int i = C36896b.C36906j.catalog_date;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C36896b.C36906j.catalog_image;
            ImageComponent imageComponent = (ImageComponent) C20753c.m96463a(view, i);
            if (imageComponent != null) {
                i = C36896b.C36906j.catalog_image_details;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, i);
                if (appCompatImageView != null) {
                    i = C36896b.C36906j.catalog_name;
                    TextView textView2 = (TextView) C20753c.m96463a(view, i);
                    if (textView2 != null) {
                        return new C37037d(view, textView, imageComponent, appCompatImageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37037d m151952b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_catalog, viewGroup);
            return m151951a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92594a;
    }
}
