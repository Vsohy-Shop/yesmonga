package com.carrefour.fid.android.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b?\u0010@J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003J{\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010$\u001a\u00020\u001eHÖ\u0001J\u0019\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0014\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\f\n\u0004\b\u0016\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\b6\u00102R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\f\n\u0004\b\u0018\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\f\n\u0004\b\u0019\u00107\u001a\u0004\b:\u00109R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0004¢\u0006\f\n\u0004\b\u001a\u0010;\u001a\u0004\b<\u0010=R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8\u0006X\u0004¢\u0006\f\n\u0004\b\u001b\u0010;\u001a\u0004\b>\u0010=¨\u0006A"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "Lcom/carrefour/fid/android/data/entities/OrderV3Address;", "component3", "Lcom/carrefour/fid/android/data/entities/OrderV3ConsumerInfo;", "component4", "component5", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "component6", "component7", "", "Lcom/carrefour/fid/android/data/entities/OrderV3PaymentInfo;", "component8", "Lcom/carrefour/fid/android/data/entities/OrderV3SubOrder;", "component9", "oneOrderId", "orderType", "billingAddress", "customerInformation", "deliveryAddress", "oneOrderAmount", "oneOrderAmountWithoutDiscount", "paymentInfo", "subOrders", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "J", "getOneOrderId", "()J", "Ljava/lang/String;", "getOrderType", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/data/entities/OrderV3Address;", "getBillingAddress", "()Lcom/carrefour/fid/android/data/entities/OrderV3Address;", "Lcom/carrefour/fid/android/data/entities/OrderV3ConsumerInfo;", "getCustomerInformation", "()Lcom/carrefour/fid/android/data/entities/OrderV3ConsumerInfo;", "getDeliveryAddress", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "getOneOrderAmount", "()Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "getOneOrderAmountWithoutDiscount", "Ljava/util/List;", "getPaymentInfo", "()Ljava/util/List;", "getSubOrders", "<init>", "(JLjava/lang/String;Lcom/carrefour/fid/android/data/entities/OrderV3Address;Lcom/carrefour/fid/android/data/entities/OrderV3ConsumerInfo;Lcom/carrefour/fid/android/data/entities/OrderV3Address;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Ljava/util/List;Ljava/util/List;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3 implements Parcelable {
    public static final int $stable = 8;
    @C12579k
    public static final Parcelable.Creator<OrderV3> CREATOR = new C36402a();
    @C33608c("billing_address")
    @C12580l
    private final OrderV3Address billingAddress;
    @C33608c("customer_information")
    @C12580l
    private final OrderV3ConsumerInfo customerInformation;
    @C33608c("delivery_address")
    @C12580l
    private final OrderV3Address deliveryAddress;
    @C33608c("one_order_amount")
    @C12580l
    private final OrderV3Amounts oneOrderAmount;
    @C33608c("one_order_amount_without_discount")
    @C12580l
    private final OrderV3Amounts oneOrderAmountWithoutDiscount;
    @C33608c("one_order_id")
    private final long oneOrderId;
    @C33608c("order_type")
    @C12579k
    private final String orderType;
    @C33608c("payment_info")
    @C12580l
    private final List<OrderV3PaymentInfo> paymentInfo;
    @C33608c("sub_orders")
    @C12579k
    private final List<OrderV3SubOrder> subOrders;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3$a */
    public static final class C36402a implements Parcelable.Creator<OrderV3> {
        @C12579k
        /* renamed from: a */
        public final OrderV3 createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            ArrayList arrayList = null;
            OrderV3Address createFromParcel = parcel.readInt() == 0 ? null : OrderV3Address.CREATOR.createFromParcel(parcel);
            OrderV3ConsumerInfo createFromParcel2 = parcel.readInt() == 0 ? null : OrderV3ConsumerInfo.CREATOR.createFromParcel(parcel);
            OrderV3Address createFromParcel3 = parcel.readInt() == 0 ? null : OrderV3Address.CREATOR.createFromParcel(parcel);
            OrderV3Amounts createFromParcel4 = parcel.readInt() == 0 ? null : OrderV3Amounts.CREATOR.createFromParcel(parcel);
            OrderV3Amounts createFromParcel5 = parcel.readInt() == 0 ? null : OrderV3Amounts.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(OrderV3PaymentInfo.CREATOR.createFromParcel(parcel));
                }
            }
            ArrayList arrayList2 = arrayList;
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList3.add(OrderV3SubOrder.CREATOR.createFromParcel(parcel));
            }
            return new OrderV3(readLong, readString, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, arrayList2, arrayList3);
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3[] newArray(int i) {
            return new OrderV3[i];
        }
    }

    public OrderV3(long j, @C12579k String str, @C12580l OrderV3Address orderV3Address, @C12580l OrderV3ConsumerInfo orderV3ConsumerInfo, @C12580l OrderV3Address orderV3Address2, @C12580l OrderV3Amounts orderV3Amounts, @C12580l OrderV3Amounts orderV3Amounts2, @C12580l List<OrderV3PaymentInfo> list, @C12579k List<OrderV3SubOrder> list2) {
        Intrinsics.checkNotNullParameter(str, "orderType");
        Intrinsics.checkNotNullParameter(list2, "subOrders");
        this.oneOrderId = j;
        this.orderType = str;
        this.billingAddress = orderV3Address;
        this.customerInformation = orderV3ConsumerInfo;
        this.deliveryAddress = orderV3Address2;
        this.oneOrderAmount = orderV3Amounts;
        this.oneOrderAmountWithoutDiscount = orderV3Amounts2;
        this.paymentInfo = list;
        this.subOrders = list2;
    }

    public static /* synthetic */ OrderV3 copy$default(OrderV3 orderV3, long j, String str, OrderV3Address orderV3Address, OrderV3ConsumerInfo orderV3ConsumerInfo, OrderV3Address orderV3Address2, OrderV3Amounts orderV3Amounts, OrderV3Amounts orderV3Amounts2, List list, List list2, int i, Object obj) {
        OrderV3 orderV32 = orderV3;
        int i2 = i;
        return orderV3.copy((i2 & 1) != 0 ? orderV32.oneOrderId : j, (i2 & 2) != 0 ? orderV32.orderType : str, (i2 & 4) != 0 ? orderV32.billingAddress : orderV3Address, (i2 & 8) != 0 ? orderV32.customerInformation : orderV3ConsumerInfo, (i2 & 16) != 0 ? orderV32.deliveryAddress : orderV3Address2, (i2 & 32) != 0 ? orderV32.oneOrderAmount : orderV3Amounts, (i2 & 64) != 0 ? orderV32.oneOrderAmountWithoutDiscount : orderV3Amounts2, (i2 & 128) != 0 ? orderV32.paymentInfo : list, (i2 & 256) != 0 ? orderV32.subOrders : list2);
    }

    public final long component1() {
        return this.oneOrderId;
    }

    @C12579k
    public final String component2() {
        return this.orderType;
    }

    @C12580l
    public final OrderV3Address component3() {
        return this.billingAddress;
    }

    @C12580l
    public final OrderV3ConsumerInfo component4() {
        return this.customerInformation;
    }

    @C12580l
    public final OrderV3Address component5() {
        return this.deliveryAddress;
    }

    @C12580l
    public final OrderV3Amounts component6() {
        return this.oneOrderAmount;
    }

    @C12580l
    public final OrderV3Amounts component7() {
        return this.oneOrderAmountWithoutDiscount;
    }

    @C12580l
    public final List<OrderV3PaymentInfo> component8() {
        return this.paymentInfo;
    }

    @C12579k
    public final List<OrderV3SubOrder> component9() {
        return this.subOrders;
    }

    @C12579k
    public final OrderV3 copy(long j, @C12579k String str, @C12580l OrderV3Address orderV3Address, @C12580l OrderV3ConsumerInfo orderV3ConsumerInfo, @C12580l OrderV3Address orderV3Address2, @C12580l OrderV3Amounts orderV3Amounts, @C12580l OrderV3Amounts orderV3Amounts2, @C12580l List<OrderV3PaymentInfo> list, @C12579k List<OrderV3SubOrder> list2) {
        Intrinsics.checkNotNullParameter(str, "orderType");
        List<OrderV3SubOrder> list3 = list2;
        Intrinsics.checkNotNullParameter(list3, "subOrders");
        return new OrderV3(j, str, orderV3Address, orderV3ConsumerInfo, orderV3Address2, orderV3Amounts, orderV3Amounts2, list, list3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV3)) {
            return false;
        }
        OrderV3 orderV3 = (OrderV3) obj;
        return this.oneOrderId == orderV3.oneOrderId && Intrinsics.areEqual((Object) this.orderType, (Object) orderV3.orderType) && Intrinsics.areEqual((Object) this.billingAddress, (Object) orderV3.billingAddress) && Intrinsics.areEqual((Object) this.customerInformation, (Object) orderV3.customerInformation) && Intrinsics.areEqual((Object) this.deliveryAddress, (Object) orderV3.deliveryAddress) && Intrinsics.areEqual((Object) this.oneOrderAmount, (Object) orderV3.oneOrderAmount) && Intrinsics.areEqual((Object) this.oneOrderAmountWithoutDiscount, (Object) orderV3.oneOrderAmountWithoutDiscount) && Intrinsics.areEqual((Object) this.paymentInfo, (Object) orderV3.paymentInfo) && Intrinsics.areEqual((Object) this.subOrders, (Object) orderV3.subOrders);
    }

    @C12580l
    public final OrderV3Address getBillingAddress() {
        return this.billingAddress;
    }

    @C12580l
    public final OrderV3ConsumerInfo getCustomerInformation() {
        return this.customerInformation;
    }

    @C12580l
    public final OrderV3Address getDeliveryAddress() {
        return this.deliveryAddress;
    }

    @C12580l
    public final OrderV3Amounts getOneOrderAmount() {
        return this.oneOrderAmount;
    }

    @C12580l
    public final OrderV3Amounts getOneOrderAmountWithoutDiscount() {
        return this.oneOrderAmountWithoutDiscount;
    }

    public final long getOneOrderId() {
        return this.oneOrderId;
    }

    @C12579k
    public final String getOrderType() {
        return this.orderType;
    }

    @C12580l
    public final List<OrderV3PaymentInfo> getPaymentInfo() {
        return this.paymentInfo;
    }

    @C12579k
    public final List<OrderV3SubOrder> getSubOrders() {
        return this.subOrders;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.oneOrderId) * 31) + this.orderType.hashCode()) * 31;
        OrderV3Address orderV3Address = this.billingAddress;
        int i = 0;
        int hashCode2 = (hashCode + (orderV3Address == null ? 0 : orderV3Address.hashCode())) * 31;
        OrderV3ConsumerInfo orderV3ConsumerInfo = this.customerInformation;
        int hashCode3 = (hashCode2 + (orderV3ConsumerInfo == null ? 0 : orderV3ConsumerInfo.hashCode())) * 31;
        OrderV3Address orderV3Address2 = this.deliveryAddress;
        int hashCode4 = (hashCode3 + (orderV3Address2 == null ? 0 : orderV3Address2.hashCode())) * 31;
        OrderV3Amounts orderV3Amounts = this.oneOrderAmount;
        int hashCode5 = (hashCode4 + (orderV3Amounts == null ? 0 : orderV3Amounts.hashCode())) * 31;
        OrderV3Amounts orderV3Amounts2 = this.oneOrderAmountWithoutDiscount;
        int hashCode6 = (hashCode5 + (orderV3Amounts2 == null ? 0 : orderV3Amounts2.hashCode())) * 31;
        List<OrderV3PaymentInfo> list = this.paymentInfo;
        if (list != null) {
            i = list.hashCode();
        }
        return ((hashCode6 + i) * 31) + this.subOrders.hashCode();
    }

    @C12579k
    public String toString() {
        long j = this.oneOrderId;
        String str = this.orderType;
        OrderV3Address orderV3Address = this.billingAddress;
        OrderV3ConsumerInfo orderV3ConsumerInfo = this.customerInformation;
        OrderV3Address orderV3Address2 = this.deliveryAddress;
        OrderV3Amounts orderV3Amounts = this.oneOrderAmount;
        OrderV3Amounts orderV3Amounts2 = this.oneOrderAmountWithoutDiscount;
        List<OrderV3PaymentInfo> list = this.paymentInfo;
        List<OrderV3SubOrder> list2 = this.subOrders;
        return "OrderV3(oneOrderId=" + j + ", orderType=" + str + ", billingAddress=" + orderV3Address + ", customerInformation=" + orderV3ConsumerInfo + ", deliveryAddress=" + orderV3Address2 + ", oneOrderAmount=" + orderV3Amounts + ", oneOrderAmountWithoutDiscount=" + orderV3Amounts2 + ", paymentInfo=" + list + ", subOrders=" + list2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.oneOrderId);
        parcel.writeString(this.orderType);
        OrderV3Address orderV3Address = this.billingAddress;
        if (orderV3Address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderV3Address.writeToParcel(parcel, i);
        }
        OrderV3ConsumerInfo orderV3ConsumerInfo = this.customerInformation;
        if (orderV3ConsumerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderV3ConsumerInfo.writeToParcel(parcel, i);
        }
        OrderV3Address orderV3Address2 = this.deliveryAddress;
        if (orderV3Address2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderV3Address2.writeToParcel(parcel, i);
        }
        OrderV3Amounts orderV3Amounts = this.oneOrderAmount;
        if (orderV3Amounts == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderV3Amounts.writeToParcel(parcel, i);
        }
        OrderV3Amounts orderV3Amounts2 = this.oneOrderAmountWithoutDiscount;
        if (orderV3Amounts2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderV3Amounts2.writeToParcel(parcel, i);
        }
        List<OrderV3PaymentInfo> list = this.paymentInfo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (OrderV3PaymentInfo writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        List<OrderV3SubOrder> list2 = this.subOrders;
        parcel.writeInt(list2.size());
        for (OrderV3SubOrder writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
    }
}
