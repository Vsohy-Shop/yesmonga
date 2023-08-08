package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25882a;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel;
import com.carrefour.fid.android.shared.base.C28499q;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$5 */
public final class ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C25882a $analytics;
    final /* synthetic */ C28499q $fragment;
    final /* synthetic */ C11300l<Gtin, C11079d2> $onAntiInflationClick;
    final /* synthetic */ C11304p<OfferIdentifier, Boolean, C11079d2> $onCardPressed;
    final /* synthetic */ C11304p<NotificationComponent.Variant, String, C11079d2> $onDisplaySnackbar;
    final /* synthetic */ C11300l<PlpOffer, C11079d2> $onMixingPressed;
    final /* synthetic */ C11289a<C11079d2> $onNavigationBackClicked;
    final /* synthetic */ C11305q<Gtin, Integer, Integer, C11079d2> $onOpenBackDrop;
    final /* synthetic */ C11289a<C11079d2> $onOpenLogin;
    final /* synthetic */ C11289a<C11079d2> $onOpenPlp;
    final /* synthetic */ C11289a<C11079d2> $onOpenServiceSelection;
    final /* synthetic */ ShoppingListViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$5(C11304p<? super OfferIdentifier, ? super Boolean, C11079d2> pVar, C11305q<? super Gtin, ? super Integer, ? super Integer, C11079d2> qVar, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11304p<? super NotificationComponent.Variant, ? super String, C11079d2> pVar2, C11300l<? super PlpOffer, C11079d2> lVar, C11289a<C11079d2> aVar4, C11300l<? super Gtin, C11079d2> lVar2, ShoppingListViewModel shoppingListViewModel, C25882a aVar5, C28499q qVar2, int i, int i2, int i3) {
        super(2);
        this.$onCardPressed = pVar;
        this.$onOpenBackDrop = qVar;
        this.$onOpenPlp = aVar;
        this.$onOpenLogin = aVar2;
        this.$onNavigationBackClicked = aVar3;
        this.$onDisplaySnackbar = pVar2;
        this.$onMixingPressed = lVar;
        this.$onOpenServiceSelection = aVar4;
        this.$onAntiInflationClick = lVar2;
        this.$viewModel = shoppingListViewModel;
        this.$analytics = aVar5;
        this.$fragment = qVar2;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ShoppingListScreenStateFulKt.m103537c(this.$onCardPressed, this.$onOpenBackDrop, this.$onOpenPlp, this.$onOpenLogin, this.$onNavigationBackClicked, this.$onDisplaySnackbar, this.$onMixingPressed, this.$onOpenServiceSelection, this.$onAntiInflationClick, this.$viewModel, this.$analytics, this.$fragment, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
