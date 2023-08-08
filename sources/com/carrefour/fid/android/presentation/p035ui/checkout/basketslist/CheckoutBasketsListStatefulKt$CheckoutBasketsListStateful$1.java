package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.C23460b;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.analytics.C23456a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.CheckoutBasketsListViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$1 */
public final class CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$1 extends Lambda implements C11300l<C23460b, C11079d2> {
    final /* synthetic */ C23456a $analytics;
    final /* synthetic */ C11289a<C11079d2> $onBackClicked;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToDepartments;
    final /* synthetic */ C11305q<Boolean, BasketType, String, C11079d2> $onNavigateToDetailedBasket;
    final /* synthetic */ CheckoutBasketsListViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$1(CheckoutBasketsListViewModel checkoutBasketsListViewModel, C11289a<C11079d2> aVar, C23456a aVar2, C11305q<? super Boolean, ? super BasketType, ? super String, C11079d2> qVar, C11289a<C11079d2> aVar3) {
        super(1);
        this.$viewModel = checkoutBasketsListViewModel;
        this.$onBackClicked = aVar;
        this.$analytics = aVar2;
        this.$onNavigateToDetailedBasket = qVar;
        this.$onNavigateToDepartments = aVar3;
    }

    /* renamed from: a */
    public final void mo68687a(@C12579k C23460b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "action");
        if (Intrinsics.areEqual((Object) bVar, (Object) C23460b.C23463c.f59321a)) {
            this.$viewModel.mo75924g0();
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C23460b.C23461a.f59317a)) {
            this.$onBackClicked.invoke();
        } else if (bVar instanceof C23460b.C23464d) {
            C23460b.C23464d dVar = (C23460b.C23464d) bVar;
            this.$analytics.mo68701a(dVar.mo68712g(), this.$viewModel.mo75926h0(), dVar.mo68715i());
            C11305q<Boolean, BasketType, String, C11079d2> qVar = this.$onNavigateToDetailedBasket;
            Boolean valueOf = Boolean.valueOf(dVar.mo68716j());
            BasketType g = dVar.mo68712g();
            String h = dVar.mo68713h();
            if (h == null) {
                h = "";
            }
            qVar.invoke(valueOf, g, h);
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C23460b.C23462b.f59319a)) {
            this.$onNavigateToDepartments.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo68687a((C23460b) obj);
        return C11079d2.f28267a;
    }
}
