package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C12001k0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.flow.internal.g */
public final class C11930g<T> extends C12001k0<T> {
    public C11930g(@C12579k CoroutineContext coroutineContext, @C12579k C11045c<? super T> cVar) {
        super(coroutineContext, cVar);
    }

    /* renamed from: F0 */
    public boolean mo23594F0(@C12579k Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return mo23583A0(th);
    }
}
