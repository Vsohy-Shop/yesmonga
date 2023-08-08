package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.x */
public final class C30606x implements Parcelable.Creator<PointOfInterest> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 2) {
                latLng = (LatLng) SafeParcelReader.m166019C(parcel, X, LatLng.CREATOR);
            } else if (O == 3) {
                str = SafeParcelReader.m166023G(parcel, X);
            } else if (O != 4) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                str2 = SafeParcelReader.m166023G(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new PointOfInterest(latLng, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PointOfInterest[i];
    }
}
