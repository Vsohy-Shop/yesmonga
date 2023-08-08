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

/* renamed from: androidx.webkit.internal.u0 */
public class C20930u0 implements C20920r1 {

    /* renamed from: a */
    public static final String[] f54023a = new String[0];

    /* renamed from: b */
    public static final String f54024b = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily";

    @C0359n0
    /* renamed from: a */
    public String[] mo62684a() {
        return f54023a;
    }

    @C0359n0
    public WebViewProviderBoundaryInterface createWebView(@C0359n0 WebView webView) {
        throw new UnsupportedOperationException(f54024b);
    }

    @C0359n0
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        throw new UnsupportedOperationException(f54024b);
    }

    @C0359n0
    public ProxyControllerBoundaryInterface getProxyController() {
        throw new UnsupportedOperationException(f54024b);
    }

    @C0359n0
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        throw new UnsupportedOperationException(f54024b);
    }

    @C0359n0
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException(f54024b);
    }

    @C0359n0
    public TracingControllerBoundaryInterface getTracingController() {
        throw new UnsupportedOperationException(f54024b);
    }

    @C0359n0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException(f54024b);
    }
}
