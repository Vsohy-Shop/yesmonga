package com.carrefour.fid.android.checkout.data.api.datasources;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource", mo22502f = "SlotDataSource.kt", mo22503i = {}, mo22504l = {24}, mo22505m = "fetchSlotsSecured-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SlotDataSource$fetchSlotsSecured$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SlotDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlotDataSource$fetchSlotsSecured$1(SlotDataSource slotDataSource, C11045c<? super SlotDataSource$fetchSlotsSecured$1> cVar) {
        super(cVar);
        this.this$0 = slotDataSource;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object f = this.this$0.mo131229f((String) null, this);
        return f == C11063b.m42612h() ? f : Result.m38701a(f);
    }
}
