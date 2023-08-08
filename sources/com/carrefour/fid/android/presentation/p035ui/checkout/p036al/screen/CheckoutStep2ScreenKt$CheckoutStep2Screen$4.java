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
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.state.C26102a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.state.C26105b;
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
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$CheckoutStep2Screen$4 */
public final class CheckoutStep2ScreenKt$CheckoutStep2Screen$4 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ Basket $basket;
    final /* synthetic */ Address $billingAddress;
    final /* synthetic */ C11289a<C11079d2> $disablePostOrderSubstitution;
    final /* synthetic */ C11289a<C11079d2> $enablePostOrderSubstitution;
    final /* synthetic */ boolean $hasPostOrderSubstitution;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ C11300l<String, C11079d2> $onCodeValidation;
    final /* synthetic */ C11289a<C11079d2> $onRemovePromoCode;
    final /* synthetic */ C11289a<C11079d2> $onSlotEdit;
    final /* synthetic */ boolean $postOrderSubstitutionSelection;
    final /* synthetic */ C28892e<String> $promoCodeState;
    final /* synthetic */ C26102a $serviceState;
    final /* synthetic */ boolean $showPreparationFees;
    final /* synthetic */ C26105b $slotSectionState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ScreenKt$CheckoutStep2Screen$4(LazyListState lazyListState, C26105b bVar, C26102a aVar, C11289a<C11079d2> aVar2, Address address, C28892e<String> eVar, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar3, Basket basket, boolean z, boolean z2, boolean z3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5) {
        super(3);
        this.$listState = lazyListState;
        this.$slotSectionState = bVar;
        this.$serviceState = aVar;
        this.$onSlotEdit = aVar2;
        this.$billingAddress = address;
        this.$promoCodeState = eVar;
        this.$onCodeValidation = lVar;
        this.$onRemovePromoCode = aVar3;
        this.$basket = basket;
        this.$showPreparationFees = z;
        this.$hasPostOrderSubstitution = z2;
        this.$postOrderSubstitutionSelection = z3;
        this.$enablePostOrderSubstitution = aVar4;
        this.$disablePostOrderSubstitution = aVar5;
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
                ComposerKt.m29845w0(-137969768, i3, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2Screen.<anonymous> (CheckoutStep2Screen.kt:226)");
            }
            C8767m j = PaddingKt.m10023j(BackgroundKt.m8825d(C8767m.f23478j, C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null), i0Var2);
            LazyListState lazyListState = this.$listState;
            final C26105b bVar = this.$slotSectionState;
            final C26102a aVar = this.$serviceState;
            final C11289a<C11079d2> aVar2 = this.$onSlotEdit;
            final Address address = this.$billingAddress;
            final C28892e<String> eVar = this.$promoCodeState;
            final C11300l<String, C11079d2> lVar = this.$onCodeValidation;
            final C11289a<C11079d2> aVar3 = this.$onRemovePromoCode;
            final Basket basket = this.$basket;
            final boolean z = this.$showPreparationFees;
            boolean z2 = this.$hasPostOrderSubstitution;
            final boolean z3 = this.$postOrderSubstitutionSelection;
            final boolean z4 = z2;
            final LazyListState lazyListState2 = lazyListState;
            final C11289a<C11079d2> aVar4 = this.$enablePostOrderSubstitution;
            final C11289a<C11079d2> aVar5 = this.$disablePostOrderSubstitution;
            LazyDslKt.m10737b(j, lazyListState, (C2366i0) null, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new C11300l<LazyListScope, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LazyListScope) obj);
                    return C11079d2.f28267a;
                }

                public final void invoke(@C12579k LazyListScope lazyListScope) {
                    Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
                    CheckoutStep2ScreenKt.m104355J(lazyListScope, bVar);
                    CheckoutStep2ScreenKt.m104362Q(lazyListScope, aVar);
                    CheckoutStep2ScreenKt.m104363R(lazyListScope, bVar, aVar2);
                    CheckoutStep2ScreenKt.m104354I(lazyListScope, address);
                    CheckoutStep2ScreenKt.m104359N(lazyListScope, aVar);
                    CheckoutStep2ScreenKt.m104361P(lazyListScope, lazyListState2, eVar, lVar, aVar3);
                    CheckoutStep2ScreenKt.m104353H(lazyListScope, basket, z);
                    CheckoutStep2ScreenKt.m104360O(lazyListScope, z4, z3, aVar4, aVar5);
                    CheckoutStep2ScreenKt.m104358M(lazyListScope);
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
