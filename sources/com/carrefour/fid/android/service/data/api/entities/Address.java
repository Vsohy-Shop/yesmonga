package com.carrefour.fid.android.service.data.api.entities;

import com.google.gson.annotations.C33608c;
import com.urbanairship.util.C9650g;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/Address;", "", "streetAddressOne", "", "streetAddressTwo", "city", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getStreetAddressOne", "getStreetAddressTwo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class Address {
    @C33608c("city")
    @C12579k
    private final String city;
    @C33608c("street_address_one")
    @C12579k
    private final String streetAddressOne;
    @C33608c("street_address_two")
    @C12580l
    private final String streetAddressTwo;

    public Address(@C12579k String str, @C12580l String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "streetAddressOne");
        Intrinsics.checkNotNullParameter(str3, C9650g.f26444g);
        this.streetAddressOne = str;
        this.streetAddressTwo = str2;
        this.city = str3;
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = address.streetAddressOne;
        }
        if ((i & 2) != 0) {
            str2 = address.streetAddressTwo;
        }
        if ((i & 4) != 0) {
            str3 = address.city;
        }
        return address.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.streetAddressOne;
    }

    @C12580l
    public final String component2() {
        return this.streetAddressTwo;
    }

    @C12579k
    public final String component3() {
        return this.city;
    }

    @C12579k
    public final Address copy(@C12579k String str, @C12580l String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "streetAddressOne");
        Intrinsics.checkNotNullParameter(str3, C9650g.f26444g);
        return new Address(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return Intrinsics.areEqual((Object) this.streetAddressOne, (Object) address.streetAddressOne) && Intrinsics.areEqual((Object) this.streetAddressTwo, (Object) address.streetAddressTwo) && Intrinsics.areEqual((Object) this.city, (Object) address.city);
    }

    @C12579k
    public final String getCity() {
        return this.city;
    }

    @C12579k
    public final String getStreetAddressOne() {
        return this.streetAddressOne;
    }

    @C12580l
    public final String getStreetAddressTwo() {
        return this.streetAddressTwo;
    }

    public int hashCode() {
        int hashCode = this.streetAddressOne.hashCode() * 31;
        String str = this.streetAddressTwo;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.city.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.streetAddressOne;
        String str2 = this.streetAddressTwo;
        String str3 = this.city;
        return "Address(streetAddressOne=" + str + ", streetAddressTwo=" + str2 + ", city=" + str3 + ")";
    }
}
