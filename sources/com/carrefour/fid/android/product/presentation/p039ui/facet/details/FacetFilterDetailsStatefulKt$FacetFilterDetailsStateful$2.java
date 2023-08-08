package com.carrefour.fid.android.product.presentation.p039ui.facet.details;

import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.product.presentation.p039ui.facet.details.C27965a;
import com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$2 */
public final class FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$2 extends Lambda implements C11300l<C27965a, C11079d2> {
    final /* synthetic */ C8700z0<Boolean> $displayAllergenDialogConfirmation;
    final /* synthetic */ C11289a<C11079d2> $onBackClicked;
    final /* synthetic */ C11289a<C11079d2> $onSeeProductClicked;
    final /* synthetic */ C11289a<C11079d2> $onShowAllergenClicked;
    final /* synthetic */ C38326b $performance;
    final /* synthetic */ FacetViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetFilterDetailsStatefulKt$FacetFilterDetailsStateful$2(C11289a<C11079d2> aVar, FacetViewModel facetViewModel, C11289a<C11079d2> aVar2, C8700z0<Boolean> z0Var, C11289a<C11079d2> aVar3, C38326b bVar) {
        super(1);
        this.$onBackClicked = aVar;
        this.$viewModel = facetViewModel;
        this.$onSeeProductClicked = aVar2;
        this.$displayAllergenDialogConfirmation = z0Var;
        this.$onShowAllergenClicked = aVar3;
        this.$performance = bVar;
    }

    /* renamed from: a */
    public final void mo81400a(@C12579k C27965a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "action");
        if (Intrinsics.areEqual((Object) aVar, (Object) C27965a.C27966a.f67801a)) {
            this.$onBackClicked.invoke();
        } else if (aVar instanceof C27965a.C27967b) {
            this.$viewModel.mo81887q0(((C27965a.C27967b) aVar).mo81412d());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27965a.C27969d.f67807a)) {
            this.$onSeeProductClicked.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27965a.C27970e.f67809a)) {
            this.$displayAllergenDialogConfirmation.setValue(Boolean.FALSE);
            this.$onShowAllergenClicked.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27965a.C27968c.f67805a)) {
            this.$displayAllergenDialogConfirmation.setValue(Boolean.FALSE);
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27965a.C27971f.f67811a)) {
            this.$displayAllergenDialogConfirmation.setValue(Boolean.TRUE);
        } else if (aVar instanceof C27965a.C27972g.C27973a) {
            C38326b bVar = this.$performance;
            C27965a.C27972g.C27973a aVar2 = (C27965a.C27972g.C27973a) aVar;
            bVar.mo121195d(aVar2.mo81421f());
            bVar.mo121184f(aVar2.mo81419e());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27965a.C27972g.C27974b.f67816a)) {
            this.$performance.mo121196e();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81400a((C27965a) obj);
        return C11079d2.f28267a;
    }
}
