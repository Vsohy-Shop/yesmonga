package com.carrefour.fid.android.presentation.p035ui.coupons.overlay;

import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/utils/a;", "it", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/design/components/utils/a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.overlay.CouponProductsOverlayBottomSheetFragment$updateProductList$1$1 */
public final class CouponProductsOverlayBottomSheetFragment$updateProductList$1$1 extends Lambda implements C11300l<C37133a, C11079d2> {
    final /* synthetic */ int $index;
    final /* synthetic */ OfferProductModel $offer;
    final /* synthetic */ CouponProductsOverlayBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponProductsOverlayBottomSheetFragment$updateProductList$1$1(CouponProductsOverlayBottomSheetFragment couponProductsOverlayBottomSheetFragment, OfferProductModel offerProductModel, int i) {
        super(1);
        this.this$0 = couponProductsOverlayBottomSheetFragment;
        this.$offer = offerProductModel;
        this.$index = i;
    }

    /* renamed from: a */
    public final void mo70034a(@C12579k C37133a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        this.this$0.mo70019o0(this.$offer, this.$index + 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo70034a((C37133a) obj);
        return C11079d2.f28267a;
    }
}
