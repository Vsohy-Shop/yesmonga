package com.carrefour.fid.android.checkout.data.api.datasources;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource", mo22502f = "SlotDataSource.kt", mo22503i = {}, mo22504l = {44}, mo22505m = "fetchH1h3Slots-0E7RQCE", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SlotDataSource$fetchH1h3Slots$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SlotDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlotDataSource$fetchH1h3Slots$1(SlotDataSource slotDataSource, C11045c<? super SlotDataSource$fetchH1h3Slots$1> cVar) {
        super(cVar);
        this.this$0 = slotDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.mo131225b((String) null, 0, this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}
