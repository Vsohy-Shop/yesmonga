package com.carrefour.fid.android.presentation.viewmodels.home;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel", mo22502f = "HomeViewModel.kt", mo22503i = {}, mo22504l = {188}, mo22505m = "getProductBasketTypes$app_release", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HomeViewModel$getProductBasketTypes$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getProductBasketTypes$1(HomeViewModel homeViewModel, C11045c<? super HomeViewModel$getProductBasketTypes$1> cVar) {
        super(cVar);
        this.this$0 = homeViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo76821D0((String) null, this);
    }
}
