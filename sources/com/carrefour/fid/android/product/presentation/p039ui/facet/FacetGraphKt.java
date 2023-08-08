package com.carrefour.fid.android.product.presentation.p039ui.facet;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.hilt.navigation.compose.C19298a;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.viewmodel.compose.C19490c;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.C19754h0;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import com.carrefour.fid.android.product.presentation.p039ui.facet.navigation.FacetNavigationKt;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFacetGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetGraph.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/FacetGraphKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,53:1\n43#2,6:54\n45#3,3:60\n76#4:63\n*S KotlinDebug\n*F\n+ 1 FacetGraph.kt\ncom/carrefour/fid/android/product/presentation/ui/facet/FacetGraphKt\n*L\n19#1:54,6\n19#1:60,3\n27#1:63\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.FacetGraphKt */
public final class FacetGraphKt {
    @C8540g
    /* renamed from: a */
    public static final void m117312a(@C12580l FacetViewModel facetViewModel, @C12579k C27950a aVar, @C12579k C38326b bVar, @C12579k C11289a<C11079d2> aVar2, @C12579k C11289a<C11079d2> aVar3, @C12579k C11289a<C11079d2> aVar4, @C12580l C8592o oVar, int i, int i2) {
        FacetViewModel facetViewModel2;
        Intrinsics.checkNotNullParameter(aVar, "analytics");
        Intrinsics.checkNotNullParameter(bVar, "performance");
        Intrinsics.checkNotNullParameter(aVar2, "onBackPress");
        Intrinsics.checkNotNullParameter(aVar3, "onShowAllergoBoxInformationPressed");
        Intrinsics.checkNotNullParameter(aVar4, "displayErrorSnackbar");
        C8592o o = oVar.mo15009o(-1478269410);
        if ((i2 & 1) != 0) {
            o.mo14918M(-550968255);
            C19395b1 a = LocalViewModelStoreOwner.f49869a.mo57681a(o, 8);
            if (a != null) {
                C19502x0.C19506b a2 = C19298a.m90444a(a, o, 8);
                o.mo14918M(564614654);
                C19476v0 f = C19490c.m90838f(FacetViewModel.class, a, (String) null, a2, o, 4168, 0);
                o.mo15002m0();
                o.mo15002m0();
                facetViewModel2 = (FacetViewModel) f;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            facetViewModel2 = facetViewModel;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1478269410, i, -1, "com.carrefour.fid.android.product.presentation.ui.facet.FacetGraph (FacetGraph.kt:17)");
        } else {
            int i3 = i;
        }
        C8578k2 t = C8415c2.m30251t(NavHostControllerKt.m91709e(new Navigator[0], o, 8), o, 8);
        NavHostKt.m91714b(m117313b(t), FacetNavigationKt.f67861a, (C8767m) null, (String) null, new FacetGraphKt$FacetGraph$1(facetViewModel2, aVar, bVar, aVar2, aVar4, t, aVar3), o, 56, 12);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new FacetGraphKt$FacetGraph$2(facetViewModel2, aVar, bVar, aVar2, aVar3, aVar4, i, i2));
        }
    }

    /* renamed from: b */
    public static final C19754h0 m117313b(C8578k2<? extends C19754h0> k2Var) {
        return (C19754h0) k2Var.getValue();
    }
}
