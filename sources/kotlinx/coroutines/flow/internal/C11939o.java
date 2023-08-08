package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,132:1\n28#2,4:133\n28#2,4:138\n20#3:137\n20#3:142\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n*L\n126#1:133,4\n128#1:138,4\n126#1:137\n128#1:142\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.internal.o */
public final class C11939o extends SharedFlowImpl<Integer> implements C11952u<Integer> {
    public C11939o(int i) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        mo24198a(Integer.valueOf(i));
    }

    @C12579k
    /* renamed from: d0 */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) mo24188P()).intValue());
        }
        return valueOf;
    }

    /* renamed from: e0 */
    public final boolean mo24268e0(int i) {
        boolean a;
        synchronized (this) {
            a = mo24198a(Integer.valueOf(((Number) mo24188P()).intValue() + i));
        }
        return a;
    }
}
