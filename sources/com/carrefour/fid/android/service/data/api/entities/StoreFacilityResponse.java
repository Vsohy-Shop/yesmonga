package com.carrefour.fid.android.service.data.api.entities;

import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/StoreFacilityResponse;", "", "storeResponseList", "", "Lcom/carrefour/fid/android/service/data/api/entities/StoreResponse;", "count", "", "meta", "Lcom/carrefour/fid/android/service/data/api/entities/StoreFacilityMetaResponse;", "(Ljava/util/List;ILcom/carrefour/fid/android/service/data/api/entities/StoreFacilityMetaResponse;)V", "getCount", "()I", "getMeta", "()Lcom/carrefour/fid/android/service/data/api/entities/StoreFacilityMetaResponse;", "getStoreResponseList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StoreFacilityResponse {
    @C33608c("count")
    private final int count;
    @C33608c("meta")
    @C12580l
    private final StoreFacilityMetaResponse meta;
    @C33608c("data")
    @C12580l
    private final List<StoreResponse> storeResponseList;

    public StoreFacilityResponse() {
        this((List) null, 0, (StoreFacilityMetaResponse) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StoreFacilityResponse copy$default(StoreFacilityResponse storeFacilityResponse, List<StoreResponse> list, int i, StoreFacilityMetaResponse storeFacilityMetaResponse, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = storeFacilityResponse.storeResponseList;
        }
        if ((i2 & 2) != 0) {
            i = storeFacilityResponse.count;
        }
        if ((i2 & 4) != 0) {
            storeFacilityMetaResponse = storeFacilityResponse.meta;
        }
        return storeFacilityResponse.copy(list, i, storeFacilityMetaResponse);
    }

    @C12580l
    public final List<StoreResponse> component1() {
        return this.storeResponseList;
    }

    public final int component2() {
        return this.count;
    }

    @C12580l
    public final StoreFacilityMetaResponse component3() {
        return this.meta;
    }

    @C12579k
    public final StoreFacilityResponse copy(@C12580l List<StoreResponse> list, int i, @C12580l StoreFacilityMetaResponse storeFacilityMetaResponse) {
        return new StoreFacilityResponse(list, i, storeFacilityMetaResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreFacilityResponse)) {
            return false;
        }
        StoreFacilityResponse storeFacilityResponse = (StoreFacilityResponse) obj;
        return Intrinsics.areEqual((Object) this.storeResponseList, (Object) storeFacilityResponse.storeResponseList) && this.count == storeFacilityResponse.count && Intrinsics.areEqual((Object) this.meta, (Object) storeFacilityResponse.meta);
    }

    public final int getCount() {
        return this.count;
    }

    @C12580l
    public final StoreFacilityMetaResponse getMeta() {
        return this.meta;
    }

    @C12580l
    public final List<StoreResponse> getStoreResponseList() {
        return this.storeResponseList;
    }

    public int hashCode() {
        List<StoreResponse> list = this.storeResponseList;
        int i = 0;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.count)) * 31;
        StoreFacilityMetaResponse storeFacilityMetaResponse = this.meta;
        if (storeFacilityMetaResponse != null) {
            i = storeFacilityMetaResponse.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        List<StoreResponse> list = this.storeResponseList;
        int i = this.count;
        StoreFacilityMetaResponse storeFacilityMetaResponse = this.meta;
        return "StoreFacilityResponse(storeResponseList=" + list + ", count=" + i + ", meta=" + storeFacilityMetaResponse + ")";
    }

    public StoreFacilityResponse(@C12580l List<StoreResponse> list, int i, @C12580l StoreFacilityMetaResponse storeFacilityMetaResponse) {
        this.storeResponseList = list;
        this.count = i;
        this.meta = storeFacilityMetaResponse;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoreFacilityResponse(List list, int i, StoreFacilityMetaResponse storeFacilityMetaResponse, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : storeFacilityMetaResponse);
    }
}
