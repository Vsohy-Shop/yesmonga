package androidx.webkit.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.webkit.C20959n;
import androidx.webkit.C20961o;
import androidx.webkit.C20977t;

@C0376v0(23)
/* renamed from: androidx.webkit.internal.c */
public class C20866c {

    /* renamed from: androidx.webkit.internal.c$a */
    public class C20867a extends WebMessagePort.WebMessageCallback {

        /* renamed from: a */
        public final /* synthetic */ C20961o.C20962a f53925a;

        public C20867a(C20961o.C20962a aVar) {
            this.f53925a = aVar;
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f53925a.mo62729a(new C20896k1(webMessagePort), C20896k1.m96887i(webMessage));
        }
    }

    /* renamed from: androidx.webkit.internal.c$b */
    public class C20868b extends WebMessagePort.WebMessageCallback {

        /* renamed from: a */
        public final /* synthetic */ C20961o.C20962a f53926a;

        public C20868b(C20961o.C20962a aVar) {
            this.f53926a = aVar;
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f53926a.mo62729a(new C20896k1(webMessagePort), C20896k1.m96887i(webMessage));
        }
    }

    /* renamed from: androidx.webkit.internal.c$c */
    public class C20869c extends WebView.VisualStateCallback {

        /* renamed from: a */
        public final /* synthetic */ C20977t.C20978a f53927a;

        public C20869c(C20977t.C20978a aVar) {
            this.f53927a = aVar;
        }

        public void onComplete(long j) {
            this.f53927a.onComplete(j);
        }
    }

    @C0373u
    /* renamed from: a */
    public static void m96813a(@C0359n0 WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    @C0359n0
    @C0373u
    /* renamed from: b */
    public static WebMessage m96814b(@C0359n0 C20959n nVar) {
        return new WebMessage(nVar.mo62726b(), C20896k1.m96886h(nVar.mo62727c()));
    }

    @C0359n0
    @C0373u
    /* renamed from: c */
    public static WebMessagePort[] m96815c(@C0359n0 WebView webView) {
        return webView.createWebMessageChannel();
    }

    @C0359n0
    @C0373u
    /* renamed from: d */
    public static C20959n m96816d(@C0359n0 WebMessage webMessage) {
        return new C20959n(webMessage.getData(), C20896k1.m96888l(webMessage.getPorts()));
    }

    @C0359n0
    @C0373u
    /* renamed from: e */
    public static CharSequence m96817e(@C0359n0 WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    @C0373u
    /* renamed from: f */
    public static int m96818f(@C0359n0 WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    @C0373u
    /* renamed from: g */
    public static boolean m96819g(@C0359n0 WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    @C0373u
    /* renamed from: h */
    public static void m96820h(@C0359n0 WebMessagePort webMessagePort, @C0359n0 WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    @C0373u
    /* renamed from: i */
    public static void m96821i(@C0359n0 WebView webView, long j, @C0359n0 C20977t.C20978a aVar) {
        webView.postVisualStateCallback(j, new C20869c(aVar));
    }

    @C0373u
    /* renamed from: j */
    public static void m96822j(@C0359n0 WebView webView, @C0359n0 WebMessage webMessage, @C0359n0 Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    @C0373u
    /* renamed from: k */
    public static void m96823k(@C0359n0 WebSettings webSettings, boolean z) {
        webSettings.setOffscreenPreRaster(z);
    }

    @C0373u
    /* renamed from: l */
    public static void m96824l(@C0359n0 WebMessagePort webMessagePort, @C0359n0 C20961o.C20962a aVar) {
        webMessagePort.setWebMessageCallback(new C20867a(aVar));
    }

    @C0373u
    /* renamed from: m */
    public static void m96825m(@C0359n0 WebMessagePort webMessagePort, @C0359n0 C20961o.C20962a aVar, @C0363p0 Handler handler) {
        webMessagePort.setWebMessageCallback(new C20868b(aVar), handler);
    }
}
