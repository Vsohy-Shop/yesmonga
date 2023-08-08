package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C11622t;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$8 */
public final class NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$8 extends Lambda implements C11300l<Float, C11079d2> {
    final /* synthetic */ C27899o $productData;
    final /* synthetic */ C8700z0<Float> $scrollToPosition$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$8(C27899o oVar, C8700z0<Float> z0Var) {
        super(1);
        this.$productData = oVar;
        this.$scrollToPosition$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo80860a(float f) {
        if (C11622t.isBlank(this.$productData.mo81091j().getDescription())) {
            NonFoodProductDetailsScreenKt.m116859i(this.$scrollToPosition$delegate, f);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo80860a(((Number) obj).floatValue());
        return C11079d2.f28267a;
    }
}
