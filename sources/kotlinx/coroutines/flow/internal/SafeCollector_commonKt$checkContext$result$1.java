package kotlinx.coroutines.flow.internal;

import kotlin.C11076d0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "count", "Lkotlin/coroutines/CoroutineContext$a;", "element", "a", "(ILkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SafeCollector_commonKt$checkContext$result$1 extends Lambda implements C11304p<Integer, CoroutineContext.C11040a, Integer> {
    final /* synthetic */ SafeCollector<?> $this_checkContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SafeCollector_commonKt$checkContext$result$1(SafeCollector<?> safeCollector) {
        super(2);
        this.$this_checkContext = safeCollector;
    }

    @C12579k
    /* renamed from: a */
    public final Integer mo24256a(int i, @C12579k CoroutineContext.C11040a aVar) {
        int i2;
        CoroutineContext.C11042b key = aVar.getKey();
        CoroutineContext.C11040a b = this.$this_checkContext.collectContext.mo7444b(key);
        if (key != C11723c2.f29067w0) {
            if (aVar != b) {
                i2 = Integer.MIN_VALUE;
            } else {
                i2 = i + 1;
            }
            return Integer.valueOf(i2);
        }
        C11723c2 c2Var = (C11723c2) b;
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        C11723c2 b2 = SafeCollector_commonKt.m47566b((C11723c2) aVar, c2Var);
        if (b2 == c2Var) {
            if (c2Var != null) {
                i++;
            }
            return Integer.valueOf(i);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b2 + ", expected child of " + c2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo24256a(((Number) obj).intValue(), (CoroutineContext.C11040a) obj2);
    }
}
