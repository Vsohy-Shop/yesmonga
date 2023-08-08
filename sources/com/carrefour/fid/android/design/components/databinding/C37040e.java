package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.e */
public final class C37040e implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92612a;
    @C0359n0

    /* renamed from: b */
    public final AppCompatImageView f92613b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatTextView f92614c;
    @C0359n0

    /* renamed from: d */
    public final LinearLayoutCompat f92615d;

    public C37040e(@C0359n0 View view, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 AppCompatTextView appCompatTextView, @C0359n0 LinearLayoutCompat linearLayoutCompat) {
        this.f92612a = view;
        this.f92613b = appCompatImageView;
        this.f92614c = appCompatTextView;
        this.f92615d = linearLayoutCompat;
    }

    @C0359n0
    /* renamed from: a */
    public static C37040e m151957a(@C0359n0 View view) {
        int i = C36896b.C36906j.checkbox_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, i);
        if (appCompatImageView != null) {
            i = C36896b.C36906j.checkbox_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, i);
            if (appCompatTextView != null) {
                i = C36896b.C36906j.layout_component_checkbox;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C20753c.m96463a(view, i);
                if (linearLayoutCompat != null) {
                    return new C37040e(view, appCompatImageView, appCompatTextView, linearLayoutCompat);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37040e m151958b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_checkbox, viewGroup);
            return m151957a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92612a;
    }
}
