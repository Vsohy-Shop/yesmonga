package com.carrefour.fid.android.utilities.domain.interactors;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.utilities.domain.interactors.UtilitiesGetSponsoredItemsUseCase", mo22502f = "UtilitiesGetSponsoredItemsUseCase.kt", mo22503i = {}, mo22504l = {122}, mo22505m = "getLuckyCartFeatureFlag", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UtilitiesGetSponsoredItemsUseCase$getLuckyCartFeatureFlag$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UtilitiesGetSponsoredItemsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UtilitiesGetSponsoredItemsUseCase$getLuckyCartFeatureFlag$1(UtilitiesGetSponsoredItemsUseCase utilitiesGetSponsoredItemsUseCase, C11045c<? super UtilitiesGetSponsoredItemsUseCase$getLuckyCartFeatureFlag$1> cVar) {
        super(cVar);
        this.this$0 = utilitiesGetSponsoredItemsUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo67035f(this);
    }
}
