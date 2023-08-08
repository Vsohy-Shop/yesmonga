package com.carrefour.fid.android.service.data.api.entities;

import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/StoreServicesPictosResponse;", "", "servicesPictos", "", "Lcom/carrefour/fid/android/service/data/api/entities/StoreServiceWithUrlResponse;", "count", "", "(Ljava/util/List;I)V", "getCount", "()I", "getServicesPictos", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StoreServicesPictosResponse {
    @C33608c("count")
    private final int count;
    @C33608c("data")
    @C12580l
    private final List<StoreServiceWithUrlResponse> servicesPictos;

    public StoreServicesPictosResponse() {
        this((List) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StoreServicesPictosResponse copy$default(StoreServicesPictosResponse storeServicesPictosResponse, List<StoreServiceWithUrlResponse> list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = storeServicesPictosResponse.servicesPictos;
        }
        if ((i2 & 2) != 0) {
            i = storeServicesPictosResponse.count;
        }
        return storeServicesPictosResponse.copy(list, i);
    }

    @C12580l
    public final List<StoreServiceWithUrlResponse> component1() {
        return this.servicesPictos;
    }

    public final int component2() {
        return this.count;
    }

    @C12579k
    public final StoreServicesPictosResponse copy(@C12580l List<StoreServiceWithUrlResponse> list, int i) {
        return new StoreServicesPictosResponse(list, i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreServicesPictosResponse)) {
            return false;
        }
        StoreServicesPictosResponse storeServicesPictosResponse = (StoreServicesPictosResponse) obj;
        return Intrinsics.areEqual((Object) this.servicesPictos, (Object) storeServicesPictosResponse.servicesPictos) && this.count == storeServicesPictosResponse.count;
    }

    public final int getCount() {
        return this.count;
    }

    @C12580l
    public final List<StoreServiceWithUrlResponse> getServicesPictos() {
        return this.servicesPictos;
    }

    public int hashCode() {
        List<StoreServiceWithUrlResponse> list = this.servicesPictos;
        return ((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.count);
    }

    @C12579k
    public String toString() {
        List<StoreServiceWithUrlResponse> list = this.servicesPictos;
        int i = this.count;
        return "StoreServicesPictosResponse(servicesPictos=" + list + ", count=" + i + ")";
    }

    public StoreServicesPictosResponse(@C12580l List<StoreServiceWithUrlResponse> list, int i) {
        this.servicesPictos = list;
        this.count = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoreServicesPictosResponse(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : i);
    }
}
