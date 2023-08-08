package com.carrefour.fid.android.analytics.data.analytics;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.analytics.data.analytics.FirebaseAnalyticsDispatcher", mo22502f = "FirebaseAnalyticsDispatcher.kt", mo22503i = {}, mo22504l = {149}, mo22505m = "getUserLogin", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FirebaseAnalyticsDispatcher$getUserLogin$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebaseAnalyticsDispatcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseAnalyticsDispatcher$getUserLogin$1(FirebaseAnalyticsDispatcher firebaseAnalyticsDispatcher, C11045c<? super FirebaseAnalyticsDispatcher$getUserLogin$1> cVar) {
        super(cVar);
        this.this$0 = firebaseAnalyticsDispatcher;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo32693r((FirebaseAnalyticsDispatcher) null, this);
    }
}
