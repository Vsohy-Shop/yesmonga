package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.google.android.gms.maps.q */
public final class C30615q implements Parcelable.Creator<GoogleMapOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        byte b = -1;
        byte b2 = -1;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        int i = 0;
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    b = SafeParcelReader.m166034R(parcel2, X);
                    break;
                case 3:
                    b2 = SafeParcelReader.m166034R(parcel2, X);
                    break;
                case 4:
                    i = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.m166019C(parcel2, X, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = SafeParcelReader.m166034R(parcel2, X);
                    break;
                case 7:
                    b4 = SafeParcelReader.m166034R(parcel2, X);
                    break;
                case 8:
                    b5 = SafeParcelReader.m166034R(parcel2, X);
                    break;
                case 9:
                    b6 = SafeParcelReader.m166034R(parcel2, X);
                    break;
                case 10:
                    b7 = SafeParcelReader.m166034R(parcel2, X);
                    break;
                case 11:
                    b8 = SafeParcelReader.m166034R(parcel2, X);
                    break;
                case 12:
                    b9 = SafeParcelReader.m166034R(parcel2, X);
                    break;
                case 14:
                    b10 = SafeParcelReader.m166034R(parcel2, X);
                    break;
                case 15:
                    b11 = SafeParcelReader.m166034R(parcel2, X);
                    break;
                case 16:
                    f = SafeParcelReader.m166039W(parcel2, X);
                    break;
                case 17:
                    f2 = SafeParcelReader.m166039W(parcel2, X);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.m166019C(parcel2, X, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = SafeParcelReader.m166034R(parcel2, X);
                    break;
                case 20:
                    num = SafeParcelReader.m166044a0(parcel2, X);
                    break;
                case 21:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12, num, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
