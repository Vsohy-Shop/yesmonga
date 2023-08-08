package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1946b;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11478t;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$RangeSlider$2$gestureEndAction$1 extends Lambda implements C11300l<Boolean, C11079d2> {
    final /* synthetic */ Ref.FloatRef $maxPx;
    final /* synthetic */ Ref.FloatRef $minPx;
    final /* synthetic */ C11289a<C11079d2> $onValueChangeFinished;
    final /* synthetic */ C8578k2<C11300l<C11457f<Float>, C11079d2>> $onValueChangeState;
    final /* synthetic */ C8700z0<Float> $rawOffsetEnd;
    final /* synthetic */ C8700z0<Float> $rawOffsetStart;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ C11457f<Float> $valueRange;

    @C11067d(mo22501c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", mo22502f = "Slider.kt", mo22503i = {}, mo22504l = {360}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1 */
    public static final class C29761 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C29761(floatValue, v, aVar2, z3, z0Var2, z0Var3, k2Var, floatRef, floatRef2, fVar, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                Animatable b = C1946b.m8288b(floatValue, 0.0f, 2, (Object) null);
                Float e = C11064a.m42619e(v);
                C2023z0 p = SliderKt.f7829i;
                Float e2 = C11064a.m42619e(0.0f);
                final boolean z = z3;
                final C8700z0<Float> z0Var = z0Var2;
                final C8700z0<Float> z0Var2 = z0Var3;
                final C8578k2<C11300l<C11457f<Float>, C11079d2>> k2Var = k2Var;
                final Ref.FloatRef floatRef = floatRef;
                final Ref.FloatRef floatRef2 = floatRef2;
                final C11457f<Float> fVar = fVar;
                C29771 r8 = new C11300l<Animatable<Float, C1983k>, C11079d2>() {
                    /* renamed from: a */
                    public final void mo10389a(@C12579k Animatable<Float, C1983k> animatable) {
                        C8700z0<Float> z0Var;
                        Intrinsics.checkNotNullParameter(animatable, "$this$animateTo");
                        if (z) {
                            z0Var = z0Var;
                        } else {
                            z0Var = z0Var2;
                        }
                        z0Var.setValue(animatable.mo6613u());
                        k2Var.getValue().invoke(SliderKt$RangeSlider$2.m13812e(floatRef, floatRef2, fVar, C11478t.m44305e(z0Var.getValue().floatValue(), z0Var2.getValue().floatValue())));
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        mo10389a((Animatable) obj);
                        return C11079d2.f28267a;
                    }
                };
                this.label = 1;
                if (b.mo6601h(e, p, e2, r8, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C11289a<C11079d2> aVar = aVar2;
            if (aVar != null) {
                aVar.invoke();
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C29761) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2$gestureEndAction$1(C8700z0<Float> z0Var, C8700z0<Float> z0Var2, List<Float> list, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, C11289a<C11079d2> aVar, C12074o0 o0Var, C8578k2<? extends C11300l<? super C11457f<Float>, C11079d2>> k2Var, C11457f<Float> fVar) {
        super(1);
        this.$rawOffsetStart = z0Var;
        this.$rawOffsetEnd = z0Var2;
        this.$tickFractions = list;
        this.$minPx = floatRef;
        this.$maxPx = floatRef2;
        this.$onValueChangeFinished = aVar;
        this.$scope = o0Var;
        this.$onValueChangeState = k2Var;
        this.$valueRange = fVar;
    }

    /* renamed from: a */
    public final void mo10387a(boolean z) {
        C8700z0<Float> z0Var;
        boolean z2;
        if (z) {
            z0Var = this.$rawOffsetStart;
        } else {
            z0Var = this.$rawOffsetEnd;
        }
        final float floatValue = z0Var.getValue().floatValue();
        final float v = SliderKt.m13780I(floatValue, this.$tickFractions, this.$minPx.element, this.$maxPx.element);
        if (floatValue == v) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C11289a<C11079d2> aVar = this.$onValueChangeFinished;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        C12074o0 o0Var = this.$scope;
        final C11289a<C11079d2> aVar2 = this.$onValueChangeFinished;
        final C8700z0<Float> z0Var2 = this.$rawOffsetStart;
        final C8700z0<Float> z0Var3 = this.$rawOffsetEnd;
        final C8578k2<C11300l<C11457f<Float>, C11079d2>> k2Var = this.$onValueChangeState;
        final Ref.FloatRef floatRef = this.$minPx;
        final Ref.FloatRef floatRef2 = this.$maxPx;
        final C11457f<Float> fVar = this.$valueRange;
        final boolean z3 = z;
        C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C29761((C11045c<? super C29761>) null), 3, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10387a(((Boolean) obj).booleanValue());
        return C11079d2.f28267a;
    }
}
