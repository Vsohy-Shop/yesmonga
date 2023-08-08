package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.analytics.C23456a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.CheckoutBasketsListViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$5 */
public final class CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$5 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C23456a $analytics;
    final /* synthetic */ C11289a<C11079d2> $onBackClicked;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToDepartments;
    final /* synthetic */ C11305q<Boolean, BasketType, String, C11079d2> $onNavigateToDetailedBasket;
    final /* synthetic */ CheckoutBasketsListViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$5(CheckoutBasketsListViewModel checkoutBasketsListViewModel, C23456a aVar, C11289a<C11079d2> aVar2, C11305q<? super Boolean, ? super BasketType, ? super String, C11079d2> qVar, C11289a<C11079d2> aVar3, int i, int i2) {
        super(2);
        this.$viewModel = checkoutBasketsListViewModel;
        this.$analytics = aVar;
        this.$onBackClicked = aVar2;
        this.$onNavigateToDetailedBasket = qVar;
        this.$onNavigateToDepartments = aVar3;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CheckoutBasketsListStatefulKt.m104518d(this.$viewModel, this.$analytics, this.$onBackClicked, this.$onNavigateToDetailedBasket, this.$onNavigateToDepartments, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
