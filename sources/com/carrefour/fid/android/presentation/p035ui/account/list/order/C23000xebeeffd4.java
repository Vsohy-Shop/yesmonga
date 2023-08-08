package com.carrefour.fid.android.presentation.p035ui.account.list.order;

import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$4 */
public final class C23000xebeeffd4 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ OfferModel $offer;
    final /* synthetic */ AccountListOrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23000xebeeffd4(AccountListOrderFragment accountListOrderFragment, OfferModel offerModel) {
        super(0);
        this.this$0 = accountListOrderFragment;
        this.$offer = offerModel;
    }

    public final void invoke() {
        this.this$0.mo67585i1((OfferProductModel) this.$offer);
    }
}
