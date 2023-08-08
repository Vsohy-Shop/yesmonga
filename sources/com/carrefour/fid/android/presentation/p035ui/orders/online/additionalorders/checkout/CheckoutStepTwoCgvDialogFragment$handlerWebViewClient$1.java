package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepTwoCgvDialogFragment$handlerWebViewClient$1 */
public final class CheckoutStepTwoCgvDialogFragment$handlerWebViewClient$1 extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ CheckoutStepTwoCgvDialogFragment f61901a;

    public CheckoutStepTwoCgvDialogFragment$handlerWebViewClient$1(CheckoutStepTwoCgvDialogFragment checkoutStepTwoCgvDialogFragment) {
        this.f61901a = checkoutStepTwoCgvDialogFragment;
    }

    public boolean shouldOverrideUrlLoading(@C12580l WebView webView, @C12580l WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            return false;
        }
        CheckoutStepTwoCgvDialogFragment checkoutStepTwoCgvDialogFragment = this.f61901a;
        FragmentKt.m118829q(checkoutStepTwoCgvDialogFragment, (String) null, (String) null, new C25105xe5b75cf(checkoutStepTwoCgvDialogFragment, url), 3, (Object) null);
        return true;
    }
}
