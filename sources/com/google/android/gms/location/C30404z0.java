package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.z0 */
public final class C30404z0 implements Parcelable.Creator<LocationAvailability> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        long j = 0;
        zzbo[] zzboArr = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                i2 = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 2) {
                i3 = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 3) {
                j = SafeParcelReader.m166048c0(parcel, X);
            } else if (O == 4) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O != 5) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                zzboArr = (zzbo[]) SafeParcelReader.m166027K(parcel, X, zzbo.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new LocationAvailability(i, i2, i3, j, zzboArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
