package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "PointOfInterestCreator")
@SafeParcelable.C40818g({1})
public final class PointOfInterest extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new C30606x();
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final LatLng f73055a;
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final String f73056b;
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public final String f73057c;

    @SafeParcelable.C40813b
    public PointOfInterest(@SafeParcelable.C40816e(mo134492id = 2) @C0359n0 LatLng latLng, @SafeParcelable.C40816e(mo134492id = 3) @C0359n0 String str, @SafeParcelable.C40816e(mo134492id = 4) @C0359n0 String str2) {
        this.f73055a = latLng;
        this.f73056b = str;
        this.f73057c = str2;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 2, this.f73055a, i, false);
        C40820a.m166108Y(parcel, 3, this.f73056b, false);
        C40820a.m166108Y(parcel, 4, this.f73057c, false);
        C40820a.m166112b(parcel, a);
    }
}
