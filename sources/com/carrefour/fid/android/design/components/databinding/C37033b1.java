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

/* renamed from: com.carrefour.fid.android.design.components.databinding.b1 */
public final class C37033b1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92575a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92576b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatImageView f92577c;
    @C0359n0

    /* renamed from: d */
    public final TextView f92578d;
    @C0359n0

    /* renamed from: e */
    public final AppCompatImageView f92579e;

    public C37033b1(@C0359n0 View view, @C0359n0 TextView textView, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 TextView textView2, @C0359n0 AppCompatImageView appCompatImageView2) {
        this.f92575a = view;
        this.f92576b = textView;
        this.f92577c = appCompatImageView;
        this.f92578d = textView2;
        this.f92579e = appCompatImageView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37033b1 m151939a(@C0359n0 View view) {
        int i = C36896b.C36906j.standard_picker_description;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C36896b.C36906j.standard_picker_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, i);
            if (appCompatImageView != null) {
                i = C36896b.C36906j.standard_picker_label;
                TextView textView2 = (TextView) C20753c.m96463a(view, i);
                if (textView2 != null) {
                    i = C36896b.C36906j.standard_sticker_icon;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) C20753c.m96463a(view, i);
                    if (appCompatImageView2 != null) {
                        return new C37033b1(view, textView, appCompatImageView, textView2, appCompatImageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37033b1 m151940b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_standard_picker, viewGroup);
            return m151939a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92575a;
    }
}
