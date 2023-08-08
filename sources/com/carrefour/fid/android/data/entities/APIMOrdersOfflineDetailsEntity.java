package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMOrdersOfflineDetailsEntity;", "", "offlineOrderHeaderEntity", "Lcom/carrefour/fid/android/data/entities/APIMDataEntity;", "(Lcom/carrefour/fid/android/data/entities/APIMDataEntity;)V", "getOfflineOrderHeaderEntity", "()Lcom/carrefour/fid/android/data/entities/APIMDataEntity;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMOrdersOfflineDetailsEntity {
    public static final int $stable = 8;
    @C33608c("data")
    @C12580l
    private final APIMDataEntity offlineOrderHeaderEntity;

    public APIMOrdersOfflineDetailsEntity(@C12580l APIMDataEntity aPIMDataEntity) {
        this.offlineOrderHeaderEntity = aPIMDataEntity;
    }

    public static /* synthetic */ APIMOrdersOfflineDetailsEntity copy$default(APIMOrdersOfflineDetailsEntity aPIMOrdersOfflineDetailsEntity, APIMDataEntity aPIMDataEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            aPIMDataEntity = aPIMOrdersOfflineDetailsEntity.offlineOrderHeaderEntity;
        }
        return aPIMOrdersOfflineDetailsEntity.copy(aPIMDataEntity);
    }

    @C12580l
    public final APIMDataEntity component1() {
        return this.offlineOrderHeaderEntity;
    }

    @C12579k
    public final APIMOrdersOfflineDetailsEntity copy(@C12580l APIMDataEntity aPIMDataEntity) {
        return new APIMOrdersOfflineDetailsEntity(aPIMDataEntity);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof APIMOrdersOfflineDetailsEntity) && Intrinsics.areEqual((Object) this.offlineOrderHeaderEntity, (Object) ((APIMOrdersOfflineDetailsEntity) obj).offlineOrderHeaderEntity);
    }

    @C12580l
    public final APIMDataEntity getOfflineOrderHeaderEntity() {
        return this.offlineOrderHeaderEntity;
    }

    public int hashCode() {
        APIMDataEntity aPIMDataEntity = this.offlineOrderHeaderEntity;
        if (aPIMDataEntity == null) {
            return 0;
        }
        return aPIMDataEntity.hashCode();
    }

    @C12579k
    public String toString() {
        APIMDataEntity aPIMDataEntity = this.offlineOrderHeaderEntity;
        return "APIMOrdersOfflineDetailsEntity(offlineOrderHeaderEntity=" + aPIMDataEntity + ")";
    }
}
