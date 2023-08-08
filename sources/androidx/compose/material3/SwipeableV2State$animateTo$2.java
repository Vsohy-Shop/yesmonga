package androidx.compose.material3;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.SwipeableV2State$animateTo$2", mo22502f = "SwipeableV2.kt", mo22503i = {}, mo22504l = {353}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@"}, mo22516d2 = {"T", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableV2State$animateTo$2 extends SuspendLambda implements C11300l<C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Float $targetOffset;
    final /* synthetic */ T $targetValue;
    final /* synthetic */ float $velocity;
    int label;
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$animateTo$2(SwipeableV2State<T> swipeableV2State, T t, Float f, float f2, C11045c<? super SwipeableV2State$animateTo$2> cVar) {
        super(1, cVar);
        this.this$0 = swipeableV2State;
        this.$targetValue = t;
        this.$targetOffset = f;
        this.$velocity = f2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new SwipeableV2State$animateTo$2(this.this$0, this.$targetValue, this.$targetOffset, this.$velocity, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        float f;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            this.this$0.mo12095G(this.$targetValue);
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            Float v = this.this$0.mo12118v();
            if (v != null) {
                f = v.floatValue();
            } else {
                f = 0.0f;
            }
            floatRef.element = f;
            float floatValue = this.$targetOffset.floatValue();
            float f2 = this.$velocity;
            C1968g<Float> n = this.this$0.mo12110n();
            final SwipeableV2State<T> swipeableV2State = this.this$0;
            C81261 r8 = new C11304p<Float, Float, C11079d2>() {
                /* renamed from: a */
                public final void mo12128a(float f, float f2) {
                    swipeableV2State.mo12099K(Float.valueOf(f));
                    floatRef.element = f;
                    swipeableV2State.mo12098J(f2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    mo12128a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return C11079d2.f28267a;
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.m8076c(f, floatValue, f2, n, r8, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.mo12098J(0.0f);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super C11079d2> cVar) {
        return ((SwipeableV2State$animateTo$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
