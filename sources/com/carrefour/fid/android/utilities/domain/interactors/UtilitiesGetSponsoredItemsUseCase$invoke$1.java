package com.carrefour.fid.android.utilities.domain.interactors;

import com.carrefour.fid.android.domain.interactors.utilities.C37890c;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase", mo22502f = "UtilitiesGetSponsoredItemsUseCase.kt", mo22503i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4}, mo22504l = {40, 42, 43, 45, 57}, mo22505m = "invoke-gIAlu-s", mo22506n = {"this", "param", "this", "param", "slotSlice", "this", "param", "slotSlice", "isFeatureFlagCriteoEnabled", "isFeatureFlagCriteoFlagshipEnabled", "this", "param", "slotSlice", "isFeatureFlagCriteoEnabled", "isFeatureFlagCriteoFlagshipEnabled", "isFeatureFlagLuckyCartEnabled", "shouldMakeCriteoCall", "shouldMakeLuckyCartCall", "this", "param"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "Z$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "Z$1", "Z$2", "Z$3", "Z$4", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UtilitiesGetSponsoredItemsUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    boolean Z$3;
    boolean Z$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UtilitiesGetSponsoredItemsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UtilitiesGetSponsoredItemsUseCase$invoke$1(UtilitiesGetSponsoredItemsUseCase utilitiesGetSponsoredItemsUseCase, C11045c<? super UtilitiesGetSponsoredItemsUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = utilitiesGetSponsoredItemsUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object i = this.this$0.m172804invokegIAlus((C37890c.C37891a) null, this);
        return i == C11063b.m42612h() ? i : Result.m38701a(i);
    }
}
