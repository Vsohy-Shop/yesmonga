package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.k3 */
public final class C36742k3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91135a;
    @C0359n0

    /* renamed from: b */
    public final AppCompatButton f91136b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91137c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91138d;
    @C0359n0

    /* renamed from: e */
    public final ImageView f91139e;

    public C36742k3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 AppCompatButton appCompatButton, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 ImageView imageView) {
        this.f91135a = constraintLayout;
        this.f91136b = appCompatButton;
        this.f91137c = textView;
        this.f91138d = textView2;
        this.f91139e = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36742k3 m150695a(@C0359n0 View view) {
        int i = R.id.scan_bar_tuto_button;
        AppCompatButton appCompatButton = (AppCompatButton) C20753c.m96463a(view, R.id.scan_bar_tuto_button);
        if (appCompatButton != null) {
            i = R.id.scan_bar_tuto_text;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.scan_bar_tuto_text);
            if (textView != null) {
                i = R.id.scan_bar_tuto_text_position;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.scan_bar_tuto_text_position);
                if (textView2 != null) {
                    i = R.id.scan_empty_img;
                    ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.scan_empty_img);
                    if (imageView != null) {
                        return new C36742k3((ConstraintLayout) view, appCompatButton, textView, textView2, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36742k3 m150696c(@C0359n0 LayoutInflater layoutInflater) {
        return m150697d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36742k3 m150697d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_scan_error_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150695a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91135a;
    }
}
