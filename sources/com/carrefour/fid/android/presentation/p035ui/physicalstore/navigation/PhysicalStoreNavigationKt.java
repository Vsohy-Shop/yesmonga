package com.carrefour.fid.android.presentation.p035ui.physicalstore.navigation;

import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.C19695c0;
import androidx.navigation.compose.C19717e;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.navigation.PhysicalStoreNavigationKt */
public final class PhysicalStoreNavigationKt {
    @C12579k

    /* renamed from: a */
    public static final String f62533a = "physical_store_screen";

    /* renamed from: a */
    public static final void m109689a(@C12579k C19695c0 c0Var, @C12579k C29018a aVar, @C12579k C11289a<C11079d2> aVar2, @C12579k C11289a<C11079d2> aVar3, @C12579k C11300l<? super String, C11079d2> lVar, @C12579k C11289a<C11079d2> aVar4, @C12579k C11289a<C11079d2> aVar5, @C12579k C11300l<? super Integer, C11079d2> lVar2, @C12579k C11289a<C11079d2> aVar6, @C12579k C11300l<? super Boolean, C11079d2> lVar3, @C12579k C11305q<? super String, ? super String, ? super String, C11079d2> qVar, @C12579k C11289a<C11079d2> aVar7, @C12579k C11289a<C11079d2> aVar8) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        C29018a aVar9 = aVar;
        Intrinsics.checkNotNullParameter(aVar9, "analytics");
        C11289a<C11079d2> aVar10 = aVar2;
        Intrinsics.checkNotNullParameter(aVar10, "onNavigateToFacilitiesSearch");
        C11289a<C11079d2> aVar11 = aVar3;
        Intrinsics.checkNotNullParameter(aVar11, "onNavigateToCatalogs");
        C11300l<? super String, C11079d2> lVar4 = lVar;
        Intrinsics.checkNotNullParameter(lVar4, "onOpenCatalogWebView");
        C11289a<C11079d2> aVar12 = aVar4;
        Intrinsics.checkNotNullParameter(aVar12, "onNavigateToChallengeFidFragment");
        C11289a<C11079d2> aVar13 = aVar5;
        Intrinsics.checkNotNullParameter(aVar13, "onNavigateToLoyaltyHome");
        C11300l<? super Integer, C11079d2> lVar5 = lVar2;
        Intrinsics.checkNotNullParameter(lVar5, "onNavigateToLoyaltyAmountHistoryFragment");
        C11289a<C11079d2> aVar14 = aVar6;
        Intrinsics.checkNotNullParameter(aVar14, "onNavigateToLoyaltyCardFragment");
        C11300l<? super Boolean, C11079d2> lVar6 = lVar3;
        Intrinsics.checkNotNullParameter(lVar6, "onNavigationToCouponFragment");
        C11305q<? super String, ? super String, ? super String, C11079d2> qVar2 = qVar;
        Intrinsics.checkNotNullParameter(qVar2, "onOpenArsenalWebView");
        C11289a<C11079d2> aVar15 = aVar7;
        Intrinsics.checkNotNullParameter(aVar15, "onArsenalError");
        C11289a<C11079d2> aVar16 = aVar8;
        Intrinsics.checkNotNullParameter(aVar16, "onNavigateToInfo");
        PhysicalStoreNavigationKt$physicalStoreScreen$1 physicalStoreNavigationKt$physicalStoreScreen$1 = r2;
        PhysicalStoreNavigationKt$physicalStoreScreen$1 physicalStoreNavigationKt$physicalStoreScreen$12 = new PhysicalStoreNavigationKt$physicalStoreScreen$1(aVar9, aVar10, aVar11, lVar4, aVar12, aVar13, lVar5, aVar14, lVar6, qVar2, aVar15, aVar16);
        C19717e.m91748b(c0Var, f62533a, (List) null, (List) null, C8553b.m31049c(-1154707845, true, physicalStoreNavigationKt$physicalStoreScreen$1), 6, (Object) null);
    }
}
