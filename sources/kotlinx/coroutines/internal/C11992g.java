package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.internal.g */
public final class C11992g implements C12074o0 {
    @C12579k

    /* renamed from: a */
    public final CoroutineContext f29595a;

    public C11992g(@C12579k CoroutineContext coroutineContext) {
        this.f29595a = coroutineContext;
    }

    @C12579k
    public CoroutineContext getCoroutineContext() {
        return this.f29595a;
    }

    @C12579k
    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
