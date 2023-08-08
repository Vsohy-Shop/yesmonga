package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "VisibleRegionCreator")
@SafeParcelable.C40818g({1})
public final class VisibleRegion extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new C30592j0();
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final LatLng f73109a;
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final LatLng f73110b;
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public final LatLng f73111c;
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public final LatLng f73112d;
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public final LatLngBounds f73113e;

    @SafeParcelable.C40813b
    public VisibleRegion(@SafeParcelable.C40816e(mo134492id = 2) @C0359n0 LatLng latLng, @SafeParcelable.C40816e(mo134492id = 3) @C0359n0 LatLng latLng2, @SafeParcelable.C40816e(mo134492id = 4) @C0359n0 LatLng latLng3, @SafeParcelable.C40816e(mo134492id = 5) @C0359n0 LatLng latLng4, @SafeParcelable.C40816e(mo134492id = 6) @C0359n0 LatLngBounds latLngBounds) {
        this.f73109a = latLng;
        this.f73110b = latLng2;
        this.f73111c = latLng3;
        this.f73112d = latLng4;
        this.f73113e = latLngBounds;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        if (!this.f73109a.equals(visibleRegion.f73109a) || !this.f73110b.equals(visibleRegion.f73110b) || !this.f73111c.equals(visibleRegion.f73111c) || !this.f73112d.equals(visibleRegion.f73112d) || !this.f73113e.equals(visibleRegion.f73113e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C40808s.m166011c(this.f73109a, this.f73110b, this.f73111c, this.f73112d, this.f73113e);
    }

    @C0359n0
    public String toString() {
        return C40808s.m166012d(this).mo134475a("nearLeft", this.f73109a).mo134475a("nearRight", this.f73110b).mo134475a("farLeft", this.f73111c).mo134475a("farRight", this.f73112d).mo134475a("latLngBounds", this.f73113e).toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 2, this.f73109a, i, false);
        C40820a.m166102S(parcel, 3, this.f73110b, i, false);
        C40820a.m166102S(parcel, 4, this.f73111c, i, false);
        C40820a.m166102S(parcel, 5, this.f73112d, i, false);
        C40820a.m166102S(parcel, 6, this.f73113e, i, false);
        C40820a.m166112b(parcel, a);
    }
}
