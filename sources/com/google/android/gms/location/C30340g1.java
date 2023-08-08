package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.g1 */
public final class C30340g1 implements Parcelable.Creator<LocationSettingsResult> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                status = (Status) SafeParcelReader.m166019C(parcel, X, Status.CREATOR);
            } else if (O != 2) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                locationSettingsStates = (LocationSettingsStates) SafeParcelReader.m166019C(parcel, X, LocationSettingsStates.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
