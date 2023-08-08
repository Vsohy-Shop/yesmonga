package com.carrefour.fid.android.account.presentation.p018ui.address.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.account.Address;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/address/model/AccountAddressModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/account/presentation/ui/address/model/AccountAddressParam;", "a", "Lcom/carrefour/fid/android/domain/models/account/Address;", "b", "param", "userAddress", "c", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/account/presentation/ui/address/model/AccountAddressParam;", "e", "()Lcom/carrefour/fid/android/account/presentation/ui/address/model/AccountAddressParam;", "Lcom/carrefour/fid/android/domain/models/account/Address;", "f", "()Lcom/carrefour/fid/android/domain/models/account/Address;", "<init>", "(Lcom/carrefour/fid/android/account/presentation/ui/address/model/AccountAddressParam;Lcom/carrefour/fid/android/domain/models/account/Address;)V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.model.AccountAddressModel */
public final class AccountAddressModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<AccountAddressModel> CREATOR = new C13473a();

    /* renamed from: c */
    public static final int f32933c = 8;
    @C12580l

    /* renamed from: a */
    public final AccountAddressParam f32934a;
    @C12580l

    /* renamed from: b */
    public final Address f32935b;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.address.model.AccountAddressModel$a */
    public static final class C13473a implements Parcelable.Creator<AccountAddressModel> {
        @C12579k
        /* renamed from: a */
        public final AccountAddressModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountAddressModel(parcel.readInt() == 0 ? null : AccountAddressParam.CREATOR.createFromParcel(parcel), (Address) parcel.readParcelable(AccountAddressModel.class.getClassLoader()));
        }

        @C12579k
        /* renamed from: b */
        public final AccountAddressModel[] newArray(int i) {
            return new AccountAddressModel[i];
        }
    }

    public AccountAddressModel(@C12580l AccountAddressParam accountAddressParam, @C12580l Address address) {
        this.f32934a = accountAddressParam;
        this.f32935b = address;
    }

    /* renamed from: d */
    public static /* synthetic */ AccountAddressModel m57943d(AccountAddressModel accountAddressModel, AccountAddressParam accountAddressParam, Address address, int i, Object obj) {
        if ((i & 1) != 0) {
            accountAddressParam = accountAddressModel.f32934a;
        }
        if ((i & 2) != 0) {
            address = accountAddressModel.f32935b;
        }
        return accountAddressModel.mo31966c(accountAddressParam, address);
    }

    @C12580l
    /* renamed from: a */
    public final AccountAddressParam mo31964a() {
        return this.f32934a;
    }

    @C12580l
    /* renamed from: b */
    public final Address mo31965b() {
        return this.f32935b;
    }

    @C12579k
    /* renamed from: c */
    public final AccountAddressModel mo31966c(@C12580l AccountAddressParam accountAddressParam, @C12580l Address address) {
        return new AccountAddressModel(accountAddressParam, address);
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final AccountAddressParam mo31968e() {
        return this.f32934a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAddressModel)) {
            return false;
        }
        AccountAddressModel accountAddressModel = (AccountAddressModel) obj;
        return Intrinsics.areEqual((Object) this.f32934a, (Object) accountAddressModel.f32934a) && Intrinsics.areEqual((Object) this.f32935b, (Object) accountAddressModel.f32935b);
    }

    @C12580l
    /* renamed from: f */
    public final Address mo31970f() {
        return this.f32935b;
    }

    public int hashCode() {
        AccountAddressParam accountAddressParam = this.f32934a;
        int i = 0;
        int hashCode = (accountAddressParam == null ? 0 : accountAddressParam.hashCode()) * 31;
        Address address = this.f32935b;
        if (address != null) {
            i = address.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        AccountAddressParam accountAddressParam = this.f32934a;
        Address address = this.f32935b;
        return "AccountAddressModel(param=" + accountAddressParam + ", userAddress=" + address + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        AccountAddressParam accountAddressParam = this.f32934a;
        if (accountAddressParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountAddressParam.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f32935b, i);
    }
}
