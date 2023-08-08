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

/* renamed from: com.carrefour.fid.android.databinding.j3 */
public final class C36732j3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91062a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91063b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatButton f91064c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91065d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91066e;

    public C36732j3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 AppCompatButton appCompatButton, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91062a = constraintLayout;
        this.f91063b = imageView;
        this.f91064c = appCompatButton;
        this.f91065d = textView;
        this.f91066e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36732j3 m150655a(@C0359n0 View view) {
        int i = R.id.scan;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.scan);
        if (imageView != null) {
            i = R.id.scan_bar_tuto_button;
            AppCompatButton appCompatButton = (AppCompatButton) C20753c.m96463a(view, R.id.scan_bar_tuto_button);
            if (appCompatButton != null) {
                i = R.id.scan_bar_tuto_text;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.scan_bar_tuto_text);
                if (textView != null) {
                    i = R.id.scan_bar_tuto_text_position;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.scan_bar_tuto_text_position);
                    if (textView2 != null) {
                        return new C36732j3((ConstraintLayout) view, imageView, appCompatButton, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36732j3 m150656c(@C0359n0 LayoutInflater layoutInflater) {
        return m150657d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36732j3 m150657d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_scan_bar_tuto, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150655a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91062a;
    }
}
