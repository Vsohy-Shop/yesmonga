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
@C11076d0(mo22515d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001d\u001a\u00020\f\u0012\u0006\u0010\u001e\u001a\u00020\f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010#\u001a\u0004\u0018\u00010\t\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\bJ\u0010KJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J¬\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0001¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001J\u0013\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010-\u001a\u00020\tHÖ\u0001J\u0019\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b4\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u0019\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u001a\u00105\u001a\u0004\b8\u00107R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u001b\u00105\u001a\u0004\b9\u00107R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\f\n\u0004\b\u001c\u0010:\u001a\u0004\b;\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\f8\u0006X\u0004¢\u0006\f\n\u0004\b\u001d\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u001e\u001a\u00020\f8\u0006X\u0004¢\u0006\f\n\u0004\b\u001e\u0010<\u001a\u0004\b?\u0010>R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u001f\u00105\u001a\u0004\b@\u00107R\u001c\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\f\n\u0004\b \u00105\u001a\u0004\bA\u00107R\u001c\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\bB\u00107R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\f\n\u0004\b\"\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010#\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\f\n\u0004\b#\u0010:\u001a\u0004\bF\u0010\u000bR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0004¢\u0006\f\n\u0004\b$\u0010G\u001a\u0004\bH\u0010I¨\u0006L"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3Offer;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/Long;", "", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Integer;", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "component6", "component7", "component8", "component9", "component10", "Lcom/carrefour/fid/android/data/entities/OrderV3OfferPrices;", "component11", "component12", "", "Lcom/carrefour/fid/android/data/entities/OrderV3Tax;", "component13", "cdbase", "gtin", "name", "offerId", "offerLine", "offerPreparedTotalAmount", "offerTotalAmount", "offerUnit", "picturePath", "preparedQuantity", "prices", "quantity", "taxes", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OrderV3OfferPrices;Ljava/lang/Integer;Ljava/util/List;)Lcom/carrefour/fid/android/data/entities/OrderV3Offer;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/Long;", "getCdbase", "Ljava/lang/String;", "getGtin", "()Ljava/lang/String;", "getName", "getOfferId", "Ljava/lang/Integer;", "getOfferLine", "Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "getOfferPreparedTotalAmount", "()Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;", "getOfferTotalAmount", "getOfferUnit", "getPicturePath", "getPreparedQuantity", "Lcom/carrefour/fid/android/data/entities/OrderV3OfferPrices;", "getPrices", "()Lcom/carrefour/fid/android/data/entities/OrderV3OfferPrices;", "getQuantity", "Ljava/util/List;", "getTaxes", "()Ljava/util/List;", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Lcom/carrefour/fid/android/data/entities/OrderV3Amounts;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/OrderV3OfferPrices;Ljava/lang/Integer;Ljava/util/List;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3Offer implements Parcelable {
    public static final int $stable = 8;
    @C12579k
    public static final Parcelable.Creator<OrderV3Offer> CREATOR = new C36408a();
    @C33608c("cdbase")
    @C12580l
    private final Long cdbase;
    @C33608c("gtin")
    @C12580l
    private final String gtin;
    @C33608c("name")
    @C12580l
    private final String name;
    @C33608c("offer_id")
    @C12580l
    private final String offerId;
    @C33608c("offer_line")
    @C12580l
    private final Integer offerLine;
    @C33608c("offer_prepared_total_amount")
    @C12579k
    private final OrderV3Amounts offerPreparedTotalAmount;
    @C33608c("offer_total_amount")
    @C12579k
    private final OrderV3Amounts offerTotalAmount;
    @C33608c("offer_unit")
    @C12580l
    private final String offerUnit;
    @C33608c("picture_path")
    @C12580l
    private final String picturePath;
    @C33608c("prepared_quantity")
    @C12580l
    private final String preparedQuantity;
    @C33608c("prices")
    @C12580l
    private final OrderV3OfferPrices prices;
    @C33608c("quantity")
    @C12580l
    private final Integer quantity;
    @C33608c("taxes")
    @C12579k
    private final List<OrderV3Tax> taxes;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3Offer$a */
    public static final class C36408a implements Parcelable.Creator<OrderV3Offer> {
        @C12579k
        /* renamed from: a */
        public final OrderV3Offer createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            Integer num = null;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Parcelable.Creator<OrderV3Amounts> creator = OrderV3Amounts.CREATOR;
            OrderV3Amounts createFromParcel = creator.createFromParcel(parcel2);
            OrderV3Amounts createFromParcel2 = creator.createFromParcel(parcel2);
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            OrderV3OfferPrices createFromParcel3 = parcel.readInt() == 0 ? null : OrderV3OfferPrices.CREATOR.createFromParcel(parcel2);
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            Integer num2 = num;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                arrayList.add(OrderV3Tax.CREATOR.createFromParcel(parcel2));
                i++;
                readInt = readInt;
            }
            return new OrderV3Offer(valueOf, readString, readString2, readString3, valueOf2, createFromParcel, createFromParcel2, readString4, readString5, readString6, createFromParcel3, num2, arrayList);
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3Offer[] newArray(int i) {
            return new OrderV3Offer[i];
        }
    }

    public OrderV3Offer(@C12580l Long l, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Integer num, @C12579k OrderV3Amounts orderV3Amounts, @C12579k OrderV3Amounts orderV3Amounts2, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l OrderV3OfferPrices orderV3OfferPrices, @C12580l Integer num2, @C12579k List<OrderV3Tax> list) {
        Intrinsics.checkNotNullParameter(orderV3Amounts, "offerPreparedTotalAmount");
        Intrinsics.checkNotNullParameter(orderV3Amounts2, "offerTotalAmount");
        Intrinsics.checkNotNullParameter(list, "taxes");
        this.cdbase = l;
        this.gtin = str;
        this.name = str2;
        this.offerId = str3;
        this.offerLine = num;
        this.offerPreparedTotalAmount = orderV3Amounts;
        this.offerTotalAmount = orderV3Amounts2;
        this.offerUnit = str4;
        this.picturePath = str5;
        this.preparedQuantity = str6;
        this.prices = orderV3OfferPrices;
        this.quantity = num2;
        this.taxes = list;
    }

    public static /* synthetic */ OrderV3Offer copy$default(OrderV3Offer orderV3Offer, Long l, String str, String str2, String str3, Integer num, OrderV3Amounts orderV3Amounts, OrderV3Amounts orderV3Amounts2, String str4, String str5, String str6, OrderV3OfferPrices orderV3OfferPrices, Integer num2, List list, int i, Object obj) {
        OrderV3Offer orderV3Offer2 = orderV3Offer;
        int i2 = i;
        return orderV3Offer.copy((i2 & 1) != 0 ? orderV3Offer2.cdbase : l, (i2 & 2) != 0 ? orderV3Offer2.gtin : str, (i2 & 4) != 0 ? orderV3Offer2.name : str2, (i2 & 8) != 0 ? orderV3Offer2.offerId : str3, (i2 & 16) != 0 ? orderV3Offer2.offerLine : num, (i2 & 32) != 0 ? orderV3Offer2.offerPreparedTotalAmount : orderV3Amounts, (i2 & 64) != 0 ? orderV3Offer2.offerTotalAmount : orderV3Amounts2, (i2 & 128) != 0 ? orderV3Offer2.offerUnit : str4, (i2 & 256) != 0 ? orderV3Offer2.picturePath : str5, (i2 & 512) != 0 ? orderV3Offer2.preparedQuantity : str6, (i2 & 1024) != 0 ? orderV3Offer2.prices : orderV3OfferPrices, (i2 & 2048) != 0 ? orderV3Offer2.quantity : num2, (i2 & 4096) != 0 ? orderV3Offer2.taxes : list);
    }

    @C12580l
    public final Long component1() {
        return this.cdbase;
    }

    @C12580l
    public final String component10() {
        return this.preparedQuantity;
    }

    @C12580l
    public final OrderV3OfferPrices component11() {
        return this.prices;
    }

    @C12580l
    public final Integer component12() {
        return this.quantity;
    }

    @C12579k
    public final List<OrderV3Tax> component13() {
        return this.taxes;
    }

    @C12580l
    public final String component2() {
        return this.gtin;
    }

    @C12580l
    public final String component3() {
        return this.name;
    }

    @C12580l
    public final String component4() {
        return this.offerId;
    }

    @C12580l
    public final Integer component5() {
        return this.offerLine;
    }

    @C12579k
    public final OrderV3Amounts component6() {
        return this.offerPreparedTotalAmount;
    }

    @C12579k
    public final OrderV3Amounts component7() {
        return this.offerTotalAmount;
    }

    @C12580l
    public final String component8() {
        return this.offerUnit;
    }

    @C12580l
    public final String component9() {
        return this.picturePath;
    }

    @C12579k
    public final OrderV3Offer copy(@C12580l Long l, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Integer num, @C12579k OrderV3Amounts orderV3Amounts, @C12579k OrderV3Amounts orderV3Amounts2, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l OrderV3OfferPrices orderV3OfferPrices, @C12580l Integer num2, @C12579k List<OrderV3Tax> list) {
        OrderV3Amounts orderV3Amounts3 = orderV3Amounts;
        Intrinsics.checkNotNullParameter(orderV3Amounts3, "offerPreparedTotalAmount");
        OrderV3Amounts orderV3Amounts4 = orderV3Amounts2;
        Intrinsics.checkNotNullParameter(orderV3Amounts4, "offerTotalAmount");
        List<OrderV3Tax> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "taxes");
        return new OrderV3Offer(l, str, str2, str3, num, orderV3Amounts3, orderV3Amounts4, str4, str5, str6, orderV3OfferPrices, num2, list2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV3Offer)) {
            return false;
        }
        OrderV3Offer orderV3Offer = (OrderV3Offer) obj;
        return Intrinsics.areEqual((Object) this.cdbase, (Object) orderV3Offer.cdbase) && Intrinsics.areEqual((Object) this.gtin, (Object) orderV3Offer.gtin) && Intrinsics.areEqual((Object) this.name, (Object) orderV3Offer.name) && Intrinsics.areEqual((Object) this.offerId, (Object) orderV3Offer.offerId) && Intrinsics.areEqual((Object) this.offerLine, (Object) orderV3Offer.offerLine) && Intrinsics.areEqual((Object) this.offerPreparedTotalAmount, (Object) orderV3Offer.offerPreparedTotalAmount) && Intrinsics.areEqual((Object) this.offerTotalAmount, (Object) orderV3Offer.offerTotalAmount) && Intrinsics.areEqual((Object) this.offerUnit, (Object) orderV3Offer.offerUnit) && Intrinsics.areEqual((Object) this.picturePath, (Object) orderV3Offer.picturePath) && Intrinsics.areEqual((Object) this.preparedQuantity, (Object) orderV3Offer.preparedQuantity) && Intrinsics.areEqual((Object) this.prices, (Object) orderV3Offer.prices) && Intrinsics.areEqual((Object) this.quantity, (Object) orderV3Offer.quantity) && Intrinsics.areEqual((Object) this.taxes, (Object) orderV3Offer.taxes);
    }

    @C12580l
    public final Long getCdbase() {
        return this.cdbase;
    }

    @C12580l
    public final String getGtin() {
        return this.gtin;
    }

    @C12580l
    public final String getName() {
        return this.name;
    }

    @C12580l
    public final String getOfferId() {
        return this.offerId;
    }

    @C12580l
    public final Integer getOfferLine() {
        return this.offerLine;
    }

    @C12579k
    public final OrderV3Amounts getOfferPreparedTotalAmount() {
        return this.offerPreparedTotalAmount;
    }

    @C12579k
    public final OrderV3Amounts getOfferTotalAmount() {
        return this.offerTotalAmount;
    }

    @C12580l
    public final String getOfferUnit() {
        return this.offerUnit;
    }

    @C12580l
    public final String getPicturePath() {
        return this.picturePath;
    }

    @C12580l
    public final String getPreparedQuantity() {
        return this.preparedQuantity;
    }

    @C12580l
    public final OrderV3OfferPrices getPrices() {
        return this.prices;
    }

    @C12580l
    public final Integer getQuantity() {
        return this.quantity;
    }

    @C12579k
    public final List<OrderV3Tax> getTaxes() {
        return this.taxes;
    }

    public int hashCode() {
        Long l = this.cdbase;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.gtin;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.offerId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.offerLine;
        int hashCode5 = (((((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.offerPreparedTotalAmount.hashCode()) * 31) + this.offerTotalAmount.hashCode()) * 31;
        String str4 = this.offerUnit;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.picturePath;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.preparedQuantity;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        OrderV3OfferPrices orderV3OfferPrices = this.prices;
        int hashCode9 = (hashCode8 + (orderV3OfferPrices == null ? 0 : orderV3OfferPrices.hashCode())) * 31;
        Integer num2 = this.quantity;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return ((hashCode9 + i) * 31) + this.taxes.hashCode();
    }

    @C12579k
    public String toString() {
        Long l = this.cdbase;
        String str = this.gtin;
        String str2 = this.name;
        String str3 = this.offerId;
        Integer num = this.offerLine;
        OrderV3Amounts orderV3Amounts = this.offerPreparedTotalAmount;
        OrderV3Amounts orderV3Amounts2 = this.offerTotalAmount;
        String str4 = this.offerUnit;
        String str5 = this.picturePath;
        String str6 = this.preparedQuantity;
        OrderV3OfferPrices orderV3OfferPrices = this.prices;
        Integer num2 = this.quantity;
        List<OrderV3Tax> list = this.taxes;
        return "OrderV3Offer(cdbase=" + l + ", gtin=" + str + ", name=" + str2 + ", offerId=" + str3 + ", offerLine=" + num + ", offerPreparedTotalAmount=" + orderV3Amounts + ", offerTotalAmount=" + orderV3Amounts2 + ", offerUnit=" + str4 + ", picturePath=" + str5 + ", preparedQuantity=" + str6 + ", prices=" + orderV3OfferPrices + ", quantity=" + num2 + ", taxes=" + list + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Long l = this.cdbase;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.gtin);
        parcel.writeString(this.name);
        parcel.writeString(this.offerId);
        Integer num = this.offerLine;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        this.offerPreparedTotalAmount.writeToParcel(parcel, i);
        this.offerTotalAmount.writeToParcel(parcel, i);
        parcel.writeString(this.offerUnit);
        parcel.writeString(this.picturePath);
        parcel.writeString(this.preparedQuantity);
        OrderV3OfferPrices orderV3OfferPrices = this.prices;
        if (orderV3OfferPrices == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderV3OfferPrices.writeToParcel(parcel, i);
        }
        Integer num2 = this.quantity;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        List<OrderV3Tax> list = this.taxes;
        parcel.writeInt(list.size());
        for (OrderV3Tax writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
