package com.carrefour.fid.android.domain.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrdersOfflineResultDomain;", "", "orders", "", "Lcom/carrefour/fid/android/domain/models/OrdersOfflineDomain;", "pagingData", "Lcom/carrefour/fid/android/domain/models/OrdersPagingDomain;", "(Ljava/util/List;Lcom/carrefour/fid/android/domain/models/OrdersPagingDomain;)V", "getOrders", "()Ljava/util/List;", "getPagingData", "()Lcom/carrefour/fid/android/domain/models/OrdersPagingDomain;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OrdersOfflineResultDomain {
    public static final int $stable = 8;
    @C12579k
    private final List<OrdersOfflineDomain> orders;
    @C12580l
    private final OrdersPagingDomain pagingData;

    public OrdersOfflineResultDomain(@C12579k List<OrdersOfflineDomain> list, @C12580l OrdersPagingDomain ordersPagingDomain) {
        Intrinsics.checkNotNullParameter(list, "orders");
        this.orders = list;
        this.pagingData = ordersPagingDomain;
    }

    public static /* synthetic */ OrdersOfflineResultDomain copy$default(OrdersOfflineResultDomain ordersOfflineResultDomain, List<OrdersOfflineDomain> list, OrdersPagingDomain ordersPagingDomain, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ordersOfflineResultDomain.orders;
        }
        if ((i & 2) != 0) {
            ordersPagingDomain = ordersOfflineResultDomain.pagingData;
        }
        return ordersOfflineResultDomain.copy(list, ordersPagingDomain);
    }

    @C12579k
    public final List<OrdersOfflineDomain> component1() {
        return this.orders;
    }

    @C12580l
    public final OrdersPagingDomain component2() {
        return this.pagingData;
    }

    @C12579k
    public final OrdersOfflineResultDomain copy(@C12579k List<OrdersOfflineDomain> list, @C12580l OrdersPagingDomain ordersPagingDomain) {
        Intrinsics.checkNotNullParameter(list, "orders");
        return new OrdersOfflineResultDomain(list, ordersPagingDomain);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOfflineResultDomain)) {
            return false;
        }
        OrdersOfflineResultDomain ordersOfflineResultDomain = (OrdersOfflineResultDomain) obj;
        return Intrinsics.areEqual((Object) this.orders, (Object) ordersOfflineResultDomain.orders) && Intrinsics.areEqual((Object) this.pagingData, (Object) ordersOfflineResultDomain.pagingData);
    }

    @C12579k
    public final List<OrdersOfflineDomain> getOrders() {
        return this.orders;
    }

    @C12580l
    public final OrdersPagingDomain getPagingData() {
        return this.pagingData;
    }

    public int hashCode() {
        int hashCode = this.orders.hashCode() * 31;
        OrdersPagingDomain ordersPagingDomain = this.pagingData;
        return hashCode + (ordersPagingDomain == null ? 0 : ordersPagingDomain.hashCode());
    }

    @C12579k
    public String toString() {
        List<OrdersOfflineDomain> list = this.orders;
        OrdersPagingDomain ordersPagingDomain = this.pagingData;
        return "OrdersOfflineResultDomain(orders=" + list + ", pagingData=" + ordersPagingDomain + ")";
    }
}
