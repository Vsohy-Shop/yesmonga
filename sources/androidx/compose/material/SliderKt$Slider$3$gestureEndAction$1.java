package androidx.compose.material;

import androidx.compose.runtime.C8700z0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$Slider$3$gestureEndAction$1 extends Lambda implements C11300l<Float, C11079d2> {
    final /* synthetic */ SliderDraggableState $draggableState;
    final /* synthetic */ Ref.FloatRef $maxPx;
    final /* synthetic */ Ref.FloatRef $minPx;
    final /* synthetic */ C11289a<C11079d2> $onValueChangeFinished;
    final /* synthetic */ C8700z0<Float> $rawOffset;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ List<Float> $tickFractions;

    @C11067d(mo22501c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", mo22502f = "Slider.kt", mo22503i = {}, mo22504l = {212}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1 */
    public static final class C29791 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C29791(sliderDraggableState, floatValue, v, f2, aVar2, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                SliderDraggableState sliderDraggableState = sliderDraggableState;
                float f = floatValue;
                float f2 = v;
                float f3 = f2;
                this.label = 1;
                if (SliderKt.m13805x(sliderDraggableState, f, f2, f3, this) == h) {
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
            return ((C29791) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3$gestureEndAction$1(C8700z0<Float> z0Var, List<Float> list, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, C12074o0 o0Var, SliderDraggableState sliderDraggableState, C11289a<C11079d2> aVar) {
        super(1);
        this.$rawOffset = z0Var;
        this.$tickFractions = list;
        this.$minPx = floatRef;
        this.$maxPx = floatRef2;
        this.$scope = o0Var;
        this.$draggableState = sliderDraggableState;
        this.$onValueChangeFinished = aVar;
    }

    /* renamed from: a */
    public final void mo10400a(float f) {
        boolean z;
        C11289a<C11079d2> aVar;
        final float floatValue = this.$rawOffset.getValue().floatValue();
        final float v = SliderKt.m13780I(floatValue, this.$tickFractions, this.$minPx.element, this.$maxPx.element);
        if (floatValue == v) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C12074o0 o0Var = this.$scope;
            final SliderDraggableState sliderDraggableState = this.$draggableState;
            final C11289a<C11079d2> aVar2 = this.$onValueChangeFinished;
            final float f2 = f;
            C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C29791((C11045c<? super C29791>) null), 3, (Object) null);
        } else if (!this.$draggableState.mo10378h() && (aVar = this.$onValueChangeFinished) != null) {
            aVar.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo10400a(((Number) obj).floatValue());
        return C11079d2.f28267a;
    }
}
