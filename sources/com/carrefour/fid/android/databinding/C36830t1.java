package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.t1 */
public final class C36830t1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91658a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f91659b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f91660c;
    @C0359n0

    /* renamed from: d */
    public final LinearLayout f91661d;
    @C0359n0

    /* renamed from: e */
    public final ProgressBar f91662e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91663f;
    @C0359n0

    /* renamed from: g */
    public final WebView f91664g;

    public C36830t1(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageButton imageButton, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView, @C0359n0 WebView webView) {
        this.f91658a = constraintLayout;
        this.f91659b = imageButton;
        this.f91660c = composeView;
        this.f91661d = linearLayout;
        this.f91662e = progressBar;
        this.f91663f = textView;
        this.f91664g = webView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36830t1 m151041a(@C0359n0 View view) {
        int i = R.id.cgv_go_to_bottom;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, R.id.cgv_go_to_bottom);
        if (imageButton != null) {
            i = R.id.checkout_step2_cvg_header;
            ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.checkout_step2_cvg_header);
            if (composeView != null) {
                i = R.id.checkout_step2_cvg_header_layout;
                LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.checkout_step2_cvg_header_layout);
                if (linearLayout != null) {
                    i = R.id.checkout_step3_cgv_progress_bar;
                    ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.checkout_step3_cgv_progress_bar);
                    if (progressBar != null) {
                        i = R.id.checkout_step3_cgv_title;
                        TextView textView = (TextView) C20753c.m96463a(view, R.id.checkout_step3_cgv_title);
                        if (textView != null) {
                            i = R.id.checkout_step3_cgvWebView;
                            WebView webView = (WebView) C20753c.m96463a(view, R.id.checkout_step3_cgvWebView);
                            if (webView != null) {
                                return new C36830t1((ConstraintLayout) view, imageButton, composeView, linearLayout, progressBar, textView, webView);
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
    public static C36830t1 m151042c(@C0359n0 LayoutInflater layoutInflater) {
        return m151043d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36830t1 m151043d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_step_two_cgv, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151041a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91658a;
    }
}
