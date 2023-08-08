package com.carrefour.fid.android.service.data.api.entities;

import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/StoreAddressResponse;", "", "coordinatesPojo", "Lcom/carrefour/fid/android/service/data/api/entities/StoreCoordinatesResponse;", "adressOne", "", "adressTwo", "cityName", "postcode", "(Lcom/carrefour/fid/android/service/data/api/entities/StoreCoordinatesResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdressOne", "()Ljava/lang/String;", "getAdressTwo", "getCityName", "getCoordinatesPojo", "()Lcom/carrefour/fid/android/service/data/api/entities/StoreCoordinatesResponse;", "getPostcode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StoreAddressResponse {
    @C33608c("street_address_one")
    @C12579k
    private final String adressOne;
    @C33608c("street_address_two")
    @C12579k
    private final String adressTwo;
    @C33608c("city")
    @C12579k
    private final String cityName;
    @C33608c("geo_coordinates")
    @C12580l
    private final StoreCoordinatesResponse coordinatesPojo;
    @C33608c("postal_code")
    @C12579k
    private final String postcode;

    public StoreAddressResponse() {
        this((StoreCoordinatesResponse) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StoreAddressResponse copy$default(StoreAddressResponse storeAddressResponse, StoreCoordinatesResponse storeCoordinatesResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            storeCoordinatesResponse = storeAddressResponse.coordinatesPojo;
        }
        if ((i & 2) != 0) {
            str = storeAddressResponse.adressOne;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = storeAddressResponse.adressTwo;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = storeAddressResponse.cityName;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = storeAddressResponse.postcode;
        }
        return storeAddressResponse.copy(storeCoordinatesResponse, str5, str6, str7, str4);
    }

    @C12580l
    public final StoreCoordinatesResponse component1() {
        return this.coordinatesPojo;
    }

    @C12579k
    public final String component2() {
        return this.adressOne;
    }

    @C12579k
    public final String component3() {
        return this.adressTwo;
    }

    @C12579k
    public final String component4() {
        return this.cityName;
    }

    @C12579k
    public final String component5() {
        return this.postcode;
    }

    @C12579k
    public final StoreAddressResponse copy(@C12580l StoreCoordinatesResponse storeCoordinatesResponse, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "adressOne");
        Intrinsics.checkNotNullParameter(str2, "adressTwo");
        Intrinsics.checkNotNullParameter(str3, "cityName");
        Intrinsics.checkNotNullParameter(str4, "postcode");
        return new StoreAddressResponse(storeCoordinatesResponse, str, str2, str3, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreAddressResponse)) {
            return false;
        }
        StoreAddressResponse storeAddressResponse = (StoreAddressResponse) obj;
        return Intrinsics.areEqual((Object) this.coordinatesPojo, (Object) storeAddressResponse.coordinatesPojo) && Intrinsics.areEqual((Object) this.adressOne, (Object) storeAddressResponse.adressOne) && Intrinsics.areEqual((Object) this.adressTwo, (Object) storeAddressResponse.adressTwo) && Intrinsics.areEqual((Object) this.cityName, (Object) storeAddressResponse.cityName) && Intrinsics.areEqual((Object) this.postcode, (Object) storeAddressResponse.postcode);
    }

    @C12579k
    public final String getAdressOne() {
        return this.adressOne;
    }

    @C12579k
    public final String getAdressTwo() {
        return this.adressTwo;
    }

    @C12579k
    public final String getCityName() {
        return this.cityName;
    }

    @C12580l
    public final StoreCoordinatesResponse getCoordinatesPojo() {
        return this.coordinatesPojo;
    }

    @C12579k
    public final String getPostcode() {
        return this.postcode;
    }

    public int hashCode() {
        StoreCoordinatesResponse storeCoordinatesResponse = this.coordinatesPojo;
        return ((((((((storeCoordinatesResponse == null ? 0 : storeCoordinatesResponse.hashCode()) * 31) + this.adressOne.hashCode()) * 31) + this.adressTwo.hashCode()) * 31) + this.cityName.hashCode()) * 31) + this.postcode.hashCode();
    }

    @C12579k
    public String toString() {
        StoreCoordinatesResponse storeCoordinatesResponse = this.coordinatesPojo;
        String str = this.adressOne;
        String str2 = this.adressTwo;
        String str3 = this.cityName;
        String str4 = this.postcode;
        return "StoreAddressResponse(coordinatesPojo=" + storeCoordinatesResponse + ", adressOne=" + str + ", adressTwo=" + str2 + ", cityName=" + str3 + ", postcode=" + str4 + ")";
    }

    public StoreAddressResponse(@C12580l StoreCoordinatesResponse storeCoordinatesResponse, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "adressOne");
        Intrinsics.checkNotNullParameter(str2, "adressTwo");
        Intrinsics.checkNotNullParameter(str3, "cityName");
        Intrinsics.checkNotNullParameter(str4, "postcode");
        this.coordinatesPojo = storeCoordinatesResponse;
        this.adressOne = str;
        this.adressTwo = str2;
        this.cityName = str3;
        this.postcode = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StoreAddressResponse(com.carrefour.fid.android.service.data.api.entities.StoreCoordinatesResponse r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0005
            r4 = 0
        L_0x0005:
            r10 = r9 & 2
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x000d
            r10 = r0
            goto L_0x000e
        L_0x000d:
            r10 = r5
        L_0x000e:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r6
        L_0x0015:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r7
        L_0x001c:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = r8
        L_0x0022:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r2
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.api.entities.StoreAddressResponse.<init>(com.carrefour.fid.android.service.data.api.entities.StoreCoordinatesResponse, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
