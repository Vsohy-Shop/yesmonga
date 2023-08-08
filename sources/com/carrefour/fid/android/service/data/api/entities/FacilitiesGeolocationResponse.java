package com.carrefour.fid.android.service.data.api.entities;

import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/FacilitiesGeolocationResponse;", "", "data", "Lcom/carrefour/fid/android/service/data/api/entities/FacilitiesGeolocationDataResponse;", "count", "", "meta", "Lcom/carrefour/fid/android/service/data/api/entities/StoreFacilityMetaResponse;", "(Lcom/carrefour/fid/android/service/data/api/entities/FacilitiesGeolocationDataResponse;ILcom/carrefour/fid/android/service/data/api/entities/StoreFacilityMetaResponse;)V", "getCount", "()I", "getData", "()Lcom/carrefour/fid/android/service/data/api/entities/FacilitiesGeolocationDataResponse;", "getMeta", "()Lcom/carrefour/fid/android/service/data/api/entities/StoreFacilityMetaResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FacilitiesGeolocationResponse {
    @C33608c("count")
    private final int count;
    @C33608c("data")
    @C12580l
    private final FacilitiesGeolocationDataResponse data;
    @C33608c("meta")
    @C12580l
    private final StoreFacilityMetaResponse meta;

    public FacilitiesGeolocationResponse() {
        this((FacilitiesGeolocationDataResponse) null, 0, (StoreFacilityMetaResponse) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FacilitiesGeolocationResponse copy$default(FacilitiesGeolocationResponse facilitiesGeolocationResponse, FacilitiesGeolocationDataResponse facilitiesGeolocationDataResponse, int i, StoreFacilityMetaResponse storeFacilityMetaResponse, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            facilitiesGeolocationDataResponse = facilitiesGeolocationResponse.data;
        }
        if ((i2 & 2) != 0) {
            i = facilitiesGeolocationResponse.count;
        }
        if ((i2 & 4) != 0) {
            storeFacilityMetaResponse = facilitiesGeolocationResponse.meta;
        }
        return facilitiesGeolocationResponse.copy(facilitiesGeolocationDataResponse, i, storeFacilityMetaResponse);
    }

    @C12580l
    public final FacilitiesGeolocationDataResponse component1() {
        return this.data;
    }

    public final int component2() {
        return this.count;
    }

    @C12580l
    public final StoreFacilityMetaResponse component3() {
        return this.meta;
    }

    @C12579k
    public final FacilitiesGeolocationResponse copy(@C12580l FacilitiesGeolocationDataResponse facilitiesGeolocationDataResponse, int i, @C12580l StoreFacilityMetaResponse storeFacilityMetaResponse) {
        return new FacilitiesGeolocationResponse(facilitiesGeolocationDataResponse, i, storeFacilityMetaResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FacilitiesGeolocationResponse)) {
            return false;
        }
        FacilitiesGeolocationResponse facilitiesGeolocationResponse = (FacilitiesGeolocationResponse) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) facilitiesGeolocationResponse.data) && this.count == facilitiesGeolocationResponse.count && Intrinsics.areEqual((Object) this.meta, (Object) facilitiesGeolocationResponse.meta);
    }

    public final int getCount() {
        return this.count;
    }

    @C12580l
    public final FacilitiesGeolocationDataResponse getData() {
        return this.data;
    }

    @C12580l
    public final StoreFacilityMetaResponse getMeta() {
        return this.meta;
    }

    public int hashCode() {
        FacilitiesGeolocationDataResponse facilitiesGeolocationDataResponse = this.data;
        int i = 0;
        int hashCode = (((facilitiesGeolocationDataResponse == null ? 0 : facilitiesGeolocationDataResponse.hashCode()) * 31) + Integer.hashCode(this.count)) * 31;
        StoreFacilityMetaResponse storeFacilityMetaResponse = this.meta;
        if (storeFacilityMetaResponse != null) {
            i = storeFacilityMetaResponse.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        FacilitiesGeolocationDataResponse facilitiesGeolocationDataResponse = this.data;
        int i = this.count;
        StoreFacilityMetaResponse storeFacilityMetaResponse = this.meta;
        return "FacilitiesGeolocationResponse(data=" + facilitiesGeolocationDataResponse + ", count=" + i + ", meta=" + storeFacilityMetaResponse + ")";
    }

    public FacilitiesGeolocationResponse(@C12580l FacilitiesGeolocationDataResponse facilitiesGeolocationDataResponse, int i, @C12580l StoreFacilityMetaResponse storeFacilityMetaResponse) {
        this.data = facilitiesGeolocationDataResponse;
        this.count = i;
        this.meta = storeFacilityMetaResponse;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FacilitiesGeolocationResponse(FacilitiesGeolocationDataResponse facilitiesGeolocationDataResponse, int i, StoreFacilityMetaResponse storeFacilityMetaResponse, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : facilitiesGeolocationDataResponse, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : storeFacilityMetaResponse);
    }
}
