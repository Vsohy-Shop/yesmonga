package com.carrefour.fid.android.product.presentation.p039ui.facet;

import androidx.compose.runtime.C8578k2;
import androidx.navigation.C19695c0;
import androidx.navigation.C19754h0;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import com.carrefour.fid.android.product.presentation.p039ui.facet.navigation.FacetDetailsNavigationKt;
import com.carrefour.fid.android.product.presentation.p039ui.facet.navigation.FacetNavigationKt;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.FacetGraphKt$FacetGraph$1 */
public final class FacetGraphKt$FacetGraph$1 extends Lambda implements C11300l<C19695c0, C11079d2> {
    final /* synthetic */ C27950a $analytics;
    final /* synthetic */ C11289a<C11079d2> $displayErrorSnackbar;
    final /* synthetic */ C8578k2<C19754h0> $navController$delegate;
    final /* synthetic */ C11289a<C11079d2> $onBackPress;
    final /* synthetic */ C11289a<C11079d2> $onShowAllergoBoxInformationPressed;
    final /* synthetic */ C38326b $performance;
    final /* synthetic */ FacetViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetGraphKt$FacetGraph$1(FacetViewModel facetViewModel, C27950a aVar, C38326b bVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C8578k2<? extends C19754h0> k2Var, C11289a<C11079d2> aVar4) {
        super(1);
        this.$viewModel = facetViewModel;
        this.$analytics = aVar;
        this.$performance = bVar;
        this.$onBackPress = aVar2;
        this.$displayErrorSnackbar = aVar3;
        this.$navController$delegate = k2Var;
        this.$onShowAllergoBoxInformationPressed = aVar4;
    }

    /* renamed from: a */
    public final void mo81364a(@C12579k C19695c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "$this$NavHost");
        FacetViewModel facetViewModel = this.$viewModel;
        C27950a aVar = this.$analytics;
        C38326b bVar = this.$performance;
        C11289a<C11079d2> aVar2 = this.$onBackPress;
        final C8578k2<C19754h0> k2Var = this.$navController$delegate;
        C19695c0 c0Var2 = c0Var;
        FacetNavigationKt.m117430a(c0Var2, facetViewModel, aVar, bVar, aVar2, new C11300l<String, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C11079d2.f28267a;
            }

            public final void invoke(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "filterFieldSelected");
                FacetDetailsNavigationKt.m117427b(FacetGraphKt.m117313b(k2Var), str);
            }
        }, this.$displayErrorSnackbar);
        FacetViewModel facetViewModel2 = this.$viewModel;
        C27950a aVar3 = this.$analytics;
        C38326b bVar2 = this.$performance;
        final C8578k2<C19754h0> k2Var2 = this.$navController$delegate;
        C279452 r5 = new C11289a<C11079d2>() {
            public final void invoke() {
                FacetGraphKt.m117313b(k2Var2).mo58152q0();
            }
        };
        final C11289a<C11079d2> aVar4 = this.$onBackPress;
        C279463 r6 = new C11289a<C11079d2>() {
            public final void invoke() {
                aVar4.invoke();
            }
        };
        final C11289a<C11079d2> aVar5 = this.$onShowAllergoBoxInformationPressed;
        FacetDetailsNavigationKt.m117426a(c0Var2, facetViewModel2, aVar3, bVar2, r5, r6, new C11289a<C11079d2>() {
            public final void invoke() {
                aVar5.invoke();
            }
        }, this.$displayErrorSnackbar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81364a((C19695c0) obj);
        return C11079d2.f28267a;
    }
}
