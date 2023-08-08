package com.google.accompanist.pager;

import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.foundation.lazy.C2517l;
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

@C11067d(mo22501c = "com.google.accompanist.pager.PagerState$scrollToPage$2$1", mo22502f = "PagerState.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/foundation/gestures/l;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PagerState$scrollToPage$2$1 extends SuspendLambda implements C11304p<C2201l, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C2517l $it;
    final /* synthetic */ float $pageOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$2$1(C2517l lVar, PagerState pagerState, float f, C11045c<? super PagerState$scrollToPage$2$1> cVar) {
        super(2, cVar);
        this.$it = lVar;
        this.this$0 = pagerState;
        this.$pageOffset = f;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PagerState$scrollToPage$2$1 pagerState$scrollToPage$2$1 = new PagerState$scrollToPage$2$1(this.$it, this.this$0, this.$pageOffset, cVar);
        pagerState$scrollToPage$2$1.L$0 = obj;
        return pagerState$scrollToPage$2$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C2201l lVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PagerState$scrollToPage$2$1) create(lVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            ((C2201l) this.L$0).mo7360a(((float) (this.$it.getSize() + this.this$0.mo42016u())) * this.$pageOffset);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
