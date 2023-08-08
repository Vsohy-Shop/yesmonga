package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.maps.model.y */
public final class C30607y implements Parcelable.Creator<PolygonOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList<PatternItem> arrayList2 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        float f2 = 0.0f;
        ArrayList<LatLng> arrayList3 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 2:
                    arrayList3 = SafeParcelReader.m166028L(parcel, X, LatLng.CREATOR);
                    break;
                case 3:
                    SafeParcelReader.m166046b0(parcel, X, arrayList, C30607y.class.getClassLoader());
                    break;
                case 4:
                    f2 = SafeParcelReader.m166038V(parcel, X);
                    break;
                case 5:
                    i = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 6:
                    i2 = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 7:
                    f = SafeParcelReader.m166038V(parcel, X);
                    break;
                case 8:
                    z = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 9:
                    z2 = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 10:
                    z3 = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 11:
                    i3 = SafeParcelReader.m166042Z(parcel, X);
                    break;
                case 12:
                    arrayList2 = SafeParcelReader.m166028L(parcel, X, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new PolygonOptions(arrayList3, arrayList, f2, i, i2, f, z, z2, z3, i3, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
