package com.carrefour.fid.android.domain.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.urbanairship.util.C9650g;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/FacilityDomain;", "", "id", "", "name", "streetAddressOne", "streetAddressTwo", "city", "service", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "banner", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/service/models/StoreService;Ljava/lang/String;)V", "getBanner", "()Ljava/lang/String;", "getCity", "getId", "getName", "getService", "()Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "getStreetAddressOne", "getStreetAddressTwo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class FacilityDomain {
    public static final int $stable = 8;
    @C12579k
    private final String banner;
    @C12579k
    private final String city;
    @C12579k

    /* renamed from: id */
    private final String f95156id;
    @C12579k
    private final String name;
    @C12580l
    private final StoreService service;
    @C12579k
    private final String streetAddressOne;
    @C12580l
    private final String streetAddressTwo;

    public FacilityDomain(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l String str4, @C12579k String str5, @C12580l StoreService storeService, @C12579k String str6) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "streetAddressOne");
        Intrinsics.checkNotNullParameter(str5, C9650g.f26444g);
        Intrinsics.checkNotNullParameter(str6, "banner");
        this.f95156id = str;
        this.name = str2;
        this.streetAddressOne = str3;
        this.streetAddressTwo = str4;
        this.city = str5;
        this.service = storeService;
        this.banner = str6;
    }

    public static /* synthetic */ FacilityDomain copy$default(FacilityDomain facilityDomain, String str, String str2, String str3, String str4, String str5, StoreService storeService, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = facilityDomain.f95156id;
        }
        if ((i & 2) != 0) {
            str2 = facilityDomain.name;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = facilityDomain.streetAddressOne;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = facilityDomain.streetAddressTwo;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = facilityDomain.city;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            storeService = facilityDomain.service;
        }
        StoreService storeService2 = storeService;
        if ((i & 64) != 0) {
            str6 = facilityDomain.banner;
        }
        return facilityDomain.copy(str, str7, str8, str9, str10, storeService2, str6);
    }

    @C12579k
    public final String component1() {
        return this.f95156id;
    }

    @C12579k
    public final String component2() {
        return this.name;
    }

    @C12579k
    public final String component3() {
        return this.streetAddressOne;
    }

    @C12580l
    public final String component4() {
        return this.streetAddressTwo;
    }

    @C12579k
    public final String component5() {
        return this.city;
    }

    @C12580l
    public final StoreService component6() {
        return this.service;
    }

    @C12579k
    public final String component7() {
        return this.banner;
    }

    @C12579k
    public final FacilityDomain copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l String str4, @C12579k String str5, @C12580l StoreService storeService, @C12579k String str6) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "streetAddressOne");
        Intrinsics.checkNotNullParameter(str5, C9650g.f26444g);
        String str7 = str6;
        Intrinsics.checkNotNullParameter(str7, "banner");
        return new FacilityDomain(str, str2, str3, str4, str5, storeService, str7);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FacilityDomain)) {
            return false;
        }
        FacilityDomain facilityDomain = (FacilityDomain) obj;
        return Intrinsics.areEqual((Object) this.f95156id, (Object) facilityDomain.f95156id) && Intrinsics.areEqual((Object) this.name, (Object) facilityDomain.name) && Intrinsics.areEqual((Object) this.streetAddressOne, (Object) facilityDomain.streetAddressOne) && Intrinsics.areEqual((Object) this.streetAddressTwo, (Object) facilityDomain.streetAddressTwo) && Intrinsics.areEqual((Object) this.city, (Object) facilityDomain.city) && Intrinsics.areEqual((Object) this.service, (Object) facilityDomain.service) && Intrinsics.areEqual((Object) this.banner, (Object) facilityDomain.banner);
    }

    @C12579k
    public final String getBanner() {
        return this.banner;
    }

    @C12579k
    public final String getCity() {
        return this.city;
    }

    @C12579k
    public final String getId() {
        return this.f95156id;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    @C12580l
    public final StoreService getService() {
        return this.service;
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
        int hashCode = ((((this.f95156id.hashCode() * 31) + this.name.hashCode()) * 31) + this.streetAddressOne.hashCode()) * 31;
        String str = this.streetAddressTwo;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.city.hashCode()) * 31;
        StoreService storeService = this.service;
        if (storeService != null) {
            i = storeService.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.banner.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f95156id;
        String str2 = this.name;
        String str3 = this.streetAddressOne;
        String str4 = this.streetAddressTwo;
        String str5 = this.city;
        StoreService storeService = this.service;
        String str6 = this.banner;
        return "FacilityDomain(id=" + str + ", name=" + str2 + ", streetAddressOne=" + str3 + ", streetAddressTwo=" + str4 + ", city=" + str5 + ", service=" + storeService + ", banner=" + str6 + ")";
    }
}
