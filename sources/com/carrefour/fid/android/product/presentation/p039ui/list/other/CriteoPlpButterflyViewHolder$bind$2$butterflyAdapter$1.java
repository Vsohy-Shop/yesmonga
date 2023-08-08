package com.carrefour.fid.android.product.presentation.p039ui.list.other;

import com.carrefour.fid.android.domain.models.criteo.C38003e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "a", "(I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.other.CriteoPlpButterflyViewHolder$bind$2$butterflyAdapter$1 */
public final class CriteoPlpButterflyViewHolder$bind$2$butterflyAdapter$1 extends Lambda implements C11300l<Integer, C11079d2> {
    final /* synthetic */ C38003e $butterfly;
    final /* synthetic */ CriteoPlpButterflyViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoPlpButterflyViewHolder$bind$2$butterflyAdapter$1(CriteoPlpButterflyViewHolder criteoPlpButterflyViewHolder, C38003e eVar) {
        super(1);
        this.this$0 = criteoPlpButterflyViewHolder;
        this.$butterfly = eVar;
    }

    /* renamed from: a */
    public final void mo81625a(int i) {
        this.this$0.f67978d.invoke(this.$butterfly, Integer.valueOf(i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81625a(((Number) obj).intValue());
        return C11079d2.f28267a;
    }
}
