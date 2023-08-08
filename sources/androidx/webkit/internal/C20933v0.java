package androidx.webkit.internal;

import androidx.annotation.C0359n0;
import androidx.webkit.C20840c;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.v0 */
public class C20933v0 extends C20840c {

    /* renamed from: a */
    public JsReplyProxyBoundaryInterface f54026a;

    /* renamed from: androidx.webkit.internal.v0$a */
    public class C20934a implements Callable<Object> {

        /* renamed from: a */
        public final /* synthetic */ JsReplyProxyBoundaryInterface f54027a;

        public C20934a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f54027a = jsReplyProxyBoundaryInterface;
        }

        public Object call() {
            return new C20933v0(this.f54027a);
        }
    }

    public C20933v0(@C0359n0 JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f54026a = jsReplyProxyBoundaryInterface;
    }

    @C0359n0
    /* renamed from: b */
    public static C20933v0 m96989b(@C0359n0 InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) C12530a.m51109a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (C20933v0) jsReplyProxyBoundaryInterface.getOrCreatePeer(new C20934a(jsReplyProxyBoundaryInterface));
    }

    /* renamed from: a */
    public void mo62581a(@C0359n0 String str) {
        if (C20908o1.f53968U.mo62608d()) {
            this.f54026a.postMessage(str);
            return;
        }
        throw C20908o1.m96934a();
    }
}
