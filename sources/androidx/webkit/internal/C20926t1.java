package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.webkit.C20983v;
import androidx.webkit.C20984w;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* renamed from: androidx.webkit.internal.t1 */
public class C20926t1 implements WebViewRendererClientBoundaryInterface {

    /* renamed from: c */
    public static final String[] f54012c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* renamed from: a */
    public final Executor f54013a;

    /* renamed from: b */
    public final C20984w f54014b;

    /* renamed from: androidx.webkit.internal.t1$a */
    public class C20927a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C20984w f54015a;

        /* renamed from: b */
        public final /* synthetic */ WebView f54016b;

        /* renamed from: c */
        public final /* synthetic */ C20983v f54017c;

        public C20927a(C20984w wVar, WebView webView, C20983v vVar) {
            this.f54015a = wVar;
            this.f54016b = webView;
            this.f54017c = vVar;
        }

        public void run() {
            this.f54015a.mo62742b(this.f54016b, this.f54017c);
        }
    }

    /* renamed from: androidx.webkit.internal.t1$b */
    public class C20928b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C20984w f54019a;

        /* renamed from: b */
        public final /* synthetic */ WebView f54020b;

        /* renamed from: c */
        public final /* synthetic */ C20983v f54021c;

        public C20928b(C20984w wVar, WebView webView, C20983v vVar) {
            this.f54019a = wVar;
            this.f54020b = webView;
            this.f54021c = vVar;
        }

        public void run() {
            this.f54019a.mo62741a(this.f54020b, this.f54021c);
        }
    }

    @SuppressLint({"LambdaLast"})
    public C20926t1(@C0363p0 Executor executor, @C0363p0 C20984w wVar) {
        this.f54013a = executor;
        this.f54014b = wVar;
    }

    @C0363p0
    /* renamed from: a */
    public C20984w mo62694a() {
        return this.f54014b;
    }

    @C0359n0
    public final String[] getSupportedFeatures() {
        return f54012c;
    }

    public final void onRendererResponsive(@C0359n0 WebView webView, @C0359n0 InvocationHandler invocationHandler) {
        C20938w1 c = C20938w1.m96998c(invocationHandler);
        C20984w wVar = this.f54014b;
        Executor executor = this.f54013a;
        if (executor == null) {
            wVar.mo62741a(webView, c);
        } else {
            executor.execute(new C20928b(wVar, webView, c));
        }
    }

    public final void onRendererUnresponsive(@C0359n0 WebView webView, @C0359n0 InvocationHandler invocationHandler) {
        C20938w1 c = C20938w1.m96998c(invocationHandler);
        C20984w wVar = this.f54014b;
        Executor executor = this.f54013a;
        if (executor == null) {
            wVar.mo62742b(webView, c);
        } else {
            executor.execute(new C20927a(wVar, webView, c));
        }
    }
}
