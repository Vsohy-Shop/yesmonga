package com.carrefour.fid.android.service.data.api.entities;

import com.google.gson.annotations.C33608c;
import com.urbanairship.analytics.location.C35563d;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/StoreCoordinatesResponse;", "", "latitude", "", "longitude", "(Ljava/lang/String;Ljava/lang/String;)V", "getLatitude", "()Ljava/lang/String;", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StoreCoordinatesResponse {
    @C33608c("latitude")
    @C12579k
    private final String latitude;
    @C33608c("longitude")
    @C12579k
    private final String longitude;

    public StoreCoordinatesResponse() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StoreCoordinatesResponse copy$default(StoreCoordinatesResponse storeCoordinatesResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storeCoordinatesResponse.latitude;
        }
        if ((i & 2) != 0) {
            str2 = storeCoordinatesResponse.longitude;
        }
        return storeCoordinatesResponse.copy(str, str2);
    }

    @C12579k
    public final String component1() {
        return this.latitude;
    }

    @C12579k
    public final String component2() {
        return this.longitude;
    }

    @C12579k
    public final StoreCoordinatesResponse copy(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, C35563d.f87833T0);
        Intrinsics.checkNotNullParameter(str2, C35563d.f87834U0);
        return new StoreCoordinatesResponse(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreCoordinatesResponse)) {
            return false;
        }
        StoreCoordinatesResponse storeCoordinatesResponse = (StoreCoordinatesResponse) obj;
        return Intrinsics.areEqual((Object) this.latitude, (Object) storeCoordinatesResponse.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) storeCoordinatesResponse.longitude);
    }

    @C12579k
    public final String getLatitude() {
        return this.latitude;
    }

    @C12579k
    public final String getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (this.latitude.hashCode() * 31) + this.longitude.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.latitude;
        String str2 = this.longitude;
        return "StoreCoordinatesResponse(latitude=" + str + ", longitude=" + str2 + ")";
    }

    public StoreCoordinatesResponse(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, C35563d.f87833T0);
        Intrinsics.checkNotNullParameter(str2, C35563d.f87834U0);
        this.latitude = str;
        this.longitude = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoreCoordinatesResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
