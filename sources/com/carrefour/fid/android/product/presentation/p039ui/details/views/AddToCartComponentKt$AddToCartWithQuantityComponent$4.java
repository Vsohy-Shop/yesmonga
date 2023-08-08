package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.AddToCartComponentKt$AddToCartWithQuantityComponent$4 */
public final class AddToCartComponentKt$AddToCartWithQuantityComponent$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ int $quantity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToCartComponentKt$AddToCartWithQuantityComponent$4(C8767m mVar, boolean z, int i, C11289a<C11079d2> aVar, int i2, int i3) {
        super(2);
        this.$modifier = mVar;
        this.$isLoading = z;
        this.$quantity = i;
        this.$onClick = aVar;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AddToCartComponentKt.m117105a(this.$modifier, this.$isLoading, this.$quantity, this.$onClick, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
