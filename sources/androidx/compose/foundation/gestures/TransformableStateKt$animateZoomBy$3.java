package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C1964f;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1976i;
import androidx.compose.animation.core.C1980j;
import androidx.compose.animation.core.C1983k;
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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", mo22502f = "TransformableState.kt", mo22503i = {}, mo22504l = {138}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/foundation/gestures/p;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TransformableStateKt$animateZoomBy$3 extends SuspendLambda implements C11304p<C2209p, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C1968g<Float> $animationSpec;
    final /* synthetic */ Ref.FloatRef $previous;
    final /* synthetic */ float $zoomFactor;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateZoomBy$3(Ref.FloatRef floatRef, float f, C1968g<Float> gVar, C11045c<? super TransformableStateKt$animateZoomBy$3> cVar) {
        super(2, cVar);
        this.$previous = floatRef;
        this.$zoomFactor = f;
        this.$animationSpec = gVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        TransformableStateKt$animateZoomBy$3 transformableStateKt$animateZoomBy$3 = new TransformableStateKt$animateZoomBy$3(this.$previous, this.$zoomFactor, this.$animationSpec, cVar);
        transformableStateKt$animateZoomBy$3.L$0 = obj;
        return transformableStateKt$animateZoomBy$3;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C2209p pVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((TransformableStateKt$animateZoomBy$3) create(pVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C2209p pVar = (C2209p) this.L$0;
            C1976i c = C1980j.m8428c(this.$previous.element, 0.0f, 0, 0, false, 30, (Object) null);
            Float e = C11064a.m42619e(this.$zoomFactor);
            C1968g<Float> gVar = this.$animationSpec;
            final Ref.FloatRef floatRef = this.$previous;
            C21821 r6 = new C11300l<C1964f<Float, C1983k>, C11079d2>() {
                /* renamed from: a */
                public final void mo7519a(@C12579k C1964f<Float, C1983k> fVar) {
                    boolean z;
                    float f;
                    Intrinsics.checkNotNullParameter(fVar, "$this$animateTo");
                    if (floatRef.element == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = fVar.mo6828g().floatValue() / floatRef.element;
                    }
                    C2209p.m9577b(pVar, f, 0, 0.0f, 6, (Object) null);
                    floatRef.element = fVar.mo6828g().floatValue();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo7519a((C1964f) obj);
                    return C11079d2.f28267a;
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.m8086m(c, e, gVar, false, r6, this, 4, (Object) null) == h) {
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
