package com.carrefour.fid.android.various.databinding;

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
import com.carrefour.fid.android.various.C22729b;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.various.databinding.a */
public final class C22773a implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f58319a;
    @C0359n0

    /* renamed from: b */
    public final TextView f58320b;
    @C0359n0

    /* renamed from: c */
    public final TextView f58321c;
    @C0359n0

    /* renamed from: d */
    public final MaterialButton f58322d;
    @C0359n0

    /* renamed from: e */
    public final AppCompatImageView f58323e;
    @C0359n0

    /* renamed from: f */
    public final MaterialButton f58324f;

    public C22773a(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 MaterialButton materialButton, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 MaterialButton materialButton2) {
        this.f58319a = constraintLayout;
        this.f58320b = textView;
        this.f58321c = textView2;
        this.f58322d = materialButton;
        this.f58323e = appCompatImageView;
        this.f58324f = materialButton2;
    }

    @C0359n0
    /* renamed from: a */
    public static C22773a m102984a(@C0359n0 View view) {
        int i = C22729b.C22739j.app_message_content_text_view;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C22729b.C22739j.app_message_title_text_view;
            TextView textView2 = (TextView) C20753c.m96463a(view, i);
            if (textView2 != null) {
                i = C22729b.C22739j.apply_app_message_action_button;
                MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, i);
                if (materialButton != null) {
                    i = C22729b.C22739j.carrefour_logo_image;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, i);
                    if (appCompatImageView != null) {
                        i = C22729b.C22739j.ignore_app_message_action_button;
                        MaterialButton materialButton2 = (MaterialButton) C20753c.m96463a(view, i);
                        if (materialButton2 != null) {
                            return new C22773a((ConstraintLayout) view, textView, textView2, materialButton, appCompatImageView, materialButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C22773a m102985c(@C0359n0 LayoutInflater layoutInflater) {
        return m102986d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C22773a m102986d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C22729b.C22742m.fragment_app_message, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m102984a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f58319a;
    }
}
