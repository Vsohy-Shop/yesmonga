package kotlinx.coroutines.flow;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.time.C11636e;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"T", "emittedItem", "", "a", "(Ljava/lang/Object;)Ljava/lang/Long;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FlowKt__DelayKt$debounce$3 extends Lambda implements C11300l<T, Long> {
    final /* synthetic */ C11300l<T, C11636e> $timeout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounce$3(C11300l<? super T, C11636e> lVar) {
        super(1);
        this.$timeout = lVar;
    }

    @C12579k
    /* renamed from: a */
    public final Long invoke(T t) {
        return Long.valueOf(DelayKt.m45928e(this.$timeout.invoke(t).mo23436x2()));
    }
}
