package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.maps.model.z */
public final class C30608z implements Parcelable.Creator<PolylineOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        ArrayList<LatLng> arrayList = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList<PatternItem> arrayList2 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    arrayList = SafeParcelReader.m166028L(parcel2, X, LatLng.CREATOR);
                    break;
                case 3:
                    f = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 4:
                    i = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 5:
                    f2 = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 6:
                    z = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 7:
                    z2 = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 8:
                    z3 = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 9:
                    cap = (Cap) SafeParcelReader.m166019C(parcel2, X, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) SafeParcelReader.m166019C(parcel2, X, Cap.CREATOR);
                    break;
                case 11:
                    i2 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 12:
                    arrayList2 = SafeParcelReader.m166028L(parcel2, X, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new PolylineOptions(arrayList, f, i, f2, z, z2, z3, cap, cap2, i2, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
