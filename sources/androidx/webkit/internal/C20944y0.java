package androidx.webkit.internal;

import androidx.annotation.C0359n0;
import androidx.webkit.C20849h;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.y0 */
public class C20944y0 extends C20849h {

    /* renamed from: a */
    public ScriptHandlerBoundaryInterface f54035a;

    public C20944y0(@C0359n0 ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f54035a = scriptHandlerBoundaryInterface;
    }

    @C0359n0
    /* renamed from: b */
    public static C20944y0 m97008b(@C0359n0 InvocationHandler invocationHandler) {
        return new C20944y0((ScriptHandlerBoundaryInterface) C12530a.m51109a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    /* renamed from: a */
    public void mo62604a() {
        this.f54035a.remove();
    }
}
