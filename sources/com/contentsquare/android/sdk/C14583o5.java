package com.contentsquare.android.sdk;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* renamed from: com.contentsquare.android.sdk.o5 */
public abstract class C14583o5 implements C14680ra {

    /* renamed from: a */
    public final WeakReference<WebView> f36069a;

    public C14583o5(WebView webView) {
        this.f36069a = new WeakReference<>(webView);
    }

    /* renamed from: a */
    public WebView mo36042a() {
        return this.f36069a.get();
    }
}
