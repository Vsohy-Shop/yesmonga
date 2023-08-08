package com.carrefour.fid.android.service.domain.interactors;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.domain.interactors.ServiceGetStoreServiceTypeSelectedUseCase", mo22502f = "ServiceGetStoreServiceTypeSelectedUseCase.kt", mo22503i = {}, mo22504l = {13}, mo22505m = "getSelectedStoreServiceSelectionType", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.domain.interactors.ServiceGetStoreServiceTypeSelectedUseCase$getSelectedStoreServiceSelectionType$1 */
public final class C28356xa36aec5 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServiceGetStoreServiceTypeSelectedUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28356xa36aec5(ServiceGetStoreServiceTypeSelectedUseCase serviceGetStoreServiceTypeSelectedUseCase, C11045c<? super C28356xa36aec5> cVar) {
        super(cVar);
        this.this$0 = serviceGetStoreServiceTypeSelectedUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getSelectedStoreServiceSelectionType(this);
    }
}
