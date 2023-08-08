package androidx.compose.material;

import androidx.compose.foundation.gestures.C2192e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material.SwipeableV2State$snapTo$2", mo22502f = "SwipeableV2.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"T", "Landroidx/compose/foundation/gestures/e;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableV2State$snapTo$2 extends SuspendLambda implements C11304p<C2192e, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Float $targetOffset;
    final /* synthetic */ T $targetValue;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$snapTo$2(SwipeableV2State<T> swipeableV2State, T t, Float f, C11045c<? super SwipeableV2State$snapTo$2> cVar) {
        super(2, cVar);
        this.this$0 = swipeableV2State;
        this.$targetValue = t;
        this.$targetOffset = f;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SwipeableV2State$snapTo$2 swipeableV2State$snapTo$2 = new SwipeableV2State$snapTo$2(this.this$0, this.$targetValue, this.$targetOffset, cVar);
        swipeableV2State$snapTo$2.L$0 = obj;
        return swipeableV2State$snapTo$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C2192e eVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SwipeableV2State$snapTo$2) create(eVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            this.this$0.mo10547D(this.$targetValue);
            ((C2192e) this.L$0).mo7352a(this.$targetOffset.floatValue() - this.this$0.mo10545B());
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
