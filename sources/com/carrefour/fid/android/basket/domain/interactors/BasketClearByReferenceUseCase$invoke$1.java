package com.carrefour.fid.android.basket.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37748a;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.basket.domain.interactors.BasketClearByReferenceUseCase", mo22502f = "BasketClearByReferenceUseCase.kt", mo22503i = {}, mo22504l = {11}, mo22505m = "invoke-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BasketClearByReferenceUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasketClearByReferenceUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketClearByReferenceUseCase$invoke$1(BasketClearByReferenceUseCase basketClearByReferenceUseCase, C11045c<? super BasketClearByReferenceUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = basketClearByReferenceUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.m172753invokegIAlus((C37748a.C37749a) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
