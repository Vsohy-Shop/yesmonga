package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* renamed from: com.google.android.gms.maps.e0 */
public final class C30445e0 implements Parcelable.Creator<StreetViewPanoramaOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        StreetViewSource streetViewSource = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) SafeParcelReader.m166019C(parcel, X, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m166023G(parcel, X);
                    break;
                case 4:
                    latLng = (LatLng) SafeParcelReader.m166019C(parcel, X, LatLng.CREATOR);
                    break;
                case 5:
                    num = SafeParcelReader.m166044a0(parcel, X);
                    break;
                case 6:
                    b = SafeParcelReader.m166034R(parcel, X);
                    break;
                case 7:
                    b2 = SafeParcelReader.m166034R(parcel, X);
                    break;
                case 8:
                    b3 = SafeParcelReader.m166034R(parcel, X);
                    break;
                case 9:
                    b4 = SafeParcelReader.m166034R(parcel, X);
                    break;
                case 10:
                    b5 = SafeParcelReader.m166034R(parcel, X);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) SafeParcelReader.m166019C(parcel, X, StreetViewSource.CREATOR);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b, b2, b3, b4, b5, streetViewSource);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
