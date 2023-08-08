package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.analytics.C23456a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.basketslist.CheckoutBasketsListViewModel;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$4 */
public final class CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$4 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C23456a $analytics;
    final /* synthetic */ CheckoutBasketsListViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutBasketsListStatefulKt$CheckoutBasketsListStateful$4(C23456a aVar, CheckoutBasketsListViewModel checkoutBasketsListViewModel) {
        super(0);
        this.$analytics = aVar;
        this.$viewModel = checkoutBasketsListViewModel;
    }

    @C12579k
    public final Boolean invoke() {
        this.$analytics.mo68702b(this.$viewModel.mo75923f0());
        return Boolean.TRUE;
    }
}
