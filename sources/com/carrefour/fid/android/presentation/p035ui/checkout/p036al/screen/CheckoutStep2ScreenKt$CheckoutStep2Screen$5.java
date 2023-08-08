package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.material.C3036d1;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.design.components.compose.Variant;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.state.C26102a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.state.C26105b;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$CheckoutStep2Screen$5 */
public final class CheckoutStep2ScreenKt$CheckoutStep2Screen$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ Basket $basket;
    final /* synthetic */ Address $billingAddress;
    final /* synthetic */ C11289a<C11079d2> $disablePostOrderSubstitution;
    final /* synthetic */ C11289a<C11079d2> $enablePostOrderSubstitution;
    final /* synthetic */ boolean $hasPostOrderSubstitution;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11300l<String, C11079d2> $onCodeValidation;
    final /* synthetic */ C11289a<C11079d2> $onRemovePromoCode;
    final /* synthetic */ C11289a<C11079d2> $onSlotEdit;
    final /* synthetic */ C11289a<C11079d2> $onValidate;
    final /* synthetic */ boolean $postOrderSubstitutionSelection;
    final /* synthetic */ C28892e<String> $promoCodeState;
    final /* synthetic */ C3036d1 $scaffoldState;
    final /* synthetic */ C26102a $serviceState;
    final /* synthetic */ boolean $showPreparationFees;
    final /* synthetic */ C26105b $slotSectionState;
    final /* synthetic */ Variant $snackbarVariant;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ScreenKt$CheckoutStep2Screen$5(C3036d1 d1Var, Variant variant, Basket basket, boolean z, C26102a aVar, Address address, C26105b bVar, C28892e<String> eVar, boolean z2, boolean z3, C11289a<C11079d2> aVar2, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11289a<C11079d2> aVar6, C11289a<C11079d2> aVar7, int i, int i2) {
        super(2);
        this.$scaffoldState = d1Var;
        this.$snackbarVariant = variant;
        this.$basket = basket;
        this.$showPreparationFees = z;
        this.$serviceState = aVar;
        this.$billingAddress = address;
        this.$slotSectionState = bVar;
        this.$promoCodeState = eVar;
        this.$hasPostOrderSubstitution = z2;
        this.$postOrderSubstitutionSelection = z3;
        this.$onSlotEdit = aVar2;
        this.$onCodeValidation = lVar;
        this.$onRemovePromoCode = aVar3;
        this.$enablePostOrderSubstitution = aVar4;
        this.$disablePostOrderSubstitution = aVar5;
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
        CheckoutStep2ScreenKt.m104364a(d1Var2, this.$snackbarVariant, this.$basket, this.$showPreparationFees, this.$serviceState, this.$billingAddress, this.$slotSectionState, this.$promoCodeState, this.$hasPostOrderSubstitution, this.$postOrderSubstitutionSelection, this.$onSlotEdit, this.$onCodeValidation, this.$onRemovePromoCode, this.$enablePostOrderSubstitution, this.$disablePostOrderSubstitution, this.$onBackPressed, this.$onValidate, oVar2, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1));
    }
}
