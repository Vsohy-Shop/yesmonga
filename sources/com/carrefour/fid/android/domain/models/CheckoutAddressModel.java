package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J+\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0013\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rHÖ\u0001R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/CheckoutAddressModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "a", "b", "Lcom/carrefour/fid/android/domain/models/PaymentSettingsModel;", "c", "localProfile", "remoteProfile", "paymentSettings", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "f", "()Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "h", "Lcom/carrefour/fid/android/domain/models/PaymentSettingsModel;", "g", "()Lcom/carrefour/fid/android/domain/models/PaymentSettingsModel;", "<init>", "(Lcom/carrefour/fid/android/domain/models/account/AccountInfo;Lcom/carrefour/fid/android/domain/models/account/AccountInfo;Lcom/carrefour/fid/android/domain/models/PaymentSettingsModel;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CheckoutAddressModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CheckoutAddressModel> CREATOR = new C37905a();

    /* renamed from: d */
    public static final int f95100d = 8;
    @C12580l

    /* renamed from: a */
    public final AccountInfo f95101a;
    @C12580l

    /* renamed from: b */
    public final AccountInfo f95102b;
    @C12579k

    /* renamed from: c */
    public final PaymentSettingsModel f95103c;

    /* renamed from: com.carrefour.fid.android.domain.models.CheckoutAddressModel$a */
    public static final class C37905a implements Parcelable.Creator<CheckoutAddressModel> {
        @C12579k
        /* renamed from: a */
        public final CheckoutAddressModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Class<CheckoutAddressModel> cls = CheckoutAddressModel.class;
            return new CheckoutAddressModel((AccountInfo) parcel.readParcelable(cls.getClassLoader()), (AccountInfo) parcel.readParcelable(cls.getClassLoader()), PaymentSettingsModel.CREATOR.createFromParcel(parcel));
        }

        @C12579k
        /* renamed from: b */
        public final CheckoutAddressModel[] newArray(int i) {
            return new CheckoutAddressModel[i];
        }
    }

    public CheckoutAddressModel(@C12580l AccountInfo accountInfo, @C12580l AccountInfo accountInfo2, @C12579k PaymentSettingsModel paymentSettingsModel) {
        Intrinsics.checkNotNullParameter(paymentSettingsModel, "paymentSettings");
        this.f95101a = accountInfo;
        this.f95102b = accountInfo2;
        this.f95103c = paymentSettingsModel;
    }

    /* renamed from: e */
    public static /* synthetic */ CheckoutAddressModel m155358e(CheckoutAddressModel checkoutAddressModel, AccountInfo accountInfo, AccountInfo accountInfo2, PaymentSettingsModel paymentSettingsModel, int i, Object obj) {
        if ((i & 1) != 0) {
            accountInfo = checkoutAddressModel.f95101a;
        }
        if ((i & 2) != 0) {
            accountInfo2 = checkoutAddressModel.f95102b;
        }
        if ((i & 4) != 0) {
            paymentSettingsModel = checkoutAddressModel.f95103c;
        }
        return checkoutAddressModel.mo115694d(accountInfo, accountInfo2, paymentSettingsModel);
    }

    @C12580l
    /* renamed from: a */
    public final AccountInfo mo115691a() {
        return this.f95101a;
    }

    @C12580l
    /* renamed from: b */
    public final AccountInfo mo115692b() {
        return this.f95102b;
    }

    @C12579k
    /* renamed from: c */
    public final PaymentSettingsModel mo115693c() {
        return this.f95103c;
    }

    @C12579k
    /* renamed from: d */
    public final CheckoutAddressModel mo115694d(@C12580l AccountInfo accountInfo, @C12580l AccountInfo accountInfo2, @C12579k PaymentSettingsModel paymentSettingsModel) {
        Intrinsics.checkNotNullParameter(paymentSettingsModel, "paymentSettings");
        return new CheckoutAddressModel(accountInfo, accountInfo2, paymentSettingsModel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutAddressModel)) {
            return false;
        }
        CheckoutAddressModel checkoutAddressModel = (CheckoutAddressModel) obj;
        return Intrinsics.areEqual((Object) this.f95101a, (Object) checkoutAddressModel.f95101a) && Intrinsics.areEqual((Object) this.f95102b, (Object) checkoutAddressModel.f95102b) && Intrinsics.areEqual((Object) this.f95103c, (Object) checkoutAddressModel.f95103c);
    }

    @C12580l
    /* renamed from: f */
    public final AccountInfo mo115697f() {
        return this.f95101a;
    }

    @C12579k
    /* renamed from: g */
    public final PaymentSettingsModel mo115698g() {
        return this.f95103c;
    }

    @C12580l
    /* renamed from: h */
    public final AccountInfo mo115699h() {
        return this.f95102b;
    }

    public int hashCode() {
        AccountInfo accountInfo = this.f95101a;
        int i = 0;
        int hashCode = (accountInfo == null ? 0 : accountInfo.hashCode()) * 31;
        AccountInfo accountInfo2 = this.f95102b;
        if (accountInfo2 != null) {
            i = accountInfo2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f95103c.hashCode();
    }

    @C12579k
    public String toString() {
        AccountInfo accountInfo = this.f95101a;
        AccountInfo accountInfo2 = this.f95102b;
        PaymentSettingsModel paymentSettingsModel = this.f95103c;
        return "CheckoutAddressModel(localProfile=" + accountInfo + ", remoteProfile=" + accountInfo2 + ", paymentSettings=" + paymentSettingsModel + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.f95101a, i);
        parcel.writeParcelable(this.f95102b, i);
        this.f95103c.writeToParcel(parcel, i);
    }
}
