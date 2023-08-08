package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep3CgvFragment$handlerWebViewClient$1 */
public final class CheckoutStep3CgvFragment$handlerWebViewClient$1 extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ CheckoutStep3CgvFragment f59019a;

    public CheckoutStep3CgvFragment$handlerWebViewClient$1(CheckoutStep3CgvFragment checkoutStep3CgvFragment) {
        this.f59019a = checkoutStep3CgvFragment;
    }

    public boolean shouldOverrideUrlLoading(@C12580l WebView webView, @C12580l WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            return false;
        }
        CheckoutStep3CgvFragment checkoutStep3CgvFragment = this.f59019a;
        FragmentKt.m118829q(checkoutStep3CgvFragment, (String) null, (String) null, new C23302x3270dc00(checkoutStep3CgvFragment, url), 3, (Object) null);
        return true;
    }
}
