package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37753d;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import java.util.List;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase", mo22502f = "ProductGetAntiInflationProductsFlowUseCase.kt", mo22503i = {0, 0, 0, 1}, mo22504l = {51, 52, 62}, mo22505m = "combineProductsUseCaseFlowsAndEmitResult", mo22506n = {"this", "$this$combineProductsUseCaseFlowsAndEmitResult", "alternativeProductsParam", "$this$combineProductsUseCaseFlowsAndEmitResult"}, mo22507s = {"L$0", "L$1", "L$2", "L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.domain.interactors.ProductGetAntiInflationProductsFlowUseCase$combineProductsUseCaseFlowsAndEmitResult$1 */
public final class C27522xdefd7183 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductGetAntiInflationProductsFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27522xdefd7183(ProductGetAntiInflationProductsFlowUseCase productGetAntiInflationProductsFlowUseCase, C11045c<? super C27522xdefd7183> cVar) {
        super(cVar);
        this.this$0 = productGetAntiInflationProductsFlowUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo79943c((C11908f<? super Result<? extends List<C38114b>>>) null, (C37753d.C37754a) null, (C38162k) null, this);
    }
}
