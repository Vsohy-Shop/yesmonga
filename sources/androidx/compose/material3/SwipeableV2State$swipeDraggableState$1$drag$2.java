package androidx.compose.material3;

import androidx.compose.foundation.gestures.C2192e;
import androidx.compose.material3.SwipeableV2State$swipeDraggableState$1;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.SwipeableV2State$swipeDraggableState$1$drag$2", mo22502f = "SwipeableV2.kt", mo22503i = {}, mo22504l = {188}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@"}, mo22516d2 = {"T", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableV2State$swipeDraggableState$1$drag$2 extends SuspendLambda implements C11300l<C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<C2192e, C11045c<? super C11079d2>, Object> $block;
    int label;
    final /* synthetic */ SwipeableV2State$swipeDraggableState$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$swipeDraggableState$1$drag$2(C11304p<? super C2192e, ? super C11045c<? super C11079d2>, ? extends Object> pVar, SwipeableV2State$swipeDraggableState$1 swipeableV2State$swipeDraggableState$1, C11045c<? super SwipeableV2State$swipeDraggableState$1$drag$2> cVar) {
        super(1, cVar);
        this.$block = pVar;
        this.this$0 = swipeableV2State$swipeDraggableState$1;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new SwipeableV2State$swipeDraggableState$1$drag$2(this.$block, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11304p<C2192e, C11045c<? super C11079d2>, Object> pVar = this.$block;
            SwipeableV2State$swipeDraggableState$1.C8127a a = this.this$0.f19807a;
            this.label = 1;
            if (pVar.invoke(a, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super C11079d2> cVar) {
        return ((SwipeableV2State$swipeDraggableState$1$drag$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
