package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.maps.model.p */
public final class C30598p implements Parcelable.Creator<CircleOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        LatLng latLng = null;
        ArrayList<PatternItem> arrayList = null;
        double d = 0.0d;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.m166019C(parcel2, X, LatLng.CREATOR);
                    break;
                case 3:
                    d = SafeParcelReader.m166036T(parcel2, X);
                    break;
                case 4:
                    f = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 5:
                    i = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 6:
                    i2 = SafeParcelReader.m166042Z(parcel2, X);
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
                    arrayList = SafeParcelReader.m166028L(parcel2, X, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new CircleOptions(latLng, d, f, i, i2, f2, z, z2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }
}
