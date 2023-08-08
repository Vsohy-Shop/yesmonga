package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.C27052b;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.viewmodel.OrderOnlineViewModel;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OrderOnlineScreenKt$OrderOnlineStateful$8 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C27052b $analytics;
    final /* synthetic */ C11305q<String, OrderType, Boolean, C11079d2> $onDisplayOrder;
    final /* synthetic */ C11289a<C11079d2> $onDisplaySnackBar;
    final /* synthetic */ C11300l<String, C11079d2> $onNavigateToAccountListFragment;
    final /* synthetic */ C11300l<String, C11079d2> $onNavigateToAdditionalOrder;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToDepartment;
    final /* synthetic */ C11300l<String, C11079d2> $onNavigateToOrdersSuccessHandleFragment;
    final /* synthetic */ C11305q<String, OrderType, String, C11079d2> $onNavigateToServiceSlot;
    final /* synthetic */ C11300l<String, C11079d2> $onNavigateToWithdrawalOrderDriveFragment;
    final /* synthetic */ OrderOnlineViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineScreenKt$OrderOnlineStateful$8(OrderOnlineViewModel orderOnlineViewModel, C27052b bVar, C11305q<? super String, ? super OrderType, ? super Boolean, C11079d2> qVar, C11300l<? super String, C11079d2> lVar, C11305q<? super String, ? super OrderType, ? super String, C11079d2> qVar2, C11300l<? super String, C11079d2> lVar2, C11300l<? super String, C11079d2> lVar3, C11300l<? super String, C11079d2> lVar4, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, int i) {
        super(2);
        this.$viewModel = orderOnlineViewModel;
        this.$analytics = bVar;
        this.$onDisplayOrder = qVar;
        this.$onNavigateToAccountListFragment = lVar;
        this.$onNavigateToServiceSlot = qVar2;
        this.$onNavigateToOrdersSuccessHandleFragment = lVar2;
        this.$onNavigateToAdditionalOrder = lVar3;
        this.$onNavigateToWithdrawalOrderDriveFragment = lVar4;
        this.$onNavigateToDepartment = aVar;
        this.$onDisplaySnackBar = aVar2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        OrderOnlineScreenKt.m114523l(this.$viewModel, this.$analytics, this.$onDisplayOrder, this.$onNavigateToAccountListFragment, this.$onNavigateToServiceSlot, this.$onNavigateToOrdersSuccessHandleFragment, this.$onNavigateToAdditionalOrder, this.$onNavigateToWithdrawalOrderDriveFragment, this.$onNavigateToDepartment, this.$onDisplaySnackBar, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
