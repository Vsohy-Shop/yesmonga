package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter;

import com.carrefour.fid.android.domain.models.offer.CategoryLimit;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscount;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountPromotionCode;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.product.presentation.models.extensions.C27659c;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.QuantityView;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.al.adapter.RecommendedProductViewHolder$updateQuantity$1$1", mo22502f = "RecommendedProductViewHolder.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.adapter.RecommendedProductViewHolder$updateQuantity$1$1 */
public final class RecommendedProductViewHolder$updateQuantity$1$1 extends SuspendLambda implements C11304p<C11079d2, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Offer $offer;
    int label;
    final /* synthetic */ RecommendedProductViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendedProductViewHolder$updateQuantity$1$1(RecommendedProductViewHolder recommendedProductViewHolder, Offer offer, C11045c<? super RecommendedProductViewHolder$updateQuantity$1$1> cVar) {
        super(2, cVar);
        this.this$0 = recommendedProductViewHolder;
        this.$offer = offer;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new RecommendedProductViewHolder$updateQuantity$1$1(this.this$0, this.$offer, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11079d2 d2Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((RecommendedProductViewHolder$updateQuantity$1$1) create(d2Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            QuantityView quantityView = this.this$0.mo68344k().f91690g;
            Offer offer = this.$offer;
            quantityView.mo81308x(Offer.m156999C(offer, (OfferIdentifier) null, (CategoryLimit) null, (OfferDiscount) null, (OfferDiscountPromotionCode) null, 0, 0, 0, (List) null, (Prices) null, (Discount) null, (Double) null, (Double) null, (Product) null, C27659c.m116370h(offer), false, false, false, false, (String) null, (OfferAvailability) null, false, false, (String) null, false, (String) null, false, (List) null, 134209535, (Object) null), true);
            this.this$0.mo68343j();
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
