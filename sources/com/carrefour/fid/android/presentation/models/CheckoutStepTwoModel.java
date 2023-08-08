package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J<\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0007R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u0007¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/CheckoutStepTwoModel;", "Landroid/os/Parcelable;", "", "a", "b", "", "c", "()Ljava/lang/Double;", "d", "facility", "storeId", "loyaltyTotalAmount", "discountTotalAmount", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/carrefour/fid/android/presentation/models/CheckoutStepTwoModel;", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "j", "Ljava/lang/Double;", "i", "g", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CheckoutStepTwoModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CheckoutStepTwoModel> CREATOR = new C38416a();

    /* renamed from: e */
    public static final int f97280e = 0;
    @C12579k

    /* renamed from: a */
    public final String f97281a;
    @C12579k

    /* renamed from: b */
    public final String f97282b;
    @C12580l

    /* renamed from: c */
    public final Double f97283c;
    @C12580l

    /* renamed from: d */
    public final Double f97284d;

    /* renamed from: com.carrefour.fid.android.presentation.models.CheckoutStepTwoModel$a */
    public static final class C38416a implements Parcelable.Creator<CheckoutStepTwoModel> {
        @C12579k
        /* renamed from: a */
        public final CheckoutStepTwoModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Double d = null;
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                d = Double.valueOf(parcel.readDouble());
            }
            return new CheckoutStepTwoModel(readString, readString2, valueOf, d);
        }

        @C12579k
        /* renamed from: b */
        public final CheckoutStepTwoModel[] newArray(int i) {
            return new CheckoutStepTwoModel[i];
        }
    }

    public CheckoutStepTwoModel(@C12579k String str, @C12579k String str2, @C12580l Double d, @C12580l Double d2) {
        Intrinsics.checkNotNullParameter(str, "facility");
        Intrinsics.checkNotNullParameter(str2, "storeId");
        this.f97281a = str;
        this.f97282b = str2;
        this.f97283c = d;
        this.f97284d = d2;
    }

    /* renamed from: f */
    public static /* synthetic */ CheckoutStepTwoModel m158992f(CheckoutStepTwoModel checkoutStepTwoModel, String str, String str2, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutStepTwoModel.f97281a;
        }
        if ((i & 2) != 0) {
            str2 = checkoutStepTwoModel.f97282b;
        }
        if ((i & 4) != 0) {
            d = checkoutStepTwoModel.f97283c;
        }
        if ((i & 8) != 0) {
            d2 = checkoutStepTwoModel.f97284d;
        }
        return checkoutStepTwoModel.mo121343e(str, str2, d, d2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo121338a() {
        return this.f97281a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo121339b() {
        return this.f97282b;
    }

    @C12580l
    /* renamed from: c */
    public final Double mo121340c() {
        return this.f97283c;
    }

    @C12580l
    /* renamed from: d */
    public final Double mo121341d() {
        return this.f97284d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final CheckoutStepTwoModel mo121343e(@C12579k String str, @C12579k String str2, @C12580l Double d, @C12580l Double d2) {
        Intrinsics.checkNotNullParameter(str, "facility");
        Intrinsics.checkNotNullParameter(str2, "storeId");
        return new CheckoutStepTwoModel(str, str2, d, d2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutStepTwoModel)) {
            return false;
        }
        CheckoutStepTwoModel checkoutStepTwoModel = (CheckoutStepTwoModel) obj;
        return Intrinsics.areEqual((Object) this.f97281a, (Object) checkoutStepTwoModel.f97281a) && Intrinsics.areEqual((Object) this.f97282b, (Object) checkoutStepTwoModel.f97282b) && Intrinsics.areEqual((Object) this.f97283c, (Object) checkoutStepTwoModel.f97283c) && Intrinsics.areEqual((Object) this.f97284d, (Object) checkoutStepTwoModel.f97284d);
    }

    @C12580l
    /* renamed from: g */
    public final Double mo121345g() {
        return this.f97284d;
    }

    @C12579k
    /* renamed from: h */
    public final String mo121346h() {
        return this.f97281a;
    }

    public int hashCode() {
        int hashCode = ((this.f97281a.hashCode() * 31) + this.f97282b.hashCode()) * 31;
        Double d = this.f97283c;
        int i = 0;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f97284d;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12580l
    /* renamed from: i */
    public final Double mo121348i() {
        return this.f97283c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo121349j() {
        return this.f97282b;
    }

    @C12579k
    public String toString() {
        String str = this.f97281a;
        String str2 = this.f97282b;
        Double d = this.f97283c;
        Double d2 = this.f97284d;
        return "CheckoutStepTwoModel(facility=" + str + ", storeId=" + str2 + ", loyaltyTotalAmount=" + d + ", discountTotalAmount=" + d2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f97281a);
        parcel.writeString(this.f97282b);
        Double d = this.f97283c;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f97284d;
        if (d2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d2.doubleValue());
    }
}
