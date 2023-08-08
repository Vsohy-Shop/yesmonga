package com.carrefour.fid.android.presentation.p035ui.orders.offline.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J;\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/offline/model/OrderDetailParam;", "Landroid/os/Parcelable;", "", "a", "b", "c", "d", "e", "orderGln", "orderKey", "orderDate", "screenName", "downloadReceiptButtonName", "f", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "k", "i", "l", "h", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.OrderDetailParam */
public final class OrderDetailParam implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrderDetailParam> CREATOR = new C24794a();

    /* renamed from: f */
    public static final int f61489f = 0;
    @C12579k

    /* renamed from: a */
    public final String f61490a;
    @C12579k

    /* renamed from: b */
    public final String f61491b;
    @C12579k

    /* renamed from: c */
    public final String f61492c;
    @C12579k

    /* renamed from: d */
    public final String f61493d;
    @C12579k

    /* renamed from: e */
    public final String f61494e;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.OrderDetailParam$a */
    public static final class C24794a implements Parcelable.Creator<OrderDetailParam> {
        @C12579k
        /* renamed from: a */
        public final OrderDetailParam createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderDetailParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final OrderDetailParam[] newArray(int i) {
            return new OrderDetailParam[i];
        }
    }

    public OrderDetailParam(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "orderGln");
        Intrinsics.checkNotNullParameter(str2, "orderKey");
        Intrinsics.checkNotNullParameter(str3, "orderDate");
        Intrinsics.checkNotNullParameter(str4, "screenName");
        Intrinsics.checkNotNullParameter(str5, "downloadReceiptButtonName");
        this.f61490a = str;
        this.f61491b = str2;
        this.f61492c = str3;
        this.f61493d = str4;
        this.f61494e = str5;
    }

    /* renamed from: g */
    public static /* synthetic */ OrderDetailParam m108019g(OrderDetailParam orderDetailParam, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderDetailParam.f61490a;
        }
        if ((i & 2) != 0) {
            str2 = orderDetailParam.f61491b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = orderDetailParam.f61492c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = orderDetailParam.f61493d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = orderDetailParam.f61494e;
        }
        return orderDetailParam.mo72366f(str, str6, str7, str8, str5);
    }

    @C12579k
    /* renamed from: a */
    public final String mo72359a() {
        return this.f61490a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo72360b() {
        return this.f61491b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo72361c() {
        return this.f61492c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo72362d() {
        return this.f61493d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo72364e() {
        return this.f61494e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailParam)) {
            return false;
        }
        OrderDetailParam orderDetailParam = (OrderDetailParam) obj;
        return Intrinsics.areEqual((Object) this.f61490a, (Object) orderDetailParam.f61490a) && Intrinsics.areEqual((Object) this.f61491b, (Object) orderDetailParam.f61491b) && Intrinsics.areEqual((Object) this.f61492c, (Object) orderDetailParam.f61492c) && Intrinsics.areEqual((Object) this.f61493d, (Object) orderDetailParam.f61493d) && Intrinsics.areEqual((Object) this.f61494e, (Object) orderDetailParam.f61494e);
    }

    @C12579k
    /* renamed from: f */
    public final OrderDetailParam mo72366f(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "orderGln");
        Intrinsics.checkNotNullParameter(str2, "orderKey");
        Intrinsics.checkNotNullParameter(str3, "orderDate");
        Intrinsics.checkNotNullParameter(str4, "screenName");
        Intrinsics.checkNotNullParameter(str5, "downloadReceiptButtonName");
        return new OrderDetailParam(str, str2, str3, str4, str5);
    }

    @C12579k
    /* renamed from: h */
    public final String mo72367h() {
        return this.f61494e;
    }

    public int hashCode() {
        return (((((((this.f61490a.hashCode() * 31) + this.f61491b.hashCode()) * 31) + this.f61492c.hashCode()) * 31) + this.f61493d.hashCode()) * 31) + this.f61494e.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo72369i() {
        return this.f61492c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo72370j() {
        return this.f61490a;
    }

    @C12579k
    /* renamed from: k */
    public final String mo72371k() {
        return this.f61491b;
    }

    @C12579k
    /* renamed from: l */
    public final String mo72372l() {
        return this.f61493d;
    }

    @C12579k
    public String toString() {
        String str = this.f61490a;
        String str2 = this.f61491b;
        String str3 = this.f61492c;
        String str4 = this.f61493d;
        String str5 = this.f61494e;
        return "OrderDetailParam(orderGln=" + str + ", orderKey=" + str2 + ", orderDate=" + str3 + ", screenName=" + str4 + ", downloadReceiptButtonName=" + str5 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f61490a);
        parcel.writeString(this.f61491b);
        parcel.writeString(this.f61492c);
        parcel.writeString(this.f61493d);
        parcel.writeString(this.f61494e);
    }
}
