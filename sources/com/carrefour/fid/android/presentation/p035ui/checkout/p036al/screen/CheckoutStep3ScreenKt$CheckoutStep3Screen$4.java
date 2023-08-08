package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.C26132a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.state.PaymentType;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3ScreenKt$CheckoutStep3Screen$4 */
public final class CheckoutStep3ScreenKt$CheckoutStep3Screen$4 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ boolean $hasPaymentTypeChoice;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ C26132a $loyaltyState;
    final /* synthetic */ C11289a<C11079d2> $onChoiceOnline;
    final /* synthetic */ C11289a<C11079d2> $onChoiceOnsite;
    final /* synthetic */ C11300l<String, C11079d2> $onCodeValidation;
    final /* synthetic */ C11289a<C11079d2> $onRemovePromoCode;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onUseAllLoyaltyChanged;
    final /* synthetic */ C11300l<Double, C11079d2> $onValidateLoyaltyAmount;
    final /* synthetic */ PaymentType $paymentType;
    final /* synthetic */ C28892e<String> $promoCodeState;
    final /* synthetic */ String $storeName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep3ScreenKt$CheckoutStep3Screen$4(LazyListState lazyListState, boolean z, PaymentType paymentType, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C28892e<String> eVar, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar3, C26132a aVar4, C11300l<? super Boolean, C11079d2> lVar2, C11300l<? super Double, C11079d2> lVar3, String str) {
        super(3);
        this.$listState = lazyListState;
        this.$hasPaymentTypeChoice = z;
        this.$paymentType = paymentType;
        this.$onChoiceOnline = aVar;
        this.$onChoiceOnsite = aVar2;
        this.$promoCodeState = eVar;
        this.$onCodeValidation = lVar;
        this.$onRemovePromoCode = aVar3;
        this.$loyaltyState = aVar4;
        this.$onUseAllLoyaltyChanged = lVar2;
        this.$onValidateLoyaltyAmount = lVar3;
        this.$storeName = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        int i2;
        C2366i0 i0Var2 = i0Var;
        int i3 = i;
        Intrinsics.checkNotNullParameter(i0Var2, "paddingValues");
        if ((i3 & 14) == 0) {
            i2 = (oVar.mo15006n0(i0Var2) ? 4 : 2) | i3;
        } else {
            C8592o oVar2 = oVar;
            i2 = i3;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-679487172, i3, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep3Screen.<anonymous> (CheckoutStep3Screen.kt:283)");
            }
            C8767m j = PaddingKt.m10023j(BackgroundKt.m8825d(C8767m.f23478j, C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null), i0Var2);
            LazyListState lazyListState = this.$listState;
            final boolean z = this.$hasPaymentTypeChoice;
            final PaymentType paymentType = this.$paymentType;
            final C11289a<C11079d2> aVar = this.$onChoiceOnline;
            final C11289a<C11079d2> aVar2 = this.$onChoiceOnsite;
            final C28892e<String> eVar = this.$promoCodeState;
            final C11300l<String, C11079d2> lVar = this.$onCodeValidation;
            final C11289a<C11079d2> aVar3 = this.$onRemovePromoCode;
            final C26132a aVar4 = this.$loyaltyState;
            final C11300l<Boolean, C11079d2> lVar2 = this.$onUseAllLoyaltyChanged;
            C11300l<Double, C11079d2> lVar3 = this.$onValidateLoyaltyAmount;
            final String str = this.$storeName;
            final C11300l<Double, C11079d2> lVar4 = lVar3;
            final LazyListState lazyListState2 = lazyListState;
            LazyDslKt.m10737b(j, lazyListState, (C2366i0) null, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new C11300l<LazyListScope, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LazyListScope) obj);
                    return C11079d2.f28267a;
                }

                public final void invoke(@C12579k LazyListScope lazyListScope) {
                    Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
                    CheckoutStep3ScreenKt.m104406N(lazyListScope, z, paymentType, aVar, aVar2);
                    CheckoutStep3ScreenKt.m104407O(lazyListScope, lazyListState2, eVar, lVar, aVar3);
                    CheckoutStep3ScreenKt.m104404L(lazyListScope, aVar4, paymentType, lVar2, lVar4);
                    CheckoutStep3ScreenKt.m104405M(lazyListScope, paymentType, str);
                    CheckoutStep3ScreenKt.m104408P(lazyListScope);
                    CheckoutStep3ScreenKt.m104402J(lazyListScope);
                }
            }, oVar, 0, 252);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
