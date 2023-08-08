package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import com.carrefour.fid.android.product.presentation.models.C27647a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$4 */
public final class NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$4 extends Lambda implements C11300l<C27647a, C11079d2> {
    final /* synthetic */ C11300l<C27870j, C11079d2> $actioner;
    final /* synthetic */ C27854a $basketData;
    final /* synthetic */ C27899o $productData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$4(C11300l<? super C27870j, C11079d2> lVar, C27899o oVar, C27854a aVar) {
        super(1);
        this.$actioner = lVar;
        this.$productData = oVar;
        this.$basketData = aVar;
    }

    /* renamed from: a */
    public final void mo80858a(@C12579k C27647a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        NonFoodProductDetailsScreenKt.m116850M(aVar, this.$actioner, this.$productData.mo81088h(), this.$productData.mo81091j(), this.$basketData.mo80927g(), this.$productData.mo81090i());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo80858a((C27647a) obj);
        return C11079d2.f28267a;
    }
}
