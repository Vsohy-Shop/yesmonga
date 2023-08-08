package kotlinx.coroutines.future;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C11701a;
import kotlinx.coroutines.C11723c2;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.future.a */
public final class C11956a<T> extends C11701a<T> implements BiFunction<T, Throwable, C11079d2> {
    @C12579k

    /* renamed from: d */
    public final CompletableFuture<T> f29542d;

    public C11956a(@C12579k CoroutineContext coroutineContext, @C12579k CompletableFuture<T> completableFuture) {
        super(coroutineContext, true, true);
        this.f29542d = completableFuture;
    }

    /* renamed from: P1 */
    public void mo23693P1(@C12579k Throwable th, boolean z) {
        this.f29542d.completeExceptionally(th);
    }

    /* renamed from: Q1 */
    public void mo23694Q1(T t) {
        this.f29542d.complete(t);
    }

    /* renamed from: S1 */
    public void mo24285S1(@C12580l T t, @C12580l Throwable th) {
        C11723c2.C11724a.m46184b(this, (CancellationException) null, 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        mo24285S1(obj, (Throwable) obj2);
        return C11079d2.f28267a;
    }
}
