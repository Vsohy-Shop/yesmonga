package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.webkit.C20963p;
import androidx.webkit.internal.C20851a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.l1 */
public class C20899l1 extends C20963p {

    /* renamed from: a */
    public WebResourceError f53944a;

    /* renamed from: b */
    public WebResourceErrorBoundaryInterface f53945b;

    public C20899l1(@C0359n0 InvocationHandler invocationHandler) {
        this.f53945b = (WebResourceErrorBoundaryInterface) C12530a.m51109a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    @C0359n0
    /* renamed from: a */
    public CharSequence mo62646a() {
        C20851a.C20853b bVar = C20908o1.f53996v;
        if (bVar.mo62607c()) {
            return C20866c.m96817e(mo62649d());
        }
        if (bVar.mo62608d()) {
            return mo62648c().getDescription();
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: b */
    public int mo62647b() {
        C20851a.C20853b bVar = C20908o1.f53997w;
        if (bVar.mo62607c()) {
            return C20866c.m96818f(mo62649d());
        }
        if (bVar.mo62608d()) {
            return mo62648c().getErrorCode();
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: c */
    public final WebResourceErrorBoundaryInterface mo62648c() {
        if (this.f53945b == null) {
            this.f53945b = (WebResourceErrorBoundaryInterface) C12530a.m51109a(WebResourceErrorBoundaryInterface.class, C20912p1.m96945c().mo62715j(this.f53944a));
        }
        return this.f53945b;
    }

    @C0376v0(23)
    /* renamed from: d */
    public final WebResourceError mo62649d() {
        if (this.f53944a == null) {
            this.f53944a = C20912p1.m96945c().mo62714i(Proxy.getInvocationHandler(this.f53945b));
        }
        return this.f53944a;
    }

    public C20899l1(@C0359n0 WebResourceError webResourceError) {
        this.f53944a = webResourceError;
    }
}
