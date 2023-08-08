package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.c1 */
public final class C37036c1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92586a;
    @C0359n0

    /* renamed from: b */
    public final ProgressBar f92587b;
    @C0359n0

    /* renamed from: c */
    public final ProgressBar f92588c;
    @C0359n0

    /* renamed from: d */
    public final AppCompatImageView f92589d;
    @C0359n0

    /* renamed from: e */
    public final AppCompatTextView f92590e;
    @C0359n0

    /* renamed from: f */
    public final AppCompatTextView f92591f;
    @C0359n0

    /* renamed from: g */
    public final AppCompatImageView f92592g;
    @C0359n0

    /* renamed from: h */
    public final AppCompatTextView f92593h;

    public C37036c1(@C0359n0 View view, @C0359n0 ProgressBar progressBar, @C0359n0 ProgressBar progressBar2, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 AppCompatTextView appCompatTextView, @C0359n0 AppCompatTextView appCompatTextView2, @C0359n0 AppCompatImageView appCompatImageView2, @C0359n0 AppCompatTextView appCompatTextView3) {
        this.f92586a = view;
        this.f92587b = progressBar;
        this.f92588c = progressBar2;
        this.f92589d = appCompatImageView;
        this.f92590e = appCompatTextView;
        this.f92591f = appCompatTextView2;
        this.f92592g = appCompatImageView2;
        this.f92593h = appCompatTextView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C37036c1 m151949a(@C0359n0 View view) {
        int i = C36896b.C36906j.first_step_progress;
        ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, i);
        if (progressBar != null) {
            i = C36896b.C36906j.second_step_progress;
            ProgressBar progressBar2 = (ProgressBar) C20753c.m96463a(view, i);
            if (progressBar2 != null) {
                i = C36896b.C36906j.validate_step_one_image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, i);
                if (appCompatImageView != null) {
                    i = C36896b.C36906j.validate_step_one_text;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, i);
                    if (appCompatTextView != null) {
                        i = C36896b.C36906j.validate_step_three_text;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C20753c.m96463a(view, i);
                        if (appCompatTextView2 != null) {
                            i = C36896b.C36906j.validate_step_two_image;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C20753c.m96463a(view, i);
                            if (appCompatImageView2 != null) {
                                i = C36896b.C36906j.validate_step_two_text;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C20753c.m96463a(view, i);
                                if (appCompatTextView3 != null) {
                                    return new C37036c1(view, progressBar, progressBar2, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatImageView2, appCompatTextView3);
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
    /* renamed from: b */
    public static C37036c1 m151950b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_step_view, viewGroup);
            return m151949a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92586a;
    }
}
