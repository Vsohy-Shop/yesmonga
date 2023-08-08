package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.annotation.C0359n0;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: androidx.webkit.internal.r1 */
public interface C20920r1 {
    @C0359n0
    /* renamed from: a */
    String[] mo62684a();

    @C0359n0
    WebViewProviderBoundaryInterface createWebView(@C0359n0 WebView webView);

    @C0359n0
    DropDataContentProviderBoundaryInterface getDropDataProvider();

    @C0359n0
    ProxyControllerBoundaryInterface getProxyController();

    @C0359n0
    ServiceWorkerControllerBoundaryInterface getServiceWorkerController();

    @C0359n0
    StaticsBoundaryInterface getStatics();

    @C0359n0
    TracingControllerBoundaryInterface getTracingController();

    @C0359n0
    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
}
