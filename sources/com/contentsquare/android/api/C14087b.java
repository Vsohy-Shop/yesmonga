package com.contentsquare.android.api;

import android.webkit.WebView;
import com.contentsquare.android.sdk.C14188ad;
import com.contentsquare.android.sdk.C14217b9;
import com.contentsquare.android.sdk.C14453jf;
import com.contentsquare.android.sdk.C14490l1;
import com.contentsquare.android.sdk.C14600oe;

/* renamed from: com.contentsquare.android.api.b */
public class C14087b {
    /* renamed from: a */
    public static void m60606a(WebView webView) {
        if (C14217b9.m61032b()) {
            C14600oe.m62882k().mo36116j().mo35543b(new C14490l1(webView));
            C14453jf.m62245h("WebView detected and WebView tracking enabled on native side");
        }
    }

    /* renamed from: b */
    public static void m60607b(WebView webView) {
        if (C14217b9.m61032b()) {
            C14600oe.m62882k().mo36116j().mo35543b(new C14188ad(webView));
        }
    }
}
