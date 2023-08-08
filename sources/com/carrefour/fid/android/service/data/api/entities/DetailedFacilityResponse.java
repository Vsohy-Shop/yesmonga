package com.carrefour.fid.android.service.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/DetailedFacilityResponse;", "", "detailedFacility", "Lcom/carrefour/fid/android/service/data/api/entities/StoreResponse;", "(Lcom/carrefour/fid/android/service/data/api/entities/StoreResponse;)V", "getDetailedFacility", "()Lcom/carrefour/fid/android/service/data/api/entities/StoreResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class DetailedFacilityResponse {
    @C33608c("DetailedFacility")
    @C12580l
    private final StoreResponse detailedFacility;

    public DetailedFacilityResponse(@C12580l StoreResponse storeResponse) {
        this.detailedFacility = storeResponse;
    }

    public static /* synthetic */ DetailedFacilityResponse copy$default(DetailedFacilityResponse detailedFacilityResponse, StoreResponse storeResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            storeResponse = detailedFacilityResponse.detailedFacility;
        }
        return detailedFacilityResponse.copy(storeResponse);
    }

    @C12580l
    public final StoreResponse component1() {
        return this.detailedFacility;
    }

    @C12579k
    public final DetailedFacilityResponse copy(@C12580l StoreResponse storeResponse) {
        return new DetailedFacilityResponse(storeResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailedFacilityResponse) && Intrinsics.areEqual((Object) this.detailedFacility, (Object) ((DetailedFacilityResponse) obj).detailedFacility);
    }

    @C12580l
    public final StoreResponse getDetailedFacility() {
        return this.detailedFacility;
    }

    public int hashCode() {
        StoreResponse storeResponse = this.detailedFacility;
        if (storeResponse == null) {
            return 0;
        }
        return storeResponse.hashCode();
    }

    @C12579k
    public String toString() {
        StoreResponse storeResponse = this.detailedFacility;
        return "DetailedFacilityResponse(detailedFacility=" + storeResponse + ")";
    }
}
