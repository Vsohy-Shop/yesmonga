package com.carrefour.fid.android.presentation.p035ui.home.carousels.adapter;

import com.carrefour.fid.android.cms.presentation.models.SlideOfferCellModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.carousels.adapter.HomeCmsOfferViewHolder$bind$2 */
public final class HomeCmsOfferViewHolder$bind$2 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ SlideOfferCellModel $item;
    final /* synthetic */ C11300l<SlideOfferCellModel, C11079d2> $itemClickListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeCmsOfferViewHolder$bind$2(C11300l<? super SlideOfferCellModel, C11079d2> lVar, SlideOfferCellModel slideOfferCellModel) {
        super(0);
        this.$itemClickListener = lVar;
        this.$item = slideOfferCellModel;
    }

    public final void invoke() {
        this.$itemClickListener.invoke(this.$item);
    }
}
