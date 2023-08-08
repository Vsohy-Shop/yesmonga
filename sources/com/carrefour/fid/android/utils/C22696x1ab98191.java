package com.carrefour.fid.android.utils;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener", mo22502f = "ForegroundBackgroundApplicationListener.kt", mo22503i = {0}, mo22504l = {56, 60}, mo22505m = "checkAndClearNotSecuredLoyalTyCards", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$checkAndClearNotSecuredLoyalTyCards$1 */
public final class C22696x1ab98191 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ForegroundBackgroundApplicationListener this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22696x1ab98191(ForegroundBackgroundApplicationListener foregroundBackgroundApplicationListener, C11045c<? super C22696x1ab98191> cVar) {
        super(cVar);
        this.this$0 = foregroundBackgroundApplicationListener;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo67058e(this);
    }
}
