package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.SwipeableV2State$swipe$2", mo22502f = "SwipeableV2.kt", mo22503i = {}, mo22504l = {462}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableV2State$swipe$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<C11045c<? super C11079d2>, Object> $action;
    final /* synthetic */ MutatePriority $swipePriority;
    int label;
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$swipe$2(SwipeableV2State<T> swipeableV2State, MutatePriority mutatePriority, C11300l<? super C11045c<? super C11079d2>, ? extends Object> lVar, C11045c<? super SwipeableV2State$swipe$2> cVar) {
        super(2, cVar);
        this.this$0 = swipeableV2State;
        this.$swipePriority = mutatePriority;
        this.$action = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SwipeableV2State$swipe$2(this.this$0, this.$swipePriority, this.$action, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            InternalMutatorMutex c = this.this$0.f19793e;
            MutatePriority mutatePriority = this.$swipePriority;
            C11300l<C11045c<? super C11079d2>, Object> lVar = this.$action;
            this.label = 1;
            if (c.mo11616d(mutatePriority, lVar, this) == h) {
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
        return ((SwipeableV2State$swipe$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
