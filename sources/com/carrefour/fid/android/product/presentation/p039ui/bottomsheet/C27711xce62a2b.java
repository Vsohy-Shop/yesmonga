package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.product.presentation.analytics.C27631a;
import com.carrefour.fid.android.product.presentation.viewmodel.bottomsheet.AlternativeProductsBottomSheetViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.AlternativeProductsBottomSheetStatefulKt$AlternativeProductsBottomSheetStateful$4 */
public final class C27711xce62a2b extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C27631a $analytics;
    final /* synthetic */ String $initialProductGtin;
    final /* synthetic */ C11306r<Gtin, Integer, Integer, C38115c, C11079d2> $onQuantityPress;
    final /* synthetic */ C11289a<C11079d2> $onResumeShoppingPress;
    final /* synthetic */ C11300l<Throwable, C11079d2> $onUpdateError;
    final /* synthetic */ AlternativeProductsBottomSheetViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27711xce62a2b(AlternativeProductsBottomSheetViewModel alternativeProductsBottomSheetViewModel, C27631a aVar, String str, C11306r<? super Gtin, ? super Integer, ? super Integer, ? super C38115c, C11079d2> rVar, C11289a<C11079d2> aVar2, C11300l<? super Throwable, C11079d2> lVar, int i, int i2) {
        super(2);
        this.$viewModel = alternativeProductsBottomSheetViewModel;
        this.$analytics = aVar;
        this.$initialProductGtin = str;
        this.$onQuantityPress = rVar;
        this.$onResumeShoppingPress = aVar2;
        this.$onUpdateError = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AlternativeProductsBottomSheetStatefulKt.m116501d(this.$viewModel, this.$analytics, this.$initialProductGtin, this.$onQuantityPress, this.$onResumeShoppingPress, this.$onUpdateError, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
