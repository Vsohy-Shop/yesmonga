package androidx.webkit;

import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.C0341g1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.C20863b;
import androidx.webkit.internal.C20899l1;
import androidx.webkit.internal.C20908o1;
import androidx.webkit.internal.C20941x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {

    /* renamed from: a */
    public static final String[] f53899a = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.webkit.WebViewClientCompat$a */
    public @interface C20837a {
    }

    @C0341g1
    @C0376v0(21)
    /* renamed from: a */
    public void mo62568a(@C0359n0 WebView webView, @C0359n0 WebResourceRequest webResourceRequest, @C0359n0 C20963p pVar) {
        if (C20980u.m97120a("WEB_RESOURCE_ERROR_GET_CODE") && C20980u.m97120a("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && C20863b.m96799b(webResourceRequest)) {
            onReceivedError(webView, pVar.mo62647b(), pVar.mo62646a().toString(), C20863b.m96798a(webResourceRequest).toString());
        }
    }

    @C0341g1
    /* renamed from: b */
    public void mo62569b(@C0359n0 WebView webView, @C0359n0 WebResourceRequest webResourceRequest, int i, @C0359n0 C20848g gVar) {
        if (C20980u.m97120a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            gVar.mo62603c(true);
            return;
        }
        throw C20908o1.m96934a();
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String[] getSupportedFeatures() {
        return f53899a;
    }

    @C0341g1
    public void onPageCommitVisible(@C0359n0 WebView webView, @C0359n0 String str) {
    }

    @C0376v0(21)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void onReceivedError(@C0359n0 WebView webView, @C0359n0 WebResourceRequest webResourceRequest, @C0359n0 InvocationHandler invocationHandler) {
        mo62568a(webView, webResourceRequest, new C20899l1(invocationHandler));
    }

    @C0341g1
    public void onReceivedHttpError(@C0359n0 WebView webView, @C0359n0 WebResourceRequest webResourceRequest, @C0359n0 WebResourceResponse webResourceResponse) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void onSafeBrowsingHit(@C0359n0 WebView webView, @C0359n0 WebResourceRequest webResourceRequest, int i, @C0359n0 InvocationHandler invocationHandler) {
        mo62569b(webView, webResourceRequest, i, new C20941x0(invocationHandler));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean onWebAuthnIntent(@C0359n0 WebView webView, @C0359n0 PendingIntent pendingIntent, @C0359n0 InvocationHandler invocationHandler) {
        return false;
    }

    @C0341g1
    @C0376v0(21)
    public boolean shouldOverrideUrlLoading(@C0359n0 WebView webView, @C0359n0 WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, C20863b.m96798a(webResourceRequest).toString());
    }

    @C0376v0(23)
    public final void onReceivedError(@C0359n0 WebView webView, @C0359n0 WebResourceRequest webResourceRequest, @C0359n0 WebResourceError webResourceError) {
        mo62568a(webView, webResourceRequest, new C20899l1(webResourceError));
    }

    @C0376v0(27)
    public final void onSafeBrowsingHit(@C0359n0 WebView webView, @C0359n0 WebResourceRequest webResourceRequest, int i, @C0359n0 SafeBrowsingResponse safeBrowsingResponse) {
        mo62569b(webView, webResourceRequest, i, new C20941x0(safeBrowsingResponse));
    }
}
