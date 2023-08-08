package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.os.Bundle;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.mvi.C26024a;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.AlternativeProductsBottomSheetFragment;
import com.carrefour.fid.android.product.presentation.p039ui.bottomsheet.C27736c;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$handleOfferListResult$2$6 */
public final class CheckoutStep1Fragment$handleOfferListResult$2$6 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ OfferModel $offer;
    final /* synthetic */ CheckoutStep1Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep1Fragment$handleOfferListResult$2$6(OfferModel offerModel, CheckoutStep1Fragment checkoutStep1Fragment) {
        super(0);
        this.$offer = offerModel;
        this.this$0 = checkoutStep1Fragment;
    }

    public final void invoke() {
        String str;
        AlternativeProductsBottomSheetFragment.C27691a aVar = AlternativeProductsBottomSheetFragment.f67217v;
        OfferIdentifierDomain W = ((OfferProductModel) this.$offer).mo121502W();
        if (W == null || (str = W.mo115986f()) == null) {
            str = "";
        }
        AlternativeProductsBottomSheetFragment a = aVar.mo80464a(Gtin.m157308b(str));
        final CheckoutStep1Fragment checkoutStep1Fragment = this.this$0;
        FragmentKt.m118834v(checkoutStep1Fragment, C27736c.f67260a, new C11300l<Bundle, C11079d2>() {
            /* renamed from: a */
            public final void mo68208a(@C12579k Bundle bundle) {
                Intrinsics.checkNotNullParameter(bundle, "it");
                checkoutStep1Fragment.mo68155c1().sendIntent(C26024a.C26054e.C26073s.f63705a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo68208a((Bundle) obj);
                return C11079d2.f28267a;
            }
        });
        a.show(this.this$0.requireActivity().mo57175g0(), (String) null);
    }
}
