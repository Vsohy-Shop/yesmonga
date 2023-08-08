package com.carrefour.fid.android.presentation.p035ui.physicalstore.navigation;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.carrefour.fid.android.presentation.p035ui.physicalstore.PhysicalStoreScreenKt;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/navigation/NavBackStackEntry;", "it", "Lkotlin/d2;", "a", "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/o;I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.navigation.PhysicalStoreNavigationKt$physicalStoreScreen$1 */
public final class PhysicalStoreNavigationKt$physicalStoreScreen$1 extends Lambda implements C11305q<NavBackStackEntry, C8592o, Integer, C11079d2> {
    final /* synthetic */ C29018a $analytics;
    final /* synthetic */ C11289a<C11079d2> $onArsenalError;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToCatalogs;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToChallengeFidFragment;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToFacilitiesSearch;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToInfo;
    final /* synthetic */ C11300l<Integer, C11079d2> $onNavigateToLoyaltyAmountHistoryFragment;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToLoyaltyCardFragment;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToLoyaltyHome;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onNavigationToCouponFragment;
    final /* synthetic */ C11305q<String, String, String, C11079d2> $onOpenArsenalWebView;
    final /* synthetic */ C11300l<String, C11079d2> $onOpenCatalogWebView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreNavigationKt$physicalStoreScreen$1(C29018a aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11300l<? super Integer, C11079d2> lVar2, C11289a<C11079d2> aVar6, C11300l<? super Boolean, C11079d2> lVar3, C11305q<? super String, ? super String, ? super String, C11079d2> qVar, C11289a<C11079d2> aVar7, C11289a<C11079d2> aVar8) {
        super(3);
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
        this.$onNavigateToInfo = aVar8;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo74063a(@C12579k NavBackStackEntry navBackStackEntry, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1154707845, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.navigation.physicalStoreScreen.<anonymous> (PhysicalStoreNavigation.kt:23)");
        }
        PhysicalStoreScreenKt.m109463f((PhysicalStoreViewModel) null, this.$analytics, this.$onNavigateToFacilitiesSearch, this.$onNavigateToCatalogs, this.$onOpenCatalogWebView, this.$onNavigateToChallengeFidFragment, this.$onNavigateToLoyaltyHome, this.$onNavigateToLoyaltyAmountHistoryFragment, this.$onNavigateToLoyaltyCardFragment, this.$onNavigationToCouponFragment, this.$onOpenArsenalWebView, this.$onArsenalError, this.$onNavigateToInfo, oVar, 0, 0, 1);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo74063a((NavBackStackEntry) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
