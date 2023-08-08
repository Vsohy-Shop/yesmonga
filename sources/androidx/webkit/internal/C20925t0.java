package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.webkit.C20850i;

@C0376v0(24)
/* renamed from: androidx.webkit.internal.t0 */
public class C20925t0 extends ServiceWorkerClient {

    /* renamed from: a */
    public final C20850i f54011a;

    public C20925t0(@C0359n0 C20850i iVar) {
        this.f54011a = iVar;
    }

    @C0363p0
    public WebResourceResponse shouldInterceptRequest(@C0359n0 WebResourceRequest webResourceRequest) {
        return this.f54011a.mo62605a(webResourceRequest);
    }
}
