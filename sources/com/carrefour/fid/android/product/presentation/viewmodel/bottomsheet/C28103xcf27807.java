package com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet;

import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel", mo22502f = "AlternativeProductsBottomSheetViewModel.kt", mo22503i = {0}, mo22504l = {96}, mo22505m = "handleBasketThrowableListMessage", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel$handleBasketThrowableListMessage$1 */
public final class C28103xcf27807 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AlternativeProductsBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28103xcf27807(AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel, C11045c<? super C28103xcf27807> cVar) {
        super(cVar);
        this.this$0 = alternativeProductsBottomSheetViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo81688m0((Basket) null, (OfferIdentifier) null, this);
    }
}
