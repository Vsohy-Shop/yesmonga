package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nExecutors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Executors.kt\nkotlinx/coroutines/ResumeUndispatchedRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
/* renamed from: kotlinx.coroutines.v2 */
public final class C12161v2 implements Runnable {
    @C12579k

    /* renamed from: a */
    public final CoroutineDispatcher f29943a;
    @C12579k

    /* renamed from: b */
    public final C12072o<C11079d2> f29944b;

    public C12161v2(@C12579k CoroutineDispatcher coroutineDispatcher, @C12579k C12072o<? super C11079d2> oVar) {
        this.f29943a = coroutineDispatcher;
        this.f29944b = oVar;
    }

    public void run() {
        this.f29944b.mo24534b0(this.f29943a, C11079d2.f28267a);
    }
}
