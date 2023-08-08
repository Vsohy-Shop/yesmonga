package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.C3036d1;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$4 */
public final class NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11300l<C23617b, C11079d2> $actioner;
    final /* synthetic */ BasketAmounts $basketAmounts;
    final /* synthetic */ Address $billingAddress;
    final /* synthetic */ C26191b.C26192a $cardFid;
    final /* synthetic */ Address $deliveryAddress;
    final /* synthetic */ boolean $displayCardFidDialog;
    final /* synthetic */ boolean $isValidatePaymentEnabled;
    final /* synthetic */ boolean $isValidatingBasket;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ C38080a $pickupSelected;
    final /* synthetic */ int $productCount;
    final /* synthetic */ BasketPromotionCode $promoCode;
    final /* synthetic */ C28892e<C11079d2> $promoCodeState;
    final /* synthetic */ C3036d1 $scaffoldState;
    final /* synthetic */ List<C26191b.C26193b> $selectableDeliveryModes;
    final /* synthetic */ String $telephone;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$4(List<C26191b.C26193b> list, C38080a aVar, Address address, Address address2, String str, BasketAmounts basketAmounts, BasketPromotionCode basketPromotionCode, int i, boolean z, C28892e<C11079d2> eVar, boolean z2, C26191b.C26192a aVar2, C3036d1 d1Var, LazyListState lazyListState, boolean z3, C11300l<? super C23617b, C11079d2> lVar, int i2, int i3, int i4) {
        super(2);
        this.$selectableDeliveryModes = list;
        this.$pickupSelected = aVar;
        this.$deliveryAddress = address;
        this.$billingAddress = address2;
        this.$telephone = str;
        this.$basketAmounts = basketAmounts;
        this.$promoCode = basketPromotionCode;
        this.$productCount = i;
        this.$isValidatingBasket = z;
        this.$promoCodeState = eVar;
        this.$isValidatePaymentEnabled = z2;
        this.$cardFid = aVar2;
        this.$scaffoldState = d1Var;
        this.$listState = lazyListState;
        this.$displayCardFidDialog = z3;
        this.$actioner = lVar;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        List<C26191b.C26193b> list = this.$selectableDeliveryModes;
        List<C26191b.C26193b> list2 = list;
        NonFoodCheckoutStep2ScreenKt.m104879h(list2, this.$pickupSelected, this.$deliveryAddress, this.$billingAddress, this.$telephone, this.$basketAmounts, this.$promoCode, this.$productCount, this.$isValidatingBasket, this.$promoCodeState, this.$isValidatePaymentEnabled, this.$cardFid, this.$scaffoldState, this.$listState, this.$displayCardFidDialog, this.$actioner, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
