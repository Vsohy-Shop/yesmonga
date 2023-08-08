package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.location.b1 */
public final class C30317b1 implements Parcelable.Creator<LocationResult> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        List<Location> list = LocationResult.f72724b;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            if (SafeParcelReader.m166031O(X) != 1) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                list = SafeParcelReader.m166028L(parcel, X, Location.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new LocationResult(list);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
