package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.BasketType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\u0006\u0010%\u001a\u00020\t\u0012\b\u0010(\u001a\u0004\u0018\u00010\t\u0012\b\u0010+\u001a\u0004\u0018\u00010\t\u0012\b\u0010.\u001a\u0004\u0018\u00010\t\u0012\b\u00100\u001a\u0004\u0018\u00010\t\u0012\b\u00103\u001a\u0004\u0018\u00010\u0012\u0012\b\u00105\u001a\u0004\u0018\u00010\u0012\u0012\b\u00107\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b8\u00109J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b\n\u0010 R\u0017\u0010%\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u000f\u0010$R\u0019\u0010(\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\rR\u0019\u0010+\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010\u000b\u001a\u0004\b*\u0010\rR\u0019\u0010.\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\rR\u0019\u00100\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b/\u0010\u000b\u001a\u0004\b\"\u0010\rR\u0019\u00103\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b1\u0010\u0014\u001a\u0004\b2\u0010\u0016R\u0019\u00105\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b4\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u00107\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b6\u0010\u000b\u001a\u0004\b&\u0010\r¨\u0006:"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrderBasketDomain;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/Double;", "e", "()Ljava/lang/Double;", "basketTotalAmount", "b", "m", "serviceAmount", "", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "basketServiceType", "Lcom/carrefour/fid/android/core/type/BasketType;", "Lcom/carrefour/fid/android/core/type/BasketType;", "h", "()Lcom/carrefour/fid/android/core/type/BasketType;", "basketType", "", "Lcom/carrefour/fid/android/domain/models/BasketOffer;", "Ljava/util/List;", "()Ljava/util/List;", "basketItems", "f", "D", "()D", "basketProductCount", "g", "l", "productsTotalAmount", "v", "j", "feesPreparation", "w", "i", "bundleTotalDiscountAmount", "x", "basketTotalAmountMin", "y", "k", "pickingOrDeliveryStartDate", "z", "basketPromoCode", "X", "basketTotalDiscountAmount", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lcom/carrefour/fid/android/core/type/BasketType;Ljava/util/List;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderBasketDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrderBasketDomain> CREATOR = new C37922a();

    /* renamed from: Y */
    public static final int f95245Y = 8;
    @C12580l

    /* renamed from: X */
    public final Double f95246X;
    @C12580l

    /* renamed from: a */
    public final Double f95247a;
    @C12580l

    /* renamed from: b */
    public final Double f95248b;
    @C12580l

    /* renamed from: c */
    public final String f95249c;
    @C12580l

    /* renamed from: d */
    public final BasketType f95250d;
    @C12580l

    /* renamed from: e */
    public final List<BasketOffer> f95251e;

    /* renamed from: f */
    public final double f95252f;
    @C12580l

    /* renamed from: g */
    public final Double f95253g;
    @C12580l

    /* renamed from: v */
    public final Double f95254v;
    @C12580l

    /* renamed from: w */
    public final Double f95255w;
    @C12580l

    /* renamed from: x */
    public final Double f95256x;
    @C12580l

    /* renamed from: y */
    public final String f95257y;
    @C12580l

    /* renamed from: z */
    public final String f95258z;

    /* renamed from: com.carrefour.fid.android.domain.models.OrderBasketDomain$a */
    public static final class C37922a implements Parcelable.Creator<OrderBasketDomain> {
        @C12579k
        /* renamed from: a */
        public final OrderBasketDomain createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            Double d = null;
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString = parcel.readString();
            BasketType valueOf3 = parcel.readInt() == 0 ? null : BasketType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(BasketOffer.CREATOR.createFromParcel(parcel2));
                }
                arrayList = arrayList2;
            }
            double readDouble = parcel.readDouble();
            Double valueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                d = Double.valueOf(parcel.readDouble());
            }
            return new OrderBasketDomain(valueOf, valueOf2, readString, valueOf3, arrayList, readDouble, valueOf4, valueOf5, valueOf6, valueOf7, readString2, readString3, d);
        }

        @C12579k
        /* renamed from: b */
        public final OrderBasketDomain[] newArray(int i) {
            return new OrderBasketDomain[i];
        }
    }

    public OrderBasketDomain(@C12580l Double d, @C12580l Double d2, @C12580l String str, @C12580l BasketType basketType, @C12580l List<BasketOffer> list, double d3, @C12580l Double d4, @C12580l Double d5, @C12580l Double d6, @C12580l Double d7, @C12580l String str2, @C12580l String str3, @C12580l Double d8) {
        this.f95247a = d;
        this.f95248b = d2;
        this.f95249c = str;
        this.f95250d = basketType;
        this.f95251e = list;
        this.f95252f = d3;
        this.f95253g = d4;
        this.f95254v = d5;
        this.f95255w = d6;
        this.f95256x = d7;
        this.f95257y = str2;
        this.f95258z = str3;
        this.f95246X = d8;
    }

    @C12580l
    /* renamed from: a */
    public final List<BasketOffer> mo116094a() {
        return this.f95251e;
    }

    /* renamed from: b */
    public final double mo116095b() {
        return this.f95252f;
    }

    @C12580l
    /* renamed from: c */
    public final String mo116096c() {
        return this.f95258z;
    }

    @C12580l
    /* renamed from: d */
    public final String mo116097d() {
        return this.f95249c;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final Double mo116099e() {
        return this.f95247a;
    }

    @C12580l
    /* renamed from: f */
    public final Double mo116100f() {
        return this.f95256x;
    }

    @C12580l
    /* renamed from: g */
    public final Double mo116101g() {
        return this.f95246X;
    }

    @C12580l
    /* renamed from: h */
    public final BasketType mo116102h() {
        return this.f95250d;
    }

    @C12580l
    /* renamed from: i */
    public final Double mo116103i() {
        return this.f95255w;
    }

    @C12580l
    /* renamed from: j */
    public final Double mo116104j() {
        return this.f95254v;
    }

    @C12580l
    /* renamed from: k */
    public final String mo116105k() {
        return this.f95257y;
    }

    @C12580l
    /* renamed from: l */
    public final Double mo116106l() {
        return this.f95253g;
    }

    @C12580l
    /* renamed from: m */
    public final Double mo116107m() {
        return this.f95248b;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Double d = this.f95247a;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f95248b;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeString(this.f95249c);
        BasketType basketType = this.f95250d;
        if (basketType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(basketType.name());
        }
        List<BasketOffer> list = this.f95251e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (BasketOffer writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeDouble(this.f95252f);
        Double d3 = this.f95253g;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        Double d4 = this.f95254v;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        Double d5 = this.f95255w;
        if (d5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d5.doubleValue());
        }
        Double d6 = this.f95256x;
        if (d6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d6.doubleValue());
        }
        parcel.writeString(this.f95257y);
        parcel.writeString(this.f95258z);
        Double d7 = this.f95246X;
        if (d7 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d7.doubleValue());
    }
}
