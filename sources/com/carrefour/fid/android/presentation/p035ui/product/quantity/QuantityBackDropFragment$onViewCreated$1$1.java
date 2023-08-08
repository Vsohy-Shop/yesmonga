package com.carrefour.fid.android.presentation.p035ui.product.quantity;

import com.carrefour.fid.android.design.components.widgets.list.C37268h;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.viewmodels.product.quantity.QuantityBottomSheetViewModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.quantity.QuantityBackDropFragment$onViewCreated$1$1 */
public final class QuantityBackDropFragment$onViewCreated$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ BasketType $basketType;
    final /* synthetic */ int $index;
    final /* synthetic */ Ref.ObjectRef<List<C37268h>> $items;
    final /* synthetic */ OfferProductModel $offer;
    final /* synthetic */ int $quantity;
    final /* synthetic */ QuantityBackDropFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuantityBackDropFragment$onViewCreated$1$1(QuantityBackDropFragment quantityBackDropFragment, Ref.ObjectRef<List<C37268h>> objectRef, int i, OfferProductModel offerProductModel, int i2, BasketType basketType) {
        super(0);
        this.this$0 = quantityBackDropFragment;
        this.$items = objectRef;
        this.$index = i;
        this.$offer = offerProductModel;
        this.$quantity = i2;
        this.$basketType = basketType;
    }

    public final void invoke() {
        QuantityBackDropFragment.m109985R0(this.this$0).f91011b.setList(this.this$0.mo74284X0((List) this.$items.element, this.$index));
        this.this$0.mo74282V0().sendIntent(new QuantityBottomSheetViewModel.C27238c.C27239a(this.$offer, this.$quantity, this.$basketType));
    }
}
