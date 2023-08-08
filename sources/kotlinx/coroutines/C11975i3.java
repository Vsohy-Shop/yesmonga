package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nThreadPoolDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadPoolDispatcher.kt\nkotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
/* renamed from: kotlinx.coroutines.i3 */
public final /* synthetic */ class C11975i3 {
    @C12579k
    @C12176y0
    /* renamed from: b */
    public static final ExecutorCoroutineDispatcher m47722b(int i, @C12579k String str) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            return C12091r1.m48306d(Executors.newScheduledThreadPool(i, new C11969h3(i, str, new AtomicInteger())));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i + " specified").toString());
    }

    /* renamed from: c */
    public static final Thread m47723c(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
