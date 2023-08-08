package androidx.webkit.internal;

import android.webkit.WebViewRenderProcess;
import androidx.annotation.C0359n0;
import androidx.webkit.C20983v;
import androidx.webkit.internal.C20851a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.w1 */
public class C20938w1 extends C20983v {

    /* renamed from: c */
    public static final WeakHashMap<WebViewRenderProcess, C20938w1> f54029c = new WeakHashMap<>();

    /* renamed from: a */
    public WebViewRendererBoundaryInterface f54030a;

    /* renamed from: b */
    public WeakReference<WebViewRenderProcess> f54031b;

    /* renamed from: androidx.webkit.internal.w1$a */
    public class C20939a implements Callable<Object> {

        /* renamed from: a */
        public final /* synthetic */ WebViewRendererBoundaryInterface f54032a;

        public C20939a(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.f54032a = webViewRendererBoundaryInterface;
        }

        public Object call() {
            return new C20938w1(this.f54032a);
        }
    }

    public C20938w1(@C0359n0 WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f54030a = webViewRendererBoundaryInterface;
    }

    @C0359n0
    /* renamed from: b */
    public static C20938w1 m96997b(@C0359n0 WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<WebViewRenderProcess, C20938w1> weakHashMap = f54029c;
        C20938w1 w1Var = weakHashMap.get(webViewRenderProcess);
        if (w1Var != null) {
            return w1Var;
        }
        C20938w1 w1Var2 = new C20938w1(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, w1Var2);
        return w1Var2;
    }

    @C0359n0
    /* renamed from: c */
    public static C20938w1 m96998c(@C0359n0 InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) C12530a.m51109a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (C20938w1) webViewRendererBoundaryInterface.getOrCreatePeer(new C20939a(webViewRendererBoundaryInterface));
    }

    /* renamed from: a */
    public boolean mo62702a() {
        C20851a.C20859h hVar = C20908o1.f53958K;
        if (hVar.mo62607c()) {
            WebViewRenderProcess a = C20935v1.m96991a(this.f54031b.get());
            if (a == null || !C20901m0.m96910g(a)) {
                return false;
            }
            return true;
        } else if (hVar.mo62608d()) {
            return this.f54030a.terminate();
        } else {
            throw C20908o1.m96934a();
        }
    }

    public C20938w1(@C0359n0 WebViewRenderProcess webViewRenderProcess) {
        this.f54031b = new WeakReference<>(webViewRenderProcess);
    }
}
