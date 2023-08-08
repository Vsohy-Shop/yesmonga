package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.C11936l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class DistinctFlowImpl<T> implements C11907e<T> {
    @C12579k

    /* renamed from: a */
    public final C11907e<T> f29276a;
    @C12579k
    @C11287e

    /* renamed from: b */
    public final C11300l<T, Object> f29277b;
    @C12579k
    @C11287e

    /* renamed from: c */
    public final C11304p<Object, Object, Boolean> f29278c;

    public DistinctFlowImpl(@C12579k C11907e<? extends T> eVar, @C12579k C11300l<? super T, ? extends Object> lVar, @C12579k C11304p<Object, Object, Boolean> pVar) {
        this.f29276a = eVar;
        this.f29277b = lVar;
        this.f29278c = pVar;
    }

    @C12580l
    public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = C11936l.f29516a;
        Object collect = this.f29276a.collect(new DistinctFlowImpl$collect$2(this, objectRef, fVar), cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}
