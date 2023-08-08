package com.carrefour.fid.android.product.presentation.p039ui.facet.navigation;

import androidx.compose.runtime.internal.C8553b;
import androidx.navigation.C19695c0;
import androidx.navigation.compose.C19717e;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.navigation.FacetNavigationKt */
public final class FacetNavigationKt {
    @C12579k

    /* renamed from: a */
    public static final String f67861a = "facet_screen";

    /* renamed from: a */
    public static final void m117430a(@C12579k C19695c0 c0Var, @C12579k FacetViewModel facetViewModel, @C12579k C27950a aVar, @C12579k C38326b bVar, @C12579k C11289a<C11079d2> aVar2, @C12579k C11300l<? super String, C11079d2> lVar, @C12579k C11289a<C11079d2> aVar3) {
        C19695c0 c0Var2 = c0Var;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(facetViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(aVar, "analytics");
        Intrinsics.checkNotNullParameter(bVar, "performance");
        C11289a<C11079d2> aVar4 = aVar2;
        Intrinsics.checkNotNullParameter(aVar4, "onBackPress");
        C11300l<? super String, C11079d2> lVar2 = lVar;
        Intrinsics.checkNotNullParameter(lVar2, "onNavigateToFilters");
        C11289a<C11079d2> aVar5 = aVar3;
        Intrinsics.checkNotNullParameter(aVar5, "displayErrorSnackbar");
        C19717e.m91748b(c0Var, f67861a, (List) null, (List) null, C8553b.m31049c(-1891926782, true, new FacetNavigationKt$facetScreen$1(facetViewModel, aVar, bVar, aVar4, lVar2, aVar5)), 6, (Object) null);
    }
}
