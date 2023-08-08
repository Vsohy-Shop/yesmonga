package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C11066c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.flow.internal.n */
public final class C11938n<T> implements C11045c<T>, C11066c {
    @C12579k

    /* renamed from: a */
    public final C11045c<T> f29520a;
    @C12579k

    /* renamed from: b */
    public final CoroutineContext f29521b;

    public C11938n(@C12579k C11045c<? super T> cVar, @C12579k CoroutineContext coroutineContext) {
        this.f29520a = cVar;
        this.f29521b = coroutineContext;
    }

    @C12580l
    public C11066c getCallerFrame() {
        C11045c<T> cVar = this.f29520a;
        if (cVar instanceof C11066c) {
            return (C11066c) cVar;
        }
        return null;
    }

    @C12579k
    public CoroutineContext getContext() {
        return this.f29521b;
    }

    @C12580l
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public void resumeWith(@C12579k Object obj) {
        this.f29520a.resumeWith(obj);
    }
}
