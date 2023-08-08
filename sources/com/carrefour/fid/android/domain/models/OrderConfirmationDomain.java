package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.OrderServiceType;
import com.carrefour.fid.android.domain.models.account.Address;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010(\u001a\u00020$\u0012\b\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\b\u00101\u001a\u0004\u0018\u00010\u000b\u0012\b\u00104\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010:\u001a\u0004\u0018\u000105\u0012\b\u0010<\u001a\u0004\u0018\u000105\u0012\b\u0010>\u001a\u0004\u0018\u000105\u0012\b\u0010A\u001a\u0004\u0018\u000105\u0012\b\u0010D\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010G\u001a\u0004\u0018\u000105\u0012\b\u0010L\u001a\u0004\u0018\u000105\u0012\b\u0010O\u001a\u0004\u0018\u000105\u0012\b\u0010R\u001a\u0004\u0018\u000105\u0012\b\u0010U\u001a\u0004\u0018\u000105\u0012\u0006\u0010Y\u001a\u00020\u0004\u0012\u000e\u0010_\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010Z\u0012\b\u0010c\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010e\u001a\u00020\u0002\u0012\u0006\u0010j\u001a\u00020f\u0012\u0006\u0010n\u001a\u00020\u0002\u0012\u0006\u0010q\u001a\u00020\u0002¢\u0006\u0004\br\u0010sJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0011\u0010 R\u0019\u0010#\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\"\u0010\u000fR\u0017\u0010(\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010+\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b*\u0010\u000fR\u0019\u0010-\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b,\u0010\u000fR\u0019\u0010.\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010\r\u001a\u0004\b)\u0010\u000fR\u0019\u00101\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010\r\u001a\u0004\b0\u0010\u000fR\u0019\u00104\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b2\u0010\r\u001a\u0004\b3\u0010\u000fR\u0019\u0010:\u001a\u0004\u0018\u0001058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010<\u001a\u0004\u0018\u0001058\u0006¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b/\u00109R\u0019\u0010>\u001a\u0004\u0018\u0001058\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b2\u00109R\u0019\u0010A\u001a\u0004\u0018\u0001058\u0006¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u00109R\u0019\u0010D\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bB\u0010\r\u001a\u0004\bC\u0010\u000fR\u0019\u0010G\u001a\u0004\u0018\u0001058\u0006¢\u0006\f\n\u0004\bE\u00107\u001a\u0004\bF\u00109R$\u0010L\u001a\u0004\u0018\u0001058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bH\u00107\u001a\u0004\bI\u00109\"\u0004\bJ\u0010KR\u0019\u0010O\u001a\u0004\u0018\u0001058\u0006¢\u0006\f\n\u0004\bM\u00107\u001a\u0004\bN\u00109R\u0019\u0010R\u001a\u0004\u0018\u0001058\u0006¢\u0006\f\n\u0004\bP\u00107\u001a\u0004\bQ\u00109R\u0019\u0010U\u001a\u0004\u0018\u0001058\u0006¢\u0006\f\n\u0004\bS\u00107\u001a\u0004\bT\u00109R\u0017\u0010Y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\b\u001a\u0010XR\u001f\u0010_\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010Z8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b\u0015\u0010^R\u0019\u0010c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\b\u001e\u0010bR\u0014\u0010e\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010=R\u0017\u0010j\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\b\f\u0010iR\u0017\u0010n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bk\u0010=\u001a\u0004\bl\u0010mR\u0017\u0010q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bo\u0010=\u001a\u0004\bp\u0010m¨\u0006t"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrderConfirmationDomain;", "Landroid/os/Parcelable;", "", "C", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "orderId", "b", "g", "orderNumber", "Ljava/util/Date;", "c", "Ljava/util/Date;", "u", "()Ljava/util/Date;", "slotStartDate", "d", "t", "slotEndDate", "Lcom/carrefour/fid/android/domain/models/account/Address;", "e", "Lcom/carrefour/fid/android/domain/models/account/Address;", "()Lcom/carrefour/fid/android/domain/models/account/Address;", "deliveryAddress", "p", "pickupPointName", "Lcom/carrefour/fid/android/core/type/OrderServiceType;", "Lcom/carrefour/fid/android/core/type/OrderServiceType;", "s", "()Lcom/carrefour/fid/android/core/type/OrderServiceType;", "providedServiceType", "v", "x", "storeName", "w", "storeId", "storeFormat", "y", "h", "orderPromoCode", "z", "q", "promoCode", "", "X", "Ljava/lang/Double;", "r", "()Ljava/lang/Double;", "promoDiscountAmount", "Y", "subOrderAmount", "Z", "subOrderDiscountAmount", "E0", "n", "paymentAmount", "F0", "o", "paymentChoice", "G0", "j", "orderTotalDiscountAmount", "H0", "m", "D", "(Ljava/lang/Double;)V", "paidWithLoyaltyCardAmount", "I0", "l", "orderTotalPreparedAmount", "J0", "k", "orderTotalOffersAmount", "K0", "i", "orderTotalAmountIncludingTaxes", "L0", "I", "()I", "offersCount", "", "Lcom/carrefour/fid/android/domain/models/OrderOffer;", "M0", "Ljava/util/List;", "()Ljava/util/List;", "offers", "N0", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "orderCount", "O0", "isOrderPaidOnSite", "Lcom/carrefour/fid/android/domain/models/OrderBasketDomain;", "P0", "Lcom/carrefour/fid/android/domain/models/OrderBasketDomain;", "()Lcom/carrefour/fid/android/domain/models/OrderBasketDomain;", "basket", "Q0", "B", "()Z", "isNonFoodOrder", "R0", "A", "isDeliveryToPickupPoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/carrefour/fid/android/domain/models/account/Address;Ljava/lang/String;Lcom/carrefour/fid/android/core/type/OrderServiceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ILjava/util/List;Ljava/lang/Integer;ZLcom/carrefour/fid/android/domain/models/OrderBasketDomain;ZZ)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderConfirmationDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrderConfirmationDomain> CREATOR = new C37923a();

    /* renamed from: S0 */
    public static final int f95259S0 = 8;
    @C12580l

    /* renamed from: E0 */
    public final Double f95260E0;
    @C12580l

    /* renamed from: F0 */
    public final String f95261F0;
    @C12580l

    /* renamed from: G0 */
    public final Double f95262G0;
    @C12580l

    /* renamed from: H0 */
    public Double f95263H0;
    @C12580l

    /* renamed from: I0 */
    public final Double f95264I0;
    @C12580l

    /* renamed from: J0 */
    public final Double f95265J0;
    @C12580l

    /* renamed from: K0 */
    public final Double f95266K0;

    /* renamed from: L0 */
    public final int f95267L0;
    @C12580l

    /* renamed from: M0 */
    public final List<OrderOffer> f95268M0;
    @C12580l

    /* renamed from: N0 */
    public final Integer f95269N0;

    /* renamed from: O0 */
    public final boolean f95270O0;
    @C12579k

    /* renamed from: P0 */
    public final OrderBasketDomain f95271P0;

    /* renamed from: Q0 */
    public final boolean f95272Q0;

    /* renamed from: R0 */
    public final boolean f95273R0;
    @C12580l

    /* renamed from: X */
    public final Double f95274X;
    @C12580l

    /* renamed from: Y */
    public final Double f95275Y;
    @C12580l

    /* renamed from: Z */
    public final Double f95276Z;
    @C12579k

    /* renamed from: a */
    public final String f95277a;
    @C12579k

    /* renamed from: b */
    public final String f95278b;
    @C12580l

    /* renamed from: c */
    public final Date f95279c;
    @C12580l

    /* renamed from: d */
    public final Date f95280d;
    @C12580l

    /* renamed from: e */
    public final Address f95281e;
    @C12580l

    /* renamed from: f */
    public final String f95282f;
    @C12579k

    /* renamed from: g */
    public final OrderServiceType f95283g;
    @C12580l

    /* renamed from: v */
    public final String f95284v;
    @C12580l

    /* renamed from: w */
    public final String f95285w;
    @C12580l

    /* renamed from: x */
    public final String f95286x;
    @C12580l

    /* renamed from: y */
    public final String f95287y;
    @C12580l

    /* renamed from: z */
    public final String f95288z;

    /* renamed from: com.carrefour.fid.android.domain.models.OrderConfirmationDomain$a */
    public static final class C37923a implements Parcelable.Creator<OrderConfirmationDomain> {
        @C12579k
        /* renamed from: a */
        public final OrderConfirmationDomain createFromParcel(@C12579k Parcel parcel) {
            Double d;
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            Address address = (Address) parcel2.readParcelable(OrderConfirmationDomain.class.getClassLoader());
            String readString3 = parcel.readString();
            OrderServiceType valueOf = OrderServiceType.valueOf(parcel.readString());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString9 = parcel.readString();
            Double valueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf8 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf9 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf10 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                d = valueOf2;
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                d = valueOf2;
                int i = 0;
                while (i != readInt2) {
                    arrayList2.add(OrderOffer.CREATOR.createFromParcel(parcel2));
                    i++;
                    readInt2 = readInt2;
                }
                arrayList = arrayList2;
            }
            return new OrderConfirmationDomain(readString, readString2, date, date2, address, readString3, valueOf, readString4, readString5, readString6, readString7, readString8, d, valueOf3, valueOf4, valueOf5, readString9, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, readInt, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, OrderBasketDomain.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final OrderConfirmationDomain[] newArray(int i) {
            return new OrderConfirmationDomain[i];
        }
    }

    public OrderConfirmationDomain(@C12579k String str, @C12579k String str2, @C12580l Date date, @C12580l Date date2, @C12580l Address address, @C12580l String str3, @C12579k OrderServiceType orderServiceType, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l Double d, @C12580l Double d2, @C12580l Double d3, @C12580l Double d4, @C12580l String str9, @C12580l Double d5, @C12580l Double d6, @C12580l Double d7, @C12580l Double d8, @C12580l Double d9, int i, @C12580l List<OrderOffer> list, @C12580l Integer num, boolean z, @C12579k OrderBasketDomain orderBasketDomain, boolean z2, boolean z3) {
        OrderBasketDomain orderBasketDomain2 = orderBasketDomain;
        Intrinsics.checkNotNullParameter(str, "orderId");
        Intrinsics.checkNotNullParameter(str2, "orderNumber");
        Intrinsics.checkNotNullParameter(orderServiceType, "providedServiceType");
        Intrinsics.checkNotNullParameter(orderBasketDomain2, "basket");
        this.f95277a = str;
        this.f95278b = str2;
        this.f95279c = date;
        this.f95280d = date2;
        this.f95281e = address;
        this.f95282f = str3;
        this.f95283g = orderServiceType;
        this.f95284v = str4;
        this.f95285w = str5;
        this.f95286x = str6;
        this.f95287y = str7;
        this.f95288z = str8;
        this.f95274X = d;
        this.f95275Y = d2;
        this.f95276Z = d3;
        this.f95260E0 = d4;
        this.f95261F0 = str9;
        this.f95262G0 = d5;
        this.f95263H0 = d6;
        this.f95264I0 = d7;
        this.f95265J0 = d8;
        this.f95266K0 = d9;
        this.f95267L0 = i;
        this.f95268M0 = list;
        this.f95269N0 = num;
        this.f95270O0 = z;
        this.f95271P0 = orderBasketDomain2;
        this.f95272Q0 = z2;
        this.f95273R0 = z3;
    }

    /* renamed from: A */
    public final boolean mo116113A() {
        return this.f95273R0;
    }

    /* renamed from: B */
    public final boolean mo116114B() {
        return this.f95272Q0;
    }

    /* renamed from: C */
    public final boolean mo116115C() {
        return this.f95270O0;
    }

    /* renamed from: D */
    public final void mo116116D(@C12580l Double d) {
        this.f95263H0 = d;
    }

    @C12579k
    /* renamed from: a */
    public final OrderBasketDomain mo116117a() {
        return this.f95271P0;
    }

    @C12580l
    /* renamed from: b */
    public final Address mo116118b() {
        return this.f95281e;
    }

    @C12580l
    /* renamed from: c */
    public final List<OrderOffer> mo116119c() {
        return this.f95268M0;
    }

    /* renamed from: d */
    public final int mo116120d() {
        return this.f95267L0;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final Integer mo116122e() {
        return this.f95269N0;
    }

    @C12579k
    /* renamed from: f */
    public final String mo116123f() {
        return this.f95277a;
    }

    @C12579k
    /* renamed from: g */
    public final String mo116124g() {
        return this.f95278b;
    }

    @C12580l
    /* renamed from: h */
    public final String mo116125h() {
        return this.f95287y;
    }

    @C12580l
    /* renamed from: i */
    public final Double mo116126i() {
        return this.f95266K0;
    }

    @C12580l
    /* renamed from: j */
    public final Double mo116127j() {
        return this.f95262G0;
    }

    @C12580l
    /* renamed from: k */
    public final Double mo116128k() {
        return this.f95265J0;
    }

    @C12580l
    /* renamed from: l */
    public final Double mo116129l() {
        return this.f95264I0;
    }

    @C12580l
    /* renamed from: m */
    public final Double mo116130m() {
        return this.f95263H0;
    }

    @C12580l
    /* renamed from: n */
    public final Double mo116131n() {
        return this.f95260E0;
    }

    @C12580l
    /* renamed from: o */
    public final String mo116132o() {
        return this.f95261F0;
    }

    @C12580l
    /* renamed from: p */
    public final String mo116133p() {
        return this.f95282f;
    }

    @C12580l
    /* renamed from: q */
    public final String mo116134q() {
        return this.f95288z;
    }

    @C12580l
    /* renamed from: r */
    public final Double mo116135r() {
        return this.f95274X;
    }

    @C12579k
    /* renamed from: s */
    public final OrderServiceType mo116136s() {
        return this.f95283g;
    }

    @C12580l
    /* renamed from: t */
    public final Date mo116137t() {
        return this.f95280d;
    }

    @C12580l
    /* renamed from: u */
    public final Date mo116138u() {
        return this.f95279c;
    }

    @C12580l
    /* renamed from: v */
    public final String mo116139v() {
        return this.f95286x;
    }

    @C12580l
    /* renamed from: w */
    public final String mo116140w() {
        return this.f95285w;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95277a);
        parcel.writeString(this.f95278b);
        parcel.writeSerializable(this.f95279c);
        parcel.writeSerializable(this.f95280d);
        parcel.writeParcelable(this.f95281e, i);
        parcel.writeString(this.f95282f);
        parcel.writeString(this.f95283g.name());
        parcel.writeString(this.f95284v);
        parcel.writeString(this.f95285w);
        parcel.writeString(this.f95286x);
        parcel.writeString(this.f95287y);
        parcel.writeString(this.f95288z);
        Double d = this.f95274X;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f95275Y;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.f95276Z;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        Double d4 = this.f95260E0;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        parcel.writeString(this.f95261F0);
        Double d5 = this.f95262G0;
        if (d5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d5.doubleValue());
        }
        Double d6 = this.f95263H0;
        if (d6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d6.doubleValue());
        }
        Double d7 = this.f95264I0;
        if (d7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d7.doubleValue());
        }
        Double d8 = this.f95265J0;
        if (d8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d8.doubleValue());
        }
        Double d9 = this.f95266K0;
        if (d9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d9.doubleValue());
        }
        parcel.writeInt(this.f95267L0);
        List<OrderOffer> list = this.f95268M0;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (OrderOffer writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        Integer num = this.f95269N0;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.f95270O0 ? 1 : 0);
        this.f95271P0.writeToParcel(parcel, i);
        parcel.writeInt(this.f95272Q0 ? 1 : 0);
        parcel.writeInt(this.f95273R0 ? 1 : 0);
    }

    @C12580l
    /* renamed from: x */
    public final String mo116142x() {
        return this.f95284v;
    }

    @C12580l
    /* renamed from: y */
    public final Double mo116143y() {
        return this.f95275Y;
    }

    @C12580l
    /* renamed from: z */
    public final Double mo116144z() {
        return this.f95276Z;
    }
}
