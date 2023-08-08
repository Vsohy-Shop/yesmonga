package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.i0 */
public final class C36719i0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f90992a;
    @C0359n0

    /* renamed from: b */
    public final WebView f90993b;

    public C36719i0(@C0359n0 FrameLayout frameLayout, @C0359n0 WebView webView) {
        this.f90992a = frameLayout;
        this.f90993b = webView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36719i0 m150603a(@C0359n0 View view) {
        WebView webView = (WebView) C20753c.m96463a(view, R.id.webview_payline);
        if (webView != null) {
            return new C36719i0((FrameLayout) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.webview_payline)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36719i0 m150604c(@C0359n0 LayoutInflater layoutInflater) {
        return m150605d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36719i0 m150605d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_additional_order_checkout_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150603a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f90992a;
    }
}
