package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C11936l;
import kotlinx.coroutines.internal.C12009o0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.v */
public final class C11953v {
    @C12579k

    /* renamed from: a */
    public static final C12009o0 f29538a = new C12009o0("NONE");
    @C12579k

    /* renamed from: b */
    public static final C12009o0 f29539b = new C12009o0("PENDING");

    @C12579k
    /* renamed from: a */
    public static final <T> C11940j<T> m47628a(T t) {
        if (t == null) {
            t = C11936l.f29516a;
        }
        return new StateFlowImpl(t);
    }

    @C12579k
    /* renamed from: d */
    public static final <T> C11907e<T> m47631d(@C12579k C11952u<? extends T> uVar, @C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        boolean z = false;
        if (i >= 0 && i < 2) {
            z = true;
        }
        if ((z || i == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) {
            return uVar;
        }
        return C11945o.m47613e(uVar, coroutineContext, i, bufferOverflow);
    }

    /* renamed from: e */
    public static final <T> T m47632e(@C12579k C11940j<T> jVar, @C12579k C11300l<? super T, ? extends T> lVar) {
        T value;
        do {
            value = jVar.getValue();
        } while (!jVar.mo24216e(value, lVar.invoke(value)));
        return value;
    }

    /* renamed from: f */
    public static final <T> void m47633f(@C12579k C11940j<T> jVar, @C12579k C11300l<? super T, ? extends T> lVar) {
        T value;
        do {
            value = jVar.getValue();
        } while (!jVar.mo24216e(value, lVar.invoke(value)));
    }

    /* renamed from: g */
    public static final <T> T m47634g(@C12579k C11940j<T> jVar, @C12579k C11300l<? super T, ? extends T> lVar) {
        T value;
        T invoke;
        do {
            value = jVar.getValue();
            invoke = lVar.invoke(value);
        } while (!jVar.mo24216e(value, invoke));
        return invoke;
    }
}
