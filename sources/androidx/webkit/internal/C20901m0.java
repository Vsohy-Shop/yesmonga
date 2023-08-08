package androidx.webkit.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.webkit.C20984w;
import java.util.concurrent.Executor;

@C0376v0(29)
/* renamed from: androidx.webkit.internal.m0 */
public class C20901m0 {
    @Deprecated
    @C0373u
    /* renamed from: a */
    public static int m96904a(@C0359n0 WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    @C0363p0
    @C0373u
    /* renamed from: b */
    public static WebViewRenderProcess m96905b(@C0359n0 WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    @C0363p0
    @C0373u
    /* renamed from: c */
    public static WebViewRenderProcessClient m96906c(@C0359n0 WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    @C0373u
    /* renamed from: d */
    public static void m96907d(@C0359n0 WebSettings webSettings, int i) {
        webSettings.setForceDark(i);
    }

    @C0373u
    /* renamed from: e */
    public static void m96908e(@C0359n0 WebView webView, @C0363p0 C20984w wVar) {
        C20931u1 u1Var;
        if (wVar != null) {
            u1Var = new C20931u1(wVar);
        } else {
            u1Var = null;
        }
        webView.setWebViewRenderProcessClient(u1Var);
    }

    @C0373u
    /* renamed from: f */
    public static void m96909f(@C0359n0 WebView webView, @C0359n0 Executor executor, @C0363p0 C20984w wVar) {
        C20931u1 u1Var;
        if (wVar != null) {
            u1Var = new C20931u1(wVar);
        } else {
            u1Var = null;
        }
        webView.setWebViewRenderProcessClient(executor, u1Var);
    }

    @C0373u
    /* renamed from: g */
    public static boolean m96910g(@C0359n0 WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
}
