package com.contentsquare.android.sdk;

import android.app.Activity;
import android.webkit.WebView;
import com.contentsquare.android.sdk.C14439j3;

/* renamed from: com.contentsquare.android.sdk.a6 */
public class C14173a6 {

    /* renamed from: a */
    public final C14870xf f35045a;

    /* renamed from: b */
    public final C14326f6 f35046b;

    /* renamed from: c */
    public final C14265d3<C14439j3.C14440a> f35047c;

    public C14173a6(C14870xf xfVar, C14326f6 f6Var, C14265d3<C14439j3.C14440a> d3Var) {
        this.f35045a = xfVar;
        this.f35046b = f6Var;
        this.f35047c = d3Var;
    }

    /* renamed from: a */
    public void mo34495a(WebView webView) {
        if (webView.getSettings().getJavaScriptEnabled()) {
            webView.removeJavascriptInterface("CSJavascriptBridge");
        }
    }

    /* renamed from: b */
    public void mo34496b(WebView webView, Activity activity, C14688re reVar) {
        if (webView.getSettings().getJavaScriptEnabled()) {
            webView.addJavascriptInterface(new C14261d(webView, activity, reVar, this.f35045a, this.f35046b, this.f35047c, new C14772u7()), "CSJavascriptBridge");
        }
    }
}
