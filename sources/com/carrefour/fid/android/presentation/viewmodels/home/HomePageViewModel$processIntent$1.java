package com.carrefour.fid.android.presentation.viewmodels.home;

import com.carrefour.fid.android.presentation.viewmodels.home.mvi.C26406a;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel", mo22502f = "HomePageViewModel.kt", mo22503i = {}, mo22504l = {277, 280, 281, 282, 283, 285, 287, 294, 306, 310, 316, 318, 320}, mo22505m = "processIntent", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HomePageViewModel$processIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomePageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageViewModel$processIntent$1(HomePageViewModel homePageViewModel, C11045c<? super HomePageViewModel$processIntent$1> cVar) {
        super(cVar);
        this.this$0 = homePageViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processIntent((C26406a.C26407a) null, this);
    }
}
