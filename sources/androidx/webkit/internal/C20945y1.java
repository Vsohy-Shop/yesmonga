package androidx.webkit.internal;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.y1 */
public class C20945y1 {

    /* renamed from: a */
    public final WebkitToCompatConverterBoundaryInterface f54036a;

    public C20945y1(@C0359n0 WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f54036a = webkitToCompatConverterBoundaryInterface;
    }

    @C0359n0
    /* renamed from: a */
    public C20922s0 mo62706a(@C0359n0 CookieManager cookieManager) {
        return new C20922s0((WebViewCookieManagerBoundaryInterface) C12530a.m51109a(WebViewCookieManagerBoundaryInterface.class, this.f54036a.convertCookieManager(cookieManager)));
    }

    @C0359n0
    @C0376v0(27)
    /* renamed from: b */
    public SafeBrowsingResponse mo62707b(@C0359n0 InvocationHandler invocationHandler) {
        return C20942x1.m97006a(this.f54036a.convertSafeBrowsingResponse(invocationHandler));
    }

    @C0359n0
    /* renamed from: c */
    public InvocationHandler mo62708c(@C0359n0 SafeBrowsingResponse safeBrowsingResponse) {
        return this.f54036a.convertSafeBrowsingResponse((Object) safeBrowsingResponse);
    }

    @C0359n0
    @C0376v0(24)
    /* renamed from: d */
    public ServiceWorkerWebSettings mo62709d(@C0359n0 InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.f54036a.convertServiceWorkerSettings(invocationHandler);
    }

    @C0359n0
    /* renamed from: e */
    public InvocationHandler mo62710e(@C0359n0 ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f54036a.convertServiceWorkerSettings((Object) serviceWorkerWebSettings);
    }

    @C0359n0
    /* renamed from: f */
    public C20905n1 mo62711f(@C0359n0 WebSettings webSettings) {
        return new C20905n1((WebSettingsBoundaryInterface) C12530a.m51109a(WebSettingsBoundaryInterface.class, this.f54036a.convertSettings(webSettings)));
    }

    @C0359n0
    @C0376v0(23)
    /* renamed from: g */
    public WebMessagePort mo62712g(@C0359n0 InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f54036a.convertWebMessagePort(invocationHandler);
    }

    @C0359n0
    /* renamed from: h */
    public InvocationHandler mo62713h(@C0359n0 WebMessagePort webMessagePort) {
        return this.f54036a.convertWebMessagePort((Object) webMessagePort);
    }

    @C0359n0
    @C0376v0(23)
    /* renamed from: i */
    public WebResourceError mo62714i(@C0359n0 InvocationHandler invocationHandler) {
        return (WebResourceError) this.f54036a.convertWebResourceError(invocationHandler);
    }

    @C0359n0
    /* renamed from: j */
    public InvocationHandler mo62715j(@C0359n0 WebResourceError webResourceError) {
        return this.f54036a.convertWebResourceError((Object) webResourceError);
    }

    @C0359n0
    /* renamed from: k */
    public C20902m1 mo62716k(@C0359n0 WebResourceRequest webResourceRequest) {
        return new C20902m1((WebResourceRequestBoundaryInterface) C12530a.m51109a(WebResourceRequestBoundaryInterface.class, this.f54036a.convertWebResourceRequest(webResourceRequest)));
    }
}
