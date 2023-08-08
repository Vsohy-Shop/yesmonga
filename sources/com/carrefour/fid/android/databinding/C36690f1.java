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

/* renamed from: com.carrefour.fid.android.databinding.f1 */
public final class C36690f1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90790a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f90791b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f90792c;
    @C0359n0

    /* renamed from: d */
    public final LinearLayout f90793d;
    @C0359n0

    /* renamed from: e */
    public final ProgressBar f90794e;
    @C0359n0

    /* renamed from: f */
    public final TextView f90795f;
    @C0359n0

    /* renamed from: g */
    public final WebView f90796g;

    public C36690f1(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageButton imageButton, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView, @C0359n0 WebView webView) {
        this.f90790a = constraintLayout;
        this.f90791b = imageButton;
        this.f90792c = composeView;
        this.f90793d = linearLayout;
        this.f90794e = progressBar;
        this.f90795f = textView;
        this.f90796g = webView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36690f1 m150487a(@C0359n0 View view) {
        int i = R.id.cgv_go_to_bottom;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, R.id.cgv_go_to_bottom);
        if (imageButton != null) {
            i = R.id.checkout_step3_cgv_header;
            ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.checkout_step3_cgv_header);
            if (composeView != null) {
                i = R.id.checkout_step3_cgv_header_layout;
                LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.checkout_step3_cgv_header_layout);
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
                                return new C36690f1((ConstraintLayout) view, imageButton, composeView, linearLayout, progressBar, textView, webView);
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
    public static C36690f1 m150488c(@C0359n0 LayoutInflater layoutInflater) {
        return m150489d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36690f1 m150489d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_cgv, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150487a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90790a;
    }
}
