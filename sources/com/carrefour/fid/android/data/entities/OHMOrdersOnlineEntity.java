package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OHMOrdersOnlineEntity;", "", "data", "", "Lcom/carrefour/fid/android/data/entities/OHMOrdersOnlineDataEntity;", "meta", "Lcom/carrefour/fid/android/data/entities/APIMOrdersPagingEntity;", "(Ljava/util/List;Lcom/carrefour/fid/android/data/entities/APIMOrdersPagingEntity;)V", "getData", "()Ljava/util/List;", "getMeta", "()Lcom/carrefour/fid/android/data/entities/APIMOrdersPagingEntity;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OHMOrdersOnlineEntity {
    public static final int $stable = 8;
    @C33608c("data")
    @C12580l
    private final List<OHMOrdersOnlineDataEntity> data;
    @C33608c("meta")
    @C12580l
    private final APIMOrdersPagingEntity meta;

    public OHMOrdersOnlineEntity(@C12580l List<OHMOrdersOnlineDataEntity> list, @C12580l APIMOrdersPagingEntity aPIMOrdersPagingEntity) {
        this.data = list;
        this.meta = aPIMOrdersPagingEntity;
    }

    public static /* synthetic */ OHMOrdersOnlineEntity copy$default(OHMOrdersOnlineEntity oHMOrdersOnlineEntity, List<OHMOrdersOnlineDataEntity> list, APIMOrdersPagingEntity aPIMOrdersPagingEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oHMOrdersOnlineEntity.data;
        }
        if ((i & 2) != 0) {
            aPIMOrdersPagingEntity = oHMOrdersOnlineEntity.meta;
        }
        return oHMOrdersOnlineEntity.copy(list, aPIMOrdersPagingEntity);
    }

    @C12580l
    public final List<OHMOrdersOnlineDataEntity> component1() {
        return this.data;
    }

    @C12580l
    public final APIMOrdersPagingEntity component2() {
        return this.meta;
    }

    @C12579k
    public final OHMOrdersOnlineEntity copy(@C12580l List<OHMOrdersOnlineDataEntity> list, @C12580l APIMOrdersPagingEntity aPIMOrdersPagingEntity) {
        return new OHMOrdersOnlineEntity(list, aPIMOrdersPagingEntity);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OHMOrdersOnlineEntity)) {
            return false;
        }
        OHMOrdersOnlineEntity oHMOrdersOnlineEntity = (OHMOrdersOnlineEntity) obj;
        return Intrinsics.areEqual((Object) this.data, (Object) oHMOrdersOnlineEntity.data) && Intrinsics.areEqual((Object) this.meta, (Object) oHMOrdersOnlineEntity.meta);
    }

    @C12580l
    public final List<OHMOrdersOnlineDataEntity> getData() {
        return this.data;
    }

    @C12580l
    public final APIMOrdersPagingEntity getMeta() {
        return this.meta;
    }

    public int hashCode() {
        List<OHMOrdersOnlineDataEntity> list = this.data;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        APIMOrdersPagingEntity aPIMOrdersPagingEntity = this.meta;
        if (aPIMOrdersPagingEntity != null) {
            i = aPIMOrdersPagingEntity.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        List<OHMOrdersOnlineDataEntity> list = this.data;
        APIMOrdersPagingEntity aPIMOrdersPagingEntity = this.meta;
        return "OHMOrdersOnlineEntity(data=" + list + ", meta=" + aPIMOrdersPagingEntity + ")";
    }
}
