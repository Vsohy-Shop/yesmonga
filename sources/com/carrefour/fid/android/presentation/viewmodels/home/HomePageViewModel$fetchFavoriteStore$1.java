package com.carrefour.fid.android.presentation.viewmodels.home;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel", mo22502f = "HomePageViewModel.kt", mo22503i = {0, 1, 2, 2}, mo22504l = {855, 858, 860}, mo22505m = "fetchFavoriteStore", mo22506n = {"this", "this", "this", "store"}, mo22507s = {"L$0", "L$0", "L$0", "L$3"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HomePageViewModel$fetchFavoriteStore$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomePageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageViewModel$fetchFavoriteStore$1(HomePageViewModel homePageViewModel, C11045c<? super HomePageViewModel$fetchFavoriteStore$1> cVar) {
        super(cVar);
        this.this$0 = homePageViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo76778k1(this);
    }
}
