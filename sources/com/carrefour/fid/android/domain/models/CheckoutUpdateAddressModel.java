package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.AddressSelectionType;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/CheckoutUpdateAddressModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/core/type/AddressSelectionType;", "a", "Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "b", "Lcom/carrefour/fid/android/domain/models/PaymentSettingsModel;", "c", "addressSelectionType", "updatedProfile", "paymentSettings", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/core/type/AddressSelectionType;", "f", "()Lcom/carrefour/fid/android/core/type/AddressSelectionType;", "Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "h", "()Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "Lcom/carrefour/fid/android/domain/models/PaymentSettingsModel;", "g", "()Lcom/carrefour/fid/android/domain/models/PaymentSettingsModel;", "<init>", "(Lcom/carrefour/fid/android/core/type/AddressSelectionType;Lcom/carrefour/fid/android/domain/models/account/AccountInfo;Lcom/carrefour/fid/android/domain/models/PaymentSettingsModel;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CheckoutUpdateAddressModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CheckoutUpdateAddressModel> CREATOR = new C37906a();

    /* renamed from: d */
    public static final int f95104d = 8;
    @C12579k

    /* renamed from: a */
    public final AddressSelectionType f95105a;
    @C12580l

    /* renamed from: b */
    public final AccountInfo f95106b;
    @C12579k

    /* renamed from: c */
    public final PaymentSettingsModel f95107c;

    /* renamed from: com.carrefour.fid.android.domain.models.CheckoutUpdateAddressModel$a */
    public static final class C37906a implements Parcelable.Creator<CheckoutUpdateAddressModel> {
        @C12579k
        /* renamed from: a */
        public final CheckoutUpdateAddressModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Class<CheckoutUpdateAddressModel> cls = CheckoutUpdateAddressModel.class;
            return new CheckoutUpdateAddressModel((AddressSelectionType) parcel.readParcelable(cls.getClassLoader()), (AccountInfo) parcel.readParcelable(cls.getClassLoader()), PaymentSettingsModel.CREATOR.createFromParcel(parcel));
        }

        @C12579k
        /* renamed from: b */
        public final CheckoutUpdateAddressModel[] newArray(int i) {
            return new CheckoutUpdateAddressModel[i];
        }
    }

    public CheckoutUpdateAddressModel(@C12579k AddressSelectionType addressSelectionType, @C12580l AccountInfo accountInfo, @C12579k PaymentSettingsModel paymentSettingsModel) {
        Intrinsics.checkNotNullParameter(addressSelectionType, "addressSelectionType");
        Intrinsics.checkNotNullParameter(paymentSettingsModel, "paymentSettings");
        this.f95105a = addressSelectionType;
        this.f95106b = accountInfo;
        this.f95107c = paymentSettingsModel;
    }

    /* renamed from: e */
    public static /* synthetic */ CheckoutUpdateAddressModel m155368e(CheckoutUpdateAddressModel checkoutUpdateAddressModel, AddressSelectionType addressSelectionType, AccountInfo accountInfo, PaymentSettingsModel paymentSettingsModel, int i, Object obj) {
        if ((i & 1) != 0) {
            addressSelectionType = checkoutUpdateAddressModel.f95105a;
        }
        if ((i & 2) != 0) {
            accountInfo = checkoutUpdateAddressModel.f95106b;
        }
        if ((i & 4) != 0) {
            paymentSettingsModel = checkoutUpdateAddressModel.f95107c;
        }
        return checkoutUpdateAddressModel.mo115710d(addressSelectionType, accountInfo, paymentSettingsModel);
    }

    @C12579k
    /* renamed from: a */
    public final AddressSelectionType mo115707a() {
        return this.f95105a;
    }

    @C12580l
    /* renamed from: b */
    public final AccountInfo mo115708b() {
        return this.f95106b;
    }

    @C12579k
    /* renamed from: c */
    public final PaymentSettingsModel mo115709c() {
        return this.f95107c;
    }

    @C12579k
    /* renamed from: d */
    public final CheckoutUpdateAddressModel mo115710d(@C12579k AddressSelectionType addressSelectionType, @C12580l AccountInfo accountInfo, @C12579k PaymentSettingsModel paymentSettingsModel) {
        Intrinsics.checkNotNullParameter(addressSelectionType, "addressSelectionType");
        Intrinsics.checkNotNullParameter(paymentSettingsModel, "paymentSettings");
        return new CheckoutUpdateAddressModel(addressSelectionType, accountInfo, paymentSettingsModel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutUpdateAddressModel)) {
            return false;
        }
        CheckoutUpdateAddressModel checkoutUpdateAddressModel = (CheckoutUpdateAddressModel) obj;
        return Intrinsics.areEqual((Object) this.f95105a, (Object) checkoutUpdateAddressModel.f95105a) && Intrinsics.areEqual((Object) this.f95106b, (Object) checkoutUpdateAddressModel.f95106b) && Intrinsics.areEqual((Object) this.f95107c, (Object) checkoutUpdateAddressModel.f95107c);
    }

    @C12579k
    /* renamed from: f */
    public final AddressSelectionType mo115713f() {
        return this.f95105a;
    }

    @C12579k
    /* renamed from: g */
    public final PaymentSettingsModel mo115714g() {
        return this.f95107c;
    }

    @C12580l
    /* renamed from: h */
    public final AccountInfo mo115715h() {
        return this.f95106b;
    }

    public int hashCode() {
        int hashCode = this.f95105a.hashCode() * 31;
        AccountInfo accountInfo = this.f95106b;
        return ((hashCode + (accountInfo == null ? 0 : accountInfo.hashCode())) * 31) + this.f95107c.hashCode();
    }

    @C12579k
    public String toString() {
        AddressSelectionType addressSelectionType = this.f95105a;
        AccountInfo accountInfo = this.f95106b;
        PaymentSettingsModel paymentSettingsModel = this.f95107c;
        return "CheckoutUpdateAddressModel(addressSelectionType=" + addressSelectionType + ", updatedProfile=" + accountInfo + ", paymentSettings=" + paymentSettingsModel + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.f95105a, i);
        parcel.writeParcelable(this.f95106b, i);
        this.f95107c.writeToParcel(parcel, i);
    }
}
