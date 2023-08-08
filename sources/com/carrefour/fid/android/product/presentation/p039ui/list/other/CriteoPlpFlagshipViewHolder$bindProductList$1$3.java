package com.carrefour.fid.android.product.presentation.p039ui.list.other;

import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.product.presentation.models.listable.C27686f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/utils/a;", "debouncerState", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/design/components/utils/a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.CriteoPlpFlagshipViewHolder$bindProductList$1$3 */
public final class CriteoPlpFlagshipViewHolder$bindProductList$1$3 extends Lambda implements C11300l<C37133a, C11079d2> {
    final /* synthetic */ C27686f.C27687a $baseCallbacks;
    final /* synthetic */ C38114b $it;
    final /* synthetic */ int $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoPlpFlagshipViewHolder$bindProductList$1$3(C27686f.C27687a aVar, C38114b bVar, int i) {
        super(1);
        this.$baseCallbacks = aVar;
        this.$it = bVar;
        this.$position = i;
    }

    /* renamed from: a */
    public final void mo81635a(@C12579k C37133a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "debouncerState");
        this.$baseCallbacks.mo80452c(aVar, this.$it.mo118842j(), this.$it.mo118846n(), this.$position + 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81635a((C37133a) obj);
        return C11079d2.f28267a;
    }
}
