package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.r6 */
public final class C36815r6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91583a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f91584b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91585c;

    public C36815r6(@C0359n0 LinearLayout linearLayout, @C0359n0 MaterialButton materialButton, @C0359n0 ImageView imageView) {
        this.f91583a = linearLayout;
        this.f91584b = materialButton;
        this.f91585c = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36815r6 m150983a(@C0359n0 View view) {
        int i = R.id.lucky_cart_button;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, R.id.lucky_cart_button);
        if (materialButton != null) {
            i = R.id.lucky_cart_image;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.lucky_cart_image);
            if (imageView != null) {
                return new C36815r6((LinearLayout) view, materialButton, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36815r6 m150984c(@C0359n0 LayoutInflater layoutInflater) {
        return m150985d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36815r6 m150985d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.lucky_cart_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150983a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91583a;
    }
}
