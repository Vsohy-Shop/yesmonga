package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrdersResponse;", "", "oneOrderId", "", "(Ljava/lang/String;)V", "getOneOrderId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OrdersResponse {
    public static final int $stable = 0;
    @C33608c("one_order_id")
    @C12579k
    private final String oneOrderId;

    public OrdersResponse(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "oneOrderId");
        this.oneOrderId = str;
    }

    public static /* synthetic */ OrdersResponse copy$default(OrdersResponse ordersResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ordersResponse.oneOrderId;
        }
        return ordersResponse.copy(str);
    }

    @C12579k
    public final String component1() {
        return this.oneOrderId;
    }

    @C12579k
    public final OrdersResponse copy(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "oneOrderId");
        return new OrdersResponse(str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrdersResponse) && Intrinsics.areEqual((Object) this.oneOrderId, (Object) ((OrdersResponse) obj).oneOrderId);
    }

    @C12579k
    public final String getOneOrderId() {
        return this.oneOrderId;
    }

    public int hashCode() {
        return this.oneOrderId.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.oneOrderId;
        return "OrdersResponse(oneOrderId=" + str + ")";
    }
}
