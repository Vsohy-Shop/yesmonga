package androidx.webkit.internal;

import androidx.annotation.C0359n0;
import androidx.webkit.C20959n;
import androidx.webkit.C20961o;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.h1 */
public class C20887h1 implements WebMessageCallbackBoundaryInterface {

    /* renamed from: a */
    public final C20961o.C20962a f53939a;

    public C20887h1(@C0359n0 C20961o.C20962a aVar) {
        this.f53939a = aVar;
    }

    @C0359n0
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    public void onMessage(@C0359n0 InvocationHandler invocationHandler, @C0359n0 InvocationHandler invocationHandler2) {
        C20959n c = C20884g1.m96872c((WebMessageBoundaryInterface) C12530a.m51109a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (c != null) {
            this.f53939a.mo62729a(new C20896k1(invocationHandler), c);
        }
    }
}
