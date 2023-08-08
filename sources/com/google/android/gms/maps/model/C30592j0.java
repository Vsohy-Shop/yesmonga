package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.j0 */
public final class C30592j0 implements Parcelable.Creator<VisibleRegion> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 2) {
                latLng = (LatLng) SafeParcelReader.m166019C(parcel, X, LatLng.CREATOR);
            } else if (O == 3) {
                latLng2 = (LatLng) SafeParcelReader.m166019C(parcel, X, LatLng.CREATOR);
            } else if (O == 4) {
                latLng3 = (LatLng) SafeParcelReader.m166019C(parcel, X, LatLng.CREATOR);
            } else if (O == 5) {
                latLng4 = (LatLng) SafeParcelReader.m166019C(parcel, X, LatLng.CREATOR);
            } else if (O != 6) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                latLngBounds = (LatLngBounds) SafeParcelReader.m166019C(parcel, X, LatLngBounds.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
