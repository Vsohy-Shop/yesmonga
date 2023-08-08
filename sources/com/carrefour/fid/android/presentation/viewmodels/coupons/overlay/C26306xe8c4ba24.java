package com.carrefour.fid.android.presentation.viewmodels.coupons.overlay;

import com.carrefour.fid.android.domain.models.OfferProductDomain;
import java.util.List;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel", mo22502f = "OverlayProductsBottomSheetViewModel.kt", mo22503i = {0}, mo22504l = {134}, mo22505m = "updateWithBasketOffersQuantity", mo22506n = {"$this$updateWithBasketOffersQuantity"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.OverlayProductsBottomSheetViewModel$updateWithBasketOffersQuantity$1 */
public final class C26306xe8c4ba24 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OverlayProductsBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26306xe8c4ba24(OverlayProductsBottomSheetViewModel overlayProductsBottomSheetViewModel, C11045c<? super C26306xe8c4ba24> cVar) {
        super(cVar);
        this.this$0 = overlayProductsBottomSheetViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo76496l0((List<OfferProductDomain>) null, this);
    }
}
