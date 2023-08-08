package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.domain.interactors.basket.C37581k0;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.interactors.BasketDetailsUseCase", mo22502f = "BasketDetailsUseCase.kt", mo22503i = {0}, mo22504l = {13}, mo22505m = "invoke-gIAlu-s", mo22506n = {"param"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketDetailsUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasketDetailsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketDetailsUseCase$invoke$1(BasketDetailsUseCase basketDetailsUseCase, C11045c<? super BasketDetailsUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = basketDetailsUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.m172756invokegIAlus((C37581k0.C37582a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
