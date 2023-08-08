package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
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

@C11067d(mo22501c = "androidx.compose.animation.core.Transition$animateTo$1$1", mo22502f = "Transition.kt", mo22503i = {0}, mo22504l = {434}, mo22505m = "invokeSuspend", mo22506n = {"$this$LaunchedEffect"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class Transition$animateTo$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Transition<S> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1(Transition<S> transition, C11045c<? super Transition$animateTo$1$1> cVar) {
        super(2, cVar);
        this.this$0 = transition;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        Transition$animateTo$1$1 transition$animateTo$1$1 = new Transition$animateTo$1$1(this.this$0, cVar);
        transition$animateTo$1$1.L$0 = obj;
        return transition$animateTo$1$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C12074o0 o0Var;
        C19311 r4;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            o0Var = (C12074o0) this.L$0;
        } else if (i == 1) {
            o0Var = (C12074o0) this.L$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            final float q = SuspendAnimationKt.m8090q(o0Var.getCoroutineContext());
            final Transition<S> transition = this.this$0;
            r4 = new C11300l<Long, C11079d2>() {
                /* renamed from: a */
                public final void mo6755a(long j) {
                    if (!transition.mo6711t()) {
                        transition.mo6713w(j / 1, q);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo6755a(((Number) obj).longValue());
                    return C11079d2.f28267a;
                }
            };
            this.L$0 = o0Var;
            this.label = 1;
        } while (MonotonicFrameClockKt.m29919f(r4, this) != h);
        return h;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((Transition$animateTo$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
