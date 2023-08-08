package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.component;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.C23454a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasketKt$PictoRow$2 */
public final class ItemBasketKt$PictoRow$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C23454a $config;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ int $productCount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemBasketKt$PictoRow$2(boolean z, C23454a aVar, int i, int i2) {
        super(2);
        this.$isLoading = z;
        this.$config = aVar;
        this.$productCount = i;
        this.$$changed = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ItemBasketKt.m104563d(this.$isLoading, this.$config, this.$productCount, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
