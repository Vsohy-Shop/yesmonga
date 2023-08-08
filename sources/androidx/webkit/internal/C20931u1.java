package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.webkit.C20984w;

@C0376v0(29)
/* renamed from: androidx.webkit.internal.u1 */
public class C20931u1 extends WebViewRenderProcessClient {

    /* renamed from: a */
    public C20984w f54025a;

    public C20931u1(@C0359n0 C20984w wVar) {
        this.f54025a = wVar;
    }

    @C0363p0
    /* renamed from: a */
    public C20984w mo62697a() {
        return this.f54025a;
    }

    public void onRenderProcessResponsive(@C0359n0 WebView webView, @C0363p0 WebViewRenderProcess webViewRenderProcess) {
        this.f54025a.mo62741a(webView, C20938w1.m96997b(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(@C0359n0 WebView webView, @C0363p0 WebViewRenderProcess webViewRenderProcess) {
        this.f54025a.mo62742b(webView, C20938w1.m96997b(webViewRenderProcess));
    }
}
