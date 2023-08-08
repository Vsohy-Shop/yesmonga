package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1946b;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1983k;
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

@C11067d(mo22501c = "androidx.compose.material3.SwipeableState$animateInternalToOffset$2", mo22502f = "Swipeable.kt", mo22503i = {}, mo22504l = {223}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"T", "Landroidx/compose/foundation/gestures/e;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableState$animateInternalToOffset$2 extends SuspendLambda implements C11304p<C2192e, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C1968g<Float> $spec;
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateInternalToOffset$2(SwipeableState<T> swipeableState, float f, C1968g<Float> gVar, C11045c<? super SwipeableState$animateInternalToOffset$2> cVar) {
        super(2, cVar);
        this.this$0 = swipeableState;
        this.$target = f;
        this.$spec = gVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.this$0, this.$target, this.$spec, cVar);
        swipeableState$animateInternalToOffset$2.L$0 = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C2192e eVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SwipeableState$animateInternalToOffset$2) create(eVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C2192e eVar = (C2192e) this.L$0;
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.element = ((Number) this.this$0.f19765g.getValue()).floatValue();
            this.this$0.f19766h.setValue(C11064a.m42619e(this.$target));
            this.this$0.mo12043J(true);
            Animatable b = C1946b.m8288b(floatRef.element, 0.0f, 2, (Object) null);
            Float e = C11064a.m42619e(this.$target);
            C1968g<Float> gVar = this.$spec;
            C81231 r8 = new C11300l<Animatable<Float, C1983k>, C11079d2>() {
                /* renamed from: a */
                public final void mo12073a(@C12579k Animatable<Float, C1983k> animatable) {
                    Intrinsics.checkNotNullParameter(animatable, "$this$animateTo");
                    eVar.mo7352a(animatable.mo6613u().floatValue() - floatRef.element);
                    floatRef.element = animatable.mo6613u().floatValue();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo12073a((Animatable) obj);
                    return C11079d2.f28267a;
                }
            };
            this.label = 1;
            if (Animatable.m7942i(b, e, gVar, (Object) null, r8, this, 4, (Object) null) == h) {
                return h;
            }
        } else if (i == 1) {
            try {
                C11661u0.m45747n(obj);
            } catch (Throwable th) {
                this.this$0.f19766h.setValue(null);
                this.this$0.mo12043J(false);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.f19766h.setValue(null);
        this.this$0.mo12043J(false);
        return C11079d2.f28267a;
    }
}
