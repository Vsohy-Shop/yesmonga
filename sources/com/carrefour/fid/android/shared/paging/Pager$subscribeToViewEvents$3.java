package com.carrefour.fid.android.shared.paging;

import com.carrefour.fid.android.core.paging.C36334b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.paging.Pager$subscribeToViewEvents$3", mo22502f = "Pager.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H@"}, mo22516d2 = {"", "Key", "Value", "Lcom/carrefour/fid/android/core/paging/b;", "it", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class Pager$subscribeToViewEvents$3 extends SuspendLambda implements C11304p<C36334b, C11045c<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public Pager$subscribeToViewEvents$3(C11045c<? super Pager$subscribeToViewEvents$3> cVar) {
        super(2, cVar);
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        Pager$subscribeToViewEvents$3 pager$subscribeToViewEvents$3 = new Pager$subscribeToViewEvents$3(cVar);
        pager$subscribeToViewEvents$3.L$0 = obj;
        return pager$subscribeToViewEvents$3;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C36334b bVar, @C12580l C11045c<? super Boolean> cVar) {
        return ((Pager$subscribeToViewEvents$3) create(bVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return C11064a.m42615a(!(((C36334b) this.L$0) instanceof C36334b.C36338d));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
