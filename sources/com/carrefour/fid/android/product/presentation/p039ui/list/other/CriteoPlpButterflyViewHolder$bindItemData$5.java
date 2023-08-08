package com.carrefour.fid.android.product.presentation.p039ui.list.other;

import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.product.presentation.models.listable.C27686f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.CriteoPlpButterflyViewHolder$bindItemData$5 */
public final class CriteoPlpButterflyViewHolder$bindItemData$5 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C38114b $itemData;
    final /* synthetic */ C27686f.C27688b $mixingCallbacks;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoPlpButterflyViewHolder$bindItemData$5(C27686f.C27688b bVar, C38114b bVar2) {
        super(0);
        this.$mixingCallbacks = bVar;
        this.$itemData = bVar2;
    }

    public final void invoke() {
        C27686f.C27688b bVar = this.$mixingCallbacks;
        if (bVar != null) {
            bVar.mo80454d(this.$itemData.mo118842j());
        }
    }
}
