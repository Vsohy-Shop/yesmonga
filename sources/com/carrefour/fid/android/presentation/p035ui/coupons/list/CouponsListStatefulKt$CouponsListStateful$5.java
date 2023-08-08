package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import com.carrefour.fid.android.presentation.models.FilterResult;
import com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$5 */
public final class CouponsListStatefulKt$CouponsListStateful$5 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ FilterResult $filterResults;
    final /* synthetic */ CouponsListViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$CouponsListStateful$5(CouponsListViewModel couponsListViewModel, FilterResult filterResult) {
        super(0);
        this.$viewModel = couponsListViewModel;
        this.$filterResults = filterResult;
    }

    public final void invoke() {
        this.$viewModel.mo76266s0(this.$filterResults);
    }
}
