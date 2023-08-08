package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMDepartmentsResponse;", "", "mergedCatalogs", "Lcom/carrefour/fid/android/data/entities/APIMCatalogsResponse;", "(Lcom/carrefour/fid/android/data/entities/APIMCatalogsResponse;)V", "getMergedCatalogs", "()Lcom/carrefour/fid/android/data/entities/APIMCatalogsResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMDepartmentsResponse {
    public static final int $stable = 8;
    @C33608c("merged_catalogs")
    @C12580l
    private final APIMCatalogsResponse mergedCatalogs;

    public APIMDepartmentsResponse() {
        this((APIMCatalogsResponse) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ APIMDepartmentsResponse copy$default(APIMDepartmentsResponse aPIMDepartmentsResponse, APIMCatalogsResponse aPIMCatalogsResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            aPIMCatalogsResponse = aPIMDepartmentsResponse.mergedCatalogs;
        }
        return aPIMDepartmentsResponse.copy(aPIMCatalogsResponse);
    }

    @C12580l
    public final APIMCatalogsResponse component1() {
        return this.mergedCatalogs;
    }

    @C12579k
    public final APIMDepartmentsResponse copy(@C12580l APIMCatalogsResponse aPIMCatalogsResponse) {
        return new APIMDepartmentsResponse(aPIMCatalogsResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof APIMDepartmentsResponse) && Intrinsics.areEqual((Object) this.mergedCatalogs, (Object) ((APIMDepartmentsResponse) obj).mergedCatalogs);
    }

    @C12580l
    public final APIMCatalogsResponse getMergedCatalogs() {
        return this.mergedCatalogs;
    }

    public int hashCode() {
        APIMCatalogsResponse aPIMCatalogsResponse = this.mergedCatalogs;
        if (aPIMCatalogsResponse == null) {
            return 0;
        }
        return aPIMCatalogsResponse.hashCode();
    }

    @C12579k
    public String toString() {
        APIMCatalogsResponse aPIMCatalogsResponse = this.mergedCatalogs;
        return "APIMDepartmentsResponse(mergedCatalogs=" + aPIMCatalogsResponse + ")";
    }

    public APIMDepartmentsResponse(@C12580l APIMCatalogsResponse aPIMCatalogsResponse) {
        this.mergedCatalogs = aPIMCatalogsResponse;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ APIMDepartmentsResponse(APIMCatalogsResponse aPIMCatalogsResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aPIMCatalogsResponse);
    }
}
