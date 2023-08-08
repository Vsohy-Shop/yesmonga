package kotlinx.coroutines.flow.internal;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class UndispatchedContextCollector<T> implements C11908f<T> {
    @C12579k

    /* renamed from: a */
    public final CoroutineContext f29503a;
    @C12579k

    /* renamed from: b */
    public final Object f29504b;
    @C12579k

    /* renamed from: c */
    public final C11304p<T, C11045c<? super C11079d2>, Object> f29505c;

    public UndispatchedContextCollector(@C12579k C11908f<? super T> fVar, @C12579k CoroutineContext coroutineContext) {
        this.f29503a = coroutineContext;
        this.f29504b = ThreadContextKt.m47767b(coroutineContext);
        this.f29505c = new UndispatchedContextCollector$emitRef$1(fVar, (C11045c<? super UndispatchedContextCollector$emitRef$1>) null);
    }

    @C12580l
    public Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
        Object c = C11927d.m47585c(this.f29503a, t, this.f29504b, this.f29505c, cVar);
        return c == C11063b.m42612h() ? c : C11079d2.f28267a;
    }
}
