package androidx.webkit.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.webkit.C20959n;
import androidx.webkit.C20961o;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.g1 */
public class C20884g1 implements WebMessageBoundaryInterface {

    /* renamed from: b */
    public static final String[] f53937b = {"WEB_MESSAGE_GET_MESSAGE_PAYLOAD"};

    /* renamed from: a */
    public C20959n f53938a;

    public C20884g1(@C0359n0 C20959n nVar) {
        this.f53938a = nVar;
    }

    /* renamed from: a */
    public static boolean m96870a(int i) {
        if (i == 0) {
            return true;
        }
        if (i != 1 || !C20908o1.f53950C.mo62608d()) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: b */
    public static C20961o[] m96871b(InvocationHandler[] invocationHandlerArr) {
        C20961o[] oVarArr = new C20961o[invocationHandlerArr.length];
        for (int i = 0; i < invocationHandlerArr.length; i++) {
            oVarArr[i] = new C20896k1(invocationHandlerArr[i]);
        }
        return oVarArr;
    }

    @C0363p0
    /* renamed from: c */
    public static C20959n m96872c(@C0359n0 WebMessageBoundaryInterface webMessageBoundaryInterface) {
        C20961o[] b = m96871b(webMessageBoundaryInterface.getPorts());
        if (!C20908o1.f53950C.mo62608d()) {
            return new C20959n(webMessageBoundaryInterface.getData(), b);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) C12530a.m51109a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new C20959n(webMessagePayloadBoundaryInterface.getAsString(), b);
        }
        if (type != 1) {
            return null;
        }
        return new C20959n(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), b);
    }

    @C0363p0
    @Deprecated
    public String getData() {
        return this.f53938a.mo62726b();
    }

    @C0363p0
    @C0376v0(api = 19)
    public InvocationHandler getMessagePayload() {
        return C12530a.m51112d(new C20893j1(this.f53938a));
    }

    @C0363p0
    public InvocationHandler[] getPorts() {
        C20961o[] c = this.f53938a.mo62727c();
        if (c == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[c.length];
        for (int i = 0; i < c.length; i++) {
            invocationHandlerArr[i] = c[i].mo62640c();
        }
        return invocationHandlerArr;
    }

    @C0359n0
    public String[] getSupportedFeatures() {
        return f53937b;
    }
}
