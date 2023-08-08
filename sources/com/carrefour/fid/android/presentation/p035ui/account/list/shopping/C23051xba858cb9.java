package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import android.content.Context;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.shopping.C23066f;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25882a;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.ShoppingListViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$actioner$1 */
public final class C23051xba858cb9 extends Lambda implements C11300l<C23066f, C11079d2> {
    final /* synthetic */ C25882a $analytics;
    final /* synthetic */ Context $context;
    final /* synthetic */ C11300l<Gtin, C11079d2> $onAntiInflationClick;
    final /* synthetic */ C11304p<OfferIdentifier, Boolean, C11079d2> $onCardPressed;
    final /* synthetic */ C11304p<NotificationComponent.Variant, String, C11079d2> $onDisplaySnackbar;
    final /* synthetic */ C11300l<PlpOffer, C11079d2> $onMixingPressed;
    final /* synthetic */ C11289a<C11079d2> $onNavigationBackClicked;
    final /* synthetic */ C11305q<Gtin, Integer, Integer, C11079d2> $onOpenBackDrop;
    final /* synthetic */ C11289a<C11079d2> $onOpenLogin;
    final /* synthetic */ C11289a<C11079d2> $onOpenPlp;
    final /* synthetic */ ShoppingListViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23051xba858cb9(C25882a aVar, Context context, ShoppingListViewModel shoppingListViewModel, C11304p<? super OfferIdentifier, ? super Boolean, C11079d2> pVar, C11304p<? super NotificationComponent.Variant, ? super String, C11079d2> pVar2, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11305q<? super Gtin, ? super Integer, ? super Integer, C11079d2> qVar, C11300l<? super PlpOffer, C11079d2> lVar, C11300l<? super Gtin, C11079d2> lVar2) {
        super(1);
        this.$analytics = aVar;
        this.$context = context;
        this.$viewModel = shoppingListViewModel;
        this.$onCardPressed = pVar;
        this.$onDisplaySnackbar = pVar2;
        this.$onNavigationBackClicked = aVar2;
        this.$onOpenLogin = aVar3;
        this.$onOpenPlp = aVar4;
        this.$onOpenBackDrop = qVar;
        this.$onMixingPressed = lVar;
        this.$onAntiInflationClick = lVar2;
    }

    /* renamed from: a */
    public final void mo67706a(@C12579k C23066f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "it");
        if (fVar instanceof C23066f.C23067a) {
            C23066f.C23067a aVar = (C23066f.C23067a) fVar;
            this.$analytics.mo75152i(aVar.mo67736g(), AccountListFragment.ParentScreen.ACCOUNT_LIST, 1, aVar.mo67737h());
            this.$analytics.mo75165v(this.$context, aVar.mo67736g().mo118850A(), 1);
            this.$viewModel.mo75131l0(aVar.mo67735f());
        } else if (fVar instanceof C23066f.C23069c) {
            C23066f.C23069c cVar = (C23066f.C23069c) fVar;
            this.$analytics.mo75158o(cVar.mo67752g(), AccountListFragment.ParentScreen.ACCOUNT_LIST, cVar.mo67753h());
            this.$onCardPressed.invoke(cVar.mo67751f(), Boolean.valueOf(cVar.mo67752g().mo118860K()));
        } else if (fVar instanceof C23066f.C23071e) {
            C23066f.C23071e eVar = (C23066f.C23071e) fVar;
            this.$onDisplaySnackbar.invoke(eVar.mo67771f(), eVar.mo67769e());
        } else if (Intrinsics.areEqual((Object) fVar, (Object) C23066f.C23073g.f58732a)) {
            this.$onNavigationBackClicked.invoke();
        } else if (Intrinsics.areEqual((Object) fVar, (Object) C23066f.C23075i.f58738a)) {
            this.$analytics.mo75163t(AccountListFragment.ParentScreen.ACCOUNT_LIST);
            this.$onOpenLogin.invoke();
        } else if (Intrinsics.areEqual((Object) fVar, (Object) C23066f.C23076j.f58740a)) {
            this.$onOpenPlp.invoke();
        } else if (fVar instanceof C23066f.C23078l) {
            C23066f.C23078l lVar = (C23066f.C23078l) fVar;
            this.$analytics.mo75161r(lVar.mo67792d(), AccountListFragment.ParentScreen.ACCOUNT_LIST);
            this.$viewModel.mo75137r0(lVar.mo67792d().mo118850A());
        } else if (fVar instanceof C23066f.C23074h) {
            C23066f.C23074h hVar = (C23066f.C23074h) fVar;
            this.$onOpenBackDrop.invoke(Gtin.m157307a(hVar.mo67786g().mo118850A()), Integer.valueOf(hVar.mo67787h()), Integer.valueOf(hVar.mo67785f()));
        } else if (fVar instanceof C23066f.C23070d) {
            C23066f.C23070d dVar = (C23066f.C23070d) fVar;
            if (dVar.mo67761f() > 0) {
                this.$analytics.mo75152i(dVar.mo67762g(), AccountListFragment.ParentScreen.ACCOUNT_LIST, dVar.mo67761f(), dVar.mo67763h() + 1);
                this.$analytics.mo75165v(this.$context, dVar.mo67762g().mo118850A(), dVar.mo67761f());
            } else if (dVar.mo67761f() < 0) {
                this.$analytics.mo75154k(dVar.mo67762g(), AccountListFragment.ParentScreen.ACCOUNT_LIST, dVar.mo67761f(), dVar.mo67763h() + 1);
            }
        } else if (Intrinsics.areEqual((Object) fVar, (Object) C23066f.C23077k.f58742a)) {
            this.$viewModel.mo75132m0();
        } else if (fVar instanceof C23066f.C23072f) {
            this.$analytics.mo75164u(AccountListFragment.ParentScreen.ACCOUNT_LIST);
            this.$onMixingPressed.invoke(((C23066f.C23072f) fVar).mo67776d());
        } else if (fVar instanceof C23066f.C23068b) {
            this.$onAntiInflationClick.invoke(Gtin.m157307a(((C23066f.C23068b) fVar).mo67742d()));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo67706a((C23066f) obj);
        return C11079d2.f28267a;
    }
}
