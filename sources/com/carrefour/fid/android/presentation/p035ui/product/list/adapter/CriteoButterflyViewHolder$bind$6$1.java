package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import com.carrefour.fid.android.presentation.models.CriteoProductModel;
import com.carrefour.fid.android.presentation.p035ui.models.C24646a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.CriteoButterflyViewHolder$bind$6$1 */
public final class CriteoButterflyViewHolder$bind$6$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C24646a.C24648b $it;
    final /* synthetic */ CriteoProductModel $product;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoButterflyViewHolder$bind$6$1(C24646a.C24648b bVar, CriteoProductModel criteoProductModel) {
        super(0);
        this.$it = bVar;
        this.$product = criteoProductModel;
    }

    public final void invoke() {
        this.$it.mo72033r(this.$product);
    }
}
