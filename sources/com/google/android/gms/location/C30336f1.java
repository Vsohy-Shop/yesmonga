package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.f1 */
public final class C30336f1 implements Parcelable.Creator<LocationSettingsRequest> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        ArrayList<LocationRequest> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        zzbj zzbj = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                arrayList = SafeParcelReader.m166028L(parcel, X, LocationRequest.CREATOR);
            } else if (O == 2) {
                z = SafeParcelReader.m166032P(parcel, X);
            } else if (O == 3) {
                z2 = SafeParcelReader.m166032P(parcel, X);
            } else if (O != 5) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                zzbj = (zzbj) SafeParcelReader.m166019C(parcel, X, zzbj.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new LocationSettingsRequest(arrayList, z, z2, zzbj);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
