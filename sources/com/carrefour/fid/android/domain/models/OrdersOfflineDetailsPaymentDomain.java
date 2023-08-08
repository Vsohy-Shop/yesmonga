package com.carrefour.fid.android.domain.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrdersOfflineDetailsPaymentDomain;", "", "paymentCode", "", "paymentName", "paymentAmountScale", "", "paymentAmount", "", "(Ljava/lang/String;Ljava/lang/String;ID)V", "getPaymentAmount", "()D", "setPaymentAmount", "(D)V", "getPaymentAmountScale", "()I", "getPaymentCode", "()Ljava/lang/String;", "getPaymentName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OrdersOfflineDetailsPaymentDomain {
    public static final int $stable = 8;
    private double paymentAmount;
    private final int paymentAmountScale;
    @C12579k
    private final String paymentCode;
    @C12579k
    private final String paymentName;

    public OrdersOfflineDetailsPaymentDomain(@C12579k String str, @C12579k String str2, int i, double d) {
        Intrinsics.checkNotNullParameter(str, "paymentCode");
        Intrinsics.checkNotNullParameter(str2, "paymentName");
        this.paymentCode = str;
        this.paymentName = str2;
        this.paymentAmountScale = i;
        this.paymentAmount = d;
    }

    public static /* synthetic */ OrdersOfflineDetailsPaymentDomain copy$default(OrdersOfflineDetailsPaymentDomain ordersOfflineDetailsPaymentDomain, String str, String str2, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ordersOfflineDetailsPaymentDomain.paymentCode;
        }
        if ((i2 & 2) != 0) {
            str2 = ordersOfflineDetailsPaymentDomain.paymentName;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = ordersOfflineDetailsPaymentDomain.paymentAmountScale;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            d = ordersOfflineDetailsPaymentDomain.paymentAmount;
        }
        return ordersOfflineDetailsPaymentDomain.copy(str, str3, i3, d);
    }

    @C12579k
    public final String component1() {
        return this.paymentCode;
    }

    @C12579k
    public final String component2() {
        return this.paymentName;
    }

    public final int component3() {
        return this.paymentAmountScale;
    }

    public final double component4() {
        return this.paymentAmount;
    }

    @C12579k
    public final OrdersOfflineDetailsPaymentDomain copy(@C12579k String str, @C12579k String str2, int i, double d) {
        Intrinsics.checkNotNullParameter(str, "paymentCode");
        Intrinsics.checkNotNullParameter(str2, "paymentName");
        return new OrdersOfflineDetailsPaymentDomain(str, str2, i, d);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOfflineDetailsPaymentDomain)) {
            return false;
        }
        OrdersOfflineDetailsPaymentDomain ordersOfflineDetailsPaymentDomain = (OrdersOfflineDetailsPaymentDomain) obj;
        return Intrinsics.areEqual((Object) this.paymentCode, (Object) ordersOfflineDetailsPaymentDomain.paymentCode) && Intrinsics.areEqual((Object) this.paymentName, (Object) ordersOfflineDetailsPaymentDomain.paymentName) && this.paymentAmountScale == ordersOfflineDetailsPaymentDomain.paymentAmountScale && Double.compare(this.paymentAmount, ordersOfflineDetailsPaymentDomain.paymentAmount) == 0;
    }

    public final double getPaymentAmount() {
        return this.paymentAmount;
    }

    public final int getPaymentAmountScale() {
        return this.paymentAmountScale;
    }

    @C12579k
    public final String getPaymentCode() {
        return this.paymentCode;
    }

    @C12579k
    public final String getPaymentName() {
        return this.paymentName;
    }

    public int hashCode() {
        return (((((this.paymentCode.hashCode() * 31) + this.paymentName.hashCode()) * 31) + Integer.hashCode(this.paymentAmountScale)) * 31) + Double.hashCode(this.paymentAmount);
    }

    public final void setPaymentAmount(double d) {
        this.paymentAmount = d;
    }

    @C12579k
    public String toString() {
        String str = this.paymentCode;
        String str2 = this.paymentName;
        int i = this.paymentAmountScale;
        double d = this.paymentAmount;
        return "OrdersOfflineDetailsPaymentDomain(paymentCode=" + str + ", paymentName=" + str2 + ", paymentAmountScale=" + i + ", paymentAmount=" + d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrdersOfflineDetailsPaymentDomain(String str, String str2, int i, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0.0d : d);
    }
}
