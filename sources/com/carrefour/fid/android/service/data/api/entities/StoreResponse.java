package com.carrefour.fid.android.service.data.api.entities;

import androidx.autofill.C0861a;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n¢\u0006\u0002\u0010\u001aJ\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110\tHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\tHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u000f0\tHÆ\u0003JÍ\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\nHÆ\u0001J\u0013\u0010A\u001a\u00020\n2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\u0019\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010$R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0016\u0010\u0018\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001e¨\u0006F"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/StoreResponse;", "", "name", "", "banner", "phoneNumber", "format", "type", "passDays", "", "", "id", "address", "Lcom/carrefour/fid/android/service/data/api/entities/StoreAddressResponse;", "openingPattern", "Lcom/carrefour/fid/android/service/data/api/entities/OpeningPatternResponse;", "openingExceptionalPattern", "Lcom/carrefour/fid/android/service/data/api/entities/OpeningExceptionalPatternResponse;", "storeServices", "Lcom/carrefour/fid/android/service/data/api/entities/StoreServiceResponse;", "gln", "anabelKey", "distance", "minOrderAmount", "paymentOnSiteActivated", "isLoyaltyActivated", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/carrefour/fid/android/service/data/api/entities/StoreAddressResponse;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAddress", "()Lcom/carrefour/fid/android/service/data/api/entities/StoreAddressResponse;", "getAnabelKey", "()Ljava/lang/String;", "getBanner", "getDistance", "getFormat", "getGln", "getId", "()Z", "getMinOrderAmount", "getName", "getOpeningExceptionalPattern", "()Ljava/util/List;", "getOpeningPattern", "getPassDays", "getPaymentOnSiteActivated", "getPhoneNumber", "getStoreServices", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StoreResponse {
    @C33608c("address")
    @C12580l
    private final StoreAddressResponse address;
    @C33608c("anabel_key")
    @C12579k
    private final String anabelKey;
    @C33608c("banner")
    @C12579k
    private final String banner;
    @C33608c("distance")
    @C12579k
    private final String distance;
    @C33608c("format")
    @C12579k
    private final String format;
    @C33608c("gln")
    @C12579k
    private final String gln;
    @C33608c("id")
    @C12579k

    /* renamed from: id */
    private final String f68526id;
    @C33608c("is_e_wallet_loyalty_activated")
    private final boolean isLoyaltyActivated;
    @C33608c("min_order_amount")
    @C12579k
    private final String minOrderAmount;
    @C33608c("name")
    @C12579k
    private final String name;
    @C33608c("opening_exception_calendar")
    @C12579k
    private final List<OpeningExceptionalPatternResponse> openingExceptionalPattern;
    @C33608c("opening_week_pattern")
    @C12579k
    private final List<OpeningPatternResponse> openingPattern;
    @C33608c("pass_days")
    @C12579k
    private final List<Boolean> passDays;
    @C33608c("payment_on_site_activated")
    private final boolean paymentOnSiteActivated;
    @C33608c("phone_number")
    @C12579k
    private final String phoneNumber;
    @C33608c("services")
    @C12579k
    private final List<StoreServiceResponse> storeServices;
    @C33608c("type")
    @C12579k
    private final String type;

    public StoreResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (StoreAddressResponse) null, (List) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, false, false, 131071, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StoreResponse copy$default(StoreResponse storeResponse, String str, String str2, String str3, String str4, String str5, List list, String str6, StoreAddressResponse storeAddressResponse, List list2, List list3, List list4, String str7, String str8, String str9, String str10, boolean z, boolean z2, int i, Object obj) {
        StoreResponse storeResponse2 = storeResponse;
        int i2 = i;
        return storeResponse.copy((i2 & 1) != 0 ? storeResponse2.name : str, (i2 & 2) != 0 ? storeResponse2.banner : str2, (i2 & 4) != 0 ? storeResponse2.phoneNumber : str3, (i2 & 8) != 0 ? storeResponse2.format : str4, (i2 & 16) != 0 ? storeResponse2.type : str5, (i2 & 32) != 0 ? storeResponse2.passDays : list, (i2 & 64) != 0 ? storeResponse2.f68526id : str6, (i2 & 128) != 0 ? storeResponse2.address : storeAddressResponse, (i2 & 256) != 0 ? storeResponse2.openingPattern : list2, (i2 & 512) != 0 ? storeResponse2.openingExceptionalPattern : list3, (i2 & 1024) != 0 ? storeResponse2.storeServices : list4, (i2 & 2048) != 0 ? storeResponse2.gln : str7, (i2 & 4096) != 0 ? storeResponse2.anabelKey : str8, (i2 & 8192) != 0 ? storeResponse2.distance : str9, (i2 & 16384) != 0 ? storeResponse2.minOrderAmount : str10, (i2 & 32768) != 0 ? storeResponse2.paymentOnSiteActivated : z, (i2 & 65536) != 0 ? storeResponse2.isLoyaltyActivated : z2);
    }

    @C12579k
    public final String component1() {
        return this.name;
    }

    @C12579k
    public final List<OpeningExceptionalPatternResponse> component10() {
        return this.openingExceptionalPattern;
    }

    @C12579k
    public final List<StoreServiceResponse> component11() {
        return this.storeServices;
    }

    @C12579k
    public final String component12() {
        return this.gln;
    }

    @C12579k
    public final String component13() {
        return this.anabelKey;
    }

    @C12579k
    public final String component14() {
        return this.distance;
    }

    @C12579k
    public final String component15() {
        return this.minOrderAmount;
    }

    public final boolean component16() {
        return this.paymentOnSiteActivated;
    }

    public final boolean component17() {
        return this.isLoyaltyActivated;
    }

    @C12579k
    public final String component2() {
        return this.banner;
    }

    @C12579k
    public final String component3() {
        return this.phoneNumber;
    }

    @C12579k
    public final String component4() {
        return this.format;
    }

    @C12579k
    public final String component5() {
        return this.type;
    }

    @C12579k
    public final List<Boolean> component6() {
        return this.passDays;
    }

    @C12579k
    public final String component7() {
        return this.f68526id;
    }

    @C12580l
    public final StoreAddressResponse component8() {
        return this.address;
    }

    @C12579k
    public final List<OpeningPatternResponse> component9() {
        return this.openingPattern;
    }

    @C12579k
    public final StoreResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k List<Boolean> list, @C12579k String str6, @C12580l StoreAddressResponse storeAddressResponse, @C12579k List<OpeningPatternResponse> list2, @C12579k List<OpeningExceptionalPatternResponse> list3, @C12579k List<StoreServiceResponse> list4, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, boolean z, boolean z2) {
        String str11 = str;
        Intrinsics.checkNotNullParameter(str11, "name");
        Intrinsics.checkNotNullParameter(str2, "banner");
        Intrinsics.checkNotNullParameter(str3, C0861a.f2689A);
        Intrinsics.checkNotNullParameter(str4, "format");
        Intrinsics.checkNotNullParameter(str5, "type");
        Intrinsics.checkNotNullParameter(list, "passDays");
        Intrinsics.checkNotNullParameter(str6, "id");
        Intrinsics.checkNotNullParameter(list2, "openingPattern");
        Intrinsics.checkNotNullParameter(list3, "openingExceptionalPattern");
        Intrinsics.checkNotNullParameter(list4, "storeServices");
        Intrinsics.checkNotNullParameter(str7, "gln");
        Intrinsics.checkNotNullParameter(str8, "anabelKey");
        Intrinsics.checkNotNullParameter(str9, "distance");
        Intrinsics.checkNotNullParameter(str10, "minOrderAmount");
        return new StoreResponse(str11, str2, str3, str4, str5, list, str6, storeAddressResponse, list2, list3, list4, str7, str8, str9, str10, z, z2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreResponse)) {
            return false;
        }
        StoreResponse storeResponse = (StoreResponse) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) storeResponse.name) && Intrinsics.areEqual((Object) this.banner, (Object) storeResponse.banner) && Intrinsics.areEqual((Object) this.phoneNumber, (Object) storeResponse.phoneNumber) && Intrinsics.areEqual((Object) this.format, (Object) storeResponse.format) && Intrinsics.areEqual((Object) this.type, (Object) storeResponse.type) && Intrinsics.areEqual((Object) this.passDays, (Object) storeResponse.passDays) && Intrinsics.areEqual((Object) this.f68526id, (Object) storeResponse.f68526id) && Intrinsics.areEqual((Object) this.address, (Object) storeResponse.address) && Intrinsics.areEqual((Object) this.openingPattern, (Object) storeResponse.openingPattern) && Intrinsics.areEqual((Object) this.openingExceptionalPattern, (Object) storeResponse.openingExceptionalPattern) && Intrinsics.areEqual((Object) this.storeServices, (Object) storeResponse.storeServices) && Intrinsics.areEqual((Object) this.gln, (Object) storeResponse.gln) && Intrinsics.areEqual((Object) this.anabelKey, (Object) storeResponse.anabelKey) && Intrinsics.areEqual((Object) this.distance, (Object) storeResponse.distance) && Intrinsics.areEqual((Object) this.minOrderAmount, (Object) storeResponse.minOrderAmount) && this.paymentOnSiteActivated == storeResponse.paymentOnSiteActivated && this.isLoyaltyActivated == storeResponse.isLoyaltyActivated;
    }

    @C12580l
    public final StoreAddressResponse getAddress() {
        return this.address;
    }

    @C12579k
    public final String getAnabelKey() {
        return this.anabelKey;
    }

    @C12579k
    public final String getBanner() {
        return this.banner;
    }

    @C12579k
    public final String getDistance() {
        return this.distance;
    }

    @C12579k
    public final String getFormat() {
        return this.format;
    }

    @C12579k
    public final String getGln() {
        return this.gln;
    }

    @C12579k
    public final String getId() {
        return this.f68526id;
    }

    @C12579k
    public final String getMinOrderAmount() {
        return this.minOrderAmount;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    @C12579k
    public final List<OpeningExceptionalPatternResponse> getOpeningExceptionalPattern() {
        return this.openingExceptionalPattern;
    }

    @C12579k
    public final List<OpeningPatternResponse> getOpeningPattern() {
        return this.openingPattern;
    }

    @C12579k
    public final List<Boolean> getPassDays() {
        return this.passDays;
    }

    public final boolean getPaymentOnSiteActivated() {
        return this.paymentOnSiteActivated;
    }

    @C12579k
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @C12579k
    public final List<StoreServiceResponse> getStoreServices() {
        return this.storeServices;
    }

    @C12579k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.name.hashCode() * 31) + this.banner.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.format.hashCode()) * 31) + this.type.hashCode()) * 31) + this.passDays.hashCode()) * 31) + this.f68526id.hashCode()) * 31;
        StoreAddressResponse storeAddressResponse = this.address;
        int hashCode2 = (((((((((((((((hashCode + (storeAddressResponse == null ? 0 : storeAddressResponse.hashCode())) * 31) + this.openingPattern.hashCode()) * 31) + this.openingExceptionalPattern.hashCode()) * 31) + this.storeServices.hashCode()) * 31) + this.gln.hashCode()) * 31) + this.anabelKey.hashCode()) * 31) + this.distance.hashCode()) * 31) + this.minOrderAmount.hashCode()) * 31;
        boolean z = this.paymentOnSiteActivated;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isLoyaltyActivated;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final boolean isLoyaltyActivated() {
        return this.isLoyaltyActivated;
    }

    @C12579k
    public String toString() {
        String str = this.name;
        String str2 = this.banner;
        String str3 = this.phoneNumber;
        String str4 = this.format;
        String str5 = this.type;
        List<Boolean> list = this.passDays;
        String str6 = this.f68526id;
        StoreAddressResponse storeAddressResponse = this.address;
        List<OpeningPatternResponse> list2 = this.openingPattern;
        List<OpeningExceptionalPatternResponse> list3 = this.openingExceptionalPattern;
        List<StoreServiceResponse> list4 = this.storeServices;
        String str7 = this.gln;
        String str8 = this.anabelKey;
        String str9 = this.distance;
        String str10 = this.minOrderAmount;
        boolean z = this.paymentOnSiteActivated;
        boolean z2 = this.isLoyaltyActivated;
        return "StoreResponse(name=" + str + ", banner=" + str2 + ", phoneNumber=" + str3 + ", format=" + str4 + ", type=" + str5 + ", passDays=" + list + ", id=" + str6 + ", address=" + storeAddressResponse + ", openingPattern=" + list2 + ", openingExceptionalPattern=" + list3 + ", storeServices=" + list4 + ", gln=" + str7 + ", anabelKey=" + str8 + ", distance=" + str9 + ", minOrderAmount=" + str10 + ", paymentOnSiteActivated=" + z + ", isLoyaltyActivated=" + z2 + ")";
    }

    public StoreResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k List<Boolean> list, @C12579k String str6, @C12580l StoreAddressResponse storeAddressResponse, @C12579k List<OpeningPatternResponse> list2, @C12579k List<OpeningExceptionalPatternResponse> list3, @C12579k List<StoreServiceResponse> list4, @C12579k String str7, @C12579k String str8, @C12579k String str9, @C12579k String str10, boolean z, boolean z2) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        List<Boolean> list5 = list;
        String str16 = str6;
        List<OpeningPatternResponse> list6 = list2;
        List<OpeningExceptionalPatternResponse> list7 = list3;
        List<StoreServiceResponse> list8 = list4;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        Intrinsics.checkNotNullParameter(str11, "name");
        Intrinsics.checkNotNullParameter(str12, "banner");
        Intrinsics.checkNotNullParameter(str13, C0861a.f2689A);
        Intrinsics.checkNotNullParameter(str14, "format");
        Intrinsics.checkNotNullParameter(str15, "type");
        Intrinsics.checkNotNullParameter(list5, "passDays");
        Intrinsics.checkNotNullParameter(str16, "id");
        Intrinsics.checkNotNullParameter(list6, "openingPattern");
        Intrinsics.checkNotNullParameter(list7, "openingExceptionalPattern");
        Intrinsics.checkNotNullParameter(list8, "storeServices");
        Intrinsics.checkNotNullParameter(str17, "gln");
        Intrinsics.checkNotNullParameter(str18, "anabelKey");
        Intrinsics.checkNotNullParameter(str19, "distance");
        Intrinsics.checkNotNullParameter(str20, "minOrderAmount");
        this.name = str11;
        this.banner = str12;
        this.phoneNumber = str13;
        this.format = str14;
        this.type = str15;
        this.passDays = list5;
        this.f68526id = str16;
        this.address = storeAddressResponse;
        this.openingPattern = list6;
        this.openingExceptionalPattern = list7;
        this.storeServices = list8;
        this.gln = str17;
        this.anabelKey = str18;
        this.distance = str19;
        this.minOrderAmount = str20;
        this.paymentOnSiteActivated = z;
        this.isLoyaltyActivated = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StoreResponse(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.List r25, java.lang.String r26, com.carrefour.fid.android.service.data.api.entities.StoreAddressResponse r27, java.util.List r28, java.util.List r29, java.util.List r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, boolean r35, boolean r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r19 = this;
            r0 = r37
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r20
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r21
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r22
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r2
            goto L_0x0024
        L_0x0022:
            r5 = r23
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002c
        L_0x002a:
            r6 = r24
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0035
            java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0037
        L_0x0035:
            r7 = r25
        L_0x0037:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003d
            r8 = r2
            goto L_0x003f
        L_0x003d:
            r8 = r26
        L_0x003f:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0045
            r9 = 0
            goto L_0x0047
        L_0x0045:
            r9 = r27
        L_0x0047:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0050
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0052
        L_0x0050:
            r10 = r28
        L_0x0052:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x005b
            java.util.List r11 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x005d
        L_0x005b:
            r11 = r29
        L_0x005d:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0066
            java.util.List r12 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0068
        L_0x0066:
            r12 = r30
        L_0x0068:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x006e
            r13 = r2
            goto L_0x0070
        L_0x006e:
            r13 = r31
        L_0x0070:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0076
            r14 = r2
            goto L_0x0078
        L_0x0076:
            r14 = r32
        L_0x0078:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x007e
            r15 = r2
            goto L_0x0080
        L_0x007e:
            r15 = r33
        L_0x0080:
            r38 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0089
            r2 = r38
            goto L_0x008b
        L_0x0089:
            r2 = r34
        L_0x008b:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            r17 = 0
            if (r16 == 0) goto L_0x0097
            r16 = r17
            goto L_0x0099
        L_0x0097:
            r16 = r35
        L_0x0099:
            r18 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r18
            if (r0 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r17 = r36
        L_0x00a2:
            r20 = r19
            r21 = r1
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r2
            r36 = r16
            r37 = r17
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.api.entities.StoreResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.carrefour.fid.android.service.data.api.entities.StoreAddressResponse, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
