package com.carrefour.fid.android.shared.network.errorhandling;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt", mo22502f = "HttpErrorHandler.kt", mo22503i = {}, mo22504l = {12}, mo22505m = "runSafeApiCall", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HttpErrorHandlerKt$runSafeApiCall$1<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public HttpErrorHandlerKt$runSafeApiCall$1(C11045c<? super HttpErrorHandlerKt$runSafeApiCall$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = HttpErrorHandlerKt.m119234a((C11300l) null, this);
        return a == C11063b.m42612h() ? a : Result.m38701a(a);
    }
}
