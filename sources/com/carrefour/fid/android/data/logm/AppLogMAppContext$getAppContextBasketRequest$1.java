package com.carrefour.fid.android.data.logm;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.logm.AppLogMAppContext", mo22502f = "AppLogMAppContext.kt", mo22503i = {}, mo22504l = {107}, mo22505m = "getAppContextBasketRequest", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class AppLogMAppContext$getAppContextBasketRequest$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppLogMAppContext this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppLogMAppContext$getAppContextBasketRequest$1(AppLogMAppContext appLogMAppContext, C11045c<? super AppLogMAppContext$getAppContextBasketRequest$1> cVar) {
        super(cVar);
        this.this$0 = appLogMAppContext;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo111404l(this);
    }
}
