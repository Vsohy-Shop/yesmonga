package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.time.C11636e;
import kotlinx.coroutines.TimeoutCancellationException;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", mo22502f = "Delay.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@"}, mo22516d2 = {"T", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements C11300l<C11045c<?>, Object> {
    final /* synthetic */ long $timeout;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j, C11045c<? super FlowKt__DelayKt$timeoutInternal$1$1$2> cVar) {
        super(1, cVar);
        this.$timeout = j;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.$timeout, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C11661u0.m45747n(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + C11636e.m45500t2(this.$timeout));
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<?> cVar) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
