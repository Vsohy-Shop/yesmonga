package com.carrefour.fid.android.product.presentation.p039ui.facet.navigation;

import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.C19695c0;
import androidx.navigation.C19755i;
import androidx.navigation.C19761k0;
import androidx.navigation.NavController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.C19717e;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.navigation.FacetDetailsNavigationKt */
public final class FacetDetailsNavigationKt {
    @C12579k

    /* renamed from: a */
    public static final String f67858a = "checkbox_filter_details_screen";
    @C12579k

    /* renamed from: b */
    public static final String f67859b = "filter_field";

    /* renamed from: a */
    public static final void m117426a(@C12579k C19695c0 c0Var, @C12579k FacetViewModel facetViewModel, @C12579k C27950a aVar, @C12579k C38326b bVar, @C12579k C11289a<C11079d2> aVar2, @C12579k C11289a<C11079d2> aVar3, @C12579k C11289a<C11079d2> aVar4, @C12579k C11289a<C11079d2> aVar5) {
        C19695c0 c0Var2 = c0Var;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(facetViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(aVar, "analytics");
        C38326b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(bVar2, "performance");
        C11289a<C11079d2> aVar6 = aVar2;
        Intrinsics.checkNotNullParameter(aVar6, "onBackClicked");
        C11289a<C11079d2> aVar7 = aVar3;
        Intrinsics.checkNotNullParameter(aVar7, "onSeeProductClicked");
        C11289a<C11079d2> aVar8 = aVar4;
        Intrinsics.checkNotNullParameter(aVar8, "onShowAllergenClicked");
        C11289a<C11079d2> aVar9 = aVar5;
        Intrinsics.checkNotNullParameter(aVar9, "displayErrorSnackbar");
        C19717e.m91748b(c0Var, "checkbox_filter_details_screen/{filter_field}", C10976s.m41419k(C19755i.m91859a(f67859b, FacetDetailsNavigationKt$facetDetailsScreen$1.f67860f)), (List) null, C8553b.m31049c(1013873929, true, new FacetDetailsNavigationKt$facetDetailsScreen$2(facetViewModel, aVar, bVar2, aVar6, aVar7, aVar8, aVar9)), 4, (Object) null);
    }

    /* renamed from: b */
    public static final void m117427b(@C12579k NavController navController, @C12579k String str) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(str, "filterField");
        NavController.m91394n0(navController, "checkbox_filter_details_screen/" + str, (C19761k0) null, (Navigator.C19688a) null, 6, (Object) null);
    }
}
