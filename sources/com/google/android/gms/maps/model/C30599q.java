package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.q */
public final class C30599q implements Parcelable.Creator<GroundOverlayOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    iBinder = SafeParcelReader.m166041Y(parcel2, X);
                    break;
                case 3:
                    latLng = (LatLng) SafeParcelReader.m166019C(parcel2, X, LatLng.CREATOR);
                    break;
                case 4:
                    f = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 5:
                    f2 = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) SafeParcelReader.m166019C(parcel2, X, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 8:
                    f4 = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 9:
                    z = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 10:
                    f5 = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 11:
                    f6 = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 12:
                    f7 = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 13:
                    z2 = SafeParcelReader.m166032P(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new GroundOverlayOptions(iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
