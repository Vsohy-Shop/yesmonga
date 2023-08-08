package androidx.webkit.internal;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.webkit.C20850i;
import java.io.File;

@C0376v0(24)
/* renamed from: androidx.webkit.internal.d */
public class C20873d {
    @C0373u
    /* renamed from: a */
    public static boolean m96835a(@C0359n0 ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowContentAccess();
    }

    @C0373u
    /* renamed from: b */
    public static boolean m96836b(@C0359n0 ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowFileAccess();
    }

    @C0373u
    /* renamed from: c */
    public static boolean m96837c(@C0359n0 ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getBlockNetworkLoads();
    }

    @C0373u
    /* renamed from: d */
    public static int m96838d(@C0359n0 ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getCacheMode();
    }

    @C0359n0
    @C0373u
    /* renamed from: e */
    public static File m96839e(@C0359n0 Context context) {
        return context.getDataDir();
    }

    @C0373u
    /* renamed from: f */
    public static int m96840f(@C0359n0 WebSettings webSettings) {
        return webSettings.getDisabledActionModeMenuItems();
    }

    @C0359n0
    @C0373u
    /* renamed from: g */
    public static ServiceWorkerController m96841g() {
        return ServiceWorkerController.getInstance();
    }

    @C0359n0
    @C0373u
    /* renamed from: h */
    public static ServiceWorkerWebSettings m96842h(@C0359n0 ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    @C0359n0
    @C0373u
    /* renamed from: i */
    public static C20865b1 m96843i(@C0359n0 ServiceWorkerController serviceWorkerController) {
        return new C20865b1(m96842h(serviceWorkerController));
    }

    @C0373u
    /* renamed from: j */
    public static boolean m96844j(@C0359n0 WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }

    @C0373u
    /* renamed from: k */
    public static void m96845k(@C0359n0 ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setAllowContentAccess(z);
    }

    @C0373u
    /* renamed from: l */
    public static void m96846l(@C0359n0 ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setAllowFileAccess(z);
    }

    @C0373u
    /* renamed from: m */
    public static void m96847m(@C0359n0 ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setBlockNetworkLoads(z);
    }

    @C0373u
    /* renamed from: n */
    public static void m96848n(@C0359n0 ServiceWorkerWebSettings serviceWorkerWebSettings, int i) {
        serviceWorkerWebSettings.setCacheMode(i);
    }

    @C0373u
    /* renamed from: o */
    public static void m96849o(@C0359n0 WebSettings webSettings, int i) {
        webSettings.setDisabledActionModeMenuItems(i);
    }

    @C0373u
    /* renamed from: p */
    public static void m96850p(@C0359n0 ServiceWorkerController serviceWorkerController, @C0363p0 ServiceWorkerClient serviceWorkerClient) {
        serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    @C0373u
    /* renamed from: q */
    public static void m96851q(@C0359n0 ServiceWorkerController serviceWorkerController, @C0359n0 C20850i iVar) {
        serviceWorkerController.setServiceWorkerClient(new C20925t0(iVar));
    }
}
