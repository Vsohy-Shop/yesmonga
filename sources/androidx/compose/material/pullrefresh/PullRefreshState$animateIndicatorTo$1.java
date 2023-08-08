package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
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

@C11067d(mo22501c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", mo22502f = "PullRefreshState.kt", mo22503i = {}, mo22504l = {185}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PullRefreshState$animateIndicatorTo$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ float $offset;
    int label;
    final /* synthetic */ PullRefreshState this$0;

    @C11067d(mo22501c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", mo22502f = "PullRefreshState.kt", mo22503i = {}, mo22504l = {186}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1 */
    public static final class C78971 extends SuspendLambda implements C11300l<C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
            return new C78971(pullRefreshState, f, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                float c = pullRefreshState.mo10937m();
                float f = f;
                final PullRefreshState pullRefreshState = pullRefreshState;
                C78981 r7 = new C11304p<Float, Float, C11079d2>() {
                    /* renamed from: a */
                    public final void mo10954a(float f, float f2) {
                        pullRefreshState.mo10947w(f);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        mo10954a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                        return C11079d2.f28267a;
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.m8079f(c, f, 0.0f, (C1968g) null, r7, this, 12, (Object) null) == h) {
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
        public final Object invoke(@C12580l C11045c<? super C11079d2> cVar) {
            return ((C78971) create(cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshState$animateIndicatorTo$1(PullRefreshState pullRefreshState, float f, C11045c<? super PullRefreshState$animateIndicatorTo$1> cVar) {
        super(2, cVar);
        this.this$0 = pullRefreshState;
        this.$offset = f;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PullRefreshState$animateIndicatorTo$1(this.this$0, this.$offset, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            MutatorMutex b = this.this$0.f18939i;
            final PullRefreshState pullRefreshState = this.this$0;
            final float f = this.$offset;
            C78971 r5 = new C78971((C11045c<? super C78971>) null);
            this.label = 1;
            if (MutatorMutex.m9039e(b, (MutatePriority) null, r5, this, 1, (Object) null) == h) {
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
        return ((PullRefreshState$animateIndicatorTo$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
