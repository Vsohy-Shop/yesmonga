package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.v */
public final class C30604v implements Parcelable.Creator<MarkerOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f6 = 0.5f;
        float f7 = 1.0f;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.m166019C(parcel2, X, LatLng.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 4:
                    str2 = SafeParcelReader.m166023G(parcel2, X);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m166041Y(parcel2, X);
                    break;
                case 6:
                    f = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 7:
                    f2 = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 8:
                    z = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 9:
                    z2 = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 10:
                    z3 = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 11:
                    f3 = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 12:
                    f6 = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 13:
                    f4 = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 14:
                    f7 = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 15:
                    f5 = SafeParcelReader.m166038V(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f6, f4, f7, f5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
