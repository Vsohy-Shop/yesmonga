package com.carrefour.fid.android.shared.paging;

import com.carrefour.fid.android.core.paging.C36334b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11342l0;
import kotlinx.coroutines.flow.C11911i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.paging.Pager$subscribeToViewEvents$2", mo22502f = "Pager.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@"}, mo22516d2 = {"", "Key", "Value", "Lcom/carrefour/fid/android/core/paging/b;", "viewEvent", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class Pager$subscribeToViewEvents$2 extends SuspendLambda implements C11304p<C36334b, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11911i<C36334b> $eventFlow;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pager$subscribeToViewEvents$2(C11911i<C36334b> iVar, C11045c<? super Pager$subscribeToViewEvents$2> cVar) {
        super(2, cVar);
        this.$eventFlow = iVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        Pager$subscribeToViewEvents$2 pager$subscribeToViewEvents$2 = new Pager$subscribeToViewEvents$2(this.$eventFlow, cVar);
        pager$subscribeToViewEvents$2.L$0 = obj;
        return pager$subscribeToViewEvents$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C36334b bVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((Pager$subscribeToViewEvents$2) create(bVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C36334b bVar = (C36334b) this.L$0;
            String s = C11342l0.m43547d(bVar.getClass()).mo22848s();
            C28851c.m119329b("Pager: received: " + s);
            if (bVar instanceof C36334b.C36338d) {
                this.$eventFlow.mo24204f();
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
