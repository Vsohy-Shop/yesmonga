package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;

/* renamed from: com.google.android.gms.signin.internal.h */
public final class C30988h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        zat zat = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O != 2) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                zat = (zat) SafeParcelReader.m166019C(parcel, X, zat.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zai(i, zat);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zai[i];
    }
}
