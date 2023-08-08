package com.carrefour.fid.android.presentation.p035ui.product.list.adapter;

import com.carrefour.fid.android.presentation.models.CriteoProductModel;
import com.carrefour.fid.android.presentation.p035ui.models.C24646a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.list.adapter.CriteoFlagshipViewHolder$bindProductList$1$6 */
public final class CriteoFlagshipViewHolder$bindProductList$1$6 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ CriteoProductModel $criteoProduct;
    final /* synthetic */ C24646a.C24648b $mixingCallbacks;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoFlagshipViewHolder$bindProductList$1$6(C24646a.C24648b bVar, CriteoProductModel criteoProductModel) {
        super(0);
        this.$mixingCallbacks = bVar;
        this.$criteoProduct = criteoProductModel;
    }

    public final void invoke() {
        C24646a.C24648b bVar = this.$mixingCallbacks;
        if (bVar != null) {
            bVar.mo72032V(this.$criteoProduct);
        }
    }
}
