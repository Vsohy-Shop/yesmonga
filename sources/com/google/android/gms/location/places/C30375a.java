package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.places.a */
public final class C30375a implements Parcelable.Creator<PlaceReport> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i0 = SafeParcelReader.m166060i0(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < i0) {
            int X = SafeParcelReader.m166040X(parcel);
            int O = SafeParcelReader.m166031O(X);
            if (O == 1) {
                i = SafeParcelReader.m166042Z(parcel, X);
            } else if (O == 2) {
                str = SafeParcelReader.m166023G(parcel, X);
            } else if (O == 3) {
                str2 = SafeParcelReader.m166023G(parcel, X);
            } else if (O != 4) {
                SafeParcelReader.m166058h0(parcel, X);
            } else {
                str3 = SafeParcelReader.m166023G(parcel, X);
            }
        }
        SafeParcelReader.m166030N(parcel, i0);
        return new PlaceReport(i, str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlaceReport[i];
    }
}
