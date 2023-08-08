package com.carrefour.fid.android.service.data.api.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/FacilityNamesResponse;", "", "id", "", "status", "facility", "Lcom/carrefour/fid/android/service/data/api/entities/FacilityName;", "(Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/service/data/api/entities/FacilityName;)V", "getFacility", "()Lcom/carrefour/fid/android/service/data/api/entities/FacilityName;", "getId", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class FacilityNamesResponse {
    @C33608c("facility")
    @C12580l
    private final FacilityName facility;
    @C33608c("facility_id")
    @C12579k

    /* renamed from: id */
    private final String f68525id;
    @C33608c("status")
    @C12579k
    private final String status;

    public FacilityNamesResponse(@C12579k String str, @C12579k String str2, @C12580l FacilityName facilityName) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "status");
        this.f68525id = str;
        this.status = str2;
        this.facility = facilityName;
    }

    public static /* synthetic */ FacilityNamesResponse copy$default(FacilityNamesResponse facilityNamesResponse, String str, String str2, FacilityName facilityName, int i, Object obj) {
        if ((i & 1) != 0) {
            str = facilityNamesResponse.f68525id;
        }
        if ((i & 2) != 0) {
            str2 = facilityNamesResponse.status;
        }
        if ((i & 4) != 0) {
            facilityName = facilityNamesResponse.facility;
        }
        return facilityNamesResponse.copy(str, str2, facilityName);
    }

    @C12579k
    public final String component1() {
        return this.f68525id;
    }

    @C12579k
    public final String component2() {
        return this.status;
    }

    @C12580l
    public final FacilityName component3() {
        return this.facility;
    }

    @C12579k
    public final FacilityNamesResponse copy(@C12579k String str, @C12579k String str2, @C12580l FacilityName facilityName) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "status");
        return new FacilityNamesResponse(str, str2, facilityName);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FacilityNamesResponse)) {
            return false;
        }
        FacilityNamesResponse facilityNamesResponse = (FacilityNamesResponse) obj;
        return Intrinsics.areEqual((Object) this.f68525id, (Object) facilityNamesResponse.f68525id) && Intrinsics.areEqual((Object) this.status, (Object) facilityNamesResponse.status) && Intrinsics.areEqual((Object) this.facility, (Object) facilityNamesResponse.facility);
    }

    @C12580l
    public final FacilityName getFacility() {
        return this.facility;
    }

    @C12579k
    public final String getId() {
        return this.f68525id;
    }

    @C12579k
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = ((this.f68525id.hashCode() * 31) + this.status.hashCode()) * 31;
        FacilityName facilityName = this.facility;
        return hashCode + (facilityName == null ? 0 : facilityName.hashCode());
    }

    @C12579k
    public String toString() {
        String str = this.f68525id;
        String str2 = this.status;
        FacilityName facilityName = this.facility;
        return "FacilityNamesResponse(id=" + str + ", status=" + str2 + ", facility=" + facilityName + ")";
    }
}
