package com.carrefour.fid.android.domain.interactors.criteo;

import com.carrefour.fid.android.domain.interactors.criteo.C37666g;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.criteo.CriteoGetCriteoProductsUseCase", mo22502f = "CriteoGetCriteoProductsUseCase.kt", mo22503i = {0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, mo22504l = {38, 51, 64, 67}, mo22505m = "fetchCriteoProducts-gIAlu-s", mo22506n = {"this", "param", "this", "param", "criteoResult", "sponsoredProducts", "criteoButterflies", "flagship", "param", "criteoResult", "flagship", "sponsoredProductsIds", "flagshipProductsIds", "productsEan", "isFlagshipEnabled"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CriteoGetCriteoProductsUseCase$fetchCriteoProducts$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CriteoGetCriteoProductsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoGetCriteoProductsUseCase$fetchCriteoProducts$1(CriteoGetCriteoProductsUseCase criteoGetCriteoProductsUseCase, C11045c<? super CriteoGetCriteoProductsUseCase$fetchCriteoProducts$1> cVar) {
        super(cVar);
        this.this$0 = criteoGetCriteoProductsUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.mo114643d((C37666g.C37667a) null, this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}
