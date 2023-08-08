package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.C11403m0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.time.C11636e;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12145t1;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,405:1\n1#2:406\n*E\n"})
public final /* synthetic */ class FlowKt__DelayKt {
    @C12145t1
    @C12579k
    /* renamed from: a */
    public static final <T> C11907e<T> m47024a(@C12579k C11907e<? extends T> eVar, long j) {
        boolean z;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
        } else if (i == 0) {
            return eVar;
        } else {
            return m47028e(eVar, new FlowKt__DelayKt$debounce$2(j));
        }
    }

    @C12145t1
    @C11403m0
    @C12579k
    /* renamed from: b */
    public static final <T> C11907e<T> m47025b(@C12579k C11907e<? extends T> eVar, @C12579k C11300l<? super T, Long> lVar) {
        return m47028e(eVar, lVar);
    }

    @C12145t1
    @C12579k
    /* renamed from: c */
    public static final <T> C11907e<T> m47026c(@C12579k C11907e<? extends T> eVar, long j) {
        return C11909g.m47427a0(eVar, DelayKt.m45928e(j));
    }

    @C12145t1
    @C11314h(name = "debounceDuration")
    @C11403m0
    @C12579k
    /* renamed from: d */
    public static final <T> C11907e<T> m47027d(@C12579k C11907e<? extends T> eVar, @C12579k C11300l<? super T, C11636e> lVar) {
        return m47028e(eVar, new FlowKt__DelayKt$debounce$3(lVar));
    }

    /* renamed from: e */
    public static final <T> C11907e<T> m47028e(C11907e<? extends T> eVar, C11300l<? super T, Long> lVar) {
        return FlowCoroutineKt.m47557b(new FlowKt__DelayKt$debounceInternal$1(lVar, eVar, (C11045c<? super FlowKt__DelayKt$debounceInternal$1>) null));
    }

    @C12579k
    /* renamed from: f */
    public static final ReceiveChannel<C11079d2> m47029f(@C12579k C12074o0 o0Var, long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j2 < 0) {
                z2 = false;
            }
            if (z2) {
                return ProduceKt.m46530f(o0Var, (CoroutineContext) null, 0, new FlowKt__DelayKt$fixedPeriodTicker$3(j2, j, (C11045c<? super FlowKt__DelayKt$fixedPeriodTicker$3>) null), 1, (Object) null);
            }
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
        }
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
    }

    /* renamed from: g */
    public static /* synthetic */ ReceiveChannel m47030g(C12074o0 o0Var, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        return C11909g.m47507y0(o0Var, j, j2);
    }

    @C12145t1
    @C12579k
    /* renamed from: h */
    public static final <T> C11907e<T> m47031h(@C12579k C11907e<? extends T> eVar, long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return FlowCoroutineKt.m47557b(new FlowKt__DelayKt$sample$2(j, eVar, (C11045c<? super FlowKt__DelayKt$sample$2>) null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    @C12145t1
    @C12579k
    /* renamed from: i */
    public static final <T> C11907e<T> m47032i(@C12579k C11907e<? extends T> eVar, long j) {
        return C11909g.m47353B1(eVar, DelayKt.m45928e(j));
    }

    @C12145t1
    @C12579k
    /* renamed from: j */
    public static final <T> C11907e<T> m47033j(@C12579k C11907e<? extends T> eVar, long j) {
        return m47034k(eVar, j);
    }

    /* renamed from: k */
    public static final <T> C11907e<T> m47034k(C11907e<? extends T> eVar, long j) {
        return FlowCoroutineKt.m47557b(new FlowKt__DelayKt$timeoutInternal$1(j, eVar, (C11045c<? super FlowKt__DelayKt$timeoutInternal$1>) null));
    }
}
