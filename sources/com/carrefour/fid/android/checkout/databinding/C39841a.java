package com.carrefour.fid.android.checkout.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.checkout.C39805b;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.checkout.databinding.a */
public final class C39841a implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f101608a;
    @C0359n0

    /* renamed from: b */
    public final ShimmerFrameLayout f101609b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f101610c;
    @C0359n0

    /* renamed from: d */
    public final LinearLayout f101611d;
    @C0359n0

    /* renamed from: e */
    public final WebView f101612e;

    public C39841a(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 WebView webView) {
        this.f101608a = constraintLayout;
        this.f101609b = shimmerFrameLayout;
        this.f101610c = composeView;
        this.f101611d = linearLayout;
        this.f101612e = webView;
    }

    @C0359n0
    /* renamed from: a */
    public static C39841a m162429a(@C0359n0 View view) {
        int i = C39805b.C39815j.loading_layout;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, i);
        if (shimmerFrameLayout != null) {
            i = C39805b.C39815j.payment_method_header;
            ComposeView composeView = (ComposeView) C20753c.m96463a(view, i);
            if (composeView != null) {
                i = C39805b.C39815j.payment_method_header_layout;
                LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, i);
                if (linearLayout != null) {
                    i = C39805b.C39815j.webview_payline;
                    WebView webView = (WebView) C20753c.m96463a(view, i);
                    if (webView != null) {
                        return new C39841a((ConstraintLayout) view, shimmerFrameLayout, composeView, linearLayout, webView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39841a m162430c(@C0359n0 LayoutInflater layoutInflater) {
        return m162431d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39841a m162431d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39805b.C39818m.fragment_payment_method, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m162429a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f101608a;
    }
}
