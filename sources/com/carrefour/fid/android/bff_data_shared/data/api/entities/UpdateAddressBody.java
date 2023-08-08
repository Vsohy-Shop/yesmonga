package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/UpdateAddressBody;", "", "addresses", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/AddressUserResponse;", "phones", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/PhonesUserResponse;", "(Ljava/util/List;Ljava/util/List;)V", "getAddresses", "()Ljava/util/List;", "setAddresses", "(Ljava/util/List;)V", "getPhones", "setPhones", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class UpdateAddressBody {
    @C33608c("addresses")
    @C12580l
    private List<AddressUserResponse> addresses;
    @C33608c("phones")
    @C12580l
    private List<PhonesUserResponse> phones;

    public UpdateAddressBody() {
        this((List) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UpdateAddressBody copy$default(UpdateAddressBody updateAddressBody, List<AddressUserResponse> list, List<PhonesUserResponse> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = updateAddressBody.addresses;
        }
        if ((i & 2) != 0) {
            list2 = updateAddressBody.phones;
        }
        return updateAddressBody.copy(list, list2);
    }

    @C12580l
    public final List<AddressUserResponse> component1() {
        return this.addresses;
    }

    @C12580l
    public final List<PhonesUserResponse> component2() {
        return this.phones;
    }

    @C12579k
    public final UpdateAddressBody copy(@C12580l List<AddressUserResponse> list, @C12580l List<PhonesUserResponse> list2) {
        return new UpdateAddressBody(list, list2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateAddressBody)) {
            return false;
        }
        UpdateAddressBody updateAddressBody = (UpdateAddressBody) obj;
        return Intrinsics.areEqual((Object) this.addresses, (Object) updateAddressBody.addresses) && Intrinsics.areEqual((Object) this.phones, (Object) updateAddressBody.phones);
    }

    @C12580l
    public final List<AddressUserResponse> getAddresses() {
        return this.addresses;
    }

    @C12580l
    public final List<PhonesUserResponse> getPhones() {
        return this.phones;
    }

    public int hashCode() {
        List<AddressUserResponse> list = this.addresses;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PhonesUserResponse> list2 = this.phones;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final void setAddresses(@C12580l List<AddressUserResponse> list) {
        this.addresses = list;
    }

    public final void setPhones(@C12580l List<PhonesUserResponse> list) {
        this.phones = list;
    }

    @C12579k
    public String toString() {
        List<AddressUserResponse> list = this.addresses;
        List<PhonesUserResponse> list2 = this.phones;
        return "UpdateAddressBody(addresses=" + list + ", phones=" + list2 + ")";
    }

    public UpdateAddressBody(@C12580l List<AddressUserResponse> list, @C12580l List<PhonesUserResponse> list2) {
        this.addresses = list;
        this.phones = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateAddressBody(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
