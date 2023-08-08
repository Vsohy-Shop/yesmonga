package kotlinx.coroutines.flow;

import androidx.concurrent.futures.C16563a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.flow.internal.C11925b;
import kotlinx.coroutines.flow.internal.C11926c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,428:1\n1#2:429\n314#3,11:430\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n298#1:430,11\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.w */
public final class C11954w extends C11926c<StateFlowImpl<?>> {
    @C12579k

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f29540a = AtomicReferenceFieldUpdater.newUpdater(C11954w.class, Object.class, "_state");
    @C11394v
    @C12580l
    private volatile Object _state;

    /* renamed from: d */
    public boolean mo24265a(@C12579k StateFlowImpl<?> stateFlowImpl) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29540a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, C11953v.f29538a);
        return true;
    }

    @C12580l
    /* renamed from: e */
    public final Object mo24276e(@C12579k C11045c<? super C11079d2> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        if (!C16563a.m75000a(f29540a, this, C11953v.f29538a, pVar)) {
            Result.C10852a aVar = Result.f28060a;
            pVar.resumeWith(Result.m38702b(C11079d2.f28267a));
        }
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (y == C11063b.m42612h()) {
            return y;
        }
        return C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: f */
    public C11045c<C11079d2>[] mo24266b(@C12579k StateFlowImpl<?> stateFlowImpl) {
        f29540a.set(this, (Object) null);
        return C11925b.f29510a;
    }

    /* renamed from: g */
    public final void mo24278g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* renamed from: h */
    public final void mo24279h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29540a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null && obj != C11953v.f29539b) {
                if (obj == C11953v.f29538a) {
                    if (C16563a.m75000a(f29540a, this, obj, C11953v.f29539b)) {
                        return;
                    }
                } else if (C16563a.m75000a(f29540a, this, obj, C11953v.f29538a)) {
                    Result.C10852a aVar = Result.f28060a;
                    ((C12078p) obj).resumeWith(Result.m38702b(C11079d2.f28267a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public final boolean mo24280i() {
        Object andSet = f29540a.getAndSet(this, C11953v.f29538a);
        Intrinsics.checkNotNull(andSet);
        if (andSet == C11953v.f29539b) {
            return true;
        }
        return false;
    }
}
