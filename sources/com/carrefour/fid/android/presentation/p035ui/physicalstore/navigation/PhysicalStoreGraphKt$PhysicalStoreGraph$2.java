package com.carrefour.fid.android.presentation.p035ui.physicalstore.navigation;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.navigation.PhysicalStoreGraphKt$PhysicalStoreGraph$2 */
public final class PhysicalStoreGraphKt$PhysicalStoreGraph$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C29018a $analytics;
    final /* synthetic */ C11289a<C11079d2> $onArsenalError;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToCatalogs;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToChallengeFidFragment;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToFacilitiesSearch;
    final /* synthetic */ C11300l<Integer, C11079d2> $onNavigateToLoyaltyAmountHistoryFragment;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToLoyaltyCardFragment;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToLoyaltyHome;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onNavigationToCouponFragment;
    final /* synthetic */ C11305q<String, String, String, C11079d2> $onOpenArsenalWebView;
    final /* synthetic */ C11300l<String, C11079d2> $onOpenCatalogWebView;
    final /* synthetic */ C11300l<String, C11079d2> $onRedirectToPhoneClicked;
    final /* synthetic */ PhysicalStoreInfoViewModel $viewModelInfo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreGraphKt$PhysicalStoreGraph$2(PhysicalStoreInfoViewModel physicalStoreInfoViewModel, C29018a aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11300l<? super Integer, C11079d2> lVar2, C11289a<C11079d2> aVar6, C11300l<? super Boolean, C11079d2> lVar3, C11305q<? super String, ? super String, ? super String, C11079d2> qVar, C11289a<C11079d2> aVar7, C11300l<? super String, C11079d2> lVar4, int i, int i2, int i3) {
        super(2);
        this.$viewModelInfo = physicalStoreInfoViewModel;
        this.$analytics = aVar;
        this.$onNavigateToFacilitiesSearch = aVar2;
        this.$onNavigateToCatalogs = aVar3;
        this.$onOpenCatalogWebView = lVar;
        this.$onNavigateToChallengeFidFragment = aVar4;
        this.$onNavigateToLoyaltyHome = aVar5;
        this.$onNavigateToLoyaltyAmountHistoryFragment = lVar2;
        this.$onNavigateToLoyaltyCardFragment = aVar6;
        this.$onNavigationToCouponFragment = lVar3;
        this.$onOpenArsenalWebView = qVar;
        this.$onArsenalError = aVar7;
        this.$onRedirectToPhoneClicked = lVar4;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        PhysicalStoreInfoViewModel physicalStoreInfoViewModel = this.$viewModelInfo;
        C29018a aVar = this.$analytics;
        C11289a<C11079d2> aVar2 = this.$onNavigateToFacilitiesSearch;
        C11289a<C11079d2> aVar3 = this.$onNavigateToCatalogs;
        C11300l<String, C11079d2> lVar = this.$onOpenCatalogWebView;
        C11289a<C11079d2> aVar4 = this.$onNavigateToChallengeFidFragment;
        C11289a<C11079d2> aVar5 = this.$onNavigateToLoyaltyHome;
        C11300l<Integer, C11079d2> lVar2 = this.$onNavigateToLoyaltyAmountHistoryFragment;
        C11289a<C11079d2> aVar6 = this.$onNavigateToLoyaltyCardFragment;
        C11300l<Boolean, C11079d2> lVar3 = this.$onNavigationToCouponFragment;
        C11305q<String, String, String, C11079d2> qVar = this.$onOpenArsenalWebView;
        C11289a<C11079d2> aVar7 = this.$onArsenalError;
        C11300l<String, C11079d2> lVar4 = this.$onRedirectToPhoneClicked;
        PhysicalStoreInfoViewModel physicalStoreInfoViewModel2 = physicalStoreInfoViewModel;
        PhysicalStoreGraphKt.m109676a(physicalStoreInfoViewModel2, aVar, aVar2, aVar3, lVar, aVar4, aVar5, lVar2, aVar6, lVar3, qVar, aVar7, lVar4, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
