package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.l3 */
public final class C12059l3 extends CoroutineDispatcher {
    @C12579k

    /* renamed from: c */
    public static final C12059l3 f29705c = new C12059l3();

    /* renamed from: O */
    public void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        C12082p3 p3Var = (C12082p3) coroutineContext.mo7444b(C12082p3.f29728c);
        if (p3Var != null) {
            p3Var.f29729b = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    /* renamed from: U */
    public boolean mo23565U(@C12579k CoroutineContext coroutineContext) {
        return false;
    }

    @C12095s1
    @C12579k
    /* renamed from: V */
    public CoroutineDispatcher mo23566V(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @C12579k
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
