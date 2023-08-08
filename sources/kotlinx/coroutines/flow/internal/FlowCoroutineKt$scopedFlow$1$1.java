package kotlinx.coroutines.flow.internal;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", mo22502f = "FlowCoroutine.kt", mo22503i = {}, mo22504l = {51}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"R", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11305q<C12074o0, C11908f<? super R>, C11045c<? super C11079d2>, Object> $block;
    final /* synthetic */ C11908f<R> $this_unsafeFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowCoroutineKt$scopedFlow$1$1(C11305q<? super C12074o0, ? super C11908f<? super R>, ? super C11045c<? super C11079d2>, ? extends Object> qVar, C11908f<? super R> fVar, C11045c<? super FlowCoroutineKt$scopedFlow$1$1> cVar) {
        super(2, cVar);
        this.$block = qVar;
        this.$this_unsafeFlow = fVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.$block, this.$this_unsafeFlow, cVar);
        flowCoroutineKt$scopedFlow$1$1.L$0 = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11305q<C12074o0, C11908f<? super R>, C11045c<? super C11079d2>, Object> qVar = this.$block;
            C11908f<R> fVar = this.$this_unsafeFlow;
            this.label = 1;
            if (qVar.invoke((C12074o0) this.L$0, fVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FlowCoroutineKt$scopedFlow$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
