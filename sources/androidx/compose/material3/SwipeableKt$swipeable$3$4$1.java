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

@C11067d(mo22501c = "androidx.compose.material3.SwipeableKt$swipeable$3$4$1", mo22502f = "Swipeable.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SwipeableKt$swipeable$3$4$1 extends SuspendLambda implements C11305q<C12074o0, Float, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ SwipeableState<T> $state;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.material3.SwipeableKt$swipeable$3$4$1$1", mo22502f = "Swipeable.kt", mo22503i = {}, mo22504l = {612}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.material3.SwipeableKt$swipeable$3$4$1$1 */
    public static final class C81181 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C81181(swipeableState, f, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                SwipeableState<T> swipeableState = swipeableState;
                float f = f;
                this.label = 1;
                if (swipeableState.mo12040G(f, this) == h) {
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
            return ((C81181) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeable$3$4$1(SwipeableState<T> swipeableState, C11045c<? super SwipeableKt$swipeable$3$4$1> cVar) {
        super(3, cVar);
        this.$state = swipeableState;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo12033g(@C12579k C12074o0 o0Var, float f, @C12580l C11045c<? super C11079d2> cVar) {
        SwipeableKt$swipeable$3$4$1 swipeableKt$swipeable$3$4$1 = new SwipeableKt$swipeable$3$4$1(this.$state, cVar);
        swipeableKt$swipeable$3$4$1.L$0 = o0Var;
        swipeableKt$swipeable$3$4$1.F$0 = f;
        return swipeableKt$swipeable$3$4$1.invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo12033g((C12074o0) obj, ((Number) obj2).floatValue(), (C11045c) obj3);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            final float f = this.F$0;
            final SwipeableState<T> swipeableState = this.$state;
            C11723c2 unused = C12038j.m48061f((C12074o0) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C81181((C11045c<? super C81181>) null), 3, (Object) null);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
