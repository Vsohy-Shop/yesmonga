package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.a1 */
public final class C30313a1 implements Parcelable.Creator<LocationRequest> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        boolean z2 = false;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            switch (SafeParcelReader.m166031O(X)) {
                case 1:
                    i = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 2:
                    j = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 3:
                    j2 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 4:
                    z = SafeParcelReader.m166032P(parcel2, X);
                    break;
                case 5:
                    j3 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 6:
                    i2 = SafeParcelReader.m166042Z(parcel2, X);
                    break;
                case 7:
                    f = SafeParcelReader.m166038V(parcel2, X);
                    break;
                case 8:
                    j4 = SafeParcelReader.m166048c0(parcel2, X);
                    break;
                case 9:
                    z2 = SafeParcelReader.m166032P(parcel2, X);
                    break;
                default:
                    SafeParcelReader.m166058h0(parcel2, X);
                    break;
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
