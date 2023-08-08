package com.carrefour.fid.android.presentation.p035ui.physicalstore.navigation;

import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.C19695c0;
import androidx.navigation.C19761k0;
import androidx.navigation.NavController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.C19717e;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.navigation.PhysicalStoreInfoNavigationKt */
public final class PhysicalStoreInfoNavigationKt {
    @C12579k

    /* renamed from: a */
    public static final String f62530a = "physical_store_info_route";
    @C12579k

    /* renamed from: b */
    public static final String f62531b = "physical_store_services_route";
    @C12579k

    /* renamed from: c */
    public static final String f62532c = "physical_store_openings_route";

    /* renamed from: a */
    public static final void m109680a(@C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        NavController.m91394n0(navController, f62530a, (C19761k0) null, (Navigator.C19688a) null, 6, (Object) null);
    }

    /* renamed from: b */
    public static final void m109681b(@C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        NavController.m91394n0(navController, f62532c, (C19761k0) null, (Navigator.C19688a) null, 6, (Object) null);
    }

    /* renamed from: c */
    public static final void m109682c(@C12579k NavController navController) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        NavController.m91394n0(navController, f62531b, (C19761k0) null, (Navigator.C19688a) null, 6, (Object) null);
    }

    /* renamed from: d */
    public static final void m109683d(@C12579k C19695c0 c0Var, @C12579k PhysicalStoreInfoViewModel physicalStoreInfoViewModel, @C12579k C29018a aVar, @C12579k C11289a<C11079d2> aVar2, @C12579k C11289a<C11079d2> aVar3, @C12579k C11289a<C11079d2> aVar4, @C12579k C11300l<? super String, C11079d2> lVar) {
        C19695c0 c0Var2 = c0Var;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(physicalStoreInfoViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(aVar, "analytics");
        Intrinsics.checkNotNullParameter(aVar2, "onBackPressed");
        C11289a<C11079d2> aVar5 = aVar3;
        Intrinsics.checkNotNullParameter(aVar5, "onSeeAllServicesClicked");
        C11289a<C11079d2> aVar6 = aVar4;
        Intrinsics.checkNotNullParameter(aVar6, "onSeeOpeningClicked");
        C11300l<? super String, C11079d2> lVar2 = lVar;
        Intrinsics.checkNotNullParameter(lVar2, "onRedirectToPhoneClicked");
        C19717e.m91748b(c0Var, f62530a, (List) null, (List) null, C8553b.m31049c(-1096892156, true, new PhysicalStoreInfoNavigationKt$physicalStoreInfoScreen$1(physicalStoreInfoViewModel, aVar, aVar2, aVar5, aVar6, lVar2)), 6, (Object) null);
    }

    /* renamed from: e */
    public static final void m109684e(@C12579k C19695c0 c0Var, @C12579k PhysicalStoreInfoViewModel physicalStoreInfoViewModel, @C12579k C29018a aVar, @C12579k C11289a<C11079d2> aVar2) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(physicalStoreInfoViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(aVar, "analytics");
        Intrinsics.checkNotNullParameter(aVar2, "onBackPressed");
        C19717e.m91748b(c0Var, f62532c, (List) null, (List) null, C8553b.m31049c(1060727372, true, new PhysicalStoreInfoNavigationKt$physicalStoreOpeningsScreen$1(physicalStoreInfoViewModel, aVar, aVar2)), 6, (Object) null);
    }

    /* renamed from: f */
    public static final void m109685f(@C12579k C19695c0 c0Var, @C12579k PhysicalStoreInfoViewModel physicalStoreInfoViewModel, @C12579k C29018a aVar, @C12579k C11289a<C11079d2> aVar2) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(physicalStoreInfoViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(aVar, "analytics");
        Intrinsics.checkNotNullParameter(aVar2, "onBackPressed");
        C19717e.m91748b(c0Var, f62531b, (List) null, (List) null, C8553b.m31049c(709115343, true, new PhysicalStoreInfoNavigationKt$physicalStoreServicesScreen$1(physicalStoreInfoViewModel, aVar, aVar2)), 6, (Object) null);
    }
}
