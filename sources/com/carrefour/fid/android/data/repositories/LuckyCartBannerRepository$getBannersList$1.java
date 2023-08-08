package com.carrefour.fid.android.data.repositories;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository", mo22502f = "LuckyCartBannerRepository.kt", mo22503i = {}, mo22504l = {31}, mo22505m = "getBannersList-0E7RQCE", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class LuckyCartBannerRepository$getBannersList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LuckyCartBannerRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuckyCartBannerRepository$getBannersList$1(LuckyCartBannerRepository luckyCartBannerRepository, C11045c<? super LuckyCartBannerRepository$getBannersList$1> cVar) {
        super(cVar);
        this.this$0 = luckyCartBannerRepository;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.mo111505b((String) null, (String) null, this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}
