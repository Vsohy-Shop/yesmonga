package com.carrefour.fid.android.shared.presentation.p047ui.webview;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity$setupWebView$3 */
public final class WebViewActivity$setupWebView$3 extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ String f70723a;

    /* renamed from: b */
    public final /* synthetic */ String f70724b;

    /* renamed from: c */
    public final /* synthetic */ WebViewActivity f70725c;

    public WebViewActivity$setupWebView$3(String str, String str2, WebViewActivity webViewActivity) {
        this.f70723a = str;
        this.f70724b = str2;
        this.f70725c = webViewActivity;
    }

    @C12580l
    public WebResourceResponse shouldInterceptRequest(@C12580l WebView webView, @C12579k WebResourceRequest webResourceRequest) {
        Intrinsics.checkNotNullParameter(webResourceRequest, "request");
        webResourceRequest.getRequestHeaders().put(this.f70723a, this.f70724b);
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean shouldOverrideUrlLoading(@C12580l WebView webView, @C12580l WebResourceRequest webResourceRequest) {
        Uri url;
        String uri;
        boolean z = false;
        if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (uri = url.toString()) == null)) {
            String lowerCase = uri.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase != null) {
                String str = null;
                if (this.f70725c.mo83993k1(lowerCase)) {
                    if (this.f70725c.mo83989g1().mo84039i()) {
                        String substringAfter$default = StringsKt__StringsKt.substringAfter$default(lowerCase, WebViewActivity.f70715h1, (String) null, 2, (Object) null);
                        if (!C11622t.isBlank(substringAfter$default)) {
                            this.f70725c.mo83987e1().mo32774a(this.f70725c, substringAfter$default);
                        }
                    }
                    return true;
                }
                String host = Uri.parse(this.f70725c.mo83988f1().mo84181u()).getHost();
                try {
                    str = Uri.parse(lowerCase).getHost();
                } catch (Exception unused) {
                }
                if (str == null || C11622t.isBlank(str)) {
                    z = true;
                }
                if (z) {
                    return true;
                }
                if (!Intrinsics.areEqual((Object) str, (Object) host)) {
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
                WebViewActivity webViewActivity = this.f70725c;
                ActivityKt.m118706p(webViewActivity, (String) null, (String) null, new WebViewActivity$setupWebView$3$shouldOverrideUrlLoading$1(webViewActivity, lowerCase), 3, (Object) null);
                return true;
            }
        }
        return false;
    }
}
