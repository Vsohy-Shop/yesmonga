package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsBody;", "", "customerKey", "", "storeId", "searchMap", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCustomerKey", "()Ljava/lang/String;", "getSearchMap", "()Ljava/util/List;", "getStoreId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMRecommendedNeedsBody {
    public static final int $stable = 8;
    @C33608c("customer_key")
    @C12579k
    private final String customerKey;
    @C33608c("search_map")
    @C12579k
    private final List<String> searchMap;
    @C33608c("store_id")
    @C12579k
    private final String storeId;

    public APIMRecommendedNeedsBody(@C12579k String str, @C12579k String str2, @C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(str, "customerKey");
        Intrinsics.checkNotNullParameter(str2, "storeId");
        Intrinsics.checkNotNullParameter(list, "searchMap");
        this.customerKey = str;
        this.storeId = str2;
        this.searchMap = list;
    }

    public static /* synthetic */ APIMRecommendedNeedsBody copy$default(APIMRecommendedNeedsBody aPIMRecommendedNeedsBody, String str, String str2, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPIMRecommendedNeedsBody.customerKey;
        }
        if ((i & 2) != 0) {
            str2 = aPIMRecommendedNeedsBody.storeId;
        }
        if ((i & 4) != 0) {
            list = aPIMRecommendedNeedsBody.searchMap;
        }
        return aPIMRecommendedNeedsBody.copy(str, str2, list);
    }

    @C12579k
    public final String component1() {
        return this.customerKey;
    }

    @C12579k
    public final String component2() {
        return this.storeId;
    }

    @C12579k
    public final List<String> component3() {
        return this.searchMap;
    }

    @C12579k
    public final APIMRecommendedNeedsBody copy(@C12579k String str, @C12579k String str2, @C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(str, "customerKey");
        Intrinsics.checkNotNullParameter(str2, "storeId");
        Intrinsics.checkNotNullParameter(list, "searchMap");
        return new APIMRecommendedNeedsBody(str, str2, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMRecommendedNeedsBody)) {
            return false;
        }
        APIMRecommendedNeedsBody aPIMRecommendedNeedsBody = (APIMRecommendedNeedsBody) obj;
        return Intrinsics.areEqual((Object) this.customerKey, (Object) aPIMRecommendedNeedsBody.customerKey) && Intrinsics.areEqual((Object) this.storeId, (Object) aPIMRecommendedNeedsBody.storeId) && Intrinsics.areEqual((Object) this.searchMap, (Object) aPIMRecommendedNeedsBody.searchMap);
    }

    @C12579k
    public final String getCustomerKey() {
        return this.customerKey;
    }

    @C12579k
    public final List<String> getSearchMap() {
        return this.searchMap;
    }

    @C12579k
    public final String getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        return (((this.customerKey.hashCode() * 31) + this.storeId.hashCode()) * 31) + this.searchMap.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.customerKey;
        String str2 = this.storeId;
        List<String> list = this.searchMap;
        return "APIMRecommendedNeedsBody(customerKey=" + str + ", storeId=" + str2 + ", searchMap=" + list + ")";
    }
}
