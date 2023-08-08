package com.carrefour.fid.android.presentation.viewmodels.challengeFid;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.challengeFid.ChallengeFidViewModel", mo22502f = "ChallengeFidViewModel.kt", mo22503i = {}, mo22504l = {25}, mo22505m = "showChallengeFidWebView", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ChallengeFidViewModel$showChallengeFidWebView$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChallengeFidViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeFidViewModel$showChallengeFidWebView$1(ChallengeFidViewModel challengeFidViewModel, C11045c<? super ChallengeFidViewModel$showChallengeFidWebView$1> cVar) {
        super(cVar);
        this.this$0 = challengeFidViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo75402f0(this);
    }
}
