package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.webkit.C20848g;
import androidx.webkit.internal.C20851a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.x0 */
public class C20941x0 extends C20848g {

    /* renamed from: a */
    public SafeBrowsingResponse f54033a;

    /* renamed from: b */
    public SafeBrowsingResponseBoundaryInterface f54034b;

    public C20941x0(@C0359n0 InvocationHandler invocationHandler) {
        this.f54034b = (SafeBrowsingResponseBoundaryInterface) C12530a.m51109a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    /* renamed from: a */
    public void mo62601a(boolean z) {
        C20851a.C20857f fVar = C20908o1.f53998x;
        if (fVar.mo62607c()) {
            C20915q.m96949a(mo62705e(), z);
        } else if (fVar.mo62608d()) {
            mo62704d().backToSafety(z);
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: b */
    public void mo62602b(boolean z) {
        C20851a.C20857f fVar = C20908o1.f53999y;
        if (fVar.mo62607c()) {
            C20915q.m96951c(mo62705e(), z);
        } else if (fVar.mo62608d()) {
            mo62704d().proceed(z);
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: c */
    public void mo62603c(boolean z) {
        C20851a.C20857f fVar = C20908o1.f54000z;
        if (fVar.mo62607c()) {
            C20915q.m96953e(mo62705e(), z);
        } else if (fVar.mo62608d()) {
            mo62704d().showInterstitial(z);
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: d */
    public final SafeBrowsingResponseBoundaryInterface mo62704d() {
        if (this.f54034b == null) {
            this.f54034b = (SafeBrowsingResponseBoundaryInterface) C12530a.m51109a(SafeBrowsingResponseBoundaryInterface.class, C20912p1.m96945c().mo62708c(this.f54033a));
        }
        return this.f54034b;
    }

    @C0376v0(27)
    /* renamed from: e */
    public final SafeBrowsingResponse mo62705e() {
        if (this.f54033a == null) {
            this.f54033a = C20912p1.m96945c().mo62707b(Proxy.getInvocationHandler(this.f54034b));
        }
        return this.f54033a;
    }

    public C20941x0(@C0359n0 SafeBrowsingResponse safeBrowsingResponse) {
        this.f54033a = safeBrowsingResponse;
    }
}
