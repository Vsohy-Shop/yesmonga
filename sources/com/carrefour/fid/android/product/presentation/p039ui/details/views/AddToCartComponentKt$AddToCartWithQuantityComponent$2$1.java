package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.AddToCartComponentKt$AddToCartWithQuantityComponent$2$1 */
public final class AddToCartComponentKt$AddToCartWithQuantityComponent$2$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ C11289a<C11079d2> $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToCartComponentKt$AddToCartWithQuantityComponent$2$1(boolean z, C11289a<C11079d2> aVar) {
        super(0);
        this.$isLoading = z;
        this.$onClick = aVar;
    }

    public final void invoke() {
        if (!this.$isLoading) {
            this.$onClick.invoke();
        }
    }
}
