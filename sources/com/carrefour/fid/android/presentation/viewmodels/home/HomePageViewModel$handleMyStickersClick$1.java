package com.carrefour.fid.android.presentation.viewmodels.home;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel", mo22502f = "HomePageViewModel.kt", mo22503i = {0, 0, 0, 1, 1, 1, 1}, mo22504l = {502, 509}, mo22505m = "handleMyStickersClick", mo22506n = {"this", "stickersTitle", "stickersUrl", "this", "stickersTitle", "stickersUrl", "secureToken"}, mo22507s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HomePageViewModel$handleMyStickersClick$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomePageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageViewModel$handleMyStickersClick$1(HomePageViewModel homePageViewModel, C11045c<? super HomePageViewModel$handleMyStickersClick$1> cVar) {
        super(cVar);
        this.this$0 = homePageViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo76751W1((String) null, (String) null, this);
    }
}
