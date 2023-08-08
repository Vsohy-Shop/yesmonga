package com.carrefour.fid.android.presentation.p035ui.account.list.order;

import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/utils/a;", "it", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/design/components/utils/a;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$3 */
public final class C22999xebeeffd3 extends Lambda implements C11300l<C37133a, C11079d2> {
    final /* synthetic */ List<OfferProductModel> $displayedOffers;
    final /* synthetic */ OfferModel $offer;
    final /* synthetic */ AccountListOrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22999xebeeffd3(AccountListOrderFragment accountListOrderFragment, OfferModel offerModel, List<? extends OfferProductModel> list) {
        super(1);
        this.this$0 = accountListOrderFragment;
        this.$offer = offerModel;
        this.$displayedOffers = list;
    }

    /* renamed from: a */
    public final void mo67616a(@C12579k C37133a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        AccountListOrderFragment accountListOrderFragment = this.this$0;
        OfferModel offerModel = this.$offer;
        accountListOrderFragment.mo67576Y((OfferProductModel) offerModel, this.$displayedOffers.indexOf(offerModel) + 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo67616a((C37133a) obj);
        return C11079d2.f28267a;
    }
}
