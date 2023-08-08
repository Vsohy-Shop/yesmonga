package com.carrefour.fid.android.shared.extension;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.FlowKt$LaunchedEffectWithLifecycle$1", mo22502f = "Flow.kt", mo22503i = {}, mo22504l = {33}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FlowKt$LaunchedEffectWithLifecycle$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11908f<T> $collector;
    final /* synthetic */ C11907e<T> $flow;
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.FlowKt$LaunchedEffectWithLifecycle$1$1", mo22502f = "Flow.kt", mo22503i = {}, mo22504l = {34}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.shared.extension.FlowKt$LaunchedEffectWithLifecycle$1$1 */
    public static final class C287101 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C287101(eVar, fVar, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11907e<T> eVar = eVar;
                C11908f<T> fVar = fVar;
                this.label = 1;
                if (eVar.collect(fVar, this) == h) {
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
            return ((C287101) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt$LaunchedEffectWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, C11907e<? extends T> eVar, C11908f<? super T> fVar, C11045c<? super FlowKt$LaunchedEffectWithLifecycle$1> cVar) {
        super(2, cVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$flow = eVar;
        this.$collector = fVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new FlowKt$LaunchedEffectWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$flow, this.$collector, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            final C11907e<T> eVar = this.$flow;
            final C11908f<T> fVar = this.$collector;
            C287101 r3 = new C287101((C11045c<? super C287101>) null);
            this.label = 1;
            if (RepeatOnLifecycleKt.m90581a(lifecycle, state, r3, this) == h) {
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
        return ((FlowKt$LaunchedEffectWithLifecycle$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
