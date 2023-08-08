package com.carrefour.fid.android.service.domain.interactors;

import com.carrefour.fid.android.domain.interactors.service.C37836s;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.domain.interactors.ServiceSetServiceSelectionUseCase", mo22502f = "SetServiceSelectionUseCase.kt", mo22503i = {}, mo22504l = {11}, mo22505m = "invoke-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ServiceSetServiceSelectionUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServiceSetServiceSelectionUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceSetServiceSelectionUseCase$invoke$1(ServiceSetServiceSelectionUseCase serviceSetServiceSelectionUseCase, C11045c<? super ServiceSetServiceSelectionUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = serviceSetServiceSelectionUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m172864invokegIAlus((C37836s.C37837a) null, (C11045c<? super Result<C11079d2>>) this);
        return r2 == C11063b.m42612h() ? r2 : Result.m38701a(r2);
    }
}
