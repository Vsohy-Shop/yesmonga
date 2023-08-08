package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import com.urbanairship.util.C9650g;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OHMDeliveryAddress;", "", "streetAddressOne", "", "streetAddressTwo", "streetAddressThree", "cityCode", "city", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCityCode", "getStreetAddressOne", "getStreetAddressThree", "getStreetAddressTwo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OHMDeliveryAddress {
    public static final int $stable = 0;
    @C33608c("city")
    @C12579k
    private final String city;
    @C33608c("city_code")
    @C12580l
    private final String cityCode;
    @C33608c("street_address_one")
    @C12579k
    private final String streetAddressOne;
    @C33608c("street_address_three")
    @C12580l
    private final String streetAddressThree;
    @C33608c("street_address_two")
    @C12580l
    private final String streetAddressTwo;

    public OHMDeliveryAddress(@C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "streetAddressOne");
        Intrinsics.checkNotNullParameter(str5, C9650g.f26444g);
        this.streetAddressOne = str;
        this.streetAddressTwo = str2;
        this.streetAddressThree = str3;
        this.cityCode = str4;
        this.city = str5;
    }

    public static /* synthetic */ OHMDeliveryAddress copy$default(OHMDeliveryAddress oHMDeliveryAddress, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oHMDeliveryAddress.streetAddressOne;
        }
        if ((i & 2) != 0) {
            str2 = oHMDeliveryAddress.streetAddressTwo;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oHMDeliveryAddress.streetAddressThree;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oHMDeliveryAddress.cityCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = oHMDeliveryAddress.city;
        }
        return oHMDeliveryAddress.copy(str, str6, str7, str8, str5);
    }

    @C12579k
    public final String component1() {
        return this.streetAddressOne;
    }

    @C12580l
    public final String component2() {
        return this.streetAddressTwo;
    }

    @C12580l
    public final String component3() {
        return this.streetAddressThree;
    }

    @C12580l
    public final String component4() {
        return this.cityCode;
    }

    @C12579k
    public final String component5() {
        return this.city;
    }

    @C12579k
    public final OHMDeliveryAddress copy(@C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "streetAddressOne");
        Intrinsics.checkNotNullParameter(str5, C9650g.f26444g);
        return new OHMDeliveryAddress(str, str2, str3, str4, str5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OHMDeliveryAddress)) {
            return false;
        }
        OHMDeliveryAddress oHMDeliveryAddress = (OHMDeliveryAddress) obj;
        return Intrinsics.areEqual((Object) this.streetAddressOne, (Object) oHMDeliveryAddress.streetAddressOne) && Intrinsics.areEqual((Object) this.streetAddressTwo, (Object) oHMDeliveryAddress.streetAddressTwo) && Intrinsics.areEqual((Object) this.streetAddressThree, (Object) oHMDeliveryAddress.streetAddressThree) && Intrinsics.areEqual((Object) this.cityCode, (Object) oHMDeliveryAddress.cityCode) && Intrinsics.areEqual((Object) this.city, (Object) oHMDeliveryAddress.city);
    }

    @C12579k
    public final String getCity() {
        return this.city;
    }

    @C12580l
    public final String getCityCode() {
        return this.cityCode;
    }

    @C12579k
    public final String getStreetAddressOne() {
        return this.streetAddressOne;
    }

    @C12580l
    public final String getStreetAddressThree() {
        return this.streetAddressThree;
    }

    @C12580l
    public final String getStreetAddressTwo() {
        return this.streetAddressTwo;
    }

    public int hashCode() {
        int hashCode = this.streetAddressOne.hashCode() * 31;
        String str = this.streetAddressTwo;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.streetAddressThree;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cityCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.city.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.streetAddressOne;
        String str2 = this.streetAddressTwo;
        String str3 = this.streetAddressThree;
        String str4 = this.cityCode;
        String str5 = this.city;
        return "OHMDeliveryAddress(streetAddressOne=" + str + ", streetAddressTwo=" + str2 + ", streetAddressThree=" + str3 + ", cityCode=" + str4 + ", city=" + str5 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OHMDeliveryAddress(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? new String() : str4, str5);
    }
}
