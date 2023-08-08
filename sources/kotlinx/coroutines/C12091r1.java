package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.C11314h;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.r1 */
public final class C12091r1 {
    @C12095s1
    /* renamed from: a */
    public static /* synthetic */ void m48303a() {
    }

    @C12579k
    /* renamed from: b */
    public static final Executor m48304b(@C12579k CoroutineDispatcher coroutineDispatcher) {
        Executor a0;
        ExecutorCoroutineDispatcher executorCoroutineDispatcher = coroutineDispatcher instanceof ExecutorCoroutineDispatcher ? (ExecutorCoroutineDispatcher) coroutineDispatcher : null;
        return (executorCoroutineDispatcher == null || (a0 = executorCoroutineDispatcher.mo23573a0()) == null) ? new C11722c1(coroutineDispatcher) : a0;
    }

    @C11314h(name = "from")
    @C12579k
    /* renamed from: c */
    public static final CoroutineDispatcher m48305c(@C12579k Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        C11722c1 c1Var = executor instanceof C11722c1 ? (C11722c1) executor : null;
        return (c1Var == null || (coroutineDispatcher = c1Var.f29066a) == null) ? new C12086q1(executor) : coroutineDispatcher;
    }

    @C11314h(name = "from")
    @C12579k
    /* renamed from: d */
    public static final ExecutorCoroutineDispatcher m48306d(@C12579k ExecutorService executorService) {
        return new C12086q1(executorService);
    }
}
