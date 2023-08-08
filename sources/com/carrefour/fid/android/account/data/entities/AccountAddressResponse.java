package com.carrefour.fid.android.account.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import com.urbanairship.util.C9650g;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b8\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010(J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J¨\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001e\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u0010\u0016R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0014\"\u0004\b3\u0010\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016¨\u0006K"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/data/entities/AccountAddressResponse;", "", "streetAddressOne", "", "streetAddressTwo", "streetAddressThree", "cityCode", "city", "country", "addressType", "reference", "floor", "digicode", "intercomCode", "buildingName", "intercom", "", "elevator", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V", "getAddressType", "()Ljava/lang/String;", "setAddressType", "(Ljava/lang/String;)V", "getBuildingName", "setBuildingName", "getCity", "setCity", "getCityCode", "setCityCode", "getCountry", "setCountry", "getDigicode", "setDigicode", "getElevator", "()Z", "setElevator", "(Z)V", "getFloor", "setFloor", "getIntercom", "()Ljava/lang/Boolean;", "setIntercom", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getIntercomCode", "setIntercomCode", "getReference", "setReference", "getStreetAddressOne", "setStreetAddressOne", "getStreetAddressThree", "setStreetAddressThree", "getStreetAddressTwo", "setStreetAddressTwo", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)Lcom/carrefour/fid/android/account/data/entities/AccountAddressResponse;", "equals", "other", "hashCode", "", "toString", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class AccountAddressResponse {
    public static final int $stable = 8;
    @C33608c("address_type")
    @C12579k
    private String addressType;
    @C33608c("building_name")
    @C12580l
    private String buildingName;
    @C33608c("city")
    @C12579k
    private String city;
    @C33608c("city_code")
    @C12579k
    private String cityCode;
    @C33608c("country")
    @C12579k
    private String country;
    @C33608c("digicode")
    @C12580l
    private String digicode;
    @C33608c("elevator")
    private boolean elevator;
    @C33608c("floor")
    @C12579k
    private String floor;
    @C33608c("intercom")
    @C12580l
    private Boolean intercom;
    @C33608c("intercom_code")
    @C12580l
    private String intercomCode;
    @C33608c("reference")
    @C12580l
    private String reference;
    @C33608c("street_address_one")
    @C12579k
    private String streetAddressOne;
    @C33608c("street_address_three")
    @C12580l
    private String streetAddressThree;
    @C33608c("street_address_two")
    @C12580l
    private String streetAddressTwo;

    public AccountAddressResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, false, 16383, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AccountAddressResponse copy$default(AccountAddressResponse accountAddressResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool, boolean z, int i, Object obj) {
        AccountAddressResponse accountAddressResponse2 = accountAddressResponse;
        int i2 = i;
        return accountAddressResponse.copy((i2 & 1) != 0 ? accountAddressResponse2.streetAddressOne : str, (i2 & 2) != 0 ? accountAddressResponse2.streetAddressTwo : str2, (i2 & 4) != 0 ? accountAddressResponse2.streetAddressThree : str3, (i2 & 8) != 0 ? accountAddressResponse2.cityCode : str4, (i2 & 16) != 0 ? accountAddressResponse2.city : str5, (i2 & 32) != 0 ? accountAddressResponse2.country : str6, (i2 & 64) != 0 ? accountAddressResponse2.addressType : str7, (i2 & 128) != 0 ? accountAddressResponse2.reference : str8, (i2 & 256) != 0 ? accountAddressResponse2.floor : str9, (i2 & 512) != 0 ? accountAddressResponse2.digicode : str10, (i2 & 1024) != 0 ? accountAddressResponse2.intercomCode : str11, (i2 & 2048) != 0 ? accountAddressResponse2.buildingName : str12, (i2 & 4096) != 0 ? accountAddressResponse2.intercom : bool, (i2 & 8192) != 0 ? accountAddressResponse2.elevator : z);
    }

    @C12579k
    public final String component1() {
        return this.streetAddressOne;
    }

    @C12580l
    public final String component10() {
        return this.digicode;
    }

    @C12580l
    public final String component11() {
        return this.intercomCode;
    }

    @C12580l
    public final String component12() {
        return this.buildingName;
    }

    @C12580l
    public final Boolean component13() {
        return this.intercom;
    }

    public final boolean component14() {
        return this.elevator;
    }

    @C12580l
    public final String component2() {
        return this.streetAddressTwo;
    }

    @C12580l
    public final String component3() {
        return this.streetAddressThree;
    }

    @C12579k
    public final String component4() {
        return this.cityCode;
    }

    @C12579k
    public final String component5() {
        return this.city;
    }

    @C12579k
    public final String component6() {
        return this.country;
    }

    @C12579k
    public final String component7() {
        return this.addressType;
    }

    @C12580l
    public final String component8() {
        return this.reference;
    }

    @C12579k
    public final String component9() {
        return this.floor;
    }

    @C12579k
    public final AccountAddressResponse copy(@C12579k String str, @C12580l String str2, @C12580l String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12580l String str8, @C12579k String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l Boolean bool, boolean z) {
        String str13 = str;
        Intrinsics.checkNotNullParameter(str13, "streetAddressOne");
        String str14 = str4;
        Intrinsics.checkNotNullParameter(str14, "cityCode");
        String str15 = str5;
        Intrinsics.checkNotNullParameter(str15, C9650g.f26444g);
        String str16 = str6;
        Intrinsics.checkNotNullParameter(str16, "country");
        String str17 = str7;
        Intrinsics.checkNotNullParameter(str17, "addressType");
        String str18 = str9;
        Intrinsics.checkNotNullParameter(str18, "floor");
        return new AccountAddressResponse(str13, str2, str3, str14, str15, str16, str17, str8, str18, str10, str11, str12, bool, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAddressResponse)) {
            return false;
        }
        AccountAddressResponse accountAddressResponse = (AccountAddressResponse) obj;
        return Intrinsics.areEqual((Object) this.streetAddressOne, (Object) accountAddressResponse.streetAddressOne) && Intrinsics.areEqual((Object) this.streetAddressTwo, (Object) accountAddressResponse.streetAddressTwo) && Intrinsics.areEqual((Object) this.streetAddressThree, (Object) accountAddressResponse.streetAddressThree) && Intrinsics.areEqual((Object) this.cityCode, (Object) accountAddressResponse.cityCode) && Intrinsics.areEqual((Object) this.city, (Object) accountAddressResponse.city) && Intrinsics.areEqual((Object) this.country, (Object) accountAddressResponse.country) && Intrinsics.areEqual((Object) this.addressType, (Object) accountAddressResponse.addressType) && Intrinsics.areEqual((Object) this.reference, (Object) accountAddressResponse.reference) && Intrinsics.areEqual((Object) this.floor, (Object) accountAddressResponse.floor) && Intrinsics.areEqual((Object) this.digicode, (Object) accountAddressResponse.digicode) && Intrinsics.areEqual((Object) this.intercomCode, (Object) accountAddressResponse.intercomCode) && Intrinsics.areEqual((Object) this.buildingName, (Object) accountAddressResponse.buildingName) && Intrinsics.areEqual((Object) this.intercom, (Object) accountAddressResponse.intercom) && this.elevator == accountAddressResponse.elevator;
    }

    @C12579k
    public final String getAddressType() {
        return this.addressType;
    }

    @C12580l
    public final String getBuildingName() {
        return this.buildingName;
    }

    @C12579k
    public final String getCity() {
        return this.city;
    }

    @C12579k
    public final String getCityCode() {
        return this.cityCode;
    }

    @C12579k
    public final String getCountry() {
        return this.country;
    }

    @C12580l
    public final String getDigicode() {
        return this.digicode;
    }

    public final boolean getElevator() {
        return this.elevator;
    }

    @C12579k
    public final String getFloor() {
        return this.floor;
    }

    @C12580l
    public final Boolean getIntercom() {
        return this.intercom;
    }

    @C12580l
    public final String getIntercomCode() {
        return this.intercomCode;
    }

    @C12580l
    public final String getReference() {
        return this.reference;
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
        int hashCode3 = (((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.cityCode.hashCode()) * 31) + this.city.hashCode()) * 31) + this.country.hashCode()) * 31) + this.addressType.hashCode()) * 31;
        String str3 = this.reference;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.floor.hashCode()) * 31;
        String str4 = this.digicode;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.intercomCode;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.buildingName;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.intercom;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i2 = (hashCode7 + i) * 31;
        boolean z = this.elevator;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final void setAddressType(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.addressType = str;
    }

    public final void setBuildingName(@C12580l String str) {
        this.buildingName = str;
    }

    public final void setCity(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.city = str;
    }

    public final void setCityCode(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cityCode = str;
    }

    public final void setCountry(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.country = str;
    }

    public final void setDigicode(@C12580l String str) {
        this.digicode = str;
    }

    public final void setElevator(boolean z) {
        this.elevator = z;
    }

    public final void setFloor(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.floor = str;
    }

    public final void setIntercom(@C12580l Boolean bool) {
        this.intercom = bool;
    }

    public final void setIntercomCode(@C12580l String str) {
        this.intercomCode = str;
    }

    public final void setReference(@C12580l String str) {
        this.reference = str;
    }

    public final void setStreetAddressOne(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.streetAddressOne = str;
    }

    public final void setStreetAddressThree(@C12580l String str) {
        this.streetAddressThree = str;
    }

    public final void setStreetAddressTwo(@C12580l String str) {
        this.streetAddressTwo = str;
    }

    @C12579k
    public String toString() {
        String str = this.streetAddressOne;
        String str2 = this.streetAddressTwo;
        String str3 = this.streetAddressThree;
        String str4 = this.cityCode;
        String str5 = this.city;
        String str6 = this.country;
        String str7 = this.addressType;
        String str8 = this.reference;
        String str9 = this.floor;
        String str10 = this.digicode;
        String str11 = this.intercomCode;
        String str12 = this.buildingName;
        Boolean bool = this.intercom;
        boolean z = this.elevator;
        return "AccountAddressResponse(streetAddressOne=" + str + ", streetAddressTwo=" + str2 + ", streetAddressThree=" + str3 + ", cityCode=" + str4 + ", city=" + str5 + ", country=" + str6 + ", addressType=" + str7 + ", reference=" + str8 + ", floor=" + str9 + ", digicode=" + str10 + ", intercomCode=" + str11 + ", buildingName=" + str12 + ", intercom=" + bool + ", elevator=" + z + ")";
    }

    public AccountAddressResponse(@C12579k String str, @C12580l String str2, @C12580l String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, @C12580l String str8, @C12579k String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(str, "streetAddressOne");
        Intrinsics.checkNotNullParameter(str4, "cityCode");
        Intrinsics.checkNotNullParameter(str5, C9650g.f26444g);
        Intrinsics.checkNotNullParameter(str6, "country");
        Intrinsics.checkNotNullParameter(str7, "addressType");
        Intrinsics.checkNotNullParameter(str9, "floor");
        this.streetAddressOne = str;
        this.streetAddressTwo = str2;
        this.streetAddressThree = str3;
        this.cityCode = str4;
        this.city = str5;
        this.country = str6;
        this.addressType = str7;
        this.reference = str8;
        this.floor = str9;
        this.digicode = str10;
        this.intercomCode = str11;
        this.buildingName = str12;
        this.intercom = bool;
        this.elevator = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AccountAddressResponse(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.Boolean r28, boolean r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r15 = this;
            r0 = r30
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x000e
        L_0x000c:
            r1 = r16
        L_0x000e:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0015
            r2 = r3
            goto L_0x0017
        L_0x0015:
            r2 = r17
        L_0x0017:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001d
            r4 = r3
            goto L_0x001f
        L_0x001d:
            r4 = r18
        L_0x001f:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0029
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            goto L_0x002b
        L_0x0029:
            r5 = r19
        L_0x002b:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0035
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            goto L_0x0037
        L_0x0035:
            r6 = r20
        L_0x0037:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0041
            java.lang.String r7 = new java.lang.String
            r7.<init>()
            goto L_0x0043
        L_0x0041:
            r7 = r21
        L_0x0043:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x004d
            java.lang.String r8 = new java.lang.String
            r8.<init>()
            goto L_0x004f
        L_0x004d:
            r8 = r22
        L_0x004f:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0055
            r9 = r3
            goto L_0x0057
        L_0x0055:
            r9 = r23
        L_0x0057:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0061
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            goto L_0x0063
        L_0x0061:
            r10 = r24
        L_0x0063:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0069
            r11 = r3
            goto L_0x006b
        L_0x0069:
            r11 = r25
        L_0x006b:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0071
            r12 = r3
            goto L_0x0073
        L_0x0071:
            r12 = r26
        L_0x0073:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0079
            r13 = r3
            goto L_0x007b
        L_0x0079:
            r13 = r27
        L_0x007b:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r3 = r28
        L_0x0082:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0088
            r0 = 0
            goto L_0x008a
        L_0x0088:
            r0 = r29
        L_0x008a:
            r16 = r15
            r17 = r1
            r18 = r2
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r3
            r30 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.entities.AccountAddressResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
