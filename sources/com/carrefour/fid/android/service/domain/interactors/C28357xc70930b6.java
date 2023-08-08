package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.models.category.C37992a;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase", mo22502f = "ServiceSwitchToStandardPromiseUseCase.kt", mo22503i = {0}, mo22504l = {98, 101}, mo22505m = "switchStandardDrivePromise", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.domain.interactors.ServiceSwitchToStandardPromiseUseCase$switchStandardDrivePromise$1 */
public final class C28357xc70930b6 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServiceSwitchToStandardPromiseUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28357xc70930b6(ServiceSwitchToStandardPromiseUseCase serviceSwitchToStandardPromiseUseCase, C11045c<? super C28357xc70930b6> cVar) {
        super(cVar);
        this.this$0 = serviceSwitchToStandardPromiseUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.switchStandardDrivePromise((C37992a) null, this);
    }
}
