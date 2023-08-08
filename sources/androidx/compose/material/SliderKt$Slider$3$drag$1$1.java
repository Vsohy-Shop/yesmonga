package androidx.compose.material;

import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material.SliderKt$Slider$3$drag$1$1", mo22502f = "Slider.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SliderKt$Slider$3$drag$1$1 extends SuspendLambda implements C11305q<C12074o0, Float, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C8578k2<C11300l<Float, C11079d2>> $gestureEndAction;
    /* synthetic */ float F$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3$drag$1$1(C8578k2<? extends C11300l<? super Float, C11079d2>> k2Var, C11045c<? super SliderKt$Slider$3$drag$1$1> cVar) {
        super(3, cVar);
        this.$gestureEndAction = k2Var;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo10398g(@C12579k C12074o0 o0Var, float f, @C12580l C11045c<? super C11079d2> cVar) {
        SliderKt$Slider$3$drag$1$1 sliderKt$Slider$3$drag$1$1 = new SliderKt$Slider$3$drag$1$1(this.$gestureEndAction, cVar);
        sliderKt$Slider$3$drag$1$1.F$0 = f;
        return sliderKt$Slider$3$drag$1$1.invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo10398g((C12074o0) obj, ((Number) obj2).floatValue(), (C11045c) obj3);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            this.$gestureEndAction.getValue().invoke(C11064a.m42619e(this.F$0));
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
