package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.server.response.n */
public final class C40950n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        Parcel parcel2 = null;
        zan zan = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 2) {
                parcel2 = SafeParcelReader.m166078y(parcel, X);
            } else if (O != 3) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                zan = (zan) SafeParcelReader.m166019C(parcel, X, zan.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new SafeParcelResponse(i, parcel2, zan);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
