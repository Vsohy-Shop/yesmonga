package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.c6 */
public final class C36665c6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90676a;
    @C0359n0

    /* renamed from: b */
    public final Button f90677b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f90678c;
    @C0359n0

    /* renamed from: d */
    public final TextView f90679d;
    @C0359n0

    /* renamed from: e */
    public final ProgressBar f90680e;
    @C0359n0

    /* renamed from: f */
    public final EditText f90681f;
    @C0359n0

    /* renamed from: g */
    public final TextView f90682g;
    @C0359n0

    /* renamed from: h */
    public final TextView f90683h;

    public C36665c6(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 ProgressBar progressBar, @C0359n0 EditText editText, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f90676a = constraintLayout;
        this.f90677b = button;
        this.f90678c = imageView;
        this.f90679d = textView;
        this.f90680e = progressBar;
        this.f90681f = editText;
        this.f90682g = textView2;
        this.f90683h = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36665c6 m150389a(@C0359n0 View view) {
        int i = R.id.add_promo_code_button;
        Button button = (Button) C20753c.m96463a(view, R.id.add_promo_code_button);
        if (button != null) {
            i = R.id.checkout_promo_code_image;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.checkout_promo_code_image);
            if (imageView != null) {
                i = R.id.code_promo_title;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.code_promo_title);
                if (textView != null) {
                    i = R.id.progressBar_add_promo;
                    ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.progressBar_add_promo);
                    if (progressBar != null) {
                        i = R.id.promo_code_edit_text;
                        EditText editText = (EditText) C20753c.m96463a(view, R.id.promo_code_edit_text);
                        if (editText != null) {
                            i = R.id.promo_code_error_text;
                            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.promo_code_error_text);
                            if (textView2 != null) {
                                i = R.id.promo_code_success_text;
                                TextView textView3 = (TextView) C20753c.m96463a(view, R.id.promo_code_success_text);
                                if (textView3 != null) {
                                    return new C36665c6((ConstraintLayout) view, button, imageView, textView, progressBar, editText, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36665c6 m150390c(@C0359n0 LayoutInflater layoutInflater) {
        return m150391d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36665c6 m150391d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_add_promo_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150389a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90676a;
    }
}
