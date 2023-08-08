package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1946b;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.gestures.C2192e;
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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.SliderKt$animateToTarget$2", mo22502f = "Slider.kt", mo22503i = {}, mo22504l = {1221}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/foundation/gestures/e;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SliderKt$animateToTarget$2 extends SuspendLambda implements C11304p<C2192e, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ float $current;
    final /* synthetic */ float $target;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$animateToTarget$2(float f, float f2, float f3, C11045c<? super SliderKt$animateToTarget$2> cVar) {
        super(2, cVar);
        this.$current = f;
        this.$target = f2;
        this.$velocity = f3;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.$current, this.$target, this.$velocity, cVar);
        sliderKt$animateToTarget$2.L$0 = obj;
        return sliderKt$animateToTarget$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C2192e eVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SliderKt$animateToTarget$2) create(eVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C2192e eVar = (C2192e) this.L$0;
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            float f = this.$current;
            floatRef.element = f;
            Animatable b = C1946b.m8288b(f, 0.0f, 2, (Object) null);
            Float e = C11064a.m42619e(this.$target);
            C2023z0 E = SliderKt.f19678k;
            Float e2 = C11064a.m42619e(this.$velocity);
            C80931 r11 = new C11300l<Animatable<Float, C1983k>, C11079d2>() {
                /* renamed from: a */
                public final void mo11918a(@C12579k Animatable<Float, C1983k> animatable) {
                    Intrinsics.checkNotNullParameter(animatable, "$this$animateTo");
                    eVar.mo7352a(animatable.mo6613u().floatValue() - floatRef.element);
                    floatRef.element = animatable.mo6613u().floatValue();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo11918a((Animatable) obj);
                    return C11079d2.f28267a;
                }
            };
            this.label = 1;
            if (b.mo6601h(e, E, e2, r11, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
