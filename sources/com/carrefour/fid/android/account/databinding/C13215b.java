package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.account.C13144b;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.carrefour.fid.android.account.databinding.b */
public final class C13215b implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final NestedScrollView f32394a;
    @C0359n0

    /* renamed from: b */
    public final View f32395b;
    @C0359n0

    /* renamed from: c */
    public final EditText f32396c;
    @C0359n0

    /* renamed from: d */
    public final TextView f32397d;
    @C0359n0

    /* renamed from: e */
    public final Button f32398e;
    @C0359n0

    /* renamed from: f */
    public final ConstraintLayout f32399f;
    @C0359n0

    /* renamed from: g */
    public final Guideline f32400g;
    @C0359n0

    /* renamed from: h */
    public final Guideline f32401h;
    @C0359n0

    /* renamed from: i */
    public final TextInputLayout f32402i;
    @C0359n0

    /* renamed from: j */
    public final ProgressBar f32403j;
    @C0359n0

    /* renamed from: k */
    public final TextView f32404k;

    public C13215b(@C0359n0 NestedScrollView nestedScrollView, @C0359n0 View view, @C0359n0 EditText editText, @C0359n0 TextView textView, @C0359n0 Button button, @C0359n0 ConstraintLayout constraintLayout, @C0359n0 Guideline guideline, @C0359n0 Guideline guideline2, @C0359n0 TextInputLayout textInputLayout, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView2) {
        this.f32394a = nestedScrollView;
        this.f32395b = view;
        this.f32396c = editText;
        this.f32397d = textView;
        this.f32398e = button;
        this.f32399f = constraintLayout;
        this.f32400g = guideline;
        this.f32401h = guideline2;
        this.f32402i = textInputLayout;
        this.f32403j = progressBar;
        this.f32404k = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C13215b m57267a(@C0359n0 View view) {
        int i = C13144b.C13154j.divider_view_1;
        View a = C20753c.m96463a(view, i);
        if (a != null) {
            i = C13144b.C13154j.edit_forgot_password_email;
            EditText editText = (EditText) C20753c.m96463a(view, i);
            if (editText != null) {
                i = C13144b.C13154j.email_forgot_password_error_txt;
                TextView textView = (TextView) C20753c.m96463a(view, i);
                if (textView != null) {
                    i = C13144b.C13154j.forgot_password_send_button;
                    Button button = (Button) C20753c.m96463a(view, i);
                    if (button != null) {
                        i = C13144b.C13154j.forgot_password_view;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C20753c.m96463a(view, i);
                        if (constraintLayout != null) {
                            i = C13144b.C13154j.guide_line_left;
                            Guideline guideline = (Guideline) C20753c.m96463a(view, i);
                            if (guideline != null) {
                                i = C13144b.C13154j.guide_line_right;
                                Guideline guideline2 = (Guideline) C20753c.m96463a(view, i);
                                if (guideline2 != null) {
                                    i = C13144b.C13154j.input_forgot_password_email;
                                    TextInputLayout textInputLayout = (TextInputLayout) C20753c.m96463a(view, i);
                                    if (textInputLayout != null) {
                                        i = C13144b.C13154j.progress_bar;
                                        ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, i);
                                        if (progressBar != null) {
                                            i = C13144b.C13154j.sub_title_txt;
                                            TextView textView2 = (TextView) C20753c.m96463a(view, i);
                                            if (textView2 != null) {
                                                return new C13215b((NestedScrollView) view, a, editText, textView, button, constraintLayout, guideline, guideline2, textInputLayout, progressBar, textView2);
                                            }
                                        }
                                    }
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
    public static C13215b m57268c(@C0359n0 LayoutInflater layoutInflater) {
        return m57269d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13215b m57269d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.forgot_password_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57267a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public NestedScrollView getRoot() {
        return this.f32394a;
    }
}
