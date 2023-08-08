package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.entities.AccountAddressResponse;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/UpdateAddressBody;", "", "oneOrderId", "", "billingAddress", "Lcom/carrefour/fid/android/account/data/entities/AccountAddressResponse;", "deliveryAddress", "contactNumber", "(Ljava/lang/String;Lcom/carrefour/fid/android/account/data/entities/AccountAddressResponse;Lcom/carrefour/fid/android/account/data/entities/AccountAddressResponse;Ljava/lang/String;)V", "getBillingAddress", "()Lcom/carrefour/fid/android/account/data/entities/AccountAddressResponse;", "getContactNumber", "()Ljava/lang/String;", "getDeliveryAddress", "getOneOrderId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class UpdateAddressBody {
    public static final int $stable;
    @C33608c("billing_address")
    @C12580l
    private final AccountAddressResponse billingAddress;
    @C33608c("contact_number")
    @C12580l
    private final String contactNumber;
    @C33608c("delivery_address")
    @C12580l
    private final AccountAddressResponse deliveryAddress;
    @C33608c("one_order_id")
    @C12579k
    private final String oneOrderId;

    static {
        int i = AccountAddressResponse.$stable;
        $stable = i | i;
    }

    public UpdateAddressBody(@C12579k String str, @C12580l AccountAddressResponse accountAddressResponse, @C12580l AccountAddressResponse accountAddressResponse2, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(str, "oneOrderId");
        this.oneOrderId = str;
        this.billingAddress = accountAddressResponse;
        this.deliveryAddress = accountAddressResponse2;
        this.contactNumber = str2;
    }

    public static /* synthetic */ UpdateAddressBody copy$default(UpdateAddressBody updateAddressBody, String str, AccountAddressResponse accountAddressResponse, AccountAddressResponse accountAddressResponse2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateAddressBody.oneOrderId;
        }
        if ((i & 2) != 0) {
            accountAddressResponse = updateAddressBody.billingAddress;
        }
        if ((i & 4) != 0) {
            accountAddressResponse2 = updateAddressBody.deliveryAddress;
        }
        if ((i & 8) != 0) {
            str2 = updateAddressBody.contactNumber;
        }
        return updateAddressBody.copy(str, accountAddressResponse, accountAddressResponse2, str2);
    }

    @C12579k
    public final String component1() {
        return this.oneOrderId;
    }

    @C12580l
    public final AccountAddressResponse component2() {
        return this.billingAddress;
    }

    @C12580l
    public final AccountAddressResponse component3() {
        return this.deliveryAddress;
    }

    @C12580l
    public final String component4() {
        return this.contactNumber;
    }

    @C12579k
    public final UpdateAddressBody copy(@C12579k String str, @C12580l AccountAddressResponse accountAddressResponse, @C12580l AccountAddressResponse accountAddressResponse2, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(str, "oneOrderId");
        return new UpdateAddressBody(str, accountAddressResponse, accountAddressResponse2, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateAddressBody)) {
            return false;
        }
        UpdateAddressBody updateAddressBody = (UpdateAddressBody) obj;
        return Intrinsics.areEqual((Object) this.oneOrderId, (Object) updateAddressBody.oneOrderId) && Intrinsics.areEqual((Object) this.billingAddress, (Object) updateAddressBody.billingAddress) && Intrinsics.areEqual((Object) this.deliveryAddress, (Object) updateAddressBody.deliveryAddress) && Intrinsics.areEqual((Object) this.contactNumber, (Object) updateAddressBody.contactNumber);
    }

    @C12580l
    public final AccountAddressResponse getBillingAddress() {
        return this.billingAddress;
    }

    @C12580l
    public final String getContactNumber() {
        return this.contactNumber;
    }

    @C12580l
    public final AccountAddressResponse getDeliveryAddress() {
        return this.deliveryAddress;
    }

    @C12579k
    public final String getOneOrderId() {
        return this.oneOrderId;
    }

    public int hashCode() {
        int hashCode = this.oneOrderId.hashCode() * 31;
        AccountAddressResponse accountAddressResponse = this.billingAddress;
        int i = 0;
        int hashCode2 = (hashCode + (accountAddressResponse == null ? 0 : accountAddressResponse.hashCode())) * 31;
        AccountAddressResponse accountAddressResponse2 = this.deliveryAddress;
        int hashCode3 = (hashCode2 + (accountAddressResponse2 == null ? 0 : accountAddressResponse2.hashCode())) * 31;
        String str = this.contactNumber;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    @C12579k
    public String toString() {
        String str = this.oneOrderId;
        AccountAddressResponse accountAddressResponse = this.billingAddress;
        AccountAddressResponse accountAddressResponse2 = this.deliveryAddress;
        String str2 = this.contactNumber;
        return "UpdateAddressBody(oneOrderId=" + str + ", billingAddress=" + accountAddressResponse + ", deliveryAddress=" + accountAddressResponse2 + ", contactNumber=" + str2 + ")";
    }
}
