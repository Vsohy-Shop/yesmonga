package com.carrefour.fid.android.product.presentation.p039ui.facet.navigation;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import com.carrefour.fid.android.product.presentation.p039ui.facet.facets.FacetStatefulKt;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel;
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
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.navigation.FacetNavigationKt$facetScreen$1 */
public final class FacetNavigationKt$facetScreen$1 extends Lambda implements C11305q<NavBackStackEntry, C8592o, Integer, C11079d2> {
    final /* synthetic */ C27950a $analytics;
    final /* synthetic */ C11289a<C11079d2> $displayErrorSnackbar;
    final /* synthetic */ C11289a<C11079d2> $onBackPress;
    final /* synthetic */ C11300l<String, C11079d2> $onNavigateToFilters;
    final /* synthetic */ C38326b $performance;
    final /* synthetic */ FacetViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetNavigationKt$facetScreen$1(FacetViewModel facetViewModel, C27950a aVar, C38326b bVar, C11289a<C11079d2> aVar2, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar3) {
        super(3);
        this.$viewModel = facetViewModel;
        this.$analytics = aVar;
        this.$performance = bVar;
        this.$onBackPress = aVar2;
        this.$onNavigateToFilters = lVar;
        this.$displayErrorSnackbar = aVar3;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo81498a(@C12579k NavBackStackEntry navBackStackEntry, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "it");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1891926782, i, -1, "com.carrefour.fid.android.product.presentation.ui.facet.navigation.facetScreen.<anonymous> (FacetNavigation.kt:19)");
        }
        FacetStatefulKt.m117375c(this.$viewModel, this.$analytics, this.$performance, this.$onBackPress, this.$onNavigateToFilters, this.$displayErrorSnackbar, oVar, 520);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo81498a((NavBackStackEntry) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
