package com.carrefour.fid.android.service.data.api.entities;

import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/UpdateStoreResponse;", "", "storeResponse", "Lcom/carrefour/fid/android/service/data/api/entities/StoreResponse;", "id", "", "(Lcom/carrefour/fid/android/service/data/api/entities/StoreResponse;J)V", "getId", "()J", "getStoreResponse", "()Lcom/carrefour/fid/android/service/data/api/entities/StoreResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UpdateStoreResponse {

    /* renamed from: id */
    private final long f68529id;
    @C33608c("DetailedFacility")
    @C12580l
    private final StoreResponse storeResponse;

    public UpdateStoreResponse() {
        this((StoreResponse) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UpdateStoreResponse copy$default(UpdateStoreResponse updateStoreResponse, StoreResponse storeResponse2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            storeResponse2 = updateStoreResponse.storeResponse;
        }
        if ((i & 2) != 0) {
            j = updateStoreResponse.f68529id;
        }
        return updateStoreResponse.copy(storeResponse2, j);
    }

    @C12580l
    public final StoreResponse component1() {
        return this.storeResponse;
    }

    public final long component2() {
        return this.f68529id;
    }

    @C12579k
    public final UpdateStoreResponse copy(@C12580l StoreResponse storeResponse2, long j) {
        return new UpdateStoreResponse(storeResponse2, j);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateStoreResponse)) {
            return false;
        }
        UpdateStoreResponse updateStoreResponse = (UpdateStoreResponse) obj;
        return Intrinsics.areEqual((Object) this.storeResponse, (Object) updateStoreResponse.storeResponse) && this.f68529id == updateStoreResponse.f68529id;
    }

    public final long getId() {
        return this.f68529id;
    }

    @C12580l
    public final StoreResponse getStoreResponse() {
        return this.storeResponse;
    }

    public int hashCode() {
        StoreResponse storeResponse2 = this.storeResponse;
        return ((storeResponse2 == null ? 0 : storeResponse2.hashCode()) * 31) + Long.hashCode(this.f68529id);
    }

    @C12579k
    public String toString() {
        StoreResponse storeResponse2 = this.storeResponse;
        long j = this.f68529id;
        return "UpdateStoreResponse(storeResponse=" + storeResponse2 + ", id=" + j + ")";
    }

    public UpdateStoreResponse(@C12580l StoreResponse storeResponse2, long j) {
        this.storeResponse = storeResponse2;
        this.f68529id = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateStoreResponse(StoreResponse storeResponse2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : storeResponse2, (i & 2) != 0 ? 0 : j);
    }
}
