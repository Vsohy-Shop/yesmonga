package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.annotation.C0359n0;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.s1 */
public class C20923s1 implements C20920r1 {

    /* renamed from: a */
    public final WebViewProviderFactoryBoundaryInterface f54010a;

    public C20923s1(@C0359n0 WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f54010a = webViewProviderFactoryBoundaryInterface;
    }

    @C0359n0
    /* renamed from: a */
    public String[] mo62684a() {
        return this.f54010a.getSupportedFeatures();
    }

    @C0359n0
    public WebViewProviderBoundaryInterface createWebView(@C0359n0 WebView webView) {
        return (WebViewProviderBoundaryInterface) C12530a.m51109a(WebViewProviderBoundaryInterface.class, this.f54010a.createWebView(webView));
    }

    @C0359n0
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) C12530a.m51109a(DropDataContentProviderBoundaryInterface.class, this.f54010a.getDropDataProvider());
    }

    @C0359n0
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) C12530a.m51109a(ProxyControllerBoundaryInterface.class, this.f54010a.getProxyController());
    }

    @C0359n0
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) C12530a.m51109a(ServiceWorkerControllerBoundaryInterface.class, this.f54010a.getServiceWorkerController());
    }

    @C0359n0
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C12530a.m51109a(StaticsBoundaryInterface.class, this.f54010a.getStatics());
    }

    @C0359n0
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) C12530a.m51109a(TracingControllerBoundaryInterface.class, this.f54010a.getTracingController());
    }

    @C0359n0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C12530a.m51109a(WebkitToCompatConverterBoundaryInterface.class, this.f54010a.getWebkitToCompatConverter());
    }
}
