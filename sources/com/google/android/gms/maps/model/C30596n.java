package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.n */
public final class C30596n implements Parcelable.Creator<CameraPosition> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 2) {
                latLng = (LatLng) SafeParcelReader.m166019C(parcel, X, LatLng.CREATOR);
            } else if (O == 3) {
                f = SafeParcelReader.m166038V(parcel, X);
            } else if (O == 4) {
                f2 = SafeParcelReader.m166038V(parcel, X);
            } else if (O != 5) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                f3 = SafeParcelReader.m166038V(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new CameraPosition(latLng, f, f2, f3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
