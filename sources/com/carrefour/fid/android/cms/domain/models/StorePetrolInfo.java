package com.carrefour.fid.android.cms.domain.models;

import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/models/StorePetrolInfo;", "", "id", "", "gasStation", "Lcom/carrefour/fid/android/cms/domain/models/GasStationDomain;", "(JLcom/carrefour/fid/android/cms/domain/models/GasStationDomain;)V", "getGasStation", "()Lcom/carrefour/fid/android/cms/domain/models/GasStationDomain;", "setGasStation", "(Lcom/carrefour/fid/android/cms/domain/models/GasStationDomain;)V", "getId", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StorePetrolInfo {
    @C12580l
    private GasStationDomain gasStation;

    /* renamed from: id */
    private final long f102046id;

    public StorePetrolInfo(long j, @C12580l GasStationDomain gasStationDomain) {
        this.f102046id = j;
        this.gasStation = gasStationDomain;
    }

    public static /* synthetic */ StorePetrolInfo copy$default(StorePetrolInfo storePetrolInfo, long j, GasStationDomain gasStationDomain, int i, Object obj) {
        if ((i & 1) != 0) {
            j = storePetrolInfo.f102046id;
        }
        if ((i & 2) != 0) {
            gasStationDomain = storePetrolInfo.gasStation;
        }
        return storePetrolInfo.copy(j, gasStationDomain);
    }

    public final long component1() {
        return this.f102046id;
    }

    @C12580l
    public final GasStationDomain component2() {
        return this.gasStation;
    }

    @C12579k
    public final StorePetrolInfo copy(long j, @C12580l GasStationDomain gasStationDomain) {
        return new StorePetrolInfo(j, gasStationDomain);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorePetrolInfo)) {
            return false;
        }
        StorePetrolInfo storePetrolInfo = (StorePetrolInfo) obj;
        return this.f102046id == storePetrolInfo.f102046id && Intrinsics.areEqual((Object) this.gasStation, (Object) storePetrolInfo.gasStation);
    }

    @C12580l
    public final GasStationDomain getGasStation() {
        return this.gasStation;
    }

    public final long getId() {
        return this.f102046id;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.f102046id) * 31;
        GasStationDomain gasStationDomain = this.gasStation;
        return hashCode + (gasStationDomain == null ? 0 : gasStationDomain.hashCode());
    }

    public final void setGasStation(@C12580l GasStationDomain gasStationDomain) {
        this.gasStation = gasStationDomain;
    }

    @C12579k
    public String toString() {
        long j = this.f102046id;
        GasStationDomain gasStationDomain = this.gasStation;
        return "StorePetrolInfo(id=" + j + ", gasStation=" + gasStationDomain + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StorePetrolInfo(long j, GasStationDomain gasStationDomain, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : gasStationDomain);
    }
}
