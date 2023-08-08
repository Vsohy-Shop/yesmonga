package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u001f\u0010\u000e\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0010\u001a\u00020\u00002\u001e\b\u0002\u0010\u0002\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R'\u0010\u0002\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeeds;", "", "data", "", "", "", "Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsItems;", "metadata", "Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsMetadata;", "(Ljava/util/List;Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsMetadata;)V", "getData", "()Ljava/util/List;", "getMetadata", "()Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsMetadata;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMRecommendedNeeds {
    public static final int $stable = 8;
    @C12580l
    private final List<Map<String, APIMRecommendedNeedsItems>> data;
    @C12580l
    private final APIMRecommendedNeedsMetadata metadata;

    public APIMRecommendedNeeds(@C12580l List<? extends Map<String, APIMRecommendedNeedsItems>> list, @C12580l APIMRecommendedNeedsMetadata aPIMRecommendedNeedsMetadata) {
        this.data = list;
        this.metadata = aPIMRecommendedNeedsMetadata;
    }

    public static /* synthetic */ APIMRecommendedNeeds copy$default(APIMRecommendedNeeds aPIMRecommendedNeeds, List<Map<String, APIMRecommendedNeedsItems>> list, APIMRecommendedNeedsMetadata aPIMRecommendedNeedsMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aPIMRecommendedNeeds.data;
        }
        if ((i & 2) != 0) {
            aPIMRecommendedNeedsMetadata = aPIMRecommendedNeeds.metadata;
        }
        return aPIMRecommendedNeeds.copy(list, aPIMRecommendedNeedsMetadata);
    }

    @C12580l
    public final List<Map<String, APIMRecommendedNeedsItems>> component1() {
        return this.data;
    }

    @C12580l
    public final APIMRecommendedNeedsMetadata component2() {
        return this.metadata;
    }

    @C12579k
    public final APIMRecommendedNeeds copy(@C12580l List<? extends Map<String, APIMRecommendedNeedsItems>> list, @C12580l APIMRecommendedNeedsMetadata aPIMRecommendedNeedsMetadata) {
        return new APIMRecommendedNeeds(list, aPIMRecommendedNeedsMetadata);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMRecommendedNeeds)) {
            return false;
        }
        APIMRecommendedNeeds aPIMRecommendedNeeds = (APIMRecommendedNeeds) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) aPIMRecommendedNeeds.data) && Intrinsics.areEqual((Object) this.metadata, (Object) aPIMRecommendedNeeds.metadata);
    }

    @C12580l
    public final List<Map<String, APIMRecommendedNeedsItems>> getData() {
        return this.data;
    }

    @C12580l
    public final APIMRecommendedNeedsMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        List<Map<String, APIMRecommendedNeedsItems>> list = this.data;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        APIMRecommendedNeedsMetadata aPIMRecommendedNeedsMetadata = this.metadata;
        if (aPIMRecommendedNeedsMetadata != null) {
            i = aPIMRecommendedNeedsMetadata.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        List<Map<String, APIMRecommendedNeedsItems>> list = this.data;
        APIMRecommendedNeedsMetadata aPIMRecommendedNeedsMetadata = this.metadata;
        return "APIMRecommendedNeeds(data=" + list + ", metadata=" + aPIMRecommendedNeedsMetadata + ")";
    }
}
