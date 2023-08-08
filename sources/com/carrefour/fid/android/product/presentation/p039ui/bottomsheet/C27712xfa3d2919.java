package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.C27728a;
import com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$actioner$1 */
public final class C27712xfa3d2919 extends Lambda implements C11300l<C27728a, C11079d2> {
    final /* synthetic */ String $initialProductGtin;
    final /* synthetic */ C11306r<Gtin, Integer, Integer, C38115c, C11079d2> $onQuantityPress;
    final /* synthetic */ C11289a<C11079d2> $onResumeShoppingPress;
    final /* synthetic */ C11300l<Throwable, C11079d2> $onUpdateError;
    final /* synthetic */ AlternativeProductsBottomSheetViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27712xfa3d2919(AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel, C11306r<? super Gtin, ? super Integer, ? super Integer, ? super C38115c, C11079d2> rVar, C11289a<C11079d2> aVar, String str, C11300l<? super Throwable, C11079d2> lVar) {
        super(1);
        this.$viewModel = alternativeProductsBottomSheetViewModel;
        this.$onQuantityPress = rVar;
        this.$onResumeShoppingPress = aVar;
        this.$initialProductGtin = str;
        this.$onUpdateError = lVar;
    }

    /* renamed from: a */
    public final void mo80476a(@C12579k C27728a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        if (aVar instanceof C27728a.C27729a) {
            this.$viewModel.mo81690o0(((C27728a.C27729a) aVar).mo80506d());
        } else if (aVar instanceof C27728a.C27731c) {
            C27728a.C27731c cVar = (C27728a.C27731c) aVar;
            this.$onQuantityPress.invoke(Gtin.m157307a(cVar.mo80525h()), Integer.valueOf(cVar.mo80524g()), Integer.valueOf(cVar.mo80528j()), cVar.mo80527i());
        } else if (aVar instanceof C27728a.C27730b) {
            C27728a.C27730b bVar = (C27728a.C27730b) aVar;
            this.$viewModel.mo81691p0(bVar.mo80513e(), bVar.mo80515f());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27728a.C27732d.f67254a)) {
            this.$onResumeShoppingPress.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C27728a.C27733e.f67256a)) {
            this.$viewModel.mo81685j0(this.$initialProductGtin);
        } else if (aVar instanceof C27728a.C27734f) {
            this.$onUpdateError.invoke(((C27728a.C27734f) aVar).mo80532d());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo80476a((C27728a) obj);
        return C11079d2.f28267a;
    }
}
