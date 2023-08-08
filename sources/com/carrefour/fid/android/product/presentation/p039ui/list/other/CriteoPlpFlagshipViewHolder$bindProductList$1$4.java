package com.carrefour.fid.android.product.presentation.p039ui.list.other;

import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.product.presentation.models.listable.C27686f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.CriteoPlpFlagshipViewHolder$bindProductList$1$4 */
public final class CriteoPlpFlagshipViewHolder$bindProductList$1$4 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C27686f.C27687a $baseCallbacks;
    final /* synthetic */ C38114b $it;
    final /* synthetic */ int $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoPlpFlagshipViewHolder$bindProductList$1$4(C27686f.C27687a aVar, C38114b bVar, int i) {
        super(0);
        this.$baseCallbacks = aVar;
        this.$it = bVar;
        this.$position = i;
    }

    public final void invoke() {
        this.$baseCallbacks.mo80450a(this.$it.mo118842j(), this.$position + 1);
    }
}
