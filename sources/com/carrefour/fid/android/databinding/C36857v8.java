package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.airbnb.lottie.LottieAnimationView;
import com.carrefour.fid.android.R;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.v8 */
public final class C36857v8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91813a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f91814b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatImageView f91815c;
    @C0359n0

    /* renamed from: d */
    public final View f91816d;
    @C0359n0

    /* renamed from: e */
    public final Group f91817e;
    @C0359n0

    /* renamed from: f */
    public final LottieAnimationView f91818f;
    @C0359n0

    /* renamed from: g */
    public final ProgressBar f91819g;
    @C0359n0

    /* renamed from: h */
    public final TextView f91820h;
    @C0359n0

    /* renamed from: i */
    public final TextView f91821i;
    @C0359n0

    /* renamed from: j */
    public final AppCompatImageView f91822j;
    @C0359n0

    /* renamed from: k */
    public final TextView f91823k;
    @C0359n0

    /* renamed from: l */
    public final TextView f91824l;
    @C0359n0

    /* renamed from: m */
    public final MaterialButton f91825m;
    @C0359n0

    /* renamed from: n */
    public final TextView f91826n;

    public C36857v8(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 View view, @C0359n0 Group group, @C0359n0 LottieAnimationView lottieAnimationView, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 AppCompatImageView appCompatImageView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 MaterialButton materialButton2, @C0359n0 TextView textView5) {
        this.f91813a = constraintLayout;
        this.f91814b = materialButton;
        this.f91815c = appCompatImageView;
        this.f91816d = view;
        this.f91817e = group;
        this.f91818f = lottieAnimationView;
        this.f91819g = progressBar;
        this.f91820h = textView;
        this.f91821i = textView2;
        this.f91822j = appCompatImageView2;
        this.f91823k = textView3;
        this.f91824l = textView4;
        this.f91825m = materialButton2;
        this.f91826n = textView5;
    }

    @C0359n0
    /* renamed from: a */
    public static C36857v8 m151145a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.button_remote_config;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view2, R.id.button_remote_config);
        if (materialButton != null) {
            i = R.id.errorImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view2, R.id.errorImage);
            if (appCompatImageView != null) {
                i = R.id.gradient_view;
                View a = C20753c.m96463a(view2, R.id.gradient_view);
                if (a != null) {
                    i = R.id.group;
                    Group group = (Group) C20753c.m96463a(view2, R.id.group);
                    if (group != null) {
                        i = R.id.image_splash_logo;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) C20753c.m96463a(view2, R.id.image_splash_logo);
                        if (lottieAnimationView != null) {
                            i = R.id.progress_bar_remote_config;
                            ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view2, R.id.progress_bar_remote_config);
                            if (progressBar != null) {
                                i = R.id.splash_app_env;
                                TextView textView = (TextView) C20753c.m96463a(view2, R.id.splash_app_env);
                                if (textView != null) {
                                    i = R.id.splash_app_info;
                                    TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.splash_app_info);
                                    if (textView2 != null) {
                                        i = R.id.splash_image_view;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C20753c.m96463a(view2, R.id.splash_image_view);
                                        if (appCompatImageView2 != null) {
                                            i = R.id.splash_label_error_description;
                                            TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.splash_label_error_description);
                                            if (textView3 != null) {
                                                i = R.id.splash_label_error_message;
                                                TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.splash_label_error_message);
                                                if (textView4 != null) {
                                                    i = R.id.splash_retry;
                                                    MaterialButton materialButton2 = (MaterialButton) C20753c.m96463a(view2, R.id.splash_retry);
                                                    if (materialButton2 != null) {
                                                        i = R.id.welcome_text;
                                                        TextView textView5 = (TextView) C20753c.m96463a(view2, R.id.welcome_text);
                                                        if (textView5 != null) {
                                                            return new C36857v8((ConstraintLayout) view2, materialButton, appCompatImageView, a, group, lottieAnimationView, progressBar, textView, textView2, appCompatImageView2, textView3, textView4, materialButton2, textView5);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36857v8 m151146c(@C0359n0 LayoutInflater layoutInflater) {
        return m151147d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36857v8 m151147d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_splash_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151145a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91813a;
    }
}
