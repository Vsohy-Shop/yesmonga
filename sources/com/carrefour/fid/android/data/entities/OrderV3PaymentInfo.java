package com.carrefour.fid.android.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3PaymentInfo;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "component1", "", "component2", "component3", "component4", "paymentAmount", "paymentChoice", "paymentDate", "paymentId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "getPaymentAmount", "()Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "Ljava/lang/String;", "getPaymentChoice", "()Ljava/lang/String;", "getPaymentDate", "getPaymentId", "<init>", "(Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3PaymentInfo implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<OrderV3PaymentInfo> CREATOR = new C36410a();
    @C33608c("payment_amount")
    @C12579k
    private final OrderV3Amounts paymentAmount;
    @C33608c("payment_choice")
    @C12579k
    private final String paymentChoice;
    @C33608c("payment_date")
    @C12579k
    private final String paymentDate;
    @C33608c("payment_id")
    @C12579k
    private final String paymentId;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3PaymentInfo$a */
    public static final class C36410a implements Parcelable.Creator<OrderV3PaymentInfo> {
        @C12579k
        /* renamed from: a */
        public final OrderV3PaymentInfo createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderV3PaymentInfo(OrderV3Amounts.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3PaymentInfo[] newArray(int i) {
            return new OrderV3PaymentInfo[i];
        }
    }

    public OrderV3PaymentInfo(@C12579k OrderV3Amounts orderV3Amounts, @C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(orderV3Amounts, "paymentAmount");
        Intrinsics.checkNotNullParameter(str, "paymentChoice");
        Intrinsics.checkNotNullParameter(str2, "paymentDate");
        Intrinsics.checkNotNullParameter(str3, "paymentId");
        this.paymentAmount = orderV3Amounts;
        this.paymentChoice = str;
        this.paymentDate = str2;
        this.paymentId = str3;
    }

    public static /* synthetic */ OrderV3PaymentInfo copy$default(OrderV3PaymentInfo orderV3PaymentInfo, OrderV3Amounts orderV3Amounts, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            orderV3Amounts = orderV3PaymentInfo.paymentAmount;
        }
        if ((i & 2) != 0) {
            str = orderV3PaymentInfo.paymentChoice;
        }
        if ((i & 4) != 0) {
            str2 = orderV3PaymentInfo.paymentDate;
        }
        if ((i & 8) != 0) {
            str3 = orderV3PaymentInfo.paymentId;
        }
        return orderV3PaymentInfo.copy(orderV3Amounts, str, str2, str3);
    }

    @C12579k
    public final OrderV3Amounts component1() {
        return this.paymentAmount;
    }

    @C12579k
    public final String component2() {
        return this.paymentChoice;
    }

    @C12579k
    public final String component3() {
        return this.paymentDate;
    }

    @C12579k
    public final String component4() {
        return this.paymentId;
    }

    @C12579k
    public final OrderV3PaymentInfo copy(@C12579k OrderV3Amounts orderV3Amounts, @C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(orderV3Amounts, "paymentAmount");
        Intrinsics.checkNotNullParameter(str, "paymentChoice");
        Intrinsics.checkNotNullParameter(str2, "paymentDate");
        Intrinsics.checkNotNullParameter(str3, "paymentId");
        return new OrderV3PaymentInfo(orderV3Amounts, str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV3PaymentInfo)) {
            return false;
        }
        OrderV3PaymentInfo orderV3PaymentInfo = (OrderV3PaymentInfo) obj;
        return Intrinsics.areEqual((Object) this.paymentAmount, (Object) orderV3PaymentInfo.paymentAmount) && Intrinsics.areEqual((Object) this.paymentChoice, (Object) orderV3PaymentInfo.paymentChoice) && Intrinsics.areEqual((Object) this.paymentDate, (Object) orderV3PaymentInfo.paymentDate) && Intrinsics.areEqual((Object) this.paymentId, (Object) orderV3PaymentInfo.paymentId);
    }

    @C12579k
    public final OrderV3Amounts getPaymentAmount() {
        return this.paymentAmount;
    }

    @C12579k
    public final String getPaymentChoice() {
        return this.paymentChoice;
    }

    @C12579k
    public final String getPaymentDate() {
        return this.paymentDate;
    }

    @C12579k
    public final String getPaymentId() {
        return this.paymentId;
    }

    public int hashCode() {
        return (((((this.paymentAmount.hashCode() * 31) + this.paymentChoice.hashCode()) * 31) + this.paymentDate.hashCode()) * 31) + this.paymentId.hashCode();
    }

    @C12579k
    public String toString() {
        OrderV3Amounts orderV3Amounts = this.paymentAmount;
        String str = this.paymentChoice;
        String str2 = this.paymentDate;
        String str3 = this.paymentId;
        return "OrderV3PaymentInfo(paymentAmount=" + orderV3Amounts + ", paymentChoice=" + str + ", paymentDate=" + str2 + ", paymentId=" + str3 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.paymentAmount.writeToParcel(parcel, i);
        parcel.writeString(this.paymentChoice);
        parcel.writeString(this.paymentDate);
        parcel.writeString(this.paymentId);
    }
}
