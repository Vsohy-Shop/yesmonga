package androidx.webkit.internal;

import android.webkit.TracingController;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.webkit.C20953l;
import androidx.webkit.C20957m;
import androidx.webkit.internal.C20851a;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* renamed from: androidx.webkit.internal.e1 */
public class C20878e1 extends C20957m {

    /* renamed from: a */
    public TracingController f53934a;

    /* renamed from: b */
    public TracingControllerBoundaryInterface f53935b;

    public C20878e1() {
        C20851a.C20858g gVar = C20908o1.f53959L;
        if (gVar.mo62607c()) {
            this.f53934a = C20877e0.m96854a();
            this.f53935b = null;
        } else if (gVar.mo62608d()) {
            this.f53934a = null;
            this.f53935b = C20912p1.m96946d().getTracingController();
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: b */
    public boolean mo62633b() {
        C20851a.C20858g gVar = C20908o1.f53959L;
        if (gVar.mo62607c()) {
            return C20877e0.m96857d(mo62637f());
        }
        if (gVar.mo62608d()) {
            return mo62636e().isTracing();
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: c */
    public void mo62634c(@C0359n0 C20953l lVar) {
        if (lVar != null) {
            C20851a.C20858g gVar = C20908o1.f53959L;
            if (gVar.mo62607c()) {
                C20877e0.m96859f(mo62637f(), lVar);
            } else if (gVar.mo62608d()) {
                mo62636e().start(lVar.mo62718b(), lVar.mo62717a(), lVar.mo62719c());
            } else {
                throw C20908o1.m96934a();
            }
        } else {
            throw new IllegalArgumentException("Tracing config must be non null");
        }
    }

    /* renamed from: d */
    public boolean mo62635d(@C0363p0 OutputStream outputStream, @C0359n0 Executor executor) {
        C20851a.C20858g gVar = C20908o1.f53959L;
        if (gVar.mo62607c()) {
            return C20877e0.m96860g(mo62637f(), outputStream, executor);
        }
        if (gVar.mo62608d()) {
            return mo62636e().stop(outputStream, executor);
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: e */
    public final TracingControllerBoundaryInterface mo62636e() {
        if (this.f53935b == null) {
            this.f53935b = C20912p1.m96946d().getTracingController();
        }
        return this.f53935b;
    }

    @C0376v0(28)
    /* renamed from: f */
    public final TracingController mo62637f() {
        if (this.f53934a == null) {
            this.f53934a = C20877e0.m96854a();
        }
        return this.f53934a;
    }
}
