package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "LatLngCreator")
@SafeParcelable.C40818g({1})
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    @C40473a
    @C0359n0
    public static final Parcelable.Creator<LatLng> CREATOR = new C30602t();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final double f73028a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final double f73029b;

    @SafeParcelable.C40813b
    public LatLng(@SafeParcelable.C40816e(mo134492id = 2) double d, @SafeParcelable.C40816e(mo134492id = 3) double d2) {
        if (d2 < -180.0d || d2 >= 180.0d) {
            this.f73029b = ((((d2 - 0.02490234375d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d;
        } else {
            this.f73029b = d2;
        }
        this.f73028a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.doubleToLongBits(this.f73028a) == Double.doubleToLongBits(latLng.f73028a) && Double.doubleToLongBits(this.f73029b) == Double.doubleToLongBits(latLng.f73029b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f73028a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f73029b);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    @C0359n0
    public String toString() {
        double d = this.f73028a;
        double d2 = this.f73029b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166136r(parcel, 2, this.f73028a);
        C40820a.m166136r(parcel, 3, this.f73029b);
        C40820a.m166112b(parcel, a);
    }
}
