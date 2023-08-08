package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,118:1\n32#2,4:119\n*S KotlinDebug\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n*L\n62#1:119,4\n*E\n"})
public final class FlowKt__CollectKt$collectIndexed$2 implements C11908f<T> {

    /* renamed from: a */
    public int f29296a;

    /* renamed from: b */
    public final /* synthetic */ C11305q<Integer, T, C11045c<? super C11079d2>, Object> f29297b;

    public FlowKt__CollectKt$collectIndexed$2(C11305q<? super Integer, ? super T, ? super C11045c<? super C11079d2>, ? extends Object> qVar) {
        this.f29297b = qVar;
    }

    @C12580l
    /* renamed from: c */
    public Object mo24085c(T t, @C12579k C11045c<? super C11079d2> cVar) {
        C11322b0.m43482e(4);
        new FlowKt__CollectKt$collectIndexed$2$emit$1(this, cVar);
        C11322b0.m43482e(5);
        C11305q<Integer, T, C11045c<? super C11079d2>, Object> qVar = this.f29297b;
        int i = this.f29296a;
        this.f29296a = i + 1;
        if (i >= 0) {
            qVar.invoke(Integer.valueOf(i), t, cVar);
            return C11079d2.f28267a;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    @C12580l
    public Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
        C11305q<Integer, T, C11045c<? super C11079d2>, Object> qVar = this.f29297b;
        int i = this.f29296a;
        this.f29296a = i + 1;
        if (i >= 0) {
            Object invoke = qVar.invoke(C11064a.m42620f(i), t, cVar);
            if (invoke == C11063b.m42612h()) {
                return invoke;
            }
            return C11079d2.f28267a;
        }
        throw new ArithmeticException("Index overflow has happened");
    }
}
