package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.material.C3036d1;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.design.components.compose.Variant;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.C26132a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.PaymentType;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Screen$5 */
public final class CheckoutStep3ScreenKt$CheckoutStep3Screen$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ Basket $basket;
    final /* synthetic */ boolean $hasPaymentTypeChoice;
    final /* synthetic */ C26132a $loyaltyState;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11289a<C11079d2> $onCgvClicked;
    final /* synthetic */ C11289a<C11079d2> $onChoiceOnline;
    final /* synthetic */ C11289a<C11079d2> $onChoiceOnsite;
    final /* synthetic */ C11300l<String, C11079d2> $onCodeValidation;
    final /* synthetic */ C11289a<C11079d2> $onRemovePromoCode;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onUseAllLoyaltyChanged;
    final /* synthetic */ C11289a<C11079d2> $onValidate;
    final /* synthetic */ C11300l<Double, C11079d2> $onValidateLoyaltyAmount;
    final /* synthetic */ boolean $paymentLoadingState;
    final /* synthetic */ PaymentType $paymentType;
    final /* synthetic */ C28892e<String> $promoCodeState;
    final /* synthetic */ C3036d1 $scaffoldState;
    final /* synthetic */ Variant $snackbarVariant;
    final /* synthetic */ String $storeName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ScreenKt$CheckoutStep3Screen$5(C3036d1 d1Var, Variant variant, boolean z, PaymentType paymentType, C26132a aVar, String str, Basket basket, C28892e<String> eVar, boolean z2, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11300l<? super Boolean, C11079d2> lVar, C11300l<? super Double, C11079d2> lVar2, C11300l<? super String, C11079d2> lVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, C11289a<C11079d2> aVar7, int i, int i2) {
        super(2);
        this.$scaffoldState = d1Var;
        this.$snackbarVariant = variant;
        this.$hasPaymentTypeChoice = z;
        this.$paymentType = paymentType;
        this.$loyaltyState = aVar;
        this.$storeName = str;
        this.$basket = basket;
        this.$promoCodeState = eVar;
        this.$paymentLoadingState = z2;
        this.$onChoiceOnline = aVar2;
        this.$onChoiceOnsite = aVar3;
        this.$onUseAllLoyaltyChanged = lVar;
        this.$onValidateLoyaltyAmount = lVar2;
        this.$onCodeValidation = lVar3;
        this.$onRemovePromoCode = aVar4;
        this.$onCgvClicked = aVar5;
        this.$onBackPressed = aVar6;
        this.$onValidate = aVar7;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        C3036d1 d1Var = this.$scaffoldState;
        C3036d1 d1Var2 = d1Var;
        CheckoutStep3ScreenKt.m104409a(d1Var2, this.$snackbarVariant, this.$hasPaymentTypeChoice, this.$paymentType, this.$loyaltyState, this.$storeName, this.$basket, this.$promoCodeState, this.$paymentLoadingState, this.$onChoiceOnline, this.$onChoiceOnsite, this.$onUseAllLoyaltyChanged, this.$onValidateLoyaltyAmount, this.$onCodeValidation, this.$onRemovePromoCode, this.$onCgvClicked, this.$onBackPressed, this.$onValidate, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1));
    }
}
