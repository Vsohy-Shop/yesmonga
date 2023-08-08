package com.carrefour.fid.android.domain.interactors.coupons;

import com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.coupons.PrintCouponsUseCase", mo22502f = "PrintCouponsUseCase.kt", mo22503i = {0, 0}, mo22504l = {22, 30}, mo22505m = "invoke-gIAlu-s", mo22506n = {"this", "param"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PrintCouponsUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PrintCouponsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrintCouponsUseCase$invoke$1(PrintCouponsUseCase printCouponsUseCase, C11045c<? super PrintCouponsUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = printCouponsUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.m172953invokegIAlus((PrintCouponsUseCase.C37637a) null, this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}
