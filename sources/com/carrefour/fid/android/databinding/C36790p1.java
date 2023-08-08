package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.p1 */
public final class C36790p1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91473a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f91474b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f91475c;
    @C0359n0

    /* renamed from: d */
    public final ComposeView f91476d;
    @C0359n0

    /* renamed from: e */
    public final LinearLayout f91477e;
    @C0359n0

    /* renamed from: f */
    public final WebView f91478f;

    public C36790p1(@C0359n0 LinearLayout linearLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout2, @C0359n0 ComposeView composeView2, @C0359n0 LinearLayout linearLayout3, @C0359n0 WebView webView) {
        this.f91473a = linearLayout;
        this.f91474b = composeView;
        this.f91475c = linearLayout2;
        this.f91476d = composeView2;
        this.f91477e = linearLayout3;
        this.f91478f = webView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36790p1 m150887a(@C0359n0 View view) {
        int i = R.id.checkout_step4_header;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.checkout_step4_header);
        if (composeView != null) {
            i = R.id.checkout_step4_header_layout;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.checkout_step4_header_layout);
            if (linearLayout != null) {
                i = R.id.express_pickup_banner;
                ComposeView composeView2 = (ComposeView) C20753c.m96463a(view, R.id.express_pickup_banner);
                if (composeView2 != null) {
                    i = R.id.loader_confirm_payment;
                    LinearLayout linearLayout2 = (LinearLayout) C20753c.m96463a(view, R.id.loader_confirm_payment);
                    if (linearLayout2 != null) {
                        i = R.id.webview_payline;
                        WebView webView = (WebView) C20753c.m96463a(view, R.id.webview_payline);
                        if (webView != null) {
                            return new C36790p1((LinearLayout) view, composeView, linearLayout, composeView2, linearLayout2, webView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36790p1 m150888c(@C0359n0 LayoutInflater layoutInflater) {
        return m150889d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36790p1 m150889d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_step_4, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150887a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91473a;
    }
}
