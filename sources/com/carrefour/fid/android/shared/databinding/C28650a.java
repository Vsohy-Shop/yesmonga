package com.carrefour.fid.android.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.shared.C28444b;

/* renamed from: com.carrefour.fid.android.shared.databinding.a */
public final class C28650a implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f70248a;
    @C0359n0

    /* renamed from: b */
    public final WebView f70249b;
    @C0359n0

    /* renamed from: c */
    public final ProgressBar f70250c;
    @C0359n0

    /* renamed from: d */
    public final ComposeView f70251d;
    @C0359n0

    /* renamed from: e */
    public final LinearLayout f70252e;

    public C28650a(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 WebView webView, @C0359n0 ProgressBar progressBar, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout) {
        this.f70248a = constraintLayout;
        this.f70249b = webView;
        this.f70250c = progressBar;
        this.f70251d = composeView;
        this.f70252e = linearLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C28650a m118620a(@C0359n0 View view) {
        int i = C28444b.C28454j.webView;
        WebView webView = (WebView) C20753c.m96463a(view, i);
        if (webView != null) {
            i = C28444b.C28454j.webViewProgress;
            ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, i);
            if (progressBar != null) {
                i = C28444b.C28454j.webview_header;
                ComposeView composeView = (ComposeView) C20753c.m96463a(view, i);
                if (composeView != null) {
                    i = C28444b.C28454j.webview_header_layout;
                    LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, i);
                    if (linearLayout != null) {
                        return new C28650a((ConstraintLayout) view, webView, progressBar, composeView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C28650a m118621c(@C0359n0 LayoutInflater layoutInflater) {
        return m118622d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C28650a m118622d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28444b.C28457m.activity_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m118620a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f70248a;
    }
}
