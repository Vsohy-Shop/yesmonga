package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", mo22502f = "AnimatedVisibility.kt", mo22503i = {}, mo22504l = {748}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Transition<EnterExitState> $childTransition;
    final /* synthetic */ C8700z0<Boolean> $isAnimationVisible;
    int label;

    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1$a */
    public static final class C1901a implements C11908f<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C8700z0<Boolean> f5207a;

        public C1901a(C8700z0<Boolean> z0Var) {
            this.f5207a = z0Var;
        }

        @C12580l
        /* renamed from: c */
        public final Object mo6469c(boolean z, @C12579k C11045c<? super C11079d2> cVar) {
            this.f5207a.setValue(C11064a.m42615a(z));
            return C11079d2.f28267a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
            return mo6469c(((Boolean) obj).booleanValue(), cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(Transition<EnterExitState> transition, C8700z0<Boolean> z0Var, C11045c<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1> cVar) {
        super(2, cVar);
        this.$childTransition = transition;
        this.$isAnimationVisible = z0Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(this.$childTransition, this.$isAnimationVisible, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final Transition<EnterExitState> transition = this.$childTransition;
            C11907e v = C8415c2.m30253v(new C11289a<Boolean>() {
                @C12579k
                public final Boolean invoke() {
                    EnterExitState h = transition.mo6700h();
                    EnterExitState enterExitState = EnterExitState.Visible;
                    return Boolean.valueOf(h == enterExitState || transition.mo6706o() == enterExitState);
                }
            });
            C1901a aVar = new C1901a(this.$isAnimationVisible);
            this.label = 1;
            if (v.collect(aVar, this) == h) {
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
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
