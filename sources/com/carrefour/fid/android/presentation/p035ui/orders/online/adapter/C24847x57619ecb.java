package com.carrefour.fid.android.presentation.p035ui.orders.online.adapter;

import com.carrefour.fid.android.presentation.p035ui.orders.online.adapter.C24881i;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25230a;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.adapter.AdditionalOrderDetailsAdditionalOrderProductListViewHolder$bind$1$3 */
public final class C24847x57619ecb extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C25230a.C25231a $additionalOrderProductModel;
    final /* synthetic */ C24881i.C24882a $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24847x57619ecb(C24881i.C24882a aVar, C25230a.C25231a aVar2) {
        super(0);
        this.$callback = aVar;
        this.$additionalOrderProductModel = aVar2;
    }

    public final void invoke() {
        C24881i.C24882a aVar = this.$callback;
        if (aVar != null) {
            aVar.mo72530b(this.$additionalOrderProductModel.mo73511l(), OrdersOnlineDetailType.ADDITIONAL_ORDER);
        }
    }
}
