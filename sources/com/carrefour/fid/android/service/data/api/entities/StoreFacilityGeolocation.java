package com.carrefour.fid.android.service.data.api.entities;

import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/StoreFacilityGeolocation;", "", "serviceKey", "", "", "longitude", "", "latitude", "radius", "", "(Ljava/util/List;DDI)V", "getLatitude", "()D", "getLongitude", "getRadius", "()I", "getServiceKey", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StoreFacilityGeolocation {
    @C33608c("latitude")
    private final double latitude;
    @C33608c("longitude")
    private final double longitude;
    @C33608c("radius")
    private final int radius;
    @C33608c("service_types")
    @C12579k
    private final List<String> serviceKey;

    public StoreFacilityGeolocation(@C12579k List<String> list, double d, double d2, int i) {
        Intrinsics.checkNotNullParameter(list, "serviceKey");
        this.serviceKey = list;
        this.longitude = d;
        this.latitude = d2;
        this.radius = i;
    }

    public static /* synthetic */ StoreFacilityGeolocation copy$default(StoreFacilityGeolocation storeFacilityGeolocation, List<String> list, double d, double d2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = storeFacilityGeolocation.serviceKey;
        }
        if ((i2 & 2) != 0) {
            d = storeFacilityGeolocation.longitude;
        }
        double d3 = d;
        if ((i2 & 4) != 0) {
            d2 = storeFacilityGeolocation.latitude;
        }
        double d4 = d2;
        if ((i2 & 8) != 0) {
            i = storeFacilityGeolocation.radius;
        }
        return storeFacilityGeolocation.copy(list, d3, d4, i);
    }

    @C12579k
    public final List<String> component1() {
        return this.serviceKey;
    }

    public final double component2() {
        return this.longitude;
    }

    public final double component3() {
        return this.latitude;
    }

    public final int component4() {
        return this.radius;
    }

    @C12579k
    public final StoreFacilityGeolocation copy(@C12579k List<String> list, double d, double d2, int i) {
        Intrinsics.checkNotNullParameter(list, "serviceKey");
        return new StoreFacilityGeolocation(list, d, d2, i);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreFacilityGeolocation)) {
            return false;
        }
        StoreFacilityGeolocation storeFacilityGeolocation = (StoreFacilityGeolocation) obj;
        return Intrinsics.areEqual((Object) this.serviceKey, (Object) storeFacilityGeolocation.serviceKey) && Double.compare(this.longitude, storeFacilityGeolocation.longitude) == 0 && Double.compare(this.latitude, storeFacilityGeolocation.latitude) == 0 && this.radius == storeFacilityGeolocation.radius;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final int getRadius() {
        return this.radius;
    }

    @C12579k
    public final List<String> getServiceKey() {
        return this.serviceKey;
    }

    public int hashCode() {
        return (((((this.serviceKey.hashCode() * 31) + Double.hashCode(this.longitude)) * 31) + Double.hashCode(this.latitude)) * 31) + Integer.hashCode(this.radius);
    }

    @C12579k
    public String toString() {
        List<String> list = this.serviceKey;
        double d = this.longitude;
        double d2 = this.latitude;
        int i = this.radius;
        return "StoreFacilityGeolocation(serviceKey=" + list + ", longitude=" + d + ", latitude=" + d2 + ", radius=" + i + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoreFacilityGeolocation(List list, double d, double d2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.m40448L("LAD", "H1H3") : list, d, d2, (i2 & 8) != 0 ? 1000 : i);
    }
}
