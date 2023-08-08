package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.C0359n0;
import androidx.webkit.C20959n;
import androidx.webkit.C20977t;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.i1 */
public class C20890i1 implements WebMessageListenerBoundaryInterface {

    /* renamed from: a */
    public C20977t.C20979b f53940a;

    public C20890i1(@C0359n0 C20977t.C20979b bVar) {
        this.f53940a = bVar;
    }

    @C0359n0
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    public void onPostMessage(@C0359n0 WebView webView, @C0359n0 InvocationHandler invocationHandler, @C0359n0 Uri uri, boolean z, @C0359n0 InvocationHandler invocationHandler2) {
        C20959n c = C20884g1.m96872c((WebMessageBoundaryInterface) C12530a.m51109a(WebMessageBoundaryInterface.class, invocationHandler));
        if (c != null) {
            this.f53940a.mo62740a(webView, c, uri, z, C20933v0.m96989b(invocationHandler2));
        }
    }
}
