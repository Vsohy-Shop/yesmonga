package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class CancellableFlowImpl<T> implements C11903a<T> {
    @C12579k

    /* renamed from: a */
    public final C11907e<T> f29274a;

    public CancellableFlowImpl(@C12579k C11907e<? extends T> eVar) {
        this.f29274a = eVar;
    }

    @C12580l
    public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = this.f29274a.collect(new CancellableFlowImpl$collect$2(fVar), cVar);
        return collect == C11063b.m42612h() ? collect : C11079d2.f28267a;
    }
}
