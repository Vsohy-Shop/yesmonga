package com.carrefour.fid.android.domain.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.usabilla.sdk.ubform.eventengine.decorators.PercentageDecorator;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrdersOfflineDetailsVATDomain;", "", "percentage", "", "amount", "", "amountWithTax", "(Ljava/lang/String;DLjava/lang/Double;)V", "getAmount", "()D", "getAmountWithTax", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPercentage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;DLjava/lang/Double;)Lcom/carrefour/fid/android/domain/models/OrdersOfflineDetailsVATDomain;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OrdersOfflineDetailsVATDomain {
    public static final int $stable = 0;
    private final double amount;
    @C12580l
    private final Double amountWithTax;
    @C12579k
    private final String percentage;

    public OrdersOfflineDetailsVATDomain(@C12579k String str, double d, @C12580l Double d2) {
        Intrinsics.checkNotNullParameter(str, PercentageDecorator.f26902e);
        this.percentage = str;
        this.amount = d;
        this.amountWithTax = d2;
    }

    public static /* synthetic */ OrdersOfflineDetailsVATDomain copy$default(OrdersOfflineDetailsVATDomain ordersOfflineDetailsVATDomain, String str, double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ordersOfflineDetailsVATDomain.percentage;
        }
        if ((i & 2) != 0) {
            d = ordersOfflineDetailsVATDomain.amount;
        }
        if ((i & 4) != 0) {
            d2 = ordersOfflineDetailsVATDomain.amountWithTax;
        }
        return ordersOfflineDetailsVATDomain.copy(str, d, d2);
    }

    @C12579k
    public final String component1() {
        return this.percentage;
    }

    public final double component2() {
        return this.amount;
    }

    @C12580l
    public final Double component3() {
        return this.amountWithTax;
    }

    @C12579k
    public final OrdersOfflineDetailsVATDomain copy(@C12579k String str, double d, @C12580l Double d2) {
        Intrinsics.checkNotNullParameter(str, PercentageDecorator.f26902e);
        return new OrdersOfflineDetailsVATDomain(str, d, d2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOfflineDetailsVATDomain)) {
            return false;
        }
        OrdersOfflineDetailsVATDomain ordersOfflineDetailsVATDomain = (OrdersOfflineDetailsVATDomain) obj;
        return Intrinsics.areEqual((Object) this.percentage, (Object) ordersOfflineDetailsVATDomain.percentage) && Double.compare(this.amount, ordersOfflineDetailsVATDomain.amount) == 0 && Intrinsics.areEqual((Object) this.amountWithTax, (Object) ordersOfflineDetailsVATDomain.amountWithTax);
    }

    public final double getAmount() {
        return this.amount;
    }

    @C12580l
    public final Double getAmountWithTax() {
        return this.amountWithTax;
    }

    @C12579k
    public final String getPercentage() {
        return this.percentage;
    }

    public int hashCode() {
        int hashCode = ((this.percentage.hashCode() * 31) + Double.hashCode(this.amount)) * 31;
        Double d = this.amountWithTax;
        return hashCode + (d == null ? 0 : d.hashCode());
    }

    @C12579k
    public String toString() {
        String str = this.percentage;
        double d = this.amount;
        Double d2 = this.amountWithTax;
        return "OrdersOfflineDetailsVATDomain(percentage=" + str + ", amount=" + d + ", amountWithTax=" + d2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrdersOfflineDetailsVATDomain(String str, double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0.0d : d, d2);
    }
}
