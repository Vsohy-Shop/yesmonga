package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27101a;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$actioner$1 */
public final class PhysicalStoreScreenKt$PhysicalStoreStateful$actioner$1 extends Lambda implements C11300l<C27101a, C11079d2> {
    final /* synthetic */ C29018a $analytics;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToChallengeFidFragment;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToFacilitiesSearch;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToInfo;
    final /* synthetic */ C11300l<Integer, C11079d2> $onNavigateToLoyaltyAmountHistoryFragment;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToLoyaltyCardFragment;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToLoyaltyHome;
    final /* synthetic */ PhysicalStoreViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreScreenKt$PhysicalStoreStateful$actioner$1(C29018a aVar, C11289a<C11079d2> aVar2, PhysicalStoreViewModel physicalStoreViewModel, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11300l<? super Integer, C11079d2> lVar, C11289a<C11079d2> aVar6) {
        super(1);
        this.$analytics = aVar;
        this.$onNavigateToInfo = aVar2;
        this.$viewModel = physicalStoreViewModel;
        this.$onNavigateToFacilitiesSearch = aVar3;
        this.$onNavigateToChallengeFidFragment = aVar4;
        this.$onNavigateToLoyaltyHome = aVar5;
        this.$onNavigateToLoyaltyAmountHistoryFragment = lVar;
        this.$onNavigateToLoyaltyCardFragment = aVar6;
    }

    /* renamed from: a */
    public final void mo73840a(@C12579k C27101a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "action");
        if (Intrinsics.areEqual((Object) aVar, (Object) C27101a.C27112d.f65939a)) {
            this.$analytics.mo84450j();
            this.$onNavigateToInfo.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27101a.C27113e.f65941a)) {
            this.$viewModel.mo78802u0();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27101a.C27111c.f65937a)) {
            this.$analytics.mo84451k();
            this.$onNavigateToFacilitiesSearch.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27101a.C27114f.f65943a)) {
            this.$analytics.mo84456p();
            this.$onNavigateToFacilitiesSearch.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27101a.C27110b.f65935a)) {
            this.$analytics.mo84444d();
            this.$viewModel.mo78805x0();
        } else if (aVar instanceof C27101a.C27102a) {
            C27101a.C27102a aVar2 = (C27101a.C27102a) aVar;
            if (Intrinsics.areEqual((Object) aVar2, (Object) C27101a.C27102a.C27103a.f65920a)) {
                this.$analytics.mo84443c();
                this.$onNavigateToChallengeFidFragment.invoke();
            } else if (Intrinsics.areEqual((Object) aVar2, (Object) C27101a.C27102a.C27104b.f65922a)) {
                this.$analytics.mo84442b();
                this.$viewModel.mo78806y0();
            } else if (Intrinsics.areEqual((Object) aVar2, (Object) C27101a.C27102a.C27105c.f65924a)) {
                this.$analytics.mo84447g();
                this.$onNavigateToLoyaltyHome.invoke();
            } else if (aVar2 instanceof C27101a.C27102a.C27106d) {
                this.$analytics.mo84449i();
                this.$onNavigateToLoyaltyAmountHistoryFragment.invoke(Integer.valueOf(((C27101a.C27102a.C27106d) aVar).mo78819d()));
            } else if (aVar2 instanceof C27101a.C27102a.C27107e) {
                this.$analytics.mo84453m();
                C27101a.C27102a.C27107e eVar = (C27101a.C27102a.C27107e) aVar;
                this.$viewModel.mo78807z0(eVar.mo78826e(), eVar.mo78828f());
            } else if (aVar2 instanceof C27101a.C27102a.C27108f) {
                this.$analytics.mo84454n();
                this.$onNavigateToLoyaltyCardFragment.invoke();
            } else if (Intrinsics.areEqual((Object) aVar2, (Object) C27101a.C27102a.C27109g.f65933a)) {
                this.$analytics.mo84452l();
                this.$onNavigateToLoyaltyHome.invoke();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo73840a((C27101a) obj);
        return C11079d2.f28267a;
    }
}
