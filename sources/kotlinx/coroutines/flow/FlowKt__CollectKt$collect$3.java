package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3\n*L\n1#1,118:1\n*E\n"})
public final class FlowKt__CollectKt$collect$3 implements C11908f<T> {

    /* renamed from: a */
    public final /* synthetic */ C11304p<T, C11045c<? super C11079d2>, Object> f29295a;

    public FlowKt__CollectKt$collect$3(C11304p<? super T, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        this.f29295a = pVar;
    }

    @C12580l
    /* renamed from: c */
    public Object mo24084c(T t, @C12579k C11045c<? super C11079d2> cVar) {
        C11322b0.m43482e(4);
        new FlowKt__CollectKt$collect$3$emit$1(this, cVar);
        C11322b0.m43482e(5);
        this.f29295a.invoke(t, cVar);
        return C11079d2.f28267a;
    }

    @C12580l
    public Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
        Object invoke = this.f29295a.invoke(t, cVar);
        return invoke == C11063b.m42612h() ? invoke : C11079d2.f28267a;
    }
}
