package com.carrefour.fid.android.account.domain.models;

import androidx.annotation.Keep;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/domain/models/DQEGeoLocationDomain;", "", "latitude", "", "longitude", "(DD)V", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class DQEGeoLocationDomain {
    private double latitude;
    private final double longitude;

    public DQEGeoLocationDomain(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public static /* synthetic */ DQEGeoLocationDomain copy$default(DQEGeoLocationDomain dQEGeoLocationDomain, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = dQEGeoLocationDomain.latitude;
        }
        if ((i & 2) != 0) {
            d2 = dQEGeoLocationDomain.longitude;
        }
        return dQEGeoLocationDomain.copy(d, d2);
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    @C12579k
    public final DQEGeoLocationDomain copy(double d, double d2) {
        return new DQEGeoLocationDomain(d, d2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DQEGeoLocationDomain)) {
            return false;
        }
        DQEGeoLocationDomain dQEGeoLocationDomain = (DQEGeoLocationDomain) obj;
        return Double.compare(this.latitude, dQEGeoLocationDomain.latitude) == 0 && Double.compare(this.longitude, dQEGeoLocationDomain.longitude) == 0;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude);
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    @C12579k
    public String toString() {
        double d = this.latitude;
        double d2 = this.longitude;
        return "DQEGeoLocationDomain(latitude=" + d + ", longitude=" + d2 + ")";
    }
}
