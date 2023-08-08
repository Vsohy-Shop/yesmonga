package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", mo22502f = "ScrollExtensions.kt", mo22503i = {}, mo22504l = {41}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/foundation/gestures/l;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements C11304p<C2201l, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C1968g<Float> $animationSpec;
    final /* synthetic */ Ref.FloatRef $previousValue;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(float f, C1968g<Float> gVar, Ref.FloatRef floatRef, C11045c<? super ScrollExtensionsKt$animateScrollBy$2> cVar) {
        super(2, cVar);
        this.$value = f;
        this.$animationSpec = gVar;
        this.$previousValue = floatRef;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$value, this.$animationSpec, this.$previousValue, cVar);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C2201l lVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create(lVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C2201l lVar = (C2201l) this.L$0;
            float f = this.$value;
            C1968g<Float> gVar = this.$animationSpec;
            final Ref.FloatRef floatRef = this.$previousValue;
            C21521 r7 = new C11304p<Float, Float, C11079d2>() {
                /* renamed from: a */
                public final void mo7440a(float f, float f2) {
                    Ref.FloatRef floatRef = floatRef;
                    float f3 = floatRef.element;
                    floatRef.element = f3 + lVar.mo7360a(f - f3);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    mo7440a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return C11079d2.f28267a;
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.m8079f(0.0f, f, 0.0f, gVar, r7, this, 4, (Object) null) == h) {
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
