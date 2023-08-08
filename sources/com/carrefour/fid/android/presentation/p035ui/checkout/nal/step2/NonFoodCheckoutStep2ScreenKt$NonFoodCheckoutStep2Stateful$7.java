package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import android.os.Bundle;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics.C23614a;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics.C24603a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$7 */
public final class NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$7 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C23614a $analytics;
    final /* synthetic */ C11300l<Double, C11079d2> $onAddPickupClicked;
    final /* synthetic */ C11289a<C11079d2> $onAddressValidated;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11304p<Bundle, String, C11079d2> $onBasketValidated;
    final /* synthetic */ C11289a<C11079d2> $onCgvClicked;
    final /* synthetic */ C11306r<Address, Address, AddressCategory, String, C11079d2> $onEditAddressPressed;
    final /* synthetic */ C11300l<String, C11079d2> $onFidCardBlocked;
    final /* synthetic */ C11304p<Bundle, String, C11079d2> $onRedirectToConfirmationOrder;
    final /* synthetic */ C11289a<C11079d2> $onRemovePromoCodeError;
    final /* synthetic */ C11300l<String, C11079d2> $onResetSecretCode;
    final /* synthetic */ C24603a $otpAnalytics;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$7(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, C23614a aVar, C24603a aVar2, C11304p<? super Bundle, ? super String, C11079d2> pVar, C11304p<? super Bundle, ? super String, C11079d2> pVar2, C11300l<? super Double, C11079d2> lVar, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11306r<? super Address, ? super Address, ? super AddressCategory, ? super String, C11079d2> rVar, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, C11300l<? super String, C11079d2> lVar2, C11300l<? super String, C11079d2> lVar3, int i, int i2, int i3) {
        super(2);
        this.$viewModel = nonFoodCheckoutStep2ViewModel;
        this.$analytics = aVar;
        this.$otpAnalytics = aVar2;
        this.$onBasketValidated = pVar;
        this.$onRedirectToConfirmationOrder = pVar2;
        this.$onAddPickupClicked = lVar;
        this.$onCgvClicked = aVar3;
        this.$onBackPressed = aVar4;
        this.$onEditAddressPressed = rVar;
        this.$onAddressValidated = aVar5;
        this.$onRemovePromoCodeError = aVar6;
        this.$onResetSecretCode = lVar2;
        this.$onFidCardBlocked = lVar3;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel = this.$viewModel;
        C23614a aVar = this.$analytics;
        C24603a aVar2 = this.$otpAnalytics;
        C11304p<Bundle, String, C11079d2> pVar = this.$onBasketValidated;
        C11304p<Bundle, String, C11079d2> pVar2 = this.$onRedirectToConfirmationOrder;
        C11300l<Double, C11079d2> lVar = this.$onAddPickupClicked;
        C11289a<C11079d2> aVar3 = this.$onCgvClicked;
        C11289a<C11079d2> aVar4 = this.$onBackPressed;
        C11306r<Address, Address, AddressCategory, String, C11079d2> rVar = this.$onEditAddressPressed;
        C11289a<C11079d2> aVar5 = this.$onAddressValidated;
        C11289a<C11079d2> aVar6 = this.$onRemovePromoCodeError;
        C11300l<String, C11079d2> lVar2 = this.$onResetSecretCode;
        C11300l<String, C11079d2> lVar3 = this.$onFidCardBlocked;
        NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel2 = nonFoodCheckoutStep2ViewModel;
        NonFoodCheckoutStep2ScreenKt.m104881j(nonFoodCheckoutStep2ViewModel2, aVar, aVar2, pVar, pVar2, lVar, aVar3, aVar4, rVar, aVar5, aVar6, lVar2, lVar3, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
