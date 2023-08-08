package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.webkit.C20959n;
import androidx.webkit.C20961o;
import androidx.webkit.C20977t;
import androidx.webkit.C20983v;
import androidx.webkit.C20984w;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.q1 */
public class C20917q1 {

    /* renamed from: a */
    public WebViewProviderBoundaryInterface f54008a;

    public C20917q1(@C0359n0 WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f54008a = webViewProviderBoundaryInterface;
    }

    @C0359n0
    /* renamed from: a */
    public C20944y0 mo62673a(@C0359n0 String str, @C0359n0 String[] strArr) {
        return C20944y0.m97008b(this.f54008a.addDocumentStartJavaScript(str, strArr));
    }

    @C0376v0(19)
    /* renamed from: b */
    public void mo62674b(@C0359n0 String str, @C0359n0 String[] strArr, @C0359n0 C20977t.C20979b bVar) {
        this.f54008a.addWebMessageListener(str, strArr, C12530a.m51112d(new C20890i1(bVar)));
    }

    @C0359n0
    /* renamed from: c */
    public C20961o[] mo62675c() {
        InvocationHandler[] createWebMessageChannel = this.f54008a.createWebMessageChannel();
        C20961o[] oVarArr = new C20961o[createWebMessageChannel.length];
        for (int i = 0; i < createWebMessageChannel.length; i++) {
            oVarArr[i] = new C20896k1(createWebMessageChannel[i]);
        }
        return oVarArr;
    }

    @C0363p0
    /* renamed from: d */
    public WebChromeClient mo62676d() {
        return this.f54008a.getWebChromeClient();
    }

    @C0359n0
    /* renamed from: e */
    public WebViewClient mo62677e() {
        return this.f54008a.getWebViewClient();
    }

    @C0363p0
    /* renamed from: f */
    public C20983v mo62678f() {
        return C20938w1.m96998c(this.f54008a.getWebViewRenderer());
    }

    @C0363p0
    @C0376v0(19)
    /* renamed from: g */
    public C20984w mo62679g() {
        InvocationHandler webViewRendererClient = this.f54008a.getWebViewRendererClient();
        if (webViewRendererClient == null) {
            return null;
        }
        return ((C20926t1) C12530a.m51115g(webViewRendererClient)).mo62694a();
    }

    @C0376v0(19)
    /* renamed from: h */
    public void mo62680h(long j, @C0359n0 C20977t.C20978a aVar) {
        this.f54008a.insertVisualStateCallback(j, C12530a.m51112d(new C20881f1(aVar)));
    }

    @C0376v0(19)
    /* renamed from: i */
    public void mo62681i(@C0359n0 C20959n nVar, @C0359n0 Uri uri) {
        this.f54008a.postMessageToMainFrame(C12530a.m51112d(new C20884g1(nVar)), uri);
    }

    /* renamed from: j */
    public void mo62682j(@C0359n0 String str) {
        this.f54008a.removeWebMessageListener(str);
    }

    @SuppressLint({"LambdaLast"})
    @C0376v0(19)
    /* renamed from: k */
    public void mo62683k(@C0363p0 Executor executor, @C0363p0 C20984w wVar) {
        InvocationHandler invocationHandler;
        if (wVar != null) {
            invocationHandler = C12530a.m51112d(new C20926t1(executor, wVar));
        } else {
            invocationHandler = null;
        }
        this.f54008a.setWebViewRendererClient(invocationHandler);
    }
}
