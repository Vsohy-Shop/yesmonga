package com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel", mo22502f = "AdditionalOrderProductSearchViewModel.kt", mo22503i = {0}, mo22504l = {85}, mo22505m = "getLatestOrFrequentSuggestions", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.AdditionalOrderProductSearchViewModel$getLatestOrFrequentSuggestions$1 */
public final class C26725xdce342de extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdditionalOrderProductSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26725xdce342de(AdditionalOrderProductSearchViewModel additionalOrderProductSearchViewModel, C11045c<? super C26725xdce342de> cVar) {
        super(cVar);
        this.this$0 = additionalOrderProductSearchViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo77665j0(this);
    }
}
