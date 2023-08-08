package com.carrefour.fid.android.checkout.domain.repositories;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.domain.repositories.SlotRepository", mo22502f = "SlotRepository.kt", mo22503i = {}, mo22504l = {47}, mo22505m = "fetchSlotExpress-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SlotRepository$fetchSlotExpress$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SlotRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlotRepository$fetchSlotExpress$1(SlotRepository slotRepository, C11045c<? super SlotRepository$fetchSlotExpress$1> cVar) {
        super(cVar);
        this.this$0 = slotRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object g = this.this$0.mo131433g((String) null, this);
        return g == C11063b.m42612h() ? g : Result.m38701a(g);
    }
}
