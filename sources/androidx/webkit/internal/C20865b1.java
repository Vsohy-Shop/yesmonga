package androidx.webkit.internal;

import android.webkit.ServiceWorkerWebSettings;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.webkit.C20951k;
import androidx.webkit.internal.C20851a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Set;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.b1 */
public class C20865b1 extends C20951k {

    /* renamed from: a */
    public ServiceWorkerWebSettings f53923a;

    /* renamed from: b */
    public ServiceWorkerWebSettingsBoundaryInterface f53924b;

    public C20865b1(@C0359n0 ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f53923a = serviceWorkerWebSettings;
    }

    /* renamed from: a */
    public boolean mo62614a() {
        C20851a.C20854c cVar = C20908o1.f53987m;
        if (cVar.mo62607c()) {
            return C20873d.m96835a(mo62625l());
        }
        if (cVar.mo62608d()) {
            return mo62624k().getAllowContentAccess();
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: b */
    public boolean mo62615b() {
        C20851a.C20854c cVar = C20908o1.f53988n;
        if (cVar.mo62607c()) {
            return C20873d.m96836b(mo62625l());
        }
        if (cVar.mo62608d()) {
            return mo62624k().getAllowFileAccess();
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: c */
    public boolean mo62616c() {
        C20851a.C20854c cVar = C20908o1.f53989o;
        if (cVar.mo62607c()) {
            return C20873d.m96837c(mo62625l());
        }
        if (cVar.mo62608d()) {
            return mo62624k().getBlockNetworkLoads();
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: d */
    public int mo62617d() {
        C20851a.C20854c cVar = C20908o1.f53986l;
        if (cVar.mo62607c()) {
            return C20873d.m96838d(mo62625l());
        }
        if (cVar.mo62608d()) {
            return mo62624k().getCacheMode();
        }
        throw C20908o1.m96934a();
    }

    @C0359n0
    /* renamed from: e */
    public Set<String> mo62618e() {
        if (C20908o1.f53975a0.mo62608d()) {
            return mo62624k().getRequestedWithHeaderOriginAllowList();
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: f */
    public void mo62619f(boolean z) {
        C20851a.C20854c cVar = C20908o1.f53987m;
        if (cVar.mo62607c()) {
            C20873d.m96845k(mo62625l(), z);
        } else if (cVar.mo62608d()) {
            mo62624k().setAllowContentAccess(z);
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: g */
    public void mo62620g(boolean z) {
        C20851a.C20854c cVar = C20908o1.f53988n;
        if (cVar.mo62607c()) {
            C20873d.m96846l(mo62625l(), z);
        } else if (cVar.mo62608d()) {
            mo62624k().setAllowFileAccess(z);
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: h */
    public void mo62621h(boolean z) {
        C20851a.C20854c cVar = C20908o1.f53989o;
        if (cVar.mo62607c()) {
            C20873d.m96847m(mo62625l(), z);
        } else if (cVar.mo62608d()) {
            mo62624k().setBlockNetworkLoads(z);
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: i */
    public void mo62622i(int i) {
        C20851a.C20854c cVar = C20908o1.f53986l;
        if (cVar.mo62607c()) {
            C20873d.m96848n(mo62625l(), i);
        } else if (cVar.mo62608d()) {
            mo62624k().setCacheMode(i);
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: j */
    public void mo62623j(@C0359n0 Set<String> set) {
        if (C20908o1.f53975a0.mo62608d()) {
            mo62624k().setRequestedWithHeaderOriginAllowList(set);
            return;
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: k */
    public final ServiceWorkerWebSettingsBoundaryInterface mo62624k() {
        if (this.f53924b == null) {
            this.f53924b = (ServiceWorkerWebSettingsBoundaryInterface) C12530a.m51109a(ServiceWorkerWebSettingsBoundaryInterface.class, C20912p1.m96945c().mo62710e(this.f53923a));
        }
        return this.f53924b;
    }

    @C0376v0(24)
    /* renamed from: l */
    public final ServiceWorkerWebSettings mo62625l() {
        if (this.f53923a == null) {
            this.f53923a = C20912p1.m96945c().mo62709d(Proxy.getInvocationHandler(this.f53924b));
        }
        return this.f53923a;
    }

    public C20865b1(@C0359n0 InvocationHandler invocationHandler) {
        this.f53924b = (ServiceWorkerWebSettingsBoundaryInterface) C12530a.m51109a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }
}
