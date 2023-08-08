package com.carrefour.fid.android.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.shared.C28444b;

/* renamed from: com.carrefour.fid.android.shared.databinding.d */
public final class C28653d implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f70259a;
    @C0359n0

    /* renamed from: b */
    public final WebView f70260b;
    @C0359n0

    /* renamed from: c */
    public final ProgressBar f70261c;

    public C28653d(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 WebView webView, @C0359n0 ProgressBar progressBar) {
        this.f70259a = constraintLayout;
        this.f70260b = webView;
        this.f70261c = progressBar;
    }

    @C0359n0
    /* renamed from: a */
    public static C28653d m118632a(@C0359n0 View view) {
        int i = C28444b.C28454j.webView;
        WebView webView = (WebView) C20753c.m96463a(view, i);
        if (webView != null) {
            i = C28444b.C28454j.webViewProgress;
            ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, i);
            if (progressBar != null) {
                return new C28653d((ConstraintLayout) view, webView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C28653d m118633c(@C0359n0 LayoutInflater layoutInflater) {
        return m118634d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C28653d m118634d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28444b.C28457m.catalog_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m118632a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f70259a;
    }
}
