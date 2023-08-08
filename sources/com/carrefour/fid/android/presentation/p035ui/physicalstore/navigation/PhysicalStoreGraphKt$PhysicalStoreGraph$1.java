package com.carrefour.fid.android.presentation.p035ui.physicalstore.navigation;

import androidx.compose.runtime.C8578k2;
import androidx.navigation.C19695c0;
import androidx.navigation.C19754h0;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.navigation.PhysicalStoreGraphKt$PhysicalStoreGraph$1 */
public final class PhysicalStoreGraphKt$PhysicalStoreGraph$1 extends Lambda implements C11300l<C19695c0, C11079d2> {
    final /* synthetic */ C29018a $analytics;
    final /* synthetic */ C8578k2<C19754h0> $navController$delegate;
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
    public PhysicalStoreGraphKt$PhysicalStoreGraph$1(C29018a aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5, C11300l<? super Integer, C11079d2> lVar2, C11289a<C11079d2> aVar6, C11300l<? super Boolean, C11079d2> lVar3, C11305q<? super String, ? super String, ? super String, C11079d2> qVar, C11289a<C11079d2> aVar7, PhysicalStoreInfoViewModel physicalStoreInfoViewModel, C11300l<? super String, C11079d2> lVar4, C8578k2<? extends C19754h0> k2Var) {
        super(1);
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
        this.$viewModelInfo = physicalStoreInfoViewModel;
        this.$onRedirectToPhoneClicked = lVar4;
        this.$navController$delegate = k2Var;
    }

    /* renamed from: a */
    public final void mo74058a(@C12579k C19695c0 c0Var) {
        C19695c0 c0Var2 = c0Var;
        Intrinsics.checkNotNullParameter(c0Var2, "$this$NavHost");
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
        final C8578k2<C19754h0> k2Var = this.$navController$delegate;
        PhysicalStoreNavigationKt.m109689a(c0Var, aVar, aVar2, aVar3, lVar, aVar4, aVar5, lVar2, aVar6, lVar3, qVar, aVar7, new C11289a<C11079d2>() {
            public final void invoke() {
                PhysicalStoreInfoNavigationKt.m109680a(PhysicalStoreGraphKt.m109677b(k2Var));
            }
        });
        PhysicalStoreInfoViewModel physicalStoreInfoViewModel = this.$viewModelInfo;
        C29018a aVar8 = this.$analytics;
        final C8578k2<C19754h0> k2Var2 = this.$navController$delegate;
        C254062 r4 = new C11289a<C11079d2>() {
            public final void invoke() {
                PhysicalStoreGraphKt.m109677b(k2Var2).mo58156s0();
            }
        };
        final C8578k2<C19754h0> k2Var3 = this.$navController$delegate;
        C254073 r5 = new C11289a<C11079d2>() {
            public final void invoke() {
                PhysicalStoreInfoNavigationKt.m109682c(PhysicalStoreGraphKt.m109677b(k2Var3));
            }
        };
        final C8578k2<C19754h0> k2Var4 = this.$navController$delegate;
        PhysicalStoreInfoNavigationKt.m109683d(c0Var, physicalStoreInfoViewModel, aVar8, r4, r5, new C11289a<C11079d2>() {
            public final void invoke() {
                PhysicalStoreInfoNavigationKt.m109681b(PhysicalStoreGraphKt.m109677b(k2Var4));
            }
        }, this.$onRedirectToPhoneClicked);
        PhysicalStoreInfoViewModel physicalStoreInfoViewModel2 = this.$viewModelInfo;
        C29018a aVar9 = this.$analytics;
        final C8578k2<C19754h0> k2Var5 = this.$navController$delegate;
        PhysicalStoreInfoNavigationKt.m109685f(c0Var2, physicalStoreInfoViewModel2, aVar9, new C11289a<C11079d2>() {
            public final void invoke() {
                PhysicalStoreGraphKt.m109677b(k2Var5).mo58156s0();
            }
        });
        PhysicalStoreInfoViewModel physicalStoreInfoViewModel3 = this.$viewModelInfo;
        C29018a aVar10 = this.$analytics;
        final C8578k2<C19754h0> k2Var6 = this.$navController$delegate;
        PhysicalStoreInfoNavigationKt.m109684e(c0Var2, physicalStoreInfoViewModel3, aVar10, new C11289a<C11079d2>() {
            public final void invoke() {
                PhysicalStoreGraphKt.m109677b(k2Var6).mo58156s0();
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74058a((C19695c0) obj);
        return C11079d2.f28267a;
    }
}
