package com.carrefour.fid.android.cms.domain.models;

import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/models/GasStationDomain;", "", "id", "", "fuelPrices", "", "Lcom/carrefour/fid/android/cms/domain/models/FuelPriceDomain;", "(Ljava/lang/String;Ljava/util/List;)V", "getFuelPrices", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class GasStationDomain {
    @C12579k
    private final List<FuelPriceDomain> fuelPrices;
    @C12579k

    /* renamed from: id */
    private final String f102045id;

    public GasStationDomain(@C12579k String str, @C12579k List<FuelPriceDomain> list) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(list, "fuelPrices");
        this.f102045id = str;
        this.fuelPrices = list;
    }

    public static /* synthetic */ GasStationDomain copy$default(GasStationDomain gasStationDomain, String str, List<FuelPriceDomain> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gasStationDomain.f102045id;
        }
        if ((i & 2) != 0) {
            list = gasStationDomain.fuelPrices;
        }
        return gasStationDomain.copy(str, list);
    }

    @C12579k
    public final String component1() {
        return this.f102045id;
    }

    @C12579k
    public final List<FuelPriceDomain> component2() {
        return this.fuelPrices;
    }

    @C12579k
    public final GasStationDomain copy(@C12579k String str, @C12579k List<FuelPriceDomain> list) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(list, "fuelPrices");
        return new GasStationDomain(str, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GasStationDomain)) {
            return false;
        }
        GasStationDomain gasStationDomain = (GasStationDomain) obj;
        return Intrinsics.areEqual((Object) this.f102045id, (Object) gasStationDomain.f102045id) && Intrinsics.areEqual((Object) this.fuelPrices, (Object) gasStationDomain.fuelPrices);
    }

    @C12579k
    public final List<FuelPriceDomain> getFuelPrices() {
        return this.fuelPrices;
    }

    @C12579k
    public final String getId() {
        return this.f102045id;
    }

    public int hashCode() {
        return (this.f102045id.hashCode() * 31) + this.fuelPrices.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f102045id;
        List<FuelPriceDomain> list = this.fuelPrices;
        return "GasStationDomain(id=" + str + ", fuelPrices=" + list + ")";
    }
}
