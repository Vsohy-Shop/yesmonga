package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.m */
public final class C36758m implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final WebView f91231a;
    @C0359n0

    /* renamed from: b */
    public final WebView f91232b;

    public C36758m(@C0359n0 WebView webView, @C0359n0 WebView webView2) {
        this.f91231a = webView;
        this.f91232b = webView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36758m m150759a(@C0359n0 View view) {
        if (view != null) {
            WebView webView = (WebView) view;
            return new C36758m(webView, webView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36758m m150760c(@C0359n0 LayoutInflater layoutInflater) {
        return m150761d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36758m m150761d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cookies_tracers_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150759a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public WebView getRoot() {
        return this.f91231a;
    }
}
