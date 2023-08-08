package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.server.converter.a */
public final class C40933a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        StringToIntConverter stringToIntConverter = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O != 2) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                stringToIntConverter = (StringToIntConverter) SafeParcelReader.m166019C(parcel, X, StringToIntConverter.CREATOR);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new zaa(i, stringToIntConverter);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
