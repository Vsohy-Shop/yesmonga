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
@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3Promotion;", "Landroid/os/Parcelable;", "", "component1", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "component2", "promotionCode", "discountAmount", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getPromotionCode", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "getDiscountAmount", "()Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "<init>", "(Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3Promotion implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<OrderV3Promotion> CREATOR = new C36411a();
    @C33608c("discount_amount")
    @C12580l
    private final OrderV3Amounts discountAmount;
    @C33608c("promotion_code")
    @C12580l
    private final String promotionCode;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3Promotion$a */
    public static final class C36411a implements Parcelable.Creator<OrderV3Promotion> {
        @C12579k
        /* renamed from: a */
        public final OrderV3Promotion createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderV3Promotion(parcel.readString(), parcel.readInt() == 0 ? null : OrderV3Amounts.CREATOR.createFromParcel(parcel));
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3Promotion[] newArray(int i) {
            return new OrderV3Promotion[i];
        }
    }

    public OrderV3Promotion(@C12580l String str, @C12580l OrderV3Amounts orderV3Amounts) {
        this.promotionCode = str;
        this.discountAmount = orderV3Amounts;
    }

    public static /* synthetic */ OrderV3Promotion copy$default(OrderV3Promotion orderV3Promotion, String str, OrderV3Amounts orderV3Amounts, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderV3Promotion.promotionCode;
        }
        if ((i & 2) != 0) {
            orderV3Amounts = orderV3Promotion.discountAmount;
        }
        return orderV3Promotion.copy(str, orderV3Amounts);
    }

    @C12580l
    public final String component1() {
        return this.promotionCode;
    }

    @C12580l
    public final OrderV3Amounts component2() {
        return this.discountAmount;
    }

    @C12579k
    public final OrderV3Promotion copy(@C12580l String str, @C12580l OrderV3Amounts orderV3Amounts) {
        return new OrderV3Promotion(str, orderV3Amounts);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV3Promotion)) {
            return false;
        }
        OrderV3Promotion orderV3Promotion = (OrderV3Promotion) obj;
        return Intrinsics.areEqual((Object) this.promotionCode, (Object) orderV3Promotion.promotionCode) && Intrinsics.areEqual((Object) this.discountAmount, (Object) orderV3Promotion.discountAmount);
    }

    @C12580l
    public final OrderV3Amounts getDiscountAmount() {
        return this.discountAmount;
    }

    @C12580l
    public final String getPromotionCode() {
        return this.promotionCode;
    }

    public int hashCode() {
        String str = this.promotionCode;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OrderV3Amounts orderV3Amounts = this.discountAmount;
        if (orderV3Amounts != null) {
            i = orderV3Amounts.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.promotionCode;
        OrderV3Amounts orderV3Amounts = this.discountAmount;
        return "OrderV3Promotion(promotionCode=" + str + ", discountAmount=" + orderV3Amounts + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.promotionCode);
        OrderV3Amounts orderV3Amounts = this.discountAmount;
        if (orderV3Amounts == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        orderV3Amounts.writeToParcel(parcel, i);
    }
}
