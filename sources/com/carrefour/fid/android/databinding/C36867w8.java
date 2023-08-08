package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.w8 */
public final class C36867w8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91873a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f91874b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f91875c;
    @C0359n0

    /* renamed from: d */
    public final ProgressBar f91876d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91877e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91878f;

    public C36867w8(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 ComposeView composeView, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91873a = constraintLayout;
        this.f91874b = materialButton;
        this.f91875c = composeView;
        this.f91876d = progressBar;
        this.f91877e = textView;
        this.f91878f = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36867w8 m151183a(@C0359n0 View view) {
        int i = R.id.button_remote_config;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, R.id.button_remote_config);
        if (materialButton != null) {
            i = R.id.compose_view;
            ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.compose_view);
            if (composeView != null) {
                i = R.id.progress_bar_remote_config;
                ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.progress_bar_remote_config);
                if (progressBar != null) {
                    i = R.id.splash_app_env;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.splash_app_env);
                    if (textView != null) {
                        i = R.id.splash_app_info;
                        TextView textView2 = (TextView) C20753c.m96463a(view, R.id.splash_app_info);
                        if (textView2 != null) {
                            return new C36867w8((ConstraintLayout) view, materialButton, composeView, progressBar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36867w8 m151184c(@C0359n0 LayoutInflater layoutInflater) {
        return m151185d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36867w8 m151185d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_splash_jo_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151183a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91873a;
    }
}
