package androidx.webkit.internal;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.webkit.C20953l;
import java.io.OutputStream;
import java.util.concurrent.Executor;

@C0376v0(28)
/* renamed from: androidx.webkit.internal.e0 */
public class C20877e0 {
    @C0359n0
    @C0373u
    /* renamed from: a */
    public static TracingController m96854a() {
        return TracingController.getInstance();
    }

    @C0359n0
    @C0373u
    /* renamed from: b */
    public static ClassLoader m96855b() {
        return WebView.getWebViewClassLoader();
    }

    @C0359n0
    @C0373u
    /* renamed from: c */
    public static Looper m96856c(@C0359n0 WebView webView) {
        return webView.getWebViewLooper();
    }

    @C0373u
    /* renamed from: d */
    public static boolean m96857d(@C0359n0 TracingController tracingController) {
        return tracingController.isTracing();
    }

    @C0373u
    /* renamed from: e */
    public static void m96858e(@C0359n0 String str) {
        WebView.setDataDirectorySuffix(str);
    }

    @C0373u
    /* renamed from: f */
    public static void m96859f(@C0359n0 TracingController tracingController, @C0359n0 C20953l lVar) {
        C20929u.m96985a();
        tracingController.start(C20924t.m96983a().addCategories(new int[]{lVar.mo62718b()}).addCategories(lVar.mo62717a()).setTracingMode(lVar.mo62719c()).build());
    }

    @C0373u
    /* renamed from: g */
    public static boolean m96860g(@C0359n0 TracingController tracingController, @C0363p0 OutputStream outputStream, @C0359n0 Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
