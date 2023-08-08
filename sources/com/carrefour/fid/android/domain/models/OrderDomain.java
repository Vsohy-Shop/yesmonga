package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\n\u0010\u0019R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrderDomain;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "orderId", "Lcom/carrefour/fid/android/domain/models/PaymentMethodDomain;", "b", "Lcom/carrefour/fid/android/domain/models/PaymentMethodDomain;", "d", "()Lcom/carrefour/fid/android/domain/models/PaymentMethodDomain;", "paymentMethod", "e", "storeName", "Lcom/carrefour/fid/android/domain/models/OrderBasketDomain;", "Lcom/carrefour/fid/android/domain/models/OrderBasketDomain;", "()Lcom/carrefour/fid/android/domain/models/OrderBasketDomain;", "basket", "orderCount", "<init>", "(Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/PaymentMethodDomain;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/OrderBasketDomain;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrderDomain> CREATOR = new C37925a();

    /* renamed from: f */
    public static final int f95310f = 8;
    @C12579k

    /* renamed from: a */
    public final String f95311a;
    @C12579k

    /* renamed from: b */
    public final PaymentMethodDomain f95312b;
    @C12580l

    /* renamed from: c */
    public final String f95313c;
    @C12579k

    /* renamed from: d */
    public final OrderBasketDomain f95314d;
    @C12580l

    /* renamed from: e */
    public final String f95315e;

    /* renamed from: com.carrefour.fid.android.domain.models.OrderDomain$a */
    public static final class C37925a implements Parcelable.Creator<OrderDomain> {
        @C12579k
        /* renamed from: a */
        public final OrderDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderDomain(parcel.readString(), PaymentMethodDomain.CREATOR.createFromParcel(parcel), parcel.readString(), OrderBasketDomain.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final OrderDomain[] newArray(int i) {
            return new OrderDomain[i];
        }
    }

    public OrderDomain(@C12579k String str, @C12579k PaymentMethodDomain paymentMethodDomain, @C12580l String str2, @C12579k OrderBasketDomain orderBasketDomain, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "orderId");
        Intrinsics.checkNotNullParameter(paymentMethodDomain, "paymentMethod");
        Intrinsics.checkNotNullParameter(orderBasketDomain, "basket");
        this.f95311a = str;
        this.f95312b = paymentMethodDomain;
        this.f95313c = str2;
        this.f95314d = orderBasketDomain;
        this.f95315e = str3;
    }

    @C12579k
    /* renamed from: a */
    public final OrderBasketDomain mo116175a() {
        return this.f95314d;
    }

    @C12580l
    /* renamed from: b */
    public final String mo116176b() {
        return this.f95315e;
    }

    @C12579k
    /* renamed from: c */
    public final String mo116177c() {
        return this.f95311a;
    }

    @C12579k
    /* renamed from: d */
    public final PaymentMethodDomain mo116178d() {
        return this.f95312b;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final String mo116180e() {
        return this.f95313c;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95311a);
        this.f95312b.writeToParcel(parcel, i);
        parcel.writeString(this.f95313c);
        this.f95314d.writeToParcel(parcel, i);
        parcel.writeString(this.f95315e);
    }
}
