package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import com.urbanairship.util.C9650g;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\bV\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u000fHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010EJ\t\u0010`\u001a\u00020\u0003HÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010EJ\u0010\u0010b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010h\u001a\u00020\nHÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\nHÆ\u0003J\u0002\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010lJ\u0013\u0010m\u001a\u00020\n2\b\u0010n\u001a\u0004\u0018\u00010oHÖ\u0003J\t\u0010p\u001a\u00020\u000fHÖ\u0001J\t\u0010q\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\"\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010 R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001e\"\u0004\b3\u0010 R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001e\"\u0004\b7\u0010 R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001e\"\u0004\b9\u0010 R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001e\"\u0004\b;\u0010 R \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001e\"\u0004\b=\u0010 R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010 R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010\f\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010H\u001a\u0004\bM\u0010E\"\u0004\bN\u0010GR\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001e\"\u0004\bP\u0010 R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010J\"\u0004\bR\u0010LR \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u001e\"\u0004\bT\u0010 ¨\u0006r"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/AddressUserResponse;", "Ljava/io/Serializable;", "country", "", "city", "address1", "address2", "address3", "address4", "preference", "", "postcode", "lift", "category", "key", "", "interphone", "building", "digitalCode", "floor", "information", "addressName", "addressType", "longitude", "", "latitude", "approximateAddress", "qualityDQE", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAddress1", "()Ljava/lang/String;", "setAddress1", "(Ljava/lang/String;)V", "getAddress2", "setAddress2", "getAddress3", "setAddress3", "getAddress4", "setAddress4", "getAddressName", "setAddressName", "getAddressType", "setAddressType", "getApproximateAddress", "()Ljava/lang/Boolean;", "setApproximateAddress", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getBuilding", "setBuilding", "getCategory", "setCategory", "getCity", "setCity", "getCountry", "setCountry", "getDigitalCode", "setDigitalCode", "getFloor", "setFloor", "getInformation", "setInformation", "getInterphone", "setInterphone", "getKey", "()I", "setKey", "(I)V", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLift", "()Z", "setLift", "(Z)V", "getLongitude", "setLongitude", "getPostcode", "setPostcode", "getPreference", "setPreference", "getQualityDQE", "setQualityDQE", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/AddressUserResponse;", "equals", "other", "", "hashCode", "toString", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class AddressUserResponse implements Serializable {
    @C33608c("address1")
    @C12579k
    private String address1;
    @C33608c("address2")
    @C12580l
    private String address2;
    @C33608c("address3")
    @C12580l
    private String address3;
    @C33608c("address4")
    @C12580l
    private String address4;
    @C33608c("address_name")
    @C12580l
    private String addressName;
    @C33608c("addressType")
    @C12580l
    private String addressType;
    @C33608c("approximate_address")
    @C12580l
    private Boolean approximateAddress;
    @C33608c("building")
    @C12580l
    private String building;
    @C33608c("category")
    @C12579k
    private String category;
    @C33608c("city")
    @C12579k
    private String city;
    @C33608c("country")
    @C12579k
    private String country;
    @C33608c("s_digicode")
    @C12580l
    private String digitalCode;
    @C33608c("floor")
    @C12580l
    private String floor;
    @C33608c("informations")
    @C12580l
    private String information;
    @C33608c("s_interphone")
    @C12580l
    private String interphone;
    @C33608c("key")
    private int key;
    @C33608c("gps_y")
    @C12580l
    private Double latitude;
    @C33608c("lift")
    private boolean lift;
    @C33608c("gps_x")
    @C12580l
    private Double longitude;
    @C33608c("postcode")
    @C12579k
    private String postcode;
    @C33608c("preference")
    private boolean preference;
    @C33608c("quality_dqe")
    @C12580l
    private String qualityDQE;

    public AddressUserResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, false, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Double) null, (Double) null, (Boolean) null, (String) null, 4194303, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AddressUserResponse copy$default(AddressUserResponse addressUserResponse, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, String str8, int i, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Double d, Double d2, Boolean bool, String str16, int i2, Object obj) {
        AddressUserResponse addressUserResponse2 = addressUserResponse;
        int i3 = i2;
        return addressUserResponse.copy((i3 & 1) != 0 ? addressUserResponse2.country : str, (i3 & 2) != 0 ? addressUserResponse2.city : str2, (i3 & 4) != 0 ? addressUserResponse2.address1 : str3, (i3 & 8) != 0 ? addressUserResponse2.address2 : str4, (i3 & 16) != 0 ? addressUserResponse2.address3 : str5, (i3 & 32) != 0 ? addressUserResponse2.address4 : str6, (i3 & 64) != 0 ? addressUserResponse2.preference : z, (i3 & 128) != 0 ? addressUserResponse2.postcode : str7, (i3 & 256) != 0 ? addressUserResponse2.lift : z2, (i3 & 512) != 0 ? addressUserResponse2.category : str8, (i3 & 1024) != 0 ? addressUserResponse2.key : i, (i3 & 2048) != 0 ? addressUserResponse2.interphone : str9, (i3 & 4096) != 0 ? addressUserResponse2.building : str10, (i3 & 8192) != 0 ? addressUserResponse2.digitalCode : str11, (i3 & 16384) != 0 ? addressUserResponse2.floor : str12, (i3 & 32768) != 0 ? addressUserResponse2.information : str13, (i3 & 65536) != 0 ? addressUserResponse2.addressName : str14, (i3 & 131072) != 0 ? addressUserResponse2.addressType : str15, (i3 & 262144) != 0 ? addressUserResponse2.longitude : d, (i3 & 524288) != 0 ? addressUserResponse2.latitude : d2, (i3 & 1048576) != 0 ? addressUserResponse2.approximateAddress : bool, (i3 & 2097152) != 0 ? addressUserResponse2.qualityDQE : str16);
    }

    @C12579k
    public final String component1() {
        return this.country;
    }

    @C12579k
    public final String component10() {
        return this.category;
    }

    public final int component11() {
        return this.key;
    }

    @C12580l
    public final String component12() {
        return this.interphone;
    }

    @C12580l
    public final String component13() {
        return this.building;
    }

    @C12580l
    public final String component14() {
        return this.digitalCode;
    }

    @C12580l
    public final String component15() {
        return this.floor;
    }

    @C12580l
    public final String component16() {
        return this.information;
    }

    @C12580l
    public final String component17() {
        return this.addressName;
    }

    @C12580l
    public final String component18() {
        return this.addressType;
    }

    @C12580l
    public final Double component19() {
        return this.longitude;
    }

    @C12579k
    public final String component2() {
        return this.city;
    }

    @C12580l
    public final Double component20() {
        return this.latitude;
    }

    @C12580l
    public final Boolean component21() {
        return this.approximateAddress;
    }

    @C12580l
    public final String component22() {
        return this.qualityDQE;
    }

    @C12579k
    public final String component3() {
        return this.address1;
    }

    @C12580l
    public final String component4() {
        return this.address2;
    }

    @C12580l
    public final String component5() {
        return this.address3;
    }

    @C12580l
    public final String component6() {
        return this.address4;
    }

    public final boolean component7() {
        return this.preference;
    }

    @C12579k
    public final String component8() {
        return this.postcode;
    }

    public final boolean component9() {
        return this.lift;
    }

    @C12579k
    public final AddressUserResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, boolean z, @C12579k String str7, boolean z2, @C12579k String str8, int i, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l Double d, @C12580l Double d2, @C12580l Boolean bool, @C12580l String str16) {
        String str17 = str;
        Intrinsics.checkNotNullParameter(str17, "country");
        Intrinsics.checkNotNullParameter(str2, C9650g.f26444g);
        Intrinsics.checkNotNullParameter(str3, "address1");
        Intrinsics.checkNotNullParameter(str7, "postcode");
        Intrinsics.checkNotNullParameter(str8, "category");
        return new AddressUserResponse(str17, str2, str3, str4, str5, str6, z, str7, z2, str8, i, str9, str10, str11, str12, str13, str14, str15, d, d2, bool, str16);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressUserResponse)) {
            return false;
        }
        AddressUserResponse addressUserResponse = (AddressUserResponse) obj;
        return Intrinsics.areEqual((Object) this.country, (Object) addressUserResponse.country) && Intrinsics.areEqual((Object) this.city, (Object) addressUserResponse.city) && Intrinsics.areEqual((Object) this.address1, (Object) addressUserResponse.address1) && Intrinsics.areEqual((Object) this.address2, (Object) addressUserResponse.address2) && Intrinsics.areEqual((Object) this.address3, (Object) addressUserResponse.address3) && Intrinsics.areEqual((Object) this.address4, (Object) addressUserResponse.address4) && this.preference == addressUserResponse.preference && Intrinsics.areEqual((Object) this.postcode, (Object) addressUserResponse.postcode) && this.lift == addressUserResponse.lift && Intrinsics.areEqual((Object) this.category, (Object) addressUserResponse.category) && this.key == addressUserResponse.key && Intrinsics.areEqual((Object) this.interphone, (Object) addressUserResponse.interphone) && Intrinsics.areEqual((Object) this.building, (Object) addressUserResponse.building) && Intrinsics.areEqual((Object) this.digitalCode, (Object) addressUserResponse.digitalCode) && Intrinsics.areEqual((Object) this.floor, (Object) addressUserResponse.floor) && Intrinsics.areEqual((Object) this.information, (Object) addressUserResponse.information) && Intrinsics.areEqual((Object) this.addressName, (Object) addressUserResponse.addressName) && Intrinsics.areEqual((Object) this.addressType, (Object) addressUserResponse.addressType) && Intrinsics.areEqual((Object) this.longitude, (Object) addressUserResponse.longitude) && Intrinsics.areEqual((Object) this.latitude, (Object) addressUserResponse.latitude) && Intrinsics.areEqual((Object) this.approximateAddress, (Object) addressUserResponse.approximateAddress) && Intrinsics.areEqual((Object) this.qualityDQE, (Object) addressUserResponse.qualityDQE);
    }

    @C12579k
    public final String getAddress1() {
        return this.address1;
    }

    @C12580l
    public final String getAddress2() {
        return this.address2;
    }

    @C12580l
    public final String getAddress3() {
        return this.address3;
    }

    @C12580l
    public final String getAddress4() {
        return this.address4;
    }

    @C12580l
    public final String getAddressName() {
        return this.addressName;
    }

    @C12580l
    public final String getAddressType() {
        return this.addressType;
    }

    @C12580l
    public final Boolean getApproximateAddress() {
        return this.approximateAddress;
    }

    @C12580l
    public final String getBuilding() {
        return this.building;
    }

    @C12579k
    public final String getCategory() {
        return this.category;
    }

    @C12579k
    public final String getCity() {
        return this.city;
    }

    @C12579k
    public final String getCountry() {
        return this.country;
    }

    @C12580l
    public final String getDigitalCode() {
        return this.digitalCode;
    }

    @C12580l
    public final String getFloor() {
        return this.floor;
    }

    @C12580l
    public final String getInformation() {
        return this.information;
    }

    @C12580l
    public final String getInterphone() {
        return this.interphone;
    }

    public final int getKey() {
        return this.key;
    }

    @C12580l
    public final Double getLatitude() {
        return this.latitude;
    }

    public final boolean getLift() {
        return this.lift;
    }

    @C12580l
    public final Double getLongitude() {
        return this.longitude;
    }

    @C12579k
    public final String getPostcode() {
        return this.postcode;
    }

    public final boolean getPreference() {
        return this.preference;
    }

    @C12580l
    public final String getQualityDQE() {
        return this.qualityDQE;
    }

    public int hashCode() {
        int hashCode = ((((this.country.hashCode() * 31) + this.city.hashCode()) * 31) + this.address1.hashCode()) * 31;
        String str = this.address2;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.address3;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.address4;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.preference;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode5 = (((hashCode4 + (z ? 1 : 0)) * 31) + this.postcode.hashCode()) * 31;
        boolean z3 = this.lift;
        if (!z3) {
            z2 = z3;
        }
        int hashCode6 = (((((hashCode5 + (z2 ? 1 : 0)) * 31) + this.category.hashCode()) * 31) + Integer.hashCode(this.key)) * 31;
        String str4 = this.interphone;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.building;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.digitalCode;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.floor;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.information;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressName;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.addressType;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Double d = this.longitude;
        int hashCode14 = (hashCode13 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.latitude;
        int hashCode15 = (hashCode14 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.approximateAddress;
        int hashCode16 = (hashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.qualityDQE;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode16 + i;
    }

    public final void setAddress1(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address1 = str;
    }

    public final void setAddress2(@C12580l String str) {
        this.address2 = str;
    }

    public final void setAddress3(@C12580l String str) {
        this.address3 = str;
    }

    public final void setAddress4(@C12580l String str) {
        this.address4 = str;
    }

    public final void setAddressName(@C12580l String str) {
        this.addressName = str;
    }

    public final void setAddressType(@C12580l String str) {
        this.addressType = str;
    }

    public final void setApproximateAddress(@C12580l Boolean bool) {
        this.approximateAddress = bool;
    }

    public final void setBuilding(@C12580l String str) {
        this.building = str;
    }

    public final void setCategory(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.category = str;
    }

    public final void setCity(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.city = str;
    }

    public final void setCountry(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.country = str;
    }

    public final void setDigitalCode(@C12580l String str) {
        this.digitalCode = str;
    }

    public final void setFloor(@C12580l String str) {
        this.floor = str;
    }

    public final void setInformation(@C12580l String str) {
        this.information = str;
    }

    public final void setInterphone(@C12580l String str) {
        this.interphone = str;
    }

    public final void setKey(int i) {
        this.key = i;
    }

    public final void setLatitude(@C12580l Double d) {
        this.latitude = d;
    }

    public final void setLift(boolean z) {
        this.lift = z;
    }

    public final void setLongitude(@C12580l Double d) {
        this.longitude = d;
    }

    public final void setPostcode(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.postcode = str;
    }

    public final void setPreference(boolean z) {
        this.preference = z;
    }

    public final void setQualityDQE(@C12580l String str) {
        this.qualityDQE = str;
    }

    @C12579k
    public String toString() {
        String str = this.country;
        String str2 = this.city;
        String str3 = this.address1;
        String str4 = this.address2;
        String str5 = this.address3;
        String str6 = this.address4;
        boolean z = this.preference;
        String str7 = this.postcode;
        boolean z2 = this.lift;
        String str8 = this.category;
        int i = this.key;
        String str9 = this.interphone;
        String str10 = this.building;
        String str11 = this.digitalCode;
        String str12 = this.floor;
        String str13 = this.information;
        String str14 = this.addressName;
        String str15 = this.addressType;
        Double d = this.longitude;
        Double d2 = this.latitude;
        Boolean bool = this.approximateAddress;
        String str16 = this.qualityDQE;
        return "AddressUserResponse(country=" + str + ", city=" + str2 + ", address1=" + str3 + ", address2=" + str4 + ", address3=" + str5 + ", address4=" + str6 + ", preference=" + z + ", postcode=" + str7 + ", lift=" + z2 + ", category=" + str8 + ", key=" + i + ", interphone=" + str9 + ", building=" + str10 + ", digitalCode=" + str11 + ", floor=" + str12 + ", information=" + str13 + ", addressName=" + str14 + ", addressType=" + str15 + ", longitude=" + d + ", latitude=" + d2 + ", approximateAddress=" + bool + ", qualityDQE=" + str16 + ")";
    }

    public AddressUserResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, boolean z, @C12579k String str7, boolean z2, @C12579k String str8, int i, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l Double d, @C12580l Double d2, @C12580l Boolean bool, @C12580l String str16) {
        String str17 = str8;
        Intrinsics.checkNotNullParameter(str, "country");
        Intrinsics.checkNotNullParameter(str2, C9650g.f26444g);
        Intrinsics.checkNotNullParameter(str3, "address1");
        Intrinsics.checkNotNullParameter(str7, "postcode");
        Intrinsics.checkNotNullParameter(str17, "category");
        this.country = str;
        this.city = str2;
        this.address1 = str3;
        this.address2 = str4;
        this.address3 = str5;
        this.address4 = str6;
        this.preference = z;
        this.postcode = str7;
        this.lift = z2;
        this.category = str17;
        this.key = i;
        this.interphone = str9;
        this.building = str10;
        this.digitalCode = str11;
        this.floor = str12;
        this.information = str13;
        this.addressName = str14;
        this.addressType = str15;
        this.longitude = d;
        this.latitude = d2;
        this.approximateAddress = bool;
        this.qualityDQE = str16;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AddressUserResponse(java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, java.lang.String r31, boolean r32, java.lang.String r33, int r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.Double r42, java.lang.Double r43, java.lang.Boolean r44, java.lang.String r45, int r46, kotlin.jvm.internal.DefaultConstructorMarker r47) {
        /*
            r23 = this;
            r0 = r46
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x000e
        L_0x000c:
            r1 = r24
        L_0x000e:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            goto L_0x001a
        L_0x0018:
            r2 = r25
        L_0x001a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = new java.lang.String
            r3.<init>()
            goto L_0x0026
        L_0x0024:
            r3 = r26
        L_0x0026:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x002c
            r4 = 0
            goto L_0x002e
        L_0x002c:
            r4 = r27
        L_0x002e:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0034
            r6 = 0
            goto L_0x0036
        L_0x0034:
            r6 = r28
        L_0x0036:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x003c
            r7 = 0
            goto L_0x003e
        L_0x003c:
            r7 = r29
        L_0x003e:
            r8 = r0 & 64
            r9 = 0
            if (r8 == 0) goto L_0x0045
            r8 = r9
            goto L_0x0047
        L_0x0045:
            r8 = r30
        L_0x0047:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0051
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            goto L_0x0053
        L_0x0051:
            r10 = r31
        L_0x0053:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0059
            r11 = r9
            goto L_0x005b
        L_0x0059:
            r11 = r32
        L_0x005b:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0065
            java.lang.String r12 = new java.lang.String
            r12.<init>()
            goto L_0x0067
        L_0x0065:
            r12 = r33
        L_0x0067:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r9 = r34
        L_0x006e:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0074
            r13 = 0
            goto L_0x0076
        L_0x0074:
            r13 = r35
        L_0x0076:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x007c
            r14 = 0
            goto L_0x007e
        L_0x007c:
            r14 = r36
        L_0x007e:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0084
            r15 = 0
            goto L_0x0086
        L_0x0084:
            r15 = r37
        L_0x0086:
            r5 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x008c
            r5 = 0
            goto L_0x008e
        L_0x008c:
            r5 = r38
        L_0x008e:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0098
            r16 = 0
            goto L_0x009a
        L_0x0098:
            r16 = r39
        L_0x009a:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00a3
            r17 = 0
            goto L_0x00a5
        L_0x00a3:
            r17 = r40
        L_0x00a5:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00ae
            r18 = 0
            goto L_0x00b0
        L_0x00ae:
            r18 = r41
        L_0x00b0:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00b9
            r19 = 0
            goto L_0x00bb
        L_0x00b9:
            r19 = r42
        L_0x00bb:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00c4
            r20 = 0
            goto L_0x00c6
        L_0x00c4:
            r20 = r43
        L_0x00c6:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00cf
            r21 = 0
            goto L_0x00d1
        L_0x00cf:
            r21 = r44
        L_0x00d1:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r22
            if (r0 == 0) goto L_0x00d9
            r0 = 0
            goto L_0x00db
        L_0x00d9:
            r0 = r45
        L_0x00db:
            r24 = r23
            r25 = r1
            r26 = r2
            r27 = r3
            r28 = r4
            r29 = r6
            r30 = r7
            r31 = r8
            r32 = r10
            r33 = r11
            r34 = r12
            r35 = r9
            r36 = r13
            r37 = r14
            r38 = r15
            r39 = r5
            r40 = r16
            r41 = r17
            r42 = r18
            r43 = r19
            r44 = r20
            r45 = r21
            r46 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.AddressUserResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
