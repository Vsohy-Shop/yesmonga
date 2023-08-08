package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.urbanairship.iam.C9259x;

@SafeParcelable.C40812a(creator = "StreetViewPanoramaLocationCreator")
@SafeParcelable.C40818g({1})
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new C30578c0();
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final StreetViewPanoramaLink[] f73089a;
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final LatLng f73090b;
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public final String f73091c;

    @SafeParcelable.C40813b
    public StreetViewPanoramaLocation(@SafeParcelable.C40816e(mo134492id = 2) @C0359n0 StreetViewPanoramaLink[] streetViewPanoramaLinkArr, @SafeParcelable.C40816e(mo134492id = 3) @C0359n0 LatLng latLng, @SafeParcelable.C40816e(mo134492id = 4) @C0359n0 String str) {
        this.f73089a = streetViewPanoramaLinkArr;
        this.f73090b = latLng;
        this.f73091c = str;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        if (!this.f73091c.equals(streetViewPanoramaLocation.f73091c) || !this.f73090b.equals(streetViewPanoramaLocation.f73090b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C40808s.m166011c(this.f73090b, this.f73091c);
    }

    @C0359n0
    public String toString() {
        return C40808s.m166012d(this).mo134475a("panoId", this.f73091c).mo134475a(C9259x.f25239v, this.f73090b.toString()).toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166115c0(parcel, 2, this.f73089a, i, false);
        C40820a.m166102S(parcel, 3, this.f73090b, i, false);
        C40820a.m166108Y(parcel, 4, this.f73091c, false);
        C40820a.m166112b(parcel, a);
    }
}
