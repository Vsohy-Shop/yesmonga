package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.C11287e;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.c1 */
public final class C11722c1 implements Executor {
    @C12579k
    @C11287e

    /* renamed from: a */
    public final CoroutineDispatcher f29066a;

    public C11722c1(@C12579k CoroutineDispatcher coroutineDispatcher) {
        this.f29066a = coroutineDispatcher;
    }

    public void execute(@C12579k Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.f29066a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f28243a;
        if (coroutineDispatcher.mo23565U(emptyCoroutineContext)) {
            this.f29066a.mo23563O(emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    @C12579k
    public String toString() {
        return this.f29066a.toString();
    }
}
