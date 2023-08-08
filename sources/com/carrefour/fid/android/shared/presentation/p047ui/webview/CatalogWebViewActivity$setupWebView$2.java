package com.carrefour.fid.android.shared.presentation.p047ui.webview;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.CatalogWebViewActivity$setupWebView$2 */
public final class CatalogWebViewActivity$setupWebView$2 extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ CatalogWebViewActivity f70709a;

    public CatalogWebViewActivity$setupWebView$2(CatalogWebViewActivity catalogWebViewActivity) {
        this.f70709a = catalogWebViewActivity;
    }

    public boolean shouldOverrideUrlLoading(@C12580l WebView webView, @C12580l WebResourceRequest webResourceRequest) {
        Uri url;
        String uri;
        Uri uri2;
        boolean z;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (uri = url.toString()) == null) {
            return false;
        }
        String lowerCase = uri.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (lowerCase == null) {
            return false;
        }
        try {
            uri2 = Uri.parse(lowerCase);
        } catch (Exception unused) {
            uri2 = null;
        }
        String host = Uri.parse(this.f70709a.mo83979c1().mo84043m()).getHost();
        if (uri2 != null) {
            String host2 = uri2.getHost();
            if (host2 == null || C11622t.isBlank(host2)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.f70709a.mo83981e1(uri2)) {
                    this.f70709a.finish();
                    return false;
                } else if (Intrinsics.areEqual((Object) uri2.getHost(), (Object) host)) {
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                } else {
                    CatalogWebViewActivity catalogWebViewActivity = this.f70709a;
                    ActivityKt.m118706p(catalogWebViewActivity, (String) null, (String) null, new CatalogWebViewActivity$setupWebView$2$shouldOverrideUrlLoading$1(catalogWebViewActivity, lowerCase), 3, (Object) null);
                }
            }
        }
        return true;
    }
}
