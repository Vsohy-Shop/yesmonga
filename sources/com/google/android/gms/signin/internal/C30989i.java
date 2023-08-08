package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* renamed from: com.google.android.gms.signin.internal.i */
public final class C30989i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        ConnectionResult connectionResult = null;
        zav zav = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.m166019C(parcel, X, ConnectionResult.CREATOR);
            } else if (O != 3) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                zav = (zav) SafeParcelReader.m166019C(parcel, X, zav.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zak(i, connectionResult, zav);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
