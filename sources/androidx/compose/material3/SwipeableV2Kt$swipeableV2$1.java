package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.SwipeableV2Kt$swipeableV2$1", mo22502f = "SwipeableV2.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "", "velocity", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableV2Kt$swipeableV2$1 extends SuspendLambda implements C11305q<C12074o0, Float, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ SwipeableV2State<T> $state;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.material3.SwipeableV2Kt$swipeableV2$1$1", mo22502f = "SwipeableV2.kt", mo22503i = {}, mo22504l = {91}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.SwipeableV2Kt$swipeableV2$1$1 */
    public static final class C81241 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C81241(swipeableV2State, f, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                SwipeableV2State<T> swipeableV2State = swipeableV2State;
                float f = f;
                this.label = 1;
                if (swipeableV2State.mo12100L(f, this) == h) {
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
            return ((C81241) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2Kt$swipeableV2$1(SwipeableV2State<T> swipeableV2State, C11045c<? super SwipeableV2Kt$swipeableV2$1> cVar) {
        super(3, cVar);
        this.$state = swipeableV2State;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo12087g(@C12579k C12074o0 o0Var, float f, @C12580l C11045c<? super C11079d2> cVar) {
        SwipeableV2Kt$swipeableV2$1 swipeableV2Kt$swipeableV2$1 = new SwipeableV2Kt$swipeableV2$1(this.$state, cVar);
        swipeableV2Kt$swipeableV2$1.L$0 = o0Var;
        swipeableV2Kt$swipeableV2$1.F$0 = f;
        return swipeableV2Kt$swipeableV2$1.invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo12087g((C12074o0) obj, ((Number) obj2).floatValue(), (C11045c) obj3);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            final float f = this.F$0;
            final SwipeableV2State<T> swipeableV2State = this.$state;
            C11723c2 unused = C12038j.m48061f((C12074o0) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C81241((C11045c<? super C81241>) null), 3, (Object) null);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
