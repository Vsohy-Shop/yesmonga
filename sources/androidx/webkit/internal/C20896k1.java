package androidx.webkit.internal;

import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.webkit.C20959n;
import androidx.webkit.C20961o;
import androidx.webkit.internal.C20851a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.k1 */
public class C20896k1 extends C20961o {

    /* renamed from: a */
    public WebMessagePort f53942a;

    /* renamed from: b */
    public WebMessagePortBoundaryInterface f53943b;

    public C20896k1(@C0359n0 WebMessagePort webMessagePort) {
        this.f53942a = webMessagePort;
    }

    @C0359n0
    @C0376v0(23)
    /* renamed from: g */
    public static WebMessage m96885g(@C0359n0 C20959n nVar) {
        return C20866c.m96814b(nVar);
    }

    @C0363p0
    @C0376v0(23)
    /* renamed from: h */
    public static WebMessagePort[] m96886h(@C0363p0 C20961o[] oVarArr) {
        if (oVarArr == null) {
            return null;
        }
        int length = oVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i = 0; i < length; i++) {
            webMessagePortArr[i] = oVarArr[i].mo62639b();
        }
        return webMessagePortArr;
    }

    @C0359n0
    @C0376v0(23)
    /* renamed from: i */
    public static C20959n m96887i(@C0359n0 WebMessage webMessage) {
        return C20866c.m96816d(webMessage);
    }

    @C0363p0
    /* renamed from: l */
    public static C20961o[] m96888l(@C0363p0 WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        C20961o[] oVarArr = new C20961o[webMessagePortArr.length];
        for (int i = 0; i < webMessagePortArr.length; i++) {
            oVarArr[i] = new C20896k1(webMessagePortArr[i]);
        }
        return oVarArr;
    }

    /* renamed from: a */
    public void mo62638a() {
        C20851a.C20853b bVar = C20908o1.f53949B;
        if (bVar.mo62607c()) {
            C20866c.m96813a(mo62645k());
        } else if (bVar.mo62608d()) {
            mo62644j().close();
        } else {
            throw C20908o1.m96934a();
        }
    }

    @C0359n0
    @C0376v0(23)
    /* renamed from: b */
    public WebMessagePort mo62639b() {
        return mo62645k();
    }

    @C0359n0
    /* renamed from: c */
    public InvocationHandler mo62640c() {
        return Proxy.getInvocationHandler(mo62644j());
    }

    /* renamed from: d */
    public void mo62641d(@C0359n0 C20959n nVar) {
        C20851a.C20853b bVar = C20908o1.f53948A;
        if (bVar.mo62607c() && nVar.mo62728d() == 0) {
            C20866c.m96820h(mo62645k(), m96885g(nVar));
        } else if (!bVar.mo62608d() || !C20884g1.m96870a(nVar.mo62728d())) {
            throw C20908o1.m96934a();
        } else {
            mo62644j().postMessage(C12530a.m51112d(new C20884g1(nVar)));
        }
    }

    /* renamed from: e */
    public void mo62642e(@C0363p0 Handler handler, @C0359n0 C20961o.C20962a aVar) {
        C20851a.C20853b bVar = C20908o1.f53952E;
        if (bVar.mo62608d()) {
            mo62644j().setWebMessageCallback(C12530a.m51112d(new C20887h1(aVar)), handler);
        } else if (bVar.mo62607c()) {
            C20866c.m96825m(mo62645k(), aVar, handler);
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: f */
    public void mo62643f(@C0359n0 C20961o.C20962a aVar) {
        C20851a.C20853b bVar = C20908o1.f53951D;
        if (bVar.mo62608d()) {
            mo62644j().setWebMessageCallback(C12530a.m51112d(new C20887h1(aVar)));
        } else if (bVar.mo62607c()) {
            C20866c.m96824l(mo62645k(), aVar);
        } else {
            throw C20908o1.m96934a();
        }
    }

    /* renamed from: j */
    public final WebMessagePortBoundaryInterface mo62644j() {
        if (this.f53943b == null) {
            this.f53943b = (WebMessagePortBoundaryInterface) C12530a.m51109a(WebMessagePortBoundaryInterface.class, C20912p1.m96945c().mo62713h(this.f53942a));
        }
        return this.f53943b;
    }

    @C0376v0(23)
    /* renamed from: k */
    public final WebMessagePort mo62645k() {
        if (this.f53942a == null) {
            this.f53942a = C20912p1.m96945c().mo62712g(Proxy.getInvocationHandler(this.f53943b));
        }
        return this.f53942a;
    }

    public C20896k1(@C0359n0 InvocationHandler invocationHandler) {
        this.f53943b = (WebMessagePortBoundaryInterface) C12530a.m51109a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
