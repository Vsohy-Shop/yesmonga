package kotlinx.coroutines.internal;

import kotlin.C11414o;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C12044k0;
import kotlinx.coroutines.C12051l0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.internal.i */
public final class C11996i {
    /* renamed from: a */
    public static final void m47843a(@C12579k CoroutineContext coroutineContext, @C12579k Throwable th) {
        for (C12044k0 P : C11994h.m47840b()) {
            try {
                P.mo23719P(coroutineContext, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                C11994h.m47841c(C12051l0.m48105c(th, th2));
            }
        }
        try {
            C11414o.m43942a(th, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        C11994h.m47841c(th);
    }
}
