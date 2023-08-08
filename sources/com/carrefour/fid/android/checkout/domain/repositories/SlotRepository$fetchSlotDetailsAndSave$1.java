package com.carrefour.fid.android.checkout.domain.repositories;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.domain.repositories.SlotRepository", mo22502f = "SlotRepository.kt", mo22503i = {0}, mo22504l = {40, 42}, mo22505m = "fetchSlotDetailsAndSave-0E7RQCE", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SlotRepository$fetchSlotDetailsAndSave$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SlotRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlotRepository$fetchSlotDetailsAndSave$1(SlotRepository slotRepository, C11045c<? super SlotRepository$fetchSlotDetailsAndSave$1> cVar) {
        super(cVar);
        this.this$0 = slotRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object f = this.this$0.mo131432f((String) null, (String) null, this);
        return f == C11063b.m42612h() ? f : Result.m38701a(f);
    }
}
