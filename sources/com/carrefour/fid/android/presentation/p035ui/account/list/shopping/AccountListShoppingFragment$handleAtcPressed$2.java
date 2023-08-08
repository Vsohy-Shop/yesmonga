package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import android.content.Context;
import android.os.Bundle;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.AccountListShoppingViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25882a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/os/Bundle;", "it", "Lkotlin/d2;", "a", "(Landroid/os/Bundle;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment$handleAtcPressed$2 */
public final class AccountListShoppingFragment$handleAtcPressed$2 extends Lambda implements C11300l<Bundle, C11079d2> {
    final /* synthetic */ int $initialQuantity;
    final /* synthetic */ OfferProductModel $offer;
    final /* synthetic */ int $productPosition;
    final /* synthetic */ AccountListShoppingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountListShoppingFragment$handleAtcPressed$2(AccountListShoppingFragment accountListShoppingFragment, OfferProductModel offerProductModel, int i, int i2) {
        super(1);
        this.this$0 = accountListShoppingFragment;
        this.$offer = offerProductModel;
        this.$initialQuantity = i;
        this.$productPosition = i2;
    }

    /* renamed from: a */
    public final void mo67655a(@C12579k Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(bundle, "it");
        this.this$0.mo67629c1().sendIntent(AccountListShoppingViewModel.C25874c.C25877c.f63340b);
        int p0 = this.$offer.mo121519p0();
        int i = this.$initialQuantity;
        if (p0 > i) {
            C25882a a1 = this.this$0.mo67627a1();
            OfferProductModel offerProductModel = this.$offer;
            AccountListShoppingFragment accountListShoppingFragment = this.this$0;
            int i2 = this.$initialQuantity;
            int i3 = p0 - i2;
            a1.mo75153j(offerProductModel, accountListShoppingFragment.mo67628b1(), i3, this.$productPosition);
            Context requireContext = accountListShoppingFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            ProductModel o0 = offerProductModel.mo121517o0();
            if (o0 != null) {
                str = o0.mo121889s();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            a1.mo75165v(requireContext, str, i3);
        } else if (p0 < i) {
            this.this$0.mo67627a1().mo75155l(this.$offer, this.this$0.mo67628b1(), this.$initialQuantity - p0, this.$productPosition);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo67655a((Bundle) obj);
        return C11079d2.f28267a;
    }
}
