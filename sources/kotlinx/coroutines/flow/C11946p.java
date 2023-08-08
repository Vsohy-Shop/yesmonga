package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.internal.C11926c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.p */
public final class C11946p extends C11926c<SharedFlowImpl<?>> {
    @C11287e

    /* renamed from: a */
    public long f29528a = -1;
    @C12580l
    @C11287e

    /* renamed from: b */
    public C11045c<? super C11079d2> f29529b;

    /* renamed from: c */
    public boolean mo24265a(@C12579k SharedFlowImpl<?> sharedFlowImpl) {
        if (this.f29528a >= 0) {
            return false;
        }
        this.f29528a = sharedFlowImpl.mo24202c0();
        return true;
    }

    @C12579k
    /* renamed from: d */
    public C11045c<C11079d2>[] mo24266b(@C12579k SharedFlowImpl<?> sharedFlowImpl) {
        long j = this.f29528a;
        this.f29528a = -1;
        this.f29529b = null;
        return sharedFlowImpl.mo24200b0(j);
    }
}
