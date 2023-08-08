package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C1964f;
import androidx.compose.animation.core.C1976i;
import androidx.compose.animation.core.C1980j;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C2013v;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", mo22502f = "Scrollable.kt", mo22503i = {0}, mo22504l = {545}, mo22505m = "invokeSuspend", mo22506n = {"velocityLeft"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super Float>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ C2201l $this_performFling;
    Object L$0;
    int label;
    final /* synthetic */ DefaultFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f, DefaultFlingBehavior defaultFlingBehavior, C2201l lVar, C11045c<? super DefaultFlingBehavior$performFling$2> cVar) {
        super(2, cVar);
        this.$initialVelocity = f;
        this.this$0 = defaultFlingBehavior;
        this.$this_performFling = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        float f;
        Ref.FloatRef floatRef;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            if (Math.abs(this.$initialVelocity) > 1.0f) {
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                floatRef2.element = this.$initialVelocity;
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                C1976i c = C1980j.m8428c(0.0f, this.$initialVelocity, 0, 0, false, 28, (Object) null);
                C2013v b = this.this$0.f5846a;
                final C2201l lVar = this.$this_performFling;
                final DefaultFlingBehavior defaultFlingBehavior = this.this$0;
                C21351 r5 = new C11300l<C1964f<Float, C1983k>, C11079d2>() {
                    /* renamed from: a */
                    public final void mo7358a(@C12579k C1964f<Float, C1983k> fVar) {
                        Intrinsics.checkNotNullParameter(fVar, "$this$animateDecay");
                        float floatValue = fVar.mo6828g().floatValue() - floatRef3.element;
                        float a = lVar.mo7360a(floatValue);
                        floatRef3.element = fVar.mo6828g().floatValue();
                        floatRef2.element = fVar.mo6829h().floatValue();
                        if (Math.abs(floatValue - a) > 0.5f) {
                            fVar.mo6822a();
                        }
                        DefaultFlingBehavior defaultFlingBehavior = defaultFlingBehavior;
                        defaultFlingBehavior.mo7356d(defaultFlingBehavior.mo7355c() + 1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        mo7358a((C1964f) obj);
                        return C11079d2.f28267a;
                    }
                };
                this.L$0 = floatRef2;
                this.label = 1;
                if (SuspendAnimationKt.m8084k(c, b, false, r5, this, 2, (Object) null) == h) {
                    return h;
                }
                floatRef = floatRef2;
            } else {
                f = this.$initialVelocity;
                return C11064a.m42619e(f);
            }
        } else if (i == 1) {
            floatRef = (Ref.FloatRef) this.L$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f = floatRef.element;
        return C11064a.m42619e(f);
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super Float> cVar) {
        return ((DefaultFlingBehavior$performFling$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
