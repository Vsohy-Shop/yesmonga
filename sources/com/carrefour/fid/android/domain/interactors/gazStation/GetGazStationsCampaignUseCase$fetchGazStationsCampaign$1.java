package com.carrefour.fid.android.domain.interactors.gazStation;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.gazStation.GetGazStationsCampaignUseCase", mo22502f = "GetGazStationsCampaignUseCase.kt", mo22503i = {}, mo22504l = {21}, mo22505m = "fetchGazStationsCampaign-IoAF18A", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class GetGazStationsCampaignUseCase$fetchGazStationsCampaign$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetGazStationsCampaignUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetGazStationsCampaignUseCase$fetchGazStationsCampaign$1(GetGazStationsCampaignUseCase getGazStationsCampaignUseCase, C11045c<? super GetGazStationsCampaignUseCase$fetchGazStationsCampaign$1> cVar) {
        super(cVar);
        this.this$0 = getGazStationsCampaignUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo114718c(this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
