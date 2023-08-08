package kotlinx.coroutines.scheduling;

import kotlin.jvm.C11314h;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.scheduling.a */
public final class C12101a {
    @C11314h(name = "isSchedulerWorker")
    /* renamed from: a */
    public static final boolean m48389a(@C12579k Thread thread) {
        return thread instanceof CoroutineScheduler.C12100c;
    }

    @C11314h(name = "mayNotBlock")
    /* renamed from: b */
    public static final boolean m48390b(@C12579k Thread thread) {
        if (!(thread instanceof CoroutineScheduler.C12100c) || ((CoroutineScheduler.C12100c) thread).f29791c != CoroutineScheduler.WorkerState.CPU_ACQUIRED) {
            return false;
        }
        return true;
    }
}
