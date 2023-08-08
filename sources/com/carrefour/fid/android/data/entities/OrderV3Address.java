package com.carrefour.fid.android.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b=\u0010>J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003J¬\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\t\u0010!\u001a\u00020\u0002HÖ\u0001J\t\u0010#\u001a\u00020\"HÖ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\u0019\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\"HÖ\u0001R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b0\u0010/R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b1\u0010/R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b2\u0010/R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\b3\u0010/R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b4\u0010/R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b5\u0010/R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\f\n\u0004\b\u0019\u00106\u001a\u0004\b7\u0010\fR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001a\u0010-\u001a\u0004\b8\u0010/R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001b\u0010-\u001a\u0004\b9\u0010/R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001c\u0010-\u001a\u0004\b:\u0010/R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\b;\u0010/R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b<\u0010/¨\u0006?"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3Address;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "component11", "component12", "component13", "addressType", "buildingName", "city", "cityCode", "country", "digicode", "interphone", "elevator", "floor", "reference", "streetAddressOne", "streetAddressTwo", "streetAddressThree", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/data/entities/OrderV3Address;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getAddressType", "()Ljava/lang/String;", "getBuildingName", "getCity", "getCityCode", "getCountry", "getDigicode", "getInterphone", "Ljava/lang/Boolean;", "getElevator", "getFloor", "getReference", "getStreetAddressOne", "getStreetAddressTwo", "getStreetAddressThree", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3Address implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<OrderV3Address> CREATOR = new C36403a();
    @C33608c("adress_type")
    @C12580l
    private final String addressType;
    @C33608c("building_name")
    @C12580l
    private final String buildingName;
    @C33608c("city")
    @C12580l
    private final String city;
    @C33608c("city_code")
    @C12580l
    private final String cityCode;
    @C33608c("country")
    @C12580l
    private final String country;
    @C33608c("digicode")
    @C12580l
    private final String digicode;
    @C33608c("elevator")
    @C12580l
    private final Boolean elevator;
    @C33608c("floor")
    @C12580l
    private final String floor;
    @C33608c("interphone")
    @C12580l
    private final String interphone;
    @C33608c("reference")
    @C12580l
    private final String reference;
    @C33608c("street_address_one")
    @C12580l
    private final String streetAddressOne;
    @C33608c("street_address_three")
    @C12580l
    private final String streetAddressThree;
    @C33608c("street_address_two")
    @C12580l
    private final String streetAddressTwo;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3Address$a */
    public static final class C36403a implements Parcelable.Creator<OrderV3Address> {
        @C12579k
        /* renamed from: a */
        public final OrderV3Address createFromParcel(@C12579k Parcel parcel) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OrderV3Address(readString, readString2, readString3, readString4, readString5, readString6, readString7, bool, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3Address[] newArray(int i) {
            return new OrderV3Address[i];
        }
    }

    public OrderV3Address() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, C16476b.f40864p, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OrderV3Address copy$default(OrderV3Address orderV3Address, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        OrderV3Address orderV3Address2 = orderV3Address;
        int i2 = i;
        return orderV3Address.copy((i2 & 1) != 0 ? orderV3Address2.addressType : str, (i2 & 2) != 0 ? orderV3Address2.buildingName : str2, (i2 & 4) != 0 ? orderV3Address2.city : str3, (i2 & 8) != 0 ? orderV3Address2.cityCode : str4, (i2 & 16) != 0 ? orderV3Address2.country : str5, (i2 & 32) != 0 ? orderV3Address2.digicode : str6, (i2 & 64) != 0 ? orderV3Address2.interphone : str7, (i2 & 128) != 0 ? orderV3Address2.elevator : bool, (i2 & 256) != 0 ? orderV3Address2.floor : str8, (i2 & 512) != 0 ? orderV3Address2.reference : str9, (i2 & 1024) != 0 ? orderV3Address2.streetAddressOne : str10, (i2 & 2048) != 0 ? orderV3Address2.streetAddressTwo : str11, (i2 & 4096) != 0 ? orderV3Address2.streetAddressThree : str12);
    }

    @C12580l
    public final String component1() {
        return this.addressType;
    }

    @C12580l
    public final String component10() {
        return this.reference;
    }

    @C12580l
    public final String component11() {
        return this.streetAddressOne;
    }

    @C12580l
    public final String component12() {
        return this.streetAddressTwo;
    }

    @C12580l
    public final String component13() {
        return this.streetAddressThree;
    }

    @C12580l
    public final String component2() {
        return this.buildingName;
    }

    @C12580l
    public final String component3() {
        return this.city;
    }

    @C12580l
    public final String component4() {
        return this.cityCode;
    }

    @C12580l
    public final String component5() {
        return this.country;
    }

    @C12580l
    public final String component6() {
        return this.digicode;
    }

    @C12580l
    public final String component7() {
        return this.interphone;
    }

    @C12580l
    public final Boolean component8() {
        return this.elevator;
    }

    @C12580l
    public final String component9() {
        return this.floor;
    }

    @C12579k
    public final OrderV3Address copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l Boolean bool, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12) {
        return new OrderV3Address(str, str2, str3, str4, str5, str6, str7, bool, str8, str9, str10, str11, str12);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV3Address)) {
            return false;
        }
        OrderV3Address orderV3Address = (OrderV3Address) obj;
        return Intrinsics.areEqual((Object) this.addressType, (Object) orderV3Address.addressType) && Intrinsics.areEqual((Object) this.buildingName, (Object) orderV3Address.buildingName) && Intrinsics.areEqual((Object) this.city, (Object) orderV3Address.city) && Intrinsics.areEqual((Object) this.cityCode, (Object) orderV3Address.cityCode) && Intrinsics.areEqual((Object) this.country, (Object) orderV3Address.country) && Intrinsics.areEqual((Object) this.digicode, (Object) orderV3Address.digicode) && Intrinsics.areEqual((Object) this.interphone, (Object) orderV3Address.interphone) && Intrinsics.areEqual((Object) this.elevator, (Object) orderV3Address.elevator) && Intrinsics.areEqual((Object) this.floor, (Object) orderV3Address.floor) && Intrinsics.areEqual((Object) this.reference, (Object) orderV3Address.reference) && Intrinsics.areEqual((Object) this.streetAddressOne, (Object) orderV3Address.streetAddressOne) && Intrinsics.areEqual((Object) this.streetAddressTwo, (Object) orderV3Address.streetAddressTwo) && Intrinsics.areEqual((Object) this.streetAddressThree, (Object) orderV3Address.streetAddressThree);
    }

    @C12580l
    public final String getAddressType() {
        return this.addressType;
    }

    @C12580l
    public final String getBuildingName() {
        return this.buildingName;
    }

    @C12580l
    public final String getCity() {
        return this.city;
    }

    @C12580l
    public final String getCityCode() {
        return this.cityCode;
    }

    @C12580l
    public final String getCountry() {
        return this.country;
    }

    @C12580l
    public final String getDigicode() {
        return this.digicode;
    }

    @C12580l
    public final Boolean getElevator() {
        return this.elevator;
    }

    @C12580l
    public final String getFloor() {
        return this.floor;
    }

    @C12580l
    public final String getInterphone() {
        return this.interphone;
    }

    @C12580l
    public final String getReference() {
        return this.reference;
    }

    @C12580l
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
        String str = this.addressType;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buildingName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cityCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.country;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.digicode;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.interphone;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.elevator;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.floor;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.reference;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.streetAddressOne;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.streetAddressTwo;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.streetAddressThree;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode12 + i;
    }

    @C12579k
    public String toString() {
        String str = this.addressType;
        String str2 = this.buildingName;
        String str3 = this.city;
        String str4 = this.cityCode;
        String str5 = this.country;
        String str6 = this.digicode;
        String str7 = this.interphone;
        Boolean bool = this.elevator;
        String str8 = this.floor;
        String str9 = this.reference;
        String str10 = this.streetAddressOne;
        String str11 = this.streetAddressTwo;
        String str12 = this.streetAddressThree;
        return "OrderV3Address(addressType=" + str + ", buildingName=" + str2 + ", city=" + str3 + ", cityCode=" + str4 + ", country=" + str5 + ", digicode=" + str6 + ", interphone=" + str7 + ", elevator=" + bool + ", floor=" + str8 + ", reference=" + str9 + ", streetAddressOne=" + str10 + ", streetAddressTwo=" + str11 + ", streetAddressThree=" + str12 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        boolean booleanValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.addressType);
        parcel.writeString(this.buildingName);
        parcel.writeString(this.city);
        parcel.writeString(this.cityCode);
        parcel.writeString(this.country);
        parcel.writeString(this.digicode);
        parcel.writeString(this.interphone);
        Boolean bool = this.elevator;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeString(this.floor);
        parcel.writeString(this.reference);
        parcel.writeString(this.streetAddressOne);
        parcel.writeString(this.streetAddressTwo);
        parcel.writeString(this.streetAddressThree);
    }

    public OrderV3Address(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l Boolean bool, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12) {
        this.addressType = str;
        this.buildingName = str2;
        this.city = str3;
        this.cityCode = str4;
        this.country = str5;
        this.digicode = str6;
        this.interphone = str7;
        this.elevator = bool;
        this.floor = str8;
        this.reference = str9;
        this.streetAddressOne = str10;
        this.streetAddressTwo = str11;
        this.streetAddressThree = str12;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrderV3Address(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Boolean r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = "DELIVERY"
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r2 = r0 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0012
            r2 = r3
            goto L_0x0014
        L_0x0012:
            r2 = r16
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r3
            goto L_0x001c
        L_0x001a:
            r4 = r17
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r3
            goto L_0x0024
        L_0x0022:
            r5 = r18
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002b
            java.lang.String r6 = "FR"
            goto L_0x002d
        L_0x002b:
            r6 = r19
        L_0x002d:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0033
            r7 = r3
            goto L_0x0035
        L_0x0033:
            r7 = r20
        L_0x0035:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003b
            r8 = r3
            goto L_0x003d
        L_0x003b:
            r8 = r21
        L_0x003d:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0044
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L_0x0046
        L_0x0044:
            r9 = r22
        L_0x0046:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004c
            r10 = r3
            goto L_0x004e
        L_0x004c:
            r10 = r23
        L_0x004e:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0054
            r11 = r3
            goto L_0x0056
        L_0x0054:
            r11 = r24
        L_0x0056:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005c
            r12 = r3
            goto L_0x005e
        L_0x005c:
            r12 = r25
        L_0x005e:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0064
            r13 = r3
            goto L_0x0066
        L_0x0064:
            r13 = r26
        L_0x0066:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r3 = r27
        L_0x006d:
            r15 = r14
            r16 = r1
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.OrderV3Address.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
