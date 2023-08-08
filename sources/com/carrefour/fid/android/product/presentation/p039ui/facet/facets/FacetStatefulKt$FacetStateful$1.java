package com.carrefour.fid.android.product.presentation.p039ui.facet.facets;

import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import com.carrefour.fid.android.product.presentation.p039ui.facet.facets.C27998a;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.facets.FacetStatefulKt$FacetStateful$1 */
public final class FacetStatefulKt$FacetStateful$1 extends Lambda implements C11300l<C27998a, C11079d2> {
    final /* synthetic */ C27950a $analytics;
    final /* synthetic */ C11289a<C11079d2> $onBackPress;
    final /* synthetic */ C11300l<String, C11079d2> $onNavigateToFilters;
    final /* synthetic */ C38326b $performance;
    final /* synthetic */ FacetViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetStatefulKt$FacetStateful$1(C11289a<C11079d2> aVar, C11300l<? super String, C11079d2> lVar, C27950a aVar2, FacetViewModel facetViewModel, C38326b bVar) {
        super(1);
        this.$onBackPress = aVar;
        this.$onNavigateToFilters = lVar;
        this.$analytics = aVar2;
        this.$viewModel = facetViewModel;
        this.$performance = bVar;
    }

    /* renamed from: a */
    public final void mo81447a(@C12579k C27998a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "action");
        if (Intrinsics.areEqual((Object) aVar, (Object) C27998a.C27999a.f67837a)) {
            this.$onBackPress.invoke();
        } else if (aVar instanceof C27998a.C28000b) {
            this.$onNavigateToFilters.invoke(((C27998a.C28000b) aVar).mo81472d());
        } else if (aVar instanceof C27998a.C28003e) {
            C27998a.C28003e eVar = (C27998a.C28003e) aVar;
            this.$analytics.mo81377a(eVar.mo81478d().mo118611f());
            this.$viewModel.mo81888r0(eVar.mo81478d());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27998a.C28001c.f67841a)) {
            this.$viewModel.mo81886p0();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27998a.C28002d.f67843a)) {
            this.$onBackPress.invoke();
        } else if (aVar instanceof C27998a.C28004f.C28005a) {
            C38326b bVar = this.$performance;
            C27998a.C28004f.C28005a aVar2 = (C27998a.C28004f.C28005a) aVar;
            bVar.mo121195d(aVar2.mo81487f());
            bVar.mo121184f(aVar2.mo81485e());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27998a.C28004f.C28006b.f67850a)) {
            this.$performance.mo121196e();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81447a((C27998a) obj);
        return C11079d2.f28267a;
    }
}
