package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.webkit.C20850i;
import androidx.webkit.C20949j;
import androidx.webkit.C20951k;
import androidx.webkit.internal.C20851a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.a1 */
public class C20862a1 extends C20949j {

    /* renamed from: a */
    public ServiceWorkerController f53920a;

    /* renamed from: b */
    public ServiceWorkerControllerBoundaryInterface f53921b;

    /* renamed from: c */
    public final C20951k f53922c;

    public C20862a1() {
        C20851a.C20854c cVar = C20908o1.f53985k;
        if (cVar.mo62607c()) {
            this.f53920a = C20873d.m96841g();
            this.f53921b = null;
            this.f53922c = C20873d.m96843i(mo62613e());
        } else if (cVar.mo62608d()) {
            this.f53920a = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController = C20912p1.m96946d().getServiceWorkerController();
            this.f53921b = serviceWorkerController;
            this.f53922c = new C20865b1(serviceWorkerController.getServiceWorkerWebSettings());
        } else {
            throw C20908o1.m96934a();
        }
    }

    @C0359n0
    /* renamed from: b */
    public C20951k mo62610b() {
        return this.f53922c;
    }

    /* renamed from: c */
    public void mo62611c(@C0363p0 C20850i iVar) {
        C20851a.C20854c cVar = C20908o1.f53985k;
        if (cVar.mo62607c()) {
            if (iVar == null) {
                C20873d.m96850p(mo62613e(), (ServiceWorkerClient) null);
            } else {
                C20873d.m96851q(mo62613e(), iVar);
            }
        } else if (!cVar.mo62608d()) {
            throw C20908o1.m96934a();
        } else if (iVar == null) {
            mo62612d().setServiceWorkerClient((InvocationHandler) null);
        } else {
            mo62612d().setServiceWorkerClient(C12530a.m51112d(new C20947z0(iVar)));
        }
    }

    /* renamed from: d */
    public final ServiceWorkerControllerBoundaryInterface mo62612d() {
        if (this.f53921b == null) {
            this.f53921b = C20912p1.m96946d().getServiceWorkerController();
        }
        return this.f53921b;
    }

    @C0376v0(24)
    /* renamed from: e */
    public final ServiceWorkerController mo62613e() {
        if (this.f53920a == null) {
            this.f53920a = C20873d.m96841g();
        }
        return this.f53920a;
    }
}
