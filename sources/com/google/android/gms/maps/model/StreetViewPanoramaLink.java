package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "StreetViewPanoramaLinkCreator")
@SafeParcelable.C40818g({1})
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new C30576b0();
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final String f73087a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final float f73088b;

    @SafeParcelable.C40813b
    public StreetViewPanoramaLink(@SafeParcelable.C40816e(mo134492id = 2) @C0359n0 String str, @SafeParcelable.C40816e(mo134492id = 3) float f) {
        this.f73087a = str;
        this.f73088b = (((double) f) <= 0.0d ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        if (!this.f73087a.equals(streetViewPanoramaLink.f73087a) || Float.floatToIntBits(this.f73088b) != Float.floatToIntBits(streetViewPanoramaLink.f73088b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C40808s.m166011c(this.f73087a, Float.valueOf(this.f73088b));
    }

    @C0359n0
    public String toString() {
        return C40808s.m166012d(this).mo134475a("panoId", this.f73087a).mo134475a("bearing", Float.valueOf(this.f73088b)).toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 2, this.f73087a, false);
        C40820a.m166141w(parcel, 3, this.f73088b);
        C40820a.m166112b(parcel, a);
    }
}
