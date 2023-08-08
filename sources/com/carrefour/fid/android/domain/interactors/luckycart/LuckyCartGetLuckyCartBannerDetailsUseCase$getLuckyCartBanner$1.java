package com.carrefour.fid.android.domain.interactors.luckycart;

import com.carrefour.fid.android.domain.interactors.luckycart.C37706a;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase", mo22502f = "LuckyCartGetLuckyCartBannerDetailsUseCase.kt", mo22503i = {0, 0}, mo22504l = {26, 28}, mo22505m = "getLuckyCartBanner-gIAlu-s", mo22506n = {"this", "param"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LuckyCartGetLuckyCartBannerDetailsUseCase$getLuckyCartBanner$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LuckyCartGetLuckyCartBannerDetailsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuckyCartGetLuckyCartBannerDetailsUseCase$getLuckyCartBanner$1(LuckyCartGetLuckyCartBannerDetailsUseCase luckyCartGetLuckyCartBannerDetailsUseCase, C11045c<? super LuckyCartGetLuckyCartBannerDetailsUseCase$getLuckyCartBanner$1> cVar) {
        super(cVar);
        this.this$0 = luckyCartGetLuckyCartBannerDetailsUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.mo114756c((C37706a.C37707a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
