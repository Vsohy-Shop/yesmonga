package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import com.carrefour.fid.android.product.presentation.models.C27647a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodBasketComponentKt$NonFoodBasketComponent$2$1$1 */
public final class NonFoodBasketComponentKt$NonFoodBasketComponent$2$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C27647a $basketButtonType;
    final /* synthetic */ C11300l<C27647a, C11079d2> $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodBasketComponentKt$NonFoodBasketComponent$2$1$1(C11300l<? super C27647a, C11079d2> lVar, C27647a aVar) {
        super(0);
        this.$onClick = lVar;
        this.$basketButtonType = aVar;
    }

    public final void invoke() {
        this.$onClick.invoke(this.$basketButtonType);
    }
}
