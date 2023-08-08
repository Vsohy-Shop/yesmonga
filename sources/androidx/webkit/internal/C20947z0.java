package androidx.webkit.internal;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.webkit.C20850i;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;

/* renamed from: androidx.webkit.internal.z0 */
public class C20947z0 implements ServiceWorkerClientBoundaryInterface {

    /* renamed from: a */
    public final C20850i f54037a;

    public C20947z0(@C0359n0 C20850i iVar) {
        this.f54037a = iVar;
    }

    @C0359n0
    public String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    @C0363p0
    public WebResourceResponse shouldInterceptRequest(@C0359n0 WebResourceRequest webResourceRequest) {
        return this.f54037a.mo62605a(webResourceRequest);
    }
}
