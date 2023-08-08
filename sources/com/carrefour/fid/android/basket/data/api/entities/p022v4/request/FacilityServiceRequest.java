package com.carrefour.fid.android.basket.data.api.entities.p022v4.request;

import androidx.annotation.Keep;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/request/FacilityServiceRequest;", "", "facilityServiceId", "", "(Ljava/lang/String;)V", "getFacilityServiceId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.request.FacilityServiceRequest */
public final class FacilityServiceRequest {
    @C33608c("facility_service_id")
    @C12579k
    private final String facilityServiceId;

    public FacilityServiceRequest(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        this.facilityServiceId = str;
    }

    public static /* synthetic */ FacilityServiceRequest copy$default(FacilityServiceRequest facilityServiceRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = facilityServiceRequest.facilityServiceId;
        }
        return facilityServiceRequest.copy(str);
    }

    @C12579k
    public final String component1() {
        return this.facilityServiceId;
    }

    @C12579k
    public final FacilityServiceRequest copy(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        return new FacilityServiceRequest(str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FacilityServiceRequest) && Intrinsics.areEqual((Object) this.facilityServiceId, (Object) ((FacilityServiceRequest) obj).facilityServiceId);
    }

    @C12579k
    public final String getFacilityServiceId() {
        return this.facilityServiceId;
    }

    public int hashCode() {
        return this.facilityServiceId.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.facilityServiceId;
        return "FacilityServiceRequest(facilityServiceId=" + str + ")";
    }
}
