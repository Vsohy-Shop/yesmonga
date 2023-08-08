package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.h1 */
public final class C30344h1 implements Parcelable.Creator<LocationSettingsStates> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    z = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 2:
                    z2 = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 3:
                    z3 = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 4:
                    z4 = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 5:
                    z5 = SafeParcelReader.m166032P(parcel, X);
                    break;
                case 6:
                    z6 = SafeParcelReader.m166032P(parcel, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
