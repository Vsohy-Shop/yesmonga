package com.carrefour.fid.android.domain.interactors.order;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.product.C37764l;
import com.carrefour.fid.android.presentation.p035ui.orders.online.mapper.C25222e;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class OrderGetCustomerStatusUseCase implements C37764l {

    /* renamed from: c */
    public static final int f94696c = 8;
    @C12579k

    /* renamed from: a */
    public final GetOrderOnlineListUseCase f94697a;
    @C12579k

    /* renamed from: b */
    public final C25222e f94698b;

    @Inject
    public OrderGetCustomerStatusUseCase(@C12579k GetOrderOnlineListUseCase getOrderOnlineListUseCase, @C12579k C25222e eVar) {
        Intrinsics.checkNotNullParameter(getOrderOnlineListUseCase, "getOrderOnlineListUseCase");
        Intrinsics.checkNotNullParameter(eVar, "ordersOnlineModelDataMapper");
        this.f94697a = getOrderOnlineListUseCase;
        this.f94698b = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172983invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends com.carrefour.fid.android.domain.models.order.CustomerStatus>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.order.OrderGetCustomerStatusUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.order.OrderGetCustomerStatusUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.order.OrderGetCustomerStatusUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.order.OrderGetCustomerStatusUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.order.OrderGetCustomerStatusUseCase$invoke$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.order.OrderGetCustomerStatusUseCase r0 = (com.carrefour.fid.android.domain.interactors.order.OrderGetCustomerStatusUseCase) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0053
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003b:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase r7 = r6.f94697a
            com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.order.GetOrderOnlineListUseCase$a
            r4 = 3
            r5 = 0
            r2.<init>(r5, r5, r4, r5)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.m172981invokegIAlus(r2, r0)
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r0 = r6
        L_0x0053:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r7)
            if (r1 != 0) goto L_0x0084
            com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain r7 = (com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain) r7
            com.carrefour.fid.android.presentation.ui.orders.online.mapper.e r0 = r0.f94698b
            java.util.List r7 = r7.getOrders()
            java.util.List r7 = com.carrefour.fid.android.domain.extension.C37511l.m153984b(r7)
            java.util.List r7 = r0.mo83406b(r7)
            if (r7 == 0) goto L_0x0070
            int r7 = r7.size()
            goto L_0x0071
        L_0x0070:
            r7 = 0
        L_0x0071:
            if (r7 == 0) goto L_0x007b
            if (r7 == r3) goto L_0x0078
            com.carrefour.fid.android.domain.models.order.CustomerStatus r7 = com.carrefour.fid.android.domain.models.order.CustomerStatus.NO_NEW_CUSTOMER_WITH_TWO_ORDERS_OR_MORE
            goto L_0x007d
        L_0x0078:
            com.carrefour.fid.android.domain.models.order.CustomerStatus r7 = com.carrefour.fid.android.domain.models.order.CustomerStatus.NO_NEW_CUSTOMER
            goto L_0x007d
        L_0x007b:
            com.carrefour.fid.android.domain.models.order.CustomerStatus r7 = com.carrefour.fid.android.domain.models.order.CustomerStatus.NEW_CUSTOMER
        L_0x007d:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x008e
        L_0x0084:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x008e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.order.OrderGetCustomerStatusUseCase.m172983invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
