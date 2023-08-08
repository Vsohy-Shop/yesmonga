package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.TooltipSync$show$6", mo22502f = "Tooltip.kt", mo22503i = {}, mo22504l = {655}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TooltipSync$show$6 extends SuspendLambda implements C11300l<C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11289a<C11079d2> $cleanUp;
    final /* synthetic */ C11300l<C11045c<? super C11079d2>, Object> $runBlock;
    final /* synthetic */ C8265p3 $state;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipSync$show$6(C8265p3 p3Var, C11300l<? super C11045c<? super C11079d2>, ? extends Object> lVar, C11289a<C11079d2> aVar, C11045c<? super TooltipSync$show$6> cVar) {
        super(1, cVar);
        this.$state = p3Var;
        this.$runBlock = lVar;
        this.$cleanUp = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new TooltipSync$show$6(this.$state, this.$runBlock, this.$cleanUp, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            TooltipSync.f19952a.mo12396d(this.$state);
            C11300l<C11045c<? super C11079d2>, Object> lVar = this.$runBlock;
            this.label = 1;
            if (lVar.invoke(this) == h) {
                return h;
            }
        } else if (i == 1) {
            try {
                C11661u0.m45747n(obj);
            } catch (Throwable th) {
                TooltipSync.f19952a.mo12396d((C8265p3) null);
                this.$cleanUp.invoke();
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        TooltipSync.f19952a.mo12396d((C8265p3) null);
        this.$cleanUp.invoke();
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super C11079d2> cVar) {
        return ((TooltipSync$show$6) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
