package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.location.b0 */
public final class C41753b0 implements Parcelable.Creator<zzba> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i0 = SafeParcelReader.m166060i0(parcel);
        ArrayList<ClientIdentity> arrayList = zzba.f105937z;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        long j = Long.MAX_VALUE;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O != 1) {
                switch (O) {
                    case 5:
                        arrayList = SafeParcelReader.m166028L(parcel2, X, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = SafeParcelReader.m166023G(parcel2, X);
                        break;
                    case 7:
                        z = SafeParcelReader.m166032P(parcel2, X);
                        break;
                    case 8:
                        z2 = SafeParcelReader.m166032P(parcel2, X);
                        break;
                    case 9:
                        z3 = SafeParcelReader.m166032P(parcel2, X);
                        break;
                    case 10:
                        str2 = SafeParcelReader.m166023G(parcel2, X);
                        break;
                    case 11:
                        z4 = SafeParcelReader.m166032P(parcel2, X);
                        break;
                    case 12:
                        z5 = SafeParcelReader.m166032P(parcel2, X);
                        break;
                    case 13:
                        str3 = SafeParcelReader.m166023G(parcel2, X);
                        break;
                    case 14:
                        j = SafeParcelReader.m166048c0(parcel2, X);
                        break;
                    default:
                        SafeParcelReader.m166058h0(parcel2, X);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.m166019C(parcel2, X, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel2, i0);
        return new zzba(locationRequest, arrayList, str, z, z2, z3, str2, z4, z5, str3, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzba[i];
    }
}
