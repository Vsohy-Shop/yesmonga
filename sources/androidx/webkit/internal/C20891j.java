package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

@C0376v0(26)
/* renamed from: androidx.webkit.internal.j */
public class C20891j {
    @C0359n0
    @C0373u
    /* renamed from: a */
    public static PackageInfo m96877a() {
        return WebView.getCurrentWebViewPackage();
    }

    @C0373u
    /* renamed from: b */
    public static boolean m96878b(@C0359n0 WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    @C0363p0
    @C0373u
    /* renamed from: c */
    public static WebChromeClient m96879c(@C0359n0 WebView webView) {
        return webView.getWebChromeClient();
    }

    @C0363p0
    @C0373u
    /* renamed from: d */
    public static WebViewClient m96880d(@C0359n0 WebView webView) {
        return webView.getWebViewClient();
    }

    @C0373u
    /* renamed from: e */
    public static void m96881e(@C0359n0 WebSettings webSettings, boolean z) {
        webSettings.setSafeBrowsingEnabled(z);
    }
}
