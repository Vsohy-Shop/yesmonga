package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;

@SafeParcelable.C40812a(creator = "LatLngBoundsCreator")
@SafeParcelable.C40818g({1})
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    @C40473a
    @C0359n0
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new C30601s();
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final LatLng f73030a;
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final LatLng f73031b;

    /* renamed from: com.google.android.gms.maps.model.LatLngBounds$a */
    public static final class C30570a {

        /* renamed from: a */
        public double f73032a = Double.POSITIVE_INFINITY;

        /* renamed from: b */
        public double f73033b = Double.NEGATIVE_INFINITY;

        /* renamed from: c */
        public double f73034c = Double.NaN;

        /* renamed from: d */
        public double f73035d = Double.NaN;

        @C0359n0
        /* renamed from: a */
        public LatLngBounds mo86350a() {
            C40843u.m166209s(!Double.isNaN(this.f73034c), "no included points");
            return new LatLngBounds(new LatLng(this.f73032a, this.f73034c), new LatLng(this.f73033b, this.f73035d));
        }

        @C0359n0
        /* renamed from: b */
        public C30570a mo86351b(@C0359n0 LatLng latLng) {
            C40843u.m166203m(latLng, "point must not be null");
            this.f73032a = Math.min(this.f73032a, latLng.f73028a);
            this.f73033b = Math.max(this.f73033b, latLng.f73028a);
            double d = latLng.f73029b;
            if (Double.isNaN(this.f73034c)) {
                this.f73034c = d;
                this.f73035d = d;
            } else {
                double d2 = this.f73034c;
                double d3 = this.f73035d;
                if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                    Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                    if (((d2 - d) + 360.0d) % 360.0d < ((d - d3) + 360.0d) % 360.0d) {
                        this.f73034c = d;
                    } else {
                        this.f73035d = d;
                    }
                }
            }
            return this;
        }
    }

    @SafeParcelable.C40813b
    public LatLngBounds(@SafeParcelable.C40816e(mo134492id = 2) @C0359n0 LatLng latLng, @SafeParcelable.C40816e(mo134492id = 3) @C0359n0 LatLng latLng2) {
        boolean z;
        C40843u.m166203m(latLng, "southwest must not be null.");
        C40843u.m166203m(latLng2, "northeast must not be null.");
        double d = latLng2.f73028a;
        double d2 = latLng.f73028a;
        if (d >= d2) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166193c(z, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.f73028a));
        this.f73030a = latLng;
        this.f73031b = latLng2;
    }

    @C0359n0
    /* renamed from: M */
    public static C30570a m123046M() {
        return new C30570a();
    }

    @C0363p0
    /* renamed from: W */
    public static LatLngBounds m123047W(@C0363p0 Context context, @C0363p0 AttributeSet attributeSet) {
        return GoogleMapOptions.m122238g4(context, attributeSet);
    }

    /* renamed from: Q */
    public boolean mo86342Q(@C0359n0 LatLng latLng) {
        LatLng latLng2 = (LatLng) C40843u.m166203m(latLng, "point must not be null.");
        double d = latLng2.f73028a;
        if (this.f73030a.f73028a > d || d > this.f73031b.f73028a || !mo86346f0(latLng2.f73029b)) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: X */
    public LatLng mo86343X() {
        LatLng latLng = this.f73030a;
        double d = latLng.f73028a;
        LatLng latLng2 = this.f73031b;
        double d2 = (d + latLng2.f73028a) / 2.0d;
        double d3 = latLng2.f73029b;
        double d4 = latLng.f73029b;
        if (d4 > d3) {
            d3 += 360.0d;
        }
        return new LatLng(d2, (d3 + d4) / 2.0d);
    }

    @C0359n0
    /* renamed from: e0 */
    public LatLngBounds mo86344e0(@C0359n0 LatLng latLng) {
        LatLng latLng2 = (LatLng) C40843u.m166203m(latLng, "point must not be null.");
        double min = Math.min(this.f73030a.f73028a, latLng2.f73028a);
        double max = Math.max(this.f73031b.f73028a, latLng2.f73028a);
        double d = this.f73031b.f73029b;
        double d2 = this.f73030a.f73029b;
        double d3 = latLng2.f73029b;
        if (!mo86346f0(d3)) {
            if (((d2 - d3) + 360.0d) % 360.0d < ((d3 - d) + 360.0d) % 360.0d) {
                d2 = d3;
            } else {
                d = d3;
            }
        }
        return new LatLngBounds(new LatLng(min, d2), new LatLng(max, d));
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (!this.f73030a.equals(latLngBounds.f73030a) || !this.f73031b.equals(latLngBounds.f73031b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public final boolean mo86346f0(double d) {
        double d2 = this.f73030a.f73029b;
        double d3 = this.f73031b.f73029b;
        int i = (d2 > d3 ? 1 : (d2 == d3 ? 0 : -1));
        int i2 = (d2 > d ? 1 : (d2 == d ? 0 : -1));
        return i <= 0 ? i2 <= 0 && d <= d3 : i2 <= 0 || d <= d3;
    }

    public int hashCode() {
        return C40808s.m166011c(this.f73030a, this.f73031b);
    }

    @C0359n0
    public String toString() {
        return C40808s.m166012d(this).mo134475a("southwest", this.f73030a).mo134475a("northeast", this.f73031b).toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 2, this.f73030a, i, false);
        C40820a.m166102S(parcel, 3, this.f73031b, i, false);
        C40820a.m166112b(parcel, a);
    }
}
